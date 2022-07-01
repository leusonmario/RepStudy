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
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = strKafkaSpout0.commit();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = strKafkaSpout0.commit();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords10 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpout0.poll();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = strKafkaSpout0.poll();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = strKafkaSpout0.commit();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords8 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer3 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout5.maxRetries = (byte) -1;
        int int8 = strKafkaSpout5.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray9 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet10, kafkaSpoutMessageIdArray9);
        strKafkaSpout5.emitted = kafkaSpoutMessageIdSet10;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = strKafkaSpout0.poll();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpout0.commit();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout5.maxRetries = (byte) -1;
        int int8 = strKafkaSpout5.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray9 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet10, kafkaSpoutMessageIdArray9);
        strKafkaSpout5.emitted = kafkaSpoutMessageIdSet10;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords14 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = strKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = strKafkaSpout0.poll();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.numUncommittedOffsets = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords8 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = strKafkaSpout0.poll();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        boolean boolean5 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        int int8 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpout0.commit();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        boolean boolean6 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = strKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpout0.poll();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpout0.poll();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = strKafkaSpout0.commit();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str5 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder6 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        int int8 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        strKafkaSpout0.numUncommittedOffsets = 100L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpout0.poll();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.numUncommittedOffsets = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer12 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str5 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpout0.commit();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        boolean boolean5 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout5.maxRetries = (byte) -1;
        int int8 = strKafkaSpout5.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray9 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet10, kafkaSpoutMessageIdArray9);
        strKafkaSpout5.emitted = kafkaSpoutMessageIdSet10;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer5 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpout0.commit();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = strKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        boolean boolean6 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = strKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpout0.poll();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpout0.poll();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean4 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpout0.commit();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        boolean boolean6 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        boolean boolean9 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer11 = strKafkaSpout0.commitTimer;
        long long12 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpout0.poll();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        int int10 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder11 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer3 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        long long2 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        int int6 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        int int8 = strKafkaSpout0.maxRetries;
        boolean boolean9 = strKafkaSpout0.initialized;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean2 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        java.lang.String str7 = strKafkaSpout0.toString();
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        strKafkaSpout0.numUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        boolean boolean9 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpout0.poll();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        long long6 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        java.lang.String str9 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        int int5 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.numUncommittedOffsets = 1L;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = strKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean9 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpout0.commit();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        strKafkaSpout0.numUncommittedOffsets = 100L;
        strKafkaSpout0.numUncommittedOffsets = 0L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.initialized;
        boolean boolean8 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        strKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        strKafkaSpout0.numUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.numUncommittedOffsets = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords3 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        int int10 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        int int8 = strKafkaSpout0.maxRetries;
        boolean boolean9 = strKafkaSpout0.initialized;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder11 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder5 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = strKafkaSpout0.collector;
        boolean boolean8 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        int int8 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer11 = strKafkaSpout0.commitTimer;
        boolean boolean12 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords13 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        java.lang.String str5 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        strKafkaSpout0.numUncommittedOffsets = 100L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        boolean boolean5 = strKafkaSpout0.initialized;
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        int int10 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder11 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = strKafkaSpout0.commit();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        java.lang.String str9 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str5 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder6 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        int int7 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        java.lang.String str9 = strKafkaSpout0.toString();
        java.lang.String str10 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = strKafkaSpout0.retryService;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = (byte) 10;
        strKafkaSpout0.maxRetries = 97;
        boolean boolean12 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        boolean boolean8 = strKafkaSpout0.consumerAutoCommitMode;
        strKafkaSpout0.numUncommittedOffsets = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder3 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpout0.poll();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout4 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout4.maxRetries = (byte) -1;
        int int7 = strKafkaSpout4.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        strKafkaSpout4.emitted = kafkaSpoutMessageIdSet9;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        strKafkaSpout0.initialized = false;
        strKafkaSpout0.maxRetries = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        strKafkaSpout0.maxRetries = '4';
        strKafkaSpout0.numUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig15 = strKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        java.lang.String str11 = strKafkaSpout0.toString();
        java.lang.String str12 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        long long2 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = strKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer3 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        java.lang.String str11 = strKafkaSpout0.toString();
        java.lang.String str12 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer11 = strKafkaSpout0.commitTimer;
        boolean boolean12 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        int int8 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpout0.poll();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        strKafkaSpout0.maxRetries = '4';
        strKafkaSpout0.numUncommittedOffsets = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        java.lang.String str11 = strKafkaSpout0.toString();
        java.lang.String str12 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        strKafkaSpout0.initialized = false;
        strKafkaSpout0.maxRetries = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = strKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpout0.poll();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords11 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpout0.commit();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        strKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        int int8 = strKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        int int8 = strKafkaSpout0.maxRetries;
        long long9 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        boolean boolean9 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = true;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        java.lang.String str11 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        boolean boolean5 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.numUncommittedOffsets = 1L;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer12 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder13 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean10 = strKafkaSpout0.commit();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer11 = strKafkaSpout0.commitTimer;
        boolean boolean12 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = strKafkaSpout0.emitted;
        boolean boolean13 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        boolean boolean9 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        boolean boolean9 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        java.lang.String str11 = strKafkaSpout0.toString();
        java.lang.String str12 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.activate();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        strKafkaSpout0.maxRetries = (short) -1;
        java.lang.String str7 = strKafkaSpout0.toString();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        int int8 = strKafkaSpout0.maxRetries;
        boolean boolean9 = strKafkaSpout0.initialized;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        boolean boolean6 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = strKafkaSpout0.kafkaSpoutConfig;
        boolean boolean9 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.initialized = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.consumerAutoCommitMode = true;
        strKafkaSpout0.maxRetries = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout4 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout4.maxRetries = (byte) -1;
        int int7 = strKafkaSpout4.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        strKafkaSpout4.emitted = kafkaSpoutMessageIdSet9;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords7 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.deactivate();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = strKafkaSpout0.commit();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = (byte) 10;
        strKafkaSpout0.maxRetries = 97;
        boolean boolean12 = strKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str6 = strKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder4 = strKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.nextTuple();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        int int10 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder11 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer12 = strKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords13 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.close();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpout0.retryService;
        strKafkaSpout0.numUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.shutdown();
    }
}

