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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder0.build();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objBuilder4.build();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setPollTimeoutMs(200L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objBuilder0.build();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.AnnotatedElement>(objBuilder0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilder7.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder7.build();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long2 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig1 = objBuilder0.build();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        long long5 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(objBuilderBuilder0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        objBuilder4.offsetCommitPeriodMs = (short) 1;
        objBuilder4.offsetCommitPeriodMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = objBuilder4.build();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        objBuilder0.pollTimeoutMs = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder0.build();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy5);
        objBuilder0.offsetCommitPeriodMs = 100L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder0.build();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = objBuilder0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder0.build();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        long long5 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableBuilder0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        objBuilder2.maxUncommittedOffsets = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder2.setMaxUncommittedOffsets((int) ' ');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder2.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder2.build();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.io.Serializable> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.io.Serializable>(strBuilder0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(objBuilderBuilder0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setMaxUncommittedOffsets(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder6.build();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        objBuilder0.pollTimeoutMs = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder0.build();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.List<java.lang.String> strList5 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.String str2 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs(200L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder0.build();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(annotatedElementBuilder0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence>(strBuilder0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(genericDeclarationBuilder0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder7 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long6 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(objBuilder0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(charSequenceBuilder0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(genericDeclarationBuilder0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        objBuilder4.offsetCommitPeriodMs = (short) 1;
        objBuilder4.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder4.setOffsetCommitPeriodMs(1L);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objBuilder4.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig15 = objBuilder4.build();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder7 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilder2.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = objBuilder2.build();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder9 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer10 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer11 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(objBuilder0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        objBuilder4.offsetCommitPeriodMs = (short) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilder4.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder4.build();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        objBuilder2.maxUncommittedOffsets = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder2.setMaxUncommittedOffsets((int) ' ');
        objBuilder2.offsetCommitPeriodMs = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder2.build();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = objBuilder4.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilder4.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder4.build();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        objBuilder0.offsetCommitPeriodMs = 0;
        objBuilder0.maxUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder0.build();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strComparableBuilder0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.Type> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.Type>(objBuilder0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableBuilder0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence>(serializableBuilder0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementBuilder0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = objBuilder0.build();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.CharSequence> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.CharSequence>(typeBuilder0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Comparable<java.lang.String>>(objBuilder0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        long long6 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder7.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objBuilder7.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.io.Serializable> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.io.Serializable>(charSequenceBuilder0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeBuilder0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.getRetryService();
        int int6 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(annotatedElementBuilder0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableBuilder0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Object> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Object>(typeBuilder0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(serializableBuilder0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(genericDeclarationBuilder0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(annotatedElementBuilder0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String>(charSequenceBuilder0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type>(strBuilder0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableBuilder0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 100;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Object>(genericDeclarationBuilder0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        long long5 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer5 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Object> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Object>(objBuilder0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>(objBuilderBuilder0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern3 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableBuilder0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str2 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder3 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long6 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long7 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.GenericDeclaration> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.GenericDeclaration>(strBuilder0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>(objBuilder0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationBuilder0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setOffsetCommitPeriodMs((long) 0);
        long long4 = objBuilder3.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objBuilder3.tuplesBuilder;
        long long6 = objBuilder3.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder3.build();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationBuilder0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement>(strBuilder0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String>(serializableBuilder0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(typeBuilder0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        objBuilder2.maxUncommittedOffsets = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder2.setMaxUncommittedOffsets((int) ' ');
        objBuilder2.offsetCommitPeriodMs = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = objBuilder2.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objBuilder2.build();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long11 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int12 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        int int15 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableBuilder0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationBuilder0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(charSequenceBuilder0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilder7.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = objBuilder7.setMaxUncommittedOffsets((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder10.build();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(serializableBuilder0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.String> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.String>(objBuilder0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long6 = objBuilderKafkaSpoutConfig5.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList7 = objBuilderKafkaSpoutConfig5.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig5.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strComparableBuilder0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setOffsetCommitPeriodMs((long) 0);
        objBuilder0.pollTimeoutMs = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = objBuilder0.build();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        objBuilder0.pollTimeoutMs = (byte) -1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder0.build();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.GenericDeclaration>(serializableBuilder0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer10 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementBuilder0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        long long4 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(charSequenceBuilder0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(typeBuilder0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long2 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        int int7 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.regex.Pattern pattern8 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        long long9 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>(serializableBuilder0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement>(objBuilderBuilder0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long10 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer11 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.String str2 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 10L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.lang.String str13 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementBuilder0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.io.Serializable> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.io.Serializable> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.io.Serializable>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(objBuilderBuilder0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        long long5 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder7 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strBuilder0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Object> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Object> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Object>(objBuilderBuilder0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.toString();
        long long4 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long5 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = objBuilder0.build();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        int int9 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strComparableBuilder0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) 100;
        long long10 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(genericDeclarationBuilder0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration>(objBuilderBuilder0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(charSequenceBuilder0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(annotatedElementBuilder0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        long long5 = objBuilder4.offsetCommitPeriodMs;
        long long6 = objBuilder4.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder4.build();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.io.Serializable> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.io.Serializable>(serializableBuilder0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String>(typeBuilder0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long11 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int12 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        long long15 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setMaxUncommittedOffsets((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder0.build();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeBuilder0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.io.Serializable>(annotatedElementBuilder0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Comparable<java.lang.String>>(serializableBuilder0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.List<java.lang.String> strList5 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        int int10 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(typeBuilder0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long2 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.util.List<java.lang.String> strList5 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>>(strBuilder0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilder0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder0.build();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strComparableBuilder0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder3.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder3.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilder3.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(genericDeclarationBuilder0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strComparableBuilder0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        long long4 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer12 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.lang.String str14 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(charSequenceBuilder0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long11 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.retryService;
        long long9 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer10 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder11 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Object>(charSequenceBuilder0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(typeBuilder0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strComparableBuilder0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        long long7 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int8 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceBuilder0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilder2.kafkaProps;
        objBuilder2.pollTimeoutMs = 10L;
        objBuilder2.pollTimeoutMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = objBuilder8.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objBuilder10.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = objBuilder10.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder2.setFirstPollOffsetStrategy(firstPollOffsetStrategy12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig14 = objBuilder13.build();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration>(objBuilder0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String>(strBuilder0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type>(objBuilderBuilder0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.io.Serializable> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.io.Serializable> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.io.Serializable>(objBuilderBuilder0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableBuilder0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.Type> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.Type>(charSequenceBuilder0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(annotatedElementBuilder0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>(strBuilder0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strBuilder0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementBuilder0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(objBuilder0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(typeBuilder0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.io.Serializable> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.io.Serializable>(typeBuilder0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) 100;
        long long10 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.List<java.lang.String> strList11 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationBuilder0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.retryService;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strBuilder0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.Type> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.Type>(typeBuilder0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        long long6 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder7.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objBuilder7.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        long long12 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer9 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String>(objBuilderBuilder0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Object>(annotatedElementBuilder0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(serializableBuilder0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.CharSequence>(charSequenceBuilder0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = objBuilder4.setOffsetCommitPeriodMs((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder10.build();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.util.List<java.lang.String> strList8 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = objBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = objBuilder0.build();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long11 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int12 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 100L;
        long long17 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        long long7 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.util.regex.Pattern pattern9 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.getRetryService();
        int int6 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long9 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationBuilder0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = ' ';
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 0);
        objBuilder4.offsetCommitPeriodMs = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder4.build();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder2.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilder2.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objBuilder2.build();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(objBuilderBuilder0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.retryService;
        int int7 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = objBuilder4.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilder4.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilder4.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder4.build();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilder4.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder6 = objBuilder4.tuplesBuilder;
        long long7 = objBuilder4.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder4.build();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        int int10 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilderKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder7 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(serializableBuilder0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long8 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = '4';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objBuilderKafkaSpoutConfig0.retryService;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = ' ';
        java.lang.String str13 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration>(objBuilderKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(objBuilder0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 100L;
        int int7 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern8 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder6.setMaxUncommittedOffsets(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder8.build();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        java.util.List<java.lang.String> strList5 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceBuilder0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.Type> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.Type>(serializableBuilder0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long2 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder9 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        long long11 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder12 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder1 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str2 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long3 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = '4';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilder5.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder5.build();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int6 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.List<java.lang.String> strList7 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long10 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long11 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer5 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 1;
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        long long7 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer12 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer14 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern3 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long5 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        long long5 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder7 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.toString();
        long long4 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long5 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder9 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilder0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objBuilder0.build();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        int int7 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strBuilder0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder3 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        long long7 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        long long4 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (-1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str2 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder3 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str3 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (byte) -1;
        int int7 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.util.regex.Pattern pattern13 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        long long14 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 100L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        long long12 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer14 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long3 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        long long10 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long11 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder7 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer15 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        long long10 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long11 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.regex.Pattern pattern13 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.util.List<java.lang.String> strList8 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objBuilder8.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder8.setMaxUncommittedOffsets((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = objBuilder11.build();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.getRetryService();
        int int6 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long9 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long11 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.kafkaProps;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long16 = objBuilderKafkaSpoutConfig15.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList17 = objBuilderKafkaSpoutConfig15.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer18 = objBuilderKafkaSpoutConfig15.getValueDeserializer();
        java.util.regex.Pattern pattern19 = objBuilderKafkaSpoutConfig15.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig15.maxUncommittedOffsets = (byte) 1;
        long long22 = objBuilderKafkaSpoutConfig15.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder25 = objBuilder23.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService26 = objBuilder23.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder27 = objBuilder23.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder28 = objBuilder23.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder30 = objBuilder23.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy31 = objBuilder30.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig15.firstPollOffsetStrategy = firstPollOffsetStrategy31;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy31;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder8 = objBuilder0.tuplesBuilder;
        long long9 = objBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer10 = objBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder12 = objBuilder0.setMaxUncommittedOffsets((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = objBuilder12.build();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long9 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer10 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder11 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer14 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(genericDeclarationBuilder0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 52L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.getRetryService();
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer1 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.List<java.lang.String> strList4 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long11 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer12 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer15 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder16 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        int int9 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder10 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.kafkaProps;
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs(200L);
        int int8 = objBuilder0.maxUncommittedOffsets;
        objBuilder0.pollTimeoutMs = 1L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder0.build();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Comparable<java.lang.String>> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Comparable<java.lang.String>> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.Comparable<java.lang.String>>(objBuilderBuilder0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objBuilderKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }
}

