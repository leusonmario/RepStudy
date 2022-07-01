import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.slf4j.Logger logger0 = null;
        org.apache.storm.kafka.spout.KafkaSpout.LOG = logger0;
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator0 = null;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator0;
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.CharSequence>.Timer timer4 = kafkaSpout0.new Timer((long) '#', (long) (short) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        long long0 = org.apache.kafka.clients.consumer.ConsumerRecord.NO_TIMESTAMP;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.header.Headers headers10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Object>("", 1, (long) (byte) -1, 0L, timestampType4, (java.lang.Long) 10L, 100, 0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) "", headers10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator0 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdComparator0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>, java.lang.String>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.apache.kafka.common.header.Headers headers11 = null;
        java.util.Optional<java.lang.Integer> intOptional12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.Object>("", (int) (byte) 0, (long) (byte) 100, (long) (byte) -1, timestampType4, (java.lang.Long) 10L, (int) '4', (int) 'a', (java.lang.reflect.AnnotatedElement) wildcardClass9, (java.lang.Object) 1.0f, headers11, intOptional12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.io.Serializable>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.apache.kafka.clients.consumer.ConsumerRecord.NULL_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = strKafkaSpout9.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = null;
        strKafkaSpout9.kafkaSpoutConfig = strKafkaSpoutConfig11;
        org.apache.kafka.common.header.Headers headers13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.base.BaseComponent, org.apache.storm.topology.IComponent> baseComponentConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.base.BaseComponent, org.apache.storm.topology.IComponent>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, (long) (byte) 10, 10L, timestampType4, (java.lang.Long) 0L, (int) (byte) 1, (int) 'a', (org.apache.storm.topology.base.BaseComponent) strKafkaSpout8, (org.apache.storm.topology.IComponent) strKafkaSpout9, headers13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords4 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int0 = org.apache.kafka.clients.consumer.ConsumerRecord.NULL_CHECKSUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.header.Headers headers10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, 0L, (long) 100, timestampType4, (java.lang.Long) 0L, 100, (int) (short) 100, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "", headers10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.kafka.common.TopicPartition topicPartition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition2, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(headerIterableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = offsetComparator0.compare(kafkaSpoutMessageId1, kafkaSpoutMessageId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType4, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers23, intOptional24);
        java.lang.Class<?> wildcardClass26 = headers23.getClass();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.slf4j.Logger logger0 = org.apache.storm.kafka.spout.KafkaSpout.LOG;
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition3, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer8;
        java.util.Map map10 = null;
        org.apache.storm.task.TopologyContext topologyContext11 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map10, topologyContext11, spoutOutputCollector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        strKafkaSpout0.maxRetries = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = kafkaSpoutMessageIdSet1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Map map2 = null;
        org.apache.storm.task.TopologyContext topologyContext3 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map2, topologyContext3, spoutOutputCollector4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaConsumer7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        java.lang.Class<?> wildcardClass5 = strKafkaSpout0.getClass();
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords4 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str6 = strKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition6, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.spout.ISpout, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>> iSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>> iSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>>(iSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout16 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet17 = strKafkaSpout16.emitted;
        java.lang.Class<?> wildcardClass18 = strKafkaSpout16.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.apache.kafka.common.record.TimestampType timestampType28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType28, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int35 = charSequenceConsumerRecord34.serializedValueSize();
        java.lang.CharSequence charSequence36 = charSequenceConsumerRecord34.key();
        org.apache.kafka.common.header.Headers headers37 = charSequenceConsumerRecord34.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray38 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList39 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList39, kafkaSpoutMessageIdArray38);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers37, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList39);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>("KafkaSpout{acked=null, emitted=null}", (int) (short) 1, (long) 'a', (long) 1, timestampType12, (java.lang.Long) 10L, 100, (int) (byte) 100, (java.lang.reflect.AnnotatedElement) wildcardClass18, (java.lang.reflect.AnnotatedElement) wildcardClass20, headers37);
        org.apache.kafka.common.record.TimestampType timestampType50 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType50, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int57 = charSequenceConsumerRecord56.serializedValueSize();
        java.lang.CharSequence charSequence58 = charSequenceConsumerRecord56.key();
        org.apache.kafka.common.header.Headers headers59 = charSequenceConsumerRecord56.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray60 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList61 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList61, kafkaSpoutMessageIdArray60);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers59, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList61);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationConsumerRecord64 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) 52, (long) '#', timestampType4, (long) '4', (int) (byte) -1, 1, (java.lang.reflect.GenericDeclaration) wildcardClass18, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList61);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence36 + "' != '" + "" + "'", charSequence36, "");
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence58 + "' != '" + "" + "'", charSequence58, "");
        org.junit.Assert.assertNotNull(headers59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = strConsumerRecordItor7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator4;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator6);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator0.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Map map11 = null;
        org.apache.storm.task.TopologyContext topologyContext12 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map11, topologyContext12, spoutOutputCollector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        org.apache.kafka.common.record.TimestampType timestampType11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType11, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int18 = charSequenceConsumerRecord17.serializedValueSize();
        java.lang.CharSequence charSequence19 = charSequenceConsumerRecord17.key();
        org.apache.kafka.common.header.Headers headers20 = charSequenceConsumerRecord17.headers();
        int int21 = charSequenceConsumerRecord17.partition();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) charSequenceConsumerRecord17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.kafka.clients.consumer.ConsumerRecord cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord6 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator4);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator4.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = offsetComparator0.compare(kafkaSpoutMessageId3, kafkaSpoutMessageId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str16 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str16, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        java.lang.Class<?> wildcardClass5 = kafkaSpoutMessageIdComparator3.getClass();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection4 = strKafkaSpout0.toArrayList(topicPartition3);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(topicPartitionCollection4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.kafka.common.record.TimestampType timestampType6 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType6, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long13 = charSequenceConsumerRecord12.checksum();
        int int14 = charSequenceConsumerRecord12.partition();
        long long15 = charSequenceConsumerRecord12.timestamp();
        long long16 = charSequenceConsumerRecord12.offset();
        int int17 = charSequenceConsumerRecord12.partition();
        java.lang.CharSequence charSequence18 = charSequenceConsumerRecord12.key();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) charSequence18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        strKafkaSpout0.collector = spoutOutputCollector3;
        java.lang.Class<?> wildcardClass5 = strKafkaSpout0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str11 = charSequenceConsumerRecord10.toString();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        int int13 = charSequenceConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout8.maxRetries = (byte) -1;
        int int11 = strKafkaSpout8.maxRetries;
        strKafkaSpout8.numUncommittedOffsets = '#';
        strKafkaSpout8.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = strKafkaSpout8.emitted;
        org.apache.kafka.common.record.TimestampType timestampType24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType24, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int31 = charSequenceConsumerRecord30.serializedValueSize();
        java.lang.CharSequence charSequence32 = charSequenceConsumerRecord30.key();
        org.apache.kafka.common.header.Headers headers33 = charSequenceConsumerRecord30.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray34 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList35 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList35, kafkaSpoutMessageIdArray34);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers33, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList35);
        org.apache.kafka.common.record.TimestampType timestampType42 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType42, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int49 = charSequenceConsumerRecord48.serializedValueSize();
        java.lang.CharSequence charSequence50 = charSequenceConsumerRecord48.key();
        org.apache.kafka.common.header.Headers headers51 = charSequenceConsumerRecord48.headers();
        org.apache.kafka.common.record.TimestampType timestampType56 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType56, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long63 = charSequenceConsumerRecord62.offset();
        int int64 = charSequenceConsumerRecord62.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional65 = charSequenceConsumerRecord62.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) '4', (long) (short) 0, (long) 100, timestampType4, (java.lang.Long) 1L, (int) (short) 0, 0, (java.lang.Object) kafkaSpoutMessageIdSet16, (java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList35, headers51, intOptional65);
        java.lang.Class<?> wildcardClass67 = kafkaSpoutMessageIdList35.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet16);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence32 + "' != '" + "" + "'", charSequence32, "");
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence50 + "' != '" + "" + "'", charSequence50, "");
        org.junit.Assert.assertNotNull(headers51);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intOptional65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords14 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        int int17 = charSequenceConsumerRecord10.partition();
        long long18 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional19 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.Class<?> wildcardClass20 = charSequenceConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout13 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout13.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = strKafkaSpout13.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = strKafkaSpout13.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = strKafkaSpout13.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) strKafkaSpout13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
        org.junit.Assert.assertNull(firstPollOffsetStrategy16);
        org.junit.Assert.assertNull(firstPollOffsetStrategy17);
        org.junit.Assert.assertNull(firstPollOffsetStrategy18);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition6, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType12, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long19 = charSequenceConsumerRecord18.checksum();
        int int20 = charSequenceConsumerRecord18.partition();
        java.lang.String str21 = charSequenceConsumerRecord18.value();
        int int22 = charSequenceConsumerRecord18.serializedKeySize();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        strKafkaSpout0.numUncommittedOffsets = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer6 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaConsumer6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder11 = strKafkaSpout0.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.CharSequence> offsetComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.CharSequence> offsetComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.CharSequence>(offsetComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout6.maxRetries = (byte) -1;
        int int9 = strKafkaSpout6.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray10 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet11, kafkaSpoutMessageIdArray10);
        strKafkaSpout6.emitted = kafkaSpoutMessageIdSet11;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        strKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams14;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) kafkaSpoutStreams14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertNull(strKafkaSpoutConfig5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean12 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        int int9 = strKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout9.maxRetries = (byte) -1;
        int int12 = strKafkaSpout9.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor13 = null;
        strKafkaSpout9.waitingToEmit = strConsumerRecordItor13;
        org.apache.kafka.common.TopicPartition topicPartition15 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection16 = strKafkaSpout9.toArrayList(topicPartition15);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer17 = strKafkaSpout9.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = strKafkaSpout9.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray23 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet24 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet24, kafkaSpoutMessageIdArray23);
        strKafkaSpout19.emitted = kafkaSpoutMessageIdSet24;
        strKafkaSpout9.emitted = kafkaSpoutMessageIdSet24;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet24;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection16);
        org.junit.Assert.assertNull(timer17);
        org.junit.Assert.assertNull(spoutOutputCollector18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object>();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator15;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = offsetComparator0.compare(kafkaSpoutMessageId4, kafkaSpoutMessageId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator13.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        java.lang.Class<?> wildcardClass28 = kafkaSpoutMessageIdComparator21.getClass();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection4 = strKafkaSpout0.toArrayList(topicPartition3);
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(topicPartitionCollection4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        strKafkaSpout0.numUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strKafkaSpoutConfig7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>>();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>, java.lang.reflect.AnnotatedElement>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        java.util.Map map10 = null;
        org.apache.storm.task.TopologyContext topologyContext11 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map10, topologyContext11, spoutOutputCollector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = offsetComparator0.compare(kafkaSpoutMessageId2, kafkaSpoutMessageId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        boolean boolean4 = strKafkaSpout0.waitingToEmit();
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = offsetComparator7.compare(kafkaSpoutMessageId17, kafkaSpoutMessageId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = strKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(charSequenceKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder2;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, org.apache.storm.topology.base.BaseRichSpout> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, org.apache.storm.topology.base.BaseRichSpout>();
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.spout.ISpout> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.storm.spout.ISpout> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.storm.spout.ISpout>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.reflect.Type>.Timer> headerIterableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.reflect.Type>.Timer> headerIterableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.reflect.Type>.Timer>(headerIterableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (-1), (long) ' ', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        int int6 = charSequenceConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator13.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId29 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = offsetComparator23.compare(kafkaSpoutMessageId29, kafkaSpoutMessageId30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType4, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers23, intOptional24);
        long long26 = charSequenceConsumerRecord25.checksum();
        java.lang.String str27 = charSequenceConsumerRecord25.value();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str27, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder2;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList12 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList12, kafkaSpoutMessageIdArray11);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Comparable<java.lang.String>> kafkaSpoutMessageIdCollectionConsumerRecord15 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Comparable<java.lang.String>>("KafkaSpout{acked=null, emitted=null}", (-1), (long) (short) -1, (long) 10, timestampType7, (long) 1, (int) 'a', (-1), (java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList12, (java.lang.Comparable<java.lang.String>) "KafkaSpout{acked=null, emitted=null}");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout16 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout16.maxRetries = (byte) -1;
        int int19 = strKafkaSpout16.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor20 = null;
        strKafkaSpout16.waitingToEmit = strConsumerRecordItor20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig22 = null;
        strKafkaSpout16.kafkaSpoutConfig = strKafkaSpoutConfig22;
        int int24 = strKafkaSpout16.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = null;
        strKafkaSpout16.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        boolean boolean27 = strKafkaSpout16.consumerAutoCommitMode;
        java.lang.Class<?> wildcardClass28 = strKafkaSpout16.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.RandomAccess, java.lang.reflect.GenericDeclaration> randomAccessConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.RandomAccess, java.lang.reflect.GenericDeclaration>("", (int) (byte) 1, 100L, (java.util.RandomAccess) kafkaSpoutMessageIdList12, (java.lang.reflect.GenericDeclaration) wildcardClass28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator15.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator17 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator17;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator24;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator24);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator19.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator24);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator28;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator28.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = offsetComparator28.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator24.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator28);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = kafkaSpoutMessageIdComparator32.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator15.thenComparing(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.CharSequence>.Timer timer4 = kafkaSpout0.new Timer(10L, (long) (byte) 100, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = strKafkaSpout0.toArrayList(topicPartition7);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        strKafkaSpout0.initialized = false;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet14 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService15;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService10;
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition12, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.lang.Class<?> wildcardClass14 = kafkaSpoutMessageIdSet10.getClass();
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = offsetComparator0.compare(kafkaSpoutMessageId5, kafkaSpoutMessageId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition3, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str10 = charSequenceConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType11 = charSequenceConsumerRecord9.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout15 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout15.maxRetries = (byte) -1;
        int int18 = strKafkaSpout15.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor19 = null;
        strKafkaSpout15.waitingToEmit = strConsumerRecordItor19;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer21 = strKafkaSpout15.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer22 = strKafkaSpout15.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType28, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long35 = charSequenceConsumerRecord34.offset();
        long long36 = charSequenceConsumerRecord34.checksum();
        int int37 = charSequenceConsumerRecord34.serializedKeySize();
        org.apache.kafka.common.header.Headers headers38 = charSequenceConsumerRecord34.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType11, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout15, (java.lang.CharSequence) "hi!", headers38);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout15.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(timer21);
        org.junit.Assert.assertNull(strKafkaConsumer22);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertNotNull(headers38);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        boolean boolean10 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable>(iComponentKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        strKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        strKafkaSpout0.collector = spoutOutputCollector14;
        boolean boolean16 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition8, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        long long15 = charSequenceConsumerRecord10.checksum();
        int int16 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str17 = charSequenceConsumerRecord10.value();
        java.util.Optional<java.lang.Integer> intOptional18 = charSequenceConsumerRecord10.leaderEpoch();
        int int19 = charSequenceConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str10 = charSequenceConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType11 = charSequenceConsumerRecord9.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout15 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout15.maxRetries = (byte) -1;
        int int18 = strKafkaSpout15.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor19 = null;
        strKafkaSpout15.waitingToEmit = strConsumerRecordItor19;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer21 = strKafkaSpout15.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer22 = strKafkaSpout15.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType28, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long35 = charSequenceConsumerRecord34.offset();
        long long36 = charSequenceConsumerRecord34.checksum();
        int int37 = charSequenceConsumerRecord34.serializedKeySize();
        org.apache.kafka.common.header.Headers headers38 = charSequenceConsumerRecord34.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType11, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout15, (java.lang.CharSequence) "hi!", headers38);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout15.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(timer21);
        org.junit.Assert.assertNull(strKafkaConsumer22);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertNotNull(headers38);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpout0.firstPollOffsetStrategy;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer9;
        java.util.Map map11 = null;
        org.apache.storm.task.TopologyContext topologyContext12 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map11, topologyContext12, spoutOutputCollector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = null;
        strKafkaSpout0.collector = spoutOutputCollector2;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator2 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator9 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator9;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator4.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator1.thenComparing(kafkaSpoutMessageIdComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = kafkaSpoutMessageIdComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator16;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator18.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator27;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = offsetComparator27.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator34 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator34;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = kafkaSpoutMessageIdComparator29.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = kafkaSpoutMessageIdComparator18.thenComparing(kafkaSpoutMessageIdComparator37);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator38);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId40 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = offsetComparator0.compare(kafkaSpoutMessageId40, kafkaSpoutMessageId41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = (-1L);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        long long6 = strKafkaSpout0.numUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout5.maxRetries = (byte) -1;
        int int8 = strKafkaSpout5.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = null;
        strKafkaSpout5.waitingToEmit = strConsumerRecordItor9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = null;
        strKafkaSpout5.kafkaSpoutConfig = strKafkaSpoutConfig11;
        int int13 = strKafkaSpout5.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        strKafkaSpout5.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = strKafkaSpout5.emitted;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) kafkaSpoutMessageIdSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet16);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator8;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator8);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator3.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator8);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator12;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator8.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator16);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = offsetComparator0.compare(kafkaSpoutMessageId18, kafkaSpoutMessageId19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        strKafkaSpout0.numUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = strKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strKafkaSpoutConfig7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str11 = charSequenceConsumerRecord10.toString();
        int int12 = charSequenceConsumerRecord10.serializedValueSize();
        int int13 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        boolean boolean10 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType13 = charSequenceConsumerRecord10.timestampType();
        long long14 = charSequenceConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNull(timestampType13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strKafkaConsumer9);
        org.junit.Assert.assertNull(strKafkaConsumer10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition11, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        strKafkaSpout0.numUncommittedOffsets = 35L;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
        org.junit.Assert.assertNull(firstPollOffsetStrategy2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>.Timer timer4 = kafkaSpout0.new Timer((long) (short) -1, (long) 52, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer6 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords8 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertNull(timer10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = strKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(spoutOutputCollector7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        boolean boolean7 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = (byte) 10;
        strKafkaSpout0.maxRetries = 97;
        java.util.Map map12 = null;
        org.apache.storm.task.TopologyContext topologyContext13 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map12, topologyContext13, spoutOutputCollector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout9.maxRetries = (byte) -1;
        int int12 = strKafkaSpout9.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor13 = null;
        strKafkaSpout9.waitingToEmit = strConsumerRecordItor13;
        org.apache.kafka.common.TopicPartition topicPartition15 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection16 = strKafkaSpout9.toArrayList(topicPartition15);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer17 = strKafkaSpout9.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = strKafkaSpout9.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray23 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet24 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet24, kafkaSpoutMessageIdArray23);
        strKafkaSpout19.emitted = kafkaSpoutMessageIdSet24;
        strKafkaSpout9.emitted = kafkaSpoutMessageIdSet24;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet24;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder29 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder29;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection16);
        org.junit.Assert.assertNull(timer17);
        org.junit.Assert.assertNull(spoutOutputCollector18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        java.lang.String str9 = strKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder5 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout10.maxRetries = (byte) -1;
        int int13 = strKafkaSpout10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray14 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet15, kafkaSpoutMessageIdArray14);
        strKafkaSpout10.emitted = kafkaSpoutMessageIdSet15;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet15;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout10.maxRetries = (byte) -1;
        int int13 = strKafkaSpout10.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor14 = null;
        strKafkaSpout10.waitingToEmit = strConsumerRecordItor14;
        org.apache.kafka.common.TopicPartition topicPartition16 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection17 = strKafkaSpout10.toArrayList(topicPartition16);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = strKafkaSpout10.retryService;
        org.apache.kafka.common.TopicPartition topicPartition19 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection20 = strKafkaSpout10.toArrayList(topicPartition19);
        boolean boolean21 = strKafkaSpout10.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection17);
        org.junit.Assert.assertNull(kafkaSpoutRetryService18);
        org.junit.Assert.assertNotNull(topicPartitionCollection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType7, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int14 = charSequenceConsumerRecord13.serializedValueSize();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord13.key();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord13.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray17 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList18 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList18, kafkaSpoutMessageIdArray17);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers16, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList18);
        java.lang.Class<?> wildcardClass21 = kafkaSpoutMessageIdList18.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator2 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator1.thenComparing(kafkaSpoutMessageIdComparator4);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator4.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator0.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        java.lang.Class<?> wildcardClass12 = kafkaSpoutMessageIdComparator11.getClass();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        strKafkaSpout0.initialized = false;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet14 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet14);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.apache.kafka.common.record.TimestampType timestampType13 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout17 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout17.maxRetries = (byte) -1;
        int int20 = strKafkaSpout17.maxRetries;
        strKafkaSpout17.numUncommittedOffsets = '#';
        strKafkaSpout17.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet25 = strKafkaSpout17.emitted;
        org.apache.kafka.common.record.TimestampType timestampType33 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType33, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int40 = charSequenceConsumerRecord39.serializedValueSize();
        java.lang.CharSequence charSequence41 = charSequenceConsumerRecord39.key();
        org.apache.kafka.common.header.Headers headers42 = charSequenceConsumerRecord39.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray43 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList44 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList44, kafkaSpoutMessageIdArray43);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers42, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList44);
        org.apache.kafka.common.record.TimestampType timestampType51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType51, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int58 = charSequenceConsumerRecord57.serializedValueSize();
        java.lang.CharSequence charSequence59 = charSequenceConsumerRecord57.key();
        org.apache.kafka.common.header.Headers headers60 = charSequenceConsumerRecord57.headers();
        org.apache.kafka.common.record.TimestampType timestampType65 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType65, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long72 = charSequenceConsumerRecord71.offset();
        int int73 = charSequenceConsumerRecord71.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional74 = charSequenceConsumerRecord71.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) '4', (long) (short) 0, (long) 100, timestampType13, (java.lang.Long) 1L, (int) (short) 0, 0, (java.lang.Object) kafkaSpoutMessageIdSet25, (java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList44, headers60, intOptional74);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(spoutOutputCollector8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet25);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence41 + "' != '" + "" + "'", charSequence41, "");
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence59 + "' != '" + "" + "'", charSequence59, "");
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intOptional74);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout8.maxRetries = (byte) -1;
        int int11 = strKafkaSpout8.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor12 = null;
        strKafkaSpout8.waitingToEmit = strConsumerRecordItor12;
        org.apache.kafka.common.TopicPartition topicPartition14 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection15 = strKafkaSpout8.toArrayList(topicPartition14);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer16 = strKafkaSpout8.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector17 = strKafkaSpout8.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout18.maxRetries = (byte) -1;
        int int21 = strKafkaSpout18.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray22 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet23 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet23, kafkaSpoutMessageIdArray22);
        strKafkaSpout18.emitted = kafkaSpoutMessageIdSet23;
        strKafkaSpout8.emitted = kafkaSpoutMessageIdSet23;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) kafkaSpoutMessageIdSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.LinkedHashSet cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection15);
        org.junit.Assert.assertNull(timer16);
        org.junit.Assert.assertNull(spoutOutputCollector17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        java.util.Map map10 = null;
        org.apache.storm.task.TopologyContext topologyContext11 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map10, topologyContext11, spoutOutputCollector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        strKafkaSpout0.initialized = false;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet14 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService15;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder17 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder17;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet14);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = strKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        long long15 = charSequenceConsumerRecord10.checksum();
        int int16 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str17 = charSequenceConsumerRecord10.value();
        java.util.Optional<java.lang.Integer> intOptional18 = charSequenceConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType19 = charSequenceConsumerRecord10.timestampType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = timestampType19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertNull(timestampType19);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator5 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator12;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator0.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = offsetComparator0.compare(kafkaSpoutMessageId17, kafkaSpoutMessageId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer2 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer2;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IRichSpout, java.util.Optional<java.lang.Integer>> iRichSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.Optional<java.lang.Integer>> iRichSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.Optional<java.lang.Integer>>(iRichSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        strKafkaSpout0.consumerAutoCommitMode = true;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout0.toArrayList(topicPartition9);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        long long14 = charSequenceConsumerRecord10.checksum();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer8;
        strKafkaSpout0.numUncommittedOffsets = 1L;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = strKafkaSpout0.kafkaSpoutConfig;
        int int12 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder13 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder13;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional17 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(intOptional17);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = strKafkaSpout0.tuplesBuilder;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        java.util.Map map12 = null;
        org.apache.storm.task.TopologyContext topologyContext13 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map12, topologyContext13, spoutOutputCollector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder2;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams10;
        int int12 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.reflect.GenericDeclaration>(objKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        boolean boolean9 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition4, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        strKafkaSpout0.maxRetries = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator2 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator2.thenComparing(kafkaSpoutMessageIdComparator5);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator6);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator0.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = null;
        strKafkaSpout0.collector = spoutOutputCollector18;
        int int20 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        strKafkaSpout0.collector = spoutOutputCollector14;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = strKafkaSpout0.toArrayList(topicPartition7);
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        long long15 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord10.headers();
        org.apache.kafka.common.record.TimestampType timestampType17 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str18 = charSequenceConsumerRecord10.topic();
        long long19 = charSequenceConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator7.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator13;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator15.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator7.thenComparing(kafkaSpoutMessageIdComparator24);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId27 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = offsetComparator7.compare(kafkaSpoutMessageId27, kafkaSpoutMessageId28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = null;
        strKafkaSpout0.collector = spoutOutputCollector18;
        int int20 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords21 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = strKafkaSpout0.kafkaSpoutConfig;
        int int12 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder13 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder13;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap16 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strKafkaConsumer9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        java.lang.Class<?> wildcardClass9 = strKafkaSpout0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = strKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.offset();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        int int15 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str16 = charSequenceConsumerRecord10.value();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) kafkaSpoutMessageIdListKafkaSpout3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder2);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, java.util.Optional<java.lang.Integer>> strKafkaSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, java.util.Optional<java.lang.Integer>> strKafkaSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, java.util.Optional<java.lang.Integer>>(strKafkaSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        strKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer8;
        strKafkaSpout0.numUncommittedOffsets = 1L;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpout0.firstPollOffsetStrategy;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition9, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str17 = charSequenceConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = charSequenceConsumerRecord16.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout22.maxRetries = (byte) -1;
        int int25 = strKafkaSpout22.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor26 = null;
        strKafkaSpout22.waitingToEmit = strConsumerRecordItor26;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer28 = strKafkaSpout22.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer29 = strKafkaSpout22.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType35 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType35, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long42 = charSequenceConsumerRecord41.offset();
        long long43 = charSequenceConsumerRecord41.checksum();
        int int44 = charSequenceConsumerRecord41.serializedKeySize();
        org.apache.kafka.common.header.Headers headers45 = charSequenceConsumerRecord41.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType18, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout22, (java.lang.CharSequence) "hi!", headers45);
        org.apache.kafka.common.record.TimestampType timestampType56 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType56, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long63 = charSequenceConsumerRecord62.checksum();
        int int64 = charSequenceConsumerRecord62.partition();
        long long65 = charSequenceConsumerRecord62.offset();
        org.apache.kafka.common.header.Headers headers66 = charSequenceConsumerRecord62.headers();
        org.apache.kafka.common.record.TimestampType timestampType71 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType71, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long78 = charSequenceConsumerRecord77.offset();
        int int79 = charSequenceConsumerRecord77.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional80 = charSequenceConsumerRecord77.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 10, 10L, 0L, timestampType18, (java.lang.Long) 35L, (int) (byte) 0, (-1), (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers66, intOptional80);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout82 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams83 = strKafkaSpout82.kafkaSpoutStreams;
        strKafkaSpout82.consumerAutoCommitMode = false;
        java.lang.String str86 = strKafkaSpout82.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout87 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout87.maxRetries = (byte) -1;
        int int90 = strKafkaSpout87.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray91 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet92 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet92, kafkaSpoutMessageIdArray91);
        strKafkaSpout87.emitted = kafkaSpoutMessageIdSet92;
        strKafkaSpout82.emitted = kafkaSpoutMessageIdSet92;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", (int) (short) -1, 0L, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers66, (java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet92);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(timer28);
        org.junit.Assert.assertNull(strKafkaConsumer29);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(headers66);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertNull(kafkaSpoutStreams83);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str86, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional12 = charSequenceConsumerRecord10.leaderEpoch();
        long long13 = charSequenceConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        strKafkaSpout0.maxRetries = (byte) 1;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str10 = charSequenceConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType11 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType19, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long26 = charSequenceConsumerRecord25.checksum();
        int int27 = charSequenceConsumerRecord25.partition();
        java.lang.String str28 = charSequenceConsumerRecord25.value();
        int int29 = charSequenceConsumerRecord25.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional30 = charSequenceConsumerRecord25.leaderEpoch();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout31 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = strKafkaSpout31.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor33 = null;
        strKafkaSpout31.waitingToEmit = strConsumerRecordItor33;
        boolean boolean35 = strKafkaSpout31.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig36 = null;
        strKafkaSpout31.kafkaSpoutConfig = strKafkaSpoutConfig36;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy38 = strKafkaSpout31.firstPollOffsetStrategy;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, org.apache.storm.topology.base.BaseComponent> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, org.apache.storm.topology.base.BaseComponent>("", (int) (short) 100, (long) (short) 1, (long) (byte) 10, timestampType11, (long) 1, (int) 'a', (-1), (java.lang.Object) charSequenceConsumerRecord25, (org.apache.storm.topology.base.BaseComponent) strKafkaSpout31);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout31.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(intOptional30);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy38);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord6 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator4);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator4;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = offsetComparator4.compare(kafkaSpoutMessageId9, kafkaSpoutMessageId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords15 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder12 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>, java.util.Optional<java.lang.Integer>> charSequenceConsumerRecordKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>, java.util.Optional<java.lang.Integer>>();
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeEnumKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeEnumKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(timestampTypeEnumKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strKafkaConsumer9);
        org.junit.Assert.assertNull(strKafkaConsumer10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        boolean boolean11 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer12 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strKafkaConsumer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strKafkaConsumer12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        boolean boolean11 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer12 = strKafkaSpout0.commitTimer;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strKafkaConsumer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(timer12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.reflect.Type> cloneableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.reflect.Type>();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout3.maxRetries = (byte) -1;
        int int6 = strKafkaSpout3.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout3.waitingToEmit = strConsumerRecordItor7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout3.toArrayList(topicPartition9);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout3.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType16 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout20 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout20.maxRetries = (byte) -1;
        int int23 = strKafkaSpout20.maxRetries;
        strKafkaSpout20.numUncommittedOffsets = '#';
        strKafkaSpout20.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet28 = strKafkaSpout20.emitted;
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType36, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int43 = charSequenceConsumerRecord42.serializedValueSize();
        java.lang.CharSequence charSequence44 = charSequenceConsumerRecord42.key();
        org.apache.kafka.common.header.Headers headers45 = charSequenceConsumerRecord42.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray46 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList47 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47, kafkaSpoutMessageIdArray46);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers45, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47);
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType54, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int61 = charSequenceConsumerRecord60.serializedValueSize();
        java.lang.CharSequence charSequence62 = charSequenceConsumerRecord60.key();
        org.apache.kafka.common.header.Headers headers63 = charSequenceConsumerRecord60.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType68, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long75 = charSequenceConsumerRecord74.offset();
        int int76 = charSequenceConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = charSequenceConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) '4', (long) (short) 0, (long) 100, timestampType16, (java.lang.Long) 1L, (int) (short) 0, 0, (java.lang.Object) kafkaSpoutMessageIdSet28, (java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47, headers63, intOptional77);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers> iSpoutConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers>("KafkaSpout{acked=null, emitted=null}", (int) '#', (long) 1, (org.apache.storm.spout.ISpout) strKafkaSpout3, headers63);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout3.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertNull(strKafkaConsumer11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet28);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence44 + "' != '" + "" + "'", charSequence44, "");
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence62 + "' != '" + "" + "'", charSequence62, "");
        org.junit.Assert.assertNotNull(headers63);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intOptional77);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        boolean boolean9 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str21 = charSequenceConsumerRecord20.toString();
        java.lang.String str22 = charSequenceConsumerRecord20.topic();
        java.lang.CharSequence charSequence23 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.record.TimestampType timestampType24 = charSequenceConsumerRecord20.timestampType();
        java.lang.String str25 = charSequenceConsumerRecord20.value();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertNull(timestampType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor11;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str6 = strKafkaSpout0.toString();
        java.lang.Class<?> wildcardClass7 = strKafkaSpout0.getClass();
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType7, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long14 = charSequenceConsumerRecord13.checksum();
        int int15 = charSequenceConsumerRecord13.partition();
        long long16 = charSequenceConsumerRecord13.timestamp();
        long long17 = charSequenceConsumerRecord13.offset();
        int int18 = charSequenceConsumerRecord13.partition();
        java.lang.CharSequence charSequence19 = charSequenceConsumerRecord13.key();
        org.apache.kafka.common.record.TimestampType timestampType20 = charSequenceConsumerRecord13.timestampType();
        java.util.Optional<java.lang.Integer> intOptional21 = charSequenceConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.header.Headers headers22 = charSequenceConsumerRecord13.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.lang.String> headersConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.lang.String>("hi!", (int) (short) 100, (long) 'a', headers22, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNull(timestampType20);
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertNotNull(headers22);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str6 = charSequenceConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional7 = charSequenceConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers8 = charSequenceConsumerRecord5.headers();
        java.lang.Class<?> wildcardClass9 = charSequenceConsumerRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator13.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator24;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator31;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator26.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator23.thenComparing(kafkaSpoutMessageIdComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator34.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator37;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator37.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator44;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = kafkaSpoutMessageIdComparator39.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator48;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = offsetComparator48.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator55 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator55;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator55);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator58 = kafkaSpoutMessageIdComparator50.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator55);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = kafkaSpoutMessageIdComparator39.thenComparing(kafkaSpoutMessageIdComparator58);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator60 = kafkaSpoutMessageIdComparator58.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator61 = kafkaSpoutMessageIdComparator34.thenComparing(kafkaSpoutMessageIdComparator58);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator62 = kafkaSpoutMessageIdComparator22.thenComparing(kafkaSpoutMessageIdComparator58);
        java.lang.Class<?> wildcardClass63 = kafkaSpoutMessageIdComparator22.getClass();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator58);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator60);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator61);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer5 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout6.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout6.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) strKafkaSpout6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
        org.junit.Assert.assertNull(timer5);
        org.junit.Assert.assertNull(timer9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.topology.base.BaseComponent> genericDeclarationKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.topology.base.BaseComponent> genericDeclarationKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.topology.base.BaseComponent>(genericDeclarationKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.common.header.Headers, org.apache.storm.topology.base.BaseComponent> headersKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, org.apache.storm.topology.base.BaseComponent> headersKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, org.apache.storm.topology.base.BaseComponent>(headersKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        strKafkaSpout0.collector = spoutOutputCollector3;
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.partition();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object>();
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = strKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(spoutOutputCollector8);
        org.junit.Assert.assertNull(strConsumerRecordItor9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.common.record.TimestampType, java.lang.Comparable<java.lang.String>> timestampTypeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.lang.Comparable<java.lang.String>> timestampTypeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.lang.Comparable<java.lang.String>>(timestampTypeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        long long12 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout0.toArrayList(topicPartition9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        strKafkaSpout0.maxRetries = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout0.toArrayList(topicPartition9);
        boolean boolean11 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = strKafkaSpout0.kafkaSpoutConfig;
        int int12 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder13 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder13;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strKafkaSpout0.retryService;
        boolean boolean16 = strKafkaSpout0.consumerAutoCommitMode;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet17 = strKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet17);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        long long12 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional13 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        int int15 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        strKafkaSpout0.collector = spoutOutputCollector14;
        boolean boolean16 = strKafkaSpout0.waitingToEmit();
        boolean boolean17 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = (-1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        java.util.Map map6 = null;
        org.apache.storm.task.TopologyContext topologyContext7 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map6, topologyContext7, spoutOutputCollector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IRichSpout, java.util.RandomAccess> iRichSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.RandomAccess> iRichSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.RandomAccess>(iRichSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = strKafkaSpout0.kafkaSpoutConfig;
        int int12 = strKafkaSpout0.maxRetries;
        boolean boolean13 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        strKafkaSpout0.numUncommittedOffsets = (byte) -1;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition5, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        java.lang.Class<?> wildcardClass16 = kafkaSpoutMessageIdSet13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer5;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        boolean boolean16 = strKafkaSpout0.consumerAutoCommitMode;
        strKafkaSpout0.maxRetries = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> timestampTypeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout3.maxRetries = (byte) -1;
        int int6 = strKafkaSpout3.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout3.waitingToEmit = strConsumerRecordItor7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout3.toArrayList(topicPartition9);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout3.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType16 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout20 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout20.maxRetries = (byte) -1;
        int int23 = strKafkaSpout20.maxRetries;
        strKafkaSpout20.numUncommittedOffsets = '#';
        strKafkaSpout20.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet28 = strKafkaSpout20.emitted;
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType36, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int43 = charSequenceConsumerRecord42.serializedValueSize();
        java.lang.CharSequence charSequence44 = charSequenceConsumerRecord42.key();
        org.apache.kafka.common.header.Headers headers45 = charSequenceConsumerRecord42.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray46 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList47 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47, kafkaSpoutMessageIdArray46);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers45, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47);
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType54, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int61 = charSequenceConsumerRecord60.serializedValueSize();
        java.lang.CharSequence charSequence62 = charSequenceConsumerRecord60.key();
        org.apache.kafka.common.header.Headers headers63 = charSequenceConsumerRecord60.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType68, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long75 = charSequenceConsumerRecord74.offset();
        int int76 = charSequenceConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = charSequenceConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) '4', (long) (short) 0, (long) 100, timestampType16, (java.lang.Long) 1L, (int) (short) 0, 0, (java.lang.Object) kafkaSpoutMessageIdSet28, (java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47, headers63, intOptional77);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers> iSpoutConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers>("KafkaSpout{acked=null, emitted=null}", (int) '#', (long) 1, (org.apache.storm.spout.ISpout) strKafkaSpout3, headers63);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer80 = strKafkaSpout3.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout3.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertNull(strKafkaConsumer11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet28);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence44 + "' != '" + "" + "'", charSequence44, "");
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence62 + "' != '" + "" + "'", charSequence62, "");
        org.junit.Assert.assertNotNull(headers63);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertNull(timer80);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = null;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords11 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder12 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder12;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder14 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder14;
        org.apache.kafka.common.TopicPartition topicPartition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition16, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection12 = strKafkaSpout0.toArrayList(topicPartition11);
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertNull(timer10);
        org.junit.Assert.assertNotNull(topicPartitionCollection12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = strKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers12 = charSequenceConsumerRecord10.headers();
        int int13 = charSequenceConsumerRecord10.serializedKeySize();
        int int14 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.Class<?> wildcardClass15 = charSequenceConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        int int10 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords11 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strKafkaSpout0.kafkaSpoutStreams;
        java.util.Map map12 = null;
        org.apache.storm.task.TopologyContext topologyContext13 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map12, topologyContext13, spoutOutputCollector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        strKafkaSpout0.collector = spoutOutputCollector3;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder10;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        int int17 = charSequenceConsumerRecord10.partition();
        long long18 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional19 = charSequenceConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional20 = charSequenceConsumerRecord10.leaderEpoch();
        int int21 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer10;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer12 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer12;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        boolean boolean9 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator2 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator1.thenComparing(kafkaSpoutMessageIdComparator4);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator4.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator0.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = offsetComparator0.compare(kafkaSpoutMessageId12, kafkaSpoutMessageId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
        org.junit.Assert.assertNull(strKafkaConsumer9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        boolean boolean9 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection4 = strKafkaSpout0.toArrayList(topicPartition3);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor10;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        strKafkaSpout0.collector = spoutOutputCollector12;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        java.util.Map map6 = null;
        org.apache.storm.task.TopologyContext topologyContext7 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map6, topologyContext7, spoutOutputCollector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType4, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers23, intOptional24);
        long long26 = charSequenceConsumerRecord25.checksum();
        long long27 = charSequenceConsumerRecord25.timestamp();
        java.lang.CharSequence charSequence28 = charSequenceConsumerRecord25.key();
        java.lang.Class<?> wildcardClass29 = charSequenceConsumerRecord25.getClass();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertEquals("'" + charSequence28 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", charSequence28, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = offsetComparator7.compare(kafkaSpoutMessageId12, kafkaSpoutMessageId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.util.Optional<java.lang.Integer>>.Timer timer4 = kafkaSpout0.new Timer((long) 97, (long) (byte) 1, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder5 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
        org.junit.Assert.assertNull(firstPollOffsetStrategy2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = strKafkaSpout0.tuplesBuilder;
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition11, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout10.maxRetries = (byte) -1;
        int int13 = strKafkaSpout10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray14 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet15, kafkaSpoutMessageIdArray14);
        strKafkaSpout10.emitted = kafkaSpoutMessageIdSet15;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet15;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.common.header.Headers> offsetComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.common.header.Headers> offsetComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.common.header.Headers>(offsetComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.CharSequence charSequence6 = charSequenceConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers7 = charSequenceConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional8 = charSequenceConsumerRecord5.leaderEpoch();
        java.lang.Class<?> wildcardClass9 = intOptional8.getClass();
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout4 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = strKafkaSpout4.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout4.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout4.collector;
        long long9 = strKafkaSpout4.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        strKafkaSpout4.collector = spoutOutputCollector10;
        java.lang.String str12 = strKafkaSpout4.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer13 = strKafkaSpout4.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder14 = strKafkaSpout4.tuplesBuilder;
        boolean boolean15 = strKafkaSpout4.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig3);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        org.junit.Assert.assertNull(spoutOutputCollector8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str12, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(timer13);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord6 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator4);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator9 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator9.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator8.thenComparing(kafkaSpoutMessageIdComparator11);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator13;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator13);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator17;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator4.thenComparing(kafkaSpoutMessageIdComparator17);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId20 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = offsetComparator4.compare(kafkaSpoutMessageId20, kafkaSpoutMessageId21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer5 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout6.maxRetries = (byte) -1;
        int int9 = strKafkaSpout6.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = null;
        strKafkaSpout6.waitingToEmit = strConsumerRecordItor10;
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection13 = strKafkaSpout6.toArrayList(topicPartition12);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = strKafkaSpout6.retryService;
        org.apache.kafka.common.TopicPartition topicPartition15 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection16 = strKafkaSpout6.toArrayList(topicPartition15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = null;
        strKafkaSpout6.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        strKafkaSpout6.retryService = kafkaSpoutRetryService19;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) strKafkaSpout6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
        org.junit.Assert.assertNull(timer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection13);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        org.junit.Assert.assertNotNull(topicPartitionCollection16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        long long15 = charSequenceConsumerRecord10.checksum();
        int int16 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str17 = charSequenceConsumerRecord10.value();
        java.util.Optional<java.lang.Integer> intOptional18 = charSequenceConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType19 = charSequenceConsumerRecord10.timestampType();
        java.lang.Class<?> wildcardClass20 = charSequenceConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = strKafkaSpout0.kafkaSpoutConfig;
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strKafkaSpoutConfig2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray6 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet7, kafkaSpoutMessageIdArray6);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType17, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long24 = charSequenceConsumerRecord23.checksum();
        int int25 = charSequenceConsumerRecord23.partition();
        long long26 = charSequenceConsumerRecord23.timestamp();
        java.lang.String str27 = charSequenceConsumerRecord23.toString();
        long long28 = charSequenceConsumerRecord23.timestamp();
        java.lang.String str29 = charSequenceConsumerRecord23.topic();
        java.lang.String str30 = charSequenceConsumerRecord23.topic();
        java.lang.String str31 = charSequenceConsumerRecord23.topic();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) str31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(timer10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str27, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator13.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator22;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator29;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator29);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator24.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = kafkaSpoutMessageIdComparator13.thenComparing(kafkaSpoutMessageIdComparator32);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator7.thenComparing(kafkaSpoutMessageIdComparator33);
        java.lang.Class<?> wildcardClass35 = offsetComparator7.getClass();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig12 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig12;
        int int14 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str10 = charSequenceConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType11 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType19, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long26 = charSequenceConsumerRecord25.checksum();
        int int27 = charSequenceConsumerRecord25.partition();
        java.lang.String str28 = charSequenceConsumerRecord25.value();
        int int29 = charSequenceConsumerRecord25.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional30 = charSequenceConsumerRecord25.leaderEpoch();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout31 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = strKafkaSpout31.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor33 = null;
        strKafkaSpout31.waitingToEmit = strConsumerRecordItor33;
        boolean boolean35 = strKafkaSpout31.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig36 = null;
        strKafkaSpout31.kafkaSpoutConfig = strKafkaSpoutConfig36;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy38 = strKafkaSpout31.firstPollOffsetStrategy;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, org.apache.storm.topology.base.BaseComponent> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, org.apache.storm.topology.base.BaseComponent>("", (int) (short) 100, (long) (short) 1, (long) (byte) 10, timestampType11, (long) 1, (int) 'a', (-1), (java.lang.Object) charSequenceConsumerRecord25, (org.apache.storm.topology.base.BaseComponent) strKafkaSpout31);
        java.util.Optional<java.lang.Integer> intOptional40 = charSequenceConsumerRecord25.leaderEpoch();
        java.lang.Class<?> wildcardClass41 = charSequenceConsumerRecord25.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(intOptional30);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy38);
        org.junit.Assert.assertNotNull(intOptional40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout3.maxRetries = (byte) -1;
        int int6 = strKafkaSpout3.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout3.waitingToEmit = strConsumerRecordItor7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig9 = null;
        strKafkaSpout3.kafkaSpoutConfig = strKafkaSpoutConfig9;
        int int11 = strKafkaSpout3.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        strKafkaSpout3.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig14 = strKafkaSpout3.kafkaSpoutConfig;
        int int15 = strKafkaSpout3.maxRetries;
        boolean boolean16 = strKafkaSpout3.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder17 = strKafkaSpout3.tuplesBuilder;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord18 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>> iSpoutConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 0, (long) 10, (org.apache.storm.spout.ISpout) strKafkaSpout3, charSequenceConsumerRecord18);
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout3.declareOutputFields(outputFieldsDeclarer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        boolean boolean8 = strKafkaSpout0.consumerAutoCommitMode;
        int int9 = strKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder2;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = strKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor7;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        int int9 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str5 = strKafkaSpout0.toString();
        java.lang.Class<?> wildcardClass6 = strKafkaSpout0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str5, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = null;
        strKafkaSpout0.collector = spoutOutputCollector18;
        int int20 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IComponent, java.lang.Comparable<java.lang.String>> iComponentKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Comparable<java.lang.String>> iComponentKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Comparable<java.lang.String>>(iComponentKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.reflect.Type>.Timer> strComparableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.reflect.Type>.Timer> strComparableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.reflect.Type>.Timer>(strComparableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str5 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder6 = strKafkaSpout0.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str5, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        strKafkaSpout0.collector = spoutOutputCollector3;
        int int5 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords6 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout3.maxRetries = (byte) -1;
        int int6 = strKafkaSpout3.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout3.waitingToEmit = strConsumerRecordItor7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout3.toArrayList(topicPartition9);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout3.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType16 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout20 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout20.maxRetries = (byte) -1;
        int int23 = strKafkaSpout20.maxRetries;
        strKafkaSpout20.numUncommittedOffsets = '#';
        strKafkaSpout20.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet28 = strKafkaSpout20.emitted;
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType36, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int43 = charSequenceConsumerRecord42.serializedValueSize();
        java.lang.CharSequence charSequence44 = charSequenceConsumerRecord42.key();
        org.apache.kafka.common.header.Headers headers45 = charSequenceConsumerRecord42.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray46 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList47 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47, kafkaSpoutMessageIdArray46);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers45, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47);
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType54, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int61 = charSequenceConsumerRecord60.serializedValueSize();
        java.lang.CharSequence charSequence62 = charSequenceConsumerRecord60.key();
        org.apache.kafka.common.header.Headers headers63 = charSequenceConsumerRecord60.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType68, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long75 = charSequenceConsumerRecord74.offset();
        int int76 = charSequenceConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = charSequenceConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) '4', (long) (short) 0, (long) 100, timestampType16, (java.lang.Long) 1L, (int) (short) 0, 0, (java.lang.Object) kafkaSpoutMessageIdSet28, (java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList47, headers63, intOptional77);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers> iSpoutConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers>("KafkaSpout{acked=null, emitted=null}", (int) '#', (long) 1, (org.apache.storm.spout.ISpout) strKafkaSpout3, headers63);
        java.lang.Class<?> wildcardClass80 = iSpoutConsumerRecord79.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertNull(strKafkaConsumer11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet28);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence44 + "' != '" + "" + "'", charSequence44, "");
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence62 + "' != '" + "" + "'", charSequence62, "");
        org.junit.Assert.assertNotNull(headers63);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.Type> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.Type>();
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        strKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout14.maxRetries = (byte) -1;
        int int17 = strKafkaSpout14.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor18 = null;
        strKafkaSpout14.waitingToEmit = strConsumerRecordItor18;
        org.apache.kafka.common.TopicPartition topicPartition20 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection21 = strKafkaSpout14.toArrayList(topicPartition20);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer22 = strKafkaSpout14.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder23 = null;
        strKafkaSpout14.tuplesBuilder = strKafkaSpoutTuplesBuilder23;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor25 = null;
        strKafkaSpout14.waitingToEmit = strConsumerRecordItor25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig27 = strKafkaSpout14.kafkaSpoutConfig;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer28 = null;
        strKafkaSpout14.kafkaConsumer = strKafkaConsumer28;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) strKafkaConsumer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection21);
        org.junit.Assert.assertNull(strKafkaConsumer22);
        org.junit.Assert.assertNull(strKafkaSpoutConfig27);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (-1), (long) ' ', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long6 = charSequenceConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertNull(timer8);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        strKafkaSpout0.collector = spoutOutputCollector3;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str6 = strKafkaSpout0.toString();
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        strKafkaSpout0.collector = spoutOutputCollector12;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer14 = strKafkaSpout0.commitTimer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor15 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor15;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
        org.junit.Assert.assertNull(timer14);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = offsetComparator0.compare(kafkaSpoutMessageId4, kafkaSpoutMessageId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord10.key();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        int int17 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str18 = charSequenceConsumerRecord10.topic();
        int int19 = charSequenceConsumerRecord10.serializedValueSize();
        long long20 = charSequenceConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = null;
        strKafkaSpout0.collector = spoutOutputCollector18;
        int int20 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator5 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator12;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator0.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = offsetComparator12.compare(kafkaSpoutMessageId17, kafkaSpoutMessageId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer10;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(timer9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        int int17 = charSequenceConsumerRecord10.partition();
        long long18 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional19 = charSequenceConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers20 = charSequenceConsumerRecord10.headers();
        java.lang.String str21 = charSequenceConsumerRecord10.value();
        int int22 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType23 = charSequenceConsumerRecord10.timestampType();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNull(timestampType23);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.common.record.TimestampType, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(timestampTypeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        strKafkaSpout0.initialized = false;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet14 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService15;
        java.util.Map map17 = null;
        org.apache.storm.task.TopologyContext topologyContext18 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map17, topologyContext18, spoutOutputCollector19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet14);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        boolean boolean8 = strKafkaSpout0.consumerAutoCommitMode;
        int int9 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType4, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers23, intOptional24);
        java.util.Optional<java.lang.Integer> intOptional26 = charSequenceConsumerRecord25.leaderEpoch();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertNull(intOptional26);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.offset();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord10.key();
        java.lang.String str16 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str16, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpout0.retryService;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer6 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer6;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition8, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord10.headers();
        long long17 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str18 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray12 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet13, kafkaSpoutMessageIdArray12);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet13;
        java.util.Map map16 = null;
        org.apache.storm.task.TopologyContext topologyContext17 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map16, topologyContext17, spoutOutputCollector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(consumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        strKafkaSpout0.maxRetries = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator5 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator3.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator5);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = offsetComparator5.compare(kafkaSpoutMessageId10, kafkaSpoutMessageId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.initialized = false;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 1, 1L, (long) (byte) 10, timestampType4, (long) '#', (int) (byte) 100, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        java.lang.String str11 = charSequenceConsumerRecord10.value();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        int int13 = charSequenceConsumerRecord10.partition();
        java.lang.String str14 = charSequenceConsumerRecord10.topic();
        java.lang.String str15 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long21 = charSequenceConsumerRecord20.offset();
        int int22 = charSequenceConsumerRecord20.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional23 = charSequenceConsumerRecord20.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType24 = charSequenceConsumerRecord20.timestampType();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) timestampType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertNull(timestampType24);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str6 = strKafkaSpout0.toString();
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        long long12 = charSequenceConsumerRecord10.checksum();
        int int13 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        java.lang.String str15 = charSequenceConsumerRecord10.toString();
        java.lang.String str16 = charSequenceConsumerRecord10.value();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpout0.firstPollOffsetStrategy;
        int int8 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        int int9 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig10 = strKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.header.Headers> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.header.Headers> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.header.Headers>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        long long10 = strKafkaSpout0.numUncommittedOffsets;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str12 = strKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str12, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, java.lang.reflect.AnnotatedElement> kafkaSpoutConsumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, java.lang.reflect.AnnotatedElement> kafkaSpoutConsumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener, java.lang.reflect.AnnotatedElement>(kafkaSpoutConsumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator13.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId31 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = offsetComparator23.compare(kafkaSpoutMessageId31, kafkaSpoutMessageId32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        java.lang.String str9 = strKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder5 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder5;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        java.lang.String str7 = strKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor8;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = strKafkaSpout18.kafkaSpoutStreams;
        strKafkaSpout18.consumerAutoCommitMode = false;
        java.lang.String str22 = strKafkaSpout18.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout23.maxRetries = (byte) -1;
        int int26 = strKafkaSpout23.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray27 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet28 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet28, kafkaSpoutMessageIdArray27);
        strKafkaSpout23.emitted = kafkaSpoutMessageIdSet28;
        strKafkaSpout18.emitted = kafkaSpoutMessageIdSet28;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout32 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout32.maxRetries = (byte) -1;
        int int35 = strKafkaSpout32.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor36 = null;
        strKafkaSpout32.waitingToEmit = strConsumerRecordItor36;
        org.apache.kafka.common.TopicPartition topicPartition38 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection39 = strKafkaSpout32.toArrayList(topicPartition38);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer40 = strKafkaSpout32.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector41 = strKafkaSpout32.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout42 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout42.maxRetries = (byte) -1;
        int int45 = strKafkaSpout42.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray46 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet47 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet47, kafkaSpoutMessageIdArray46);
        strKafkaSpout42.emitted = kafkaSpoutMessageIdSet47;
        strKafkaSpout32.emitted = kafkaSpoutMessageIdSet47;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, (long) (short) -1, (long) (byte) 10, timestampType14, (long) (byte) 10, (int) (byte) -1, 0, (java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet28, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet47);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet28;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(spoutOutputCollector6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str22, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection39);
        org.junit.Assert.assertNull(timer40);
        org.junit.Assert.assertNull(spoutOutputCollector41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) 'a', (long) (byte) 1, (long) (byte) 0, timestampType4, (long) (short) -1, (int) (byte) 1, (int) (short) -1, (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long11 = charSequenceConsumerRecord10.offset();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer6 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaConsumer6);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        java.lang.CharSequence charSequence17 = charSequenceConsumerRecord10.key();
        java.lang.CharSequence charSequence18 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers19 = charSequenceConsumerRecord10.headers();
        long long20 = charSequenceConsumerRecord10.offset();
        long long21 = charSequenceConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator10.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator12;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator19;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator19);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator14.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator23.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator30 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator30;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator30);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = kafkaSpoutMessageIdComparator25.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator30);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator14.thenComparing(kafkaSpoutMessageIdComparator33);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = offsetComparator35.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator35.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = kafkaSpoutMessageIdComparator33.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator35);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = kafkaSpoutMessageIdComparator10.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator35);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId42 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = offsetComparator35.compare(kafkaSpoutMessageId42, kafkaSpoutMessageId43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        long long6 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition7, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout10.maxRetries = (byte) -1;
        int int13 = strKafkaSpout10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray14 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet15, kafkaSpoutMessageIdArray14);
        strKafkaSpout10.emitted = kafkaSpoutMessageIdSet15;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet15;
        strKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig21 = strKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig21);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        java.util.Map map9 = null;
        org.apache.storm.task.TopologyContext topologyContext10 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map9, topologyContext10, spoutOutputCollector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(spoutOutputCollector8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator4;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout9.maxRetries = (byte) -1;
        int int12 = strKafkaSpout9.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor13 = null;
        strKafkaSpout9.waitingToEmit = strConsumerRecordItor13;
        strKafkaSpout9.maxRetries = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = strKafkaSpout9.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) kafkaSpoutStreams17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutStreams17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig11 = strKafkaSpout0.kafkaSpoutConfig;
        int int12 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder13 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder13;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strKafkaSpout0.retryService;
        boolean boolean16 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.topic();
        java.lang.String str17 = charSequenceConsumerRecord10.topic();
        java.lang.CharSequence charSequence18 = charSequenceConsumerRecord10.key();
        java.lang.String str19 = charSequenceConsumerRecord10.value();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord10.key();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional17 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intOptional17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType4, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers23, intOptional24);
        long long26 = charSequenceConsumerRecord25.checksum();
        long long27 = charSequenceConsumerRecord25.timestamp();
        java.lang.CharSequence charSequence28 = charSequenceConsumerRecord25.key();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = charSequenceConsumerRecord25.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertEquals("'" + charSequence28 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", charSequence28, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout6.maxRetries = (byte) -1;
        int int9 = strKafkaSpout6.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = null;
        strKafkaSpout6.waitingToEmit = strConsumerRecordItor10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer12 = strKafkaSpout6.commitTimer;
        boolean boolean13 = strKafkaSpout6.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor14 = strKafkaSpout6.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = strKafkaSpout6.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) kafkaSpoutStreams15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(timer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor14);
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        long long8 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService12;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = strKafkaSpout0.collector;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaConsumer7);
        org.junit.Assert.assertNull(spoutOutputCollector8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 10, (long) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        boolean boolean7 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        int int11 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig14 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig14;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strKafkaConsumer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }
}

