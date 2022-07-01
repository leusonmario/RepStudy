import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.close();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.shutdown();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.activate();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords5 = genericDeclarationKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.deactivate();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = genericDeclarationKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.nextTuple();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = genericDeclarationKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.deactivate();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.shutdown();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        genericDeclarationKafkaSpout0.maxRetries = '#';
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = genericDeclarationKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.activate();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        int int1 = genericDeclarationKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = genericDeclarationKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = genericDeclarationKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        boolean boolean5 = genericDeclarationKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = genericDeclarationKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        genericDeclarationKafkaSpout0.maxRetries = '#';
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = genericDeclarationKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = genericDeclarationKafkaSpout0.commit();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = genericDeclarationKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.nextTuple();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.maxRetries = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = genericDeclarationKafkaSpout0.poll();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = genericDeclarationKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.nextTuple();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.deactivate();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = genericDeclarationKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer4 = genericDeclarationKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = genericDeclarationKafkaSpout0.poll();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        boolean boolean5 = genericDeclarationKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = genericDeclarationKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords4 = genericDeclarationKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        genericDeclarationKafkaSpout0.maxRetries = '#';
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = genericDeclarationKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = true;
        boolean boolean7 = genericDeclarationKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.activate();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        genericDeclarationKafkaSpout0.maxRetries = '#';
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = genericDeclarationKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = genericDeclarationKafkaSpout0.commit();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.deactivate();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.shutdown();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = '4';
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer8 = genericDeclarationKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = genericDeclarationKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer5 = genericDeclarationKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.maxRetries = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = genericDeclarationKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.activate();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = genericDeclarationKafkaSpout0.commit();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.close();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = false;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = genericDeclarationKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords6 = genericDeclarationKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = genericDeclarationKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = genericDeclarationKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.nextTuple();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.deactivate();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.close();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.initialized;
        genericDeclarationKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = genericDeclarationKafkaSpout0.commit();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        genericDeclarationKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = genericDeclarationKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        java.lang.String str4 = genericDeclarationKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer5 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer6 = genericDeclarationKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = genericDeclarationKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = '4';
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer8 = genericDeclarationKafkaSpout0.kafkaConsumer;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = genericDeclarationKafkaSpout0.commit();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords5 = genericDeclarationKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords1 = genericDeclarationKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        int int1 = genericDeclarationKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.nextTuple();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        boolean boolean5 = genericDeclarationKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        genericDeclarationKafkaSpout0.maxRetries = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.maxRetries = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = genericDeclarationKafkaSpout0.retryService;
        genericDeclarationKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.activate();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = '4';
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer8 = genericDeclarationKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = true;
        boolean boolean7 = genericDeclarationKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = genericDeclarationKafkaSpout0.getNamedTopics();
    }
}

