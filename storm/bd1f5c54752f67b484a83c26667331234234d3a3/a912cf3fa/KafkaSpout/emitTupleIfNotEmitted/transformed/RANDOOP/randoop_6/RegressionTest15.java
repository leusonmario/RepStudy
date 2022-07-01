import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long21 = charSequenceConsumerRecord20.checksum();
        int int22 = charSequenceConsumerRecord20.partition();
        java.lang.String str23 = charSequenceConsumerRecord20.value();
        int int24 = charSequenceConsumerRecord20.serializedKeySize();
        org.apache.kafka.common.header.Headers headers25 = charSequenceConsumerRecord20.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", 0, (long) 100, (long) (short) 1, timestampType4, (java.lang.Long) 0L, (int) ' ', (int) (short) 1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "", headers25);
        int int27 = charSequenceConsumerRecord26.serializedKeySize();
        long long28 = charSequenceConsumerRecord26.timestamp();
        int int29 = charSequenceConsumerRecord26.serializedKeySize();
        java.lang.String str30 = charSequenceConsumerRecord26.toString();
        java.lang.String str31 = charSequenceConsumerRecord26.value();
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(headers25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )" + "'", str30, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator21.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator24;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator31;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator26.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator38 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator38;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator40 = offsetComparator38.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = offsetComparator37.thenComparing(kafkaSpoutMessageIdComparator40);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = offsetComparator35.thenComparing(kafkaSpoutMessageIdComparator41);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = offsetComparator31.thenComparing(kafkaSpoutMessageIdComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = kafkaSpoutMessageIdComparator23.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator31.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId46 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId47 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int48 = offsetComparator31.compare(kafkaSpoutMessageId46, kafkaSpoutMessageId47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator40);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = strKafkaSpout0.tuplesBuilder;
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        strKafkaSpout0.numUncommittedOffsets = 'a';
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 10, 0L, (java.lang.CharSequence) "", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        long long6 = charSequenceConsumerRecord5.checksum();
        java.lang.String str7 = charSequenceConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional8 = charSequenceConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers9 = charSequenceConsumerRecord5.headers();
        long long10 = charSequenceConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str7, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer18 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig19 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder20 = strKafkaSpout0.tuplesBuilder;
        int int21 = strKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strKafkaConsumer18);
        org.junit.Assert.assertNull(strKafkaSpoutConfig19);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = null;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        java.lang.String str10 = strKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str14 = charSequenceConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor23 = null;
        strKafkaSpout19.waitingToEmit = strConsumerRecordItor23;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer25 = strKafkaSpout19.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer26 = strKafkaSpout19.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType32, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long39 = charSequenceConsumerRecord38.offset();
        long long40 = charSequenceConsumerRecord38.checksum();
        int int41 = charSequenceConsumerRecord38.serializedKeySize();
        org.apache.kafka.common.header.Headers headers42 = charSequenceConsumerRecord38.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType15, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout19, (java.lang.CharSequence) "hi!", headers42);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (byte) 100, (long) (byte) 1, 0L, timestampType15, 0L, 1, (int) (byte) -1, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        java.lang.String str50 = charSequenceConsumerRecord49.value();
        long long51 = charSequenceConsumerRecord49.checksum();
        long long52 = charSequenceConsumerRecord49.offset();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(timer25);
        org.junit.Assert.assertNull(strKafkaConsumer26);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str50, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        strKafkaSpout0.numUncommittedOffsets = (short) 1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer9 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer9;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
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
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator16;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = kafkaSpoutMessageIdComparator16.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator27;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator27);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator22.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator27);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = offsetComparator19.thenComparing(kafkaSpoutMessageIdComparator30);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator16.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator16;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator38 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator38;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator38);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = offsetComparator38.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator42 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator43 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator43;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator43.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = offsetComparator42.thenComparing(kafkaSpoutMessageIdComparator45);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator47 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator47;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = offsetComparator47.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = offsetComparator47.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = kafkaSpoutMessageIdComparator45.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator51;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = offsetComparator38.thenComparing(kafkaSpoutMessageIdComparator51);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator16.thenComparing(kafkaSpoutMessageIdComparator53);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator54.reversed();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator46);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator49);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        java.lang.CharSequence charSequence3 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) ' ', (long) (byte) -1, charSequence3, "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)");
        java.lang.String str6 = charSequenceConsumerRecord5.value();
        org.apache.kafka.common.header.Headers headers7 = charSequenceConsumerRecord5.headers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)" + "'", str6, "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)");
        org.junit.Assert.assertNotNull(headers7);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout4 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean5 = strKafkaSpout4.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder6 = null;
        strKafkaSpout4.tuplesBuilder = strKafkaSpoutTuplesBuilder6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout4.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig10 = strKafkaSpout4.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = null;
        strKafkaSpout4.waitingToEmit = strConsumerRecordItor11;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor13 = null;
        strKafkaSpout4.waitingToEmit = strConsumerRecordItor13;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor15 = null;
        strKafkaSpout4.waitingToEmit = strConsumerRecordItor15;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer17 = strKafkaSpout4.commitTimer;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.topology.IComponent> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.topology.IComponent>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) -1, (long) (byte) 0, "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", (org.apache.storm.topology.IComponent) strKafkaSpout4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig19 = strKafkaSpout4.kafkaSpoutConfig;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig10);
        org.junit.Assert.assertNull(timer17);
        org.junit.Assert.assertNull(strKafkaSpoutConfig19);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
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
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection13 = strKafkaSpout0.toArrayList(topicPartition12);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor14 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor14;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder16 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder16;
        java.lang.String str18 = strKafkaSpout0.toString();
        strKafkaSpout0.numUncommittedOffsets = 35L;
        strKafkaSpout0.initialized = false;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.initialized = true;
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
        org.junit.Assert.assertNotNull(topicPartitionCollection13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str18, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        java.lang.String str17 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional18 = charSequenceConsumerRecord10.leaderEpoch();
        int int19 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers20 = charSequenceConsumerRecord10.headers();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(headers20);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator8;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator8);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator3.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator8);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator11);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator14;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator14.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator21;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator21);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator16.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator25;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator28;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator28.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = offsetComparator27.thenComparing(kafkaSpoutMessageIdComparator30);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator25.thenComparing(kafkaSpoutMessageIdComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = offsetComparator21.thenComparing(kafkaSpoutMessageIdComparator32);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator32.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = offsetComparator35.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator42 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator42;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = kafkaSpoutMessageIdComparator37.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = offsetComparator42.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = kafkaSpoutMessageIdComparator32.thenComparing(kafkaSpoutMessageIdComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = kafkaSpoutMessageIdComparator13.thenComparing(kafkaSpoutMessageIdComparator32);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator32;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator46);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 1, 1L, (long) (byte) 10, timestampType4, (long) '#', (int) (byte) 100, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        java.lang.String str11 = charSequenceConsumerRecord10.value();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional13 = charSequenceConsumerRecord10.leaderEpoch();
        int int14 = charSequenceConsumerRecord10.serializedKeySize();
        int int15 = charSequenceConsumerRecord10.partition();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator21.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator24;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator31;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator26.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator38 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator38;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator40 = offsetComparator38.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = offsetComparator37.thenComparing(kafkaSpoutMessageIdComparator40);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = offsetComparator35.thenComparing(kafkaSpoutMessageIdComparator41);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = offsetComparator31.thenComparing(kafkaSpoutMessageIdComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = kafkaSpoutMessageIdComparator23.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator45 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator45;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator45.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator52 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator52;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator52);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator47.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator52);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator56 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator56;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator58 = offsetComparator56.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator63;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator63);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator66 = kafkaSpoutMessageIdComparator58.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = kafkaSpoutMessageIdComparator47.thenComparing(kafkaSpoutMessageIdComparator66);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator68 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator68;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator70 = offsetComparator68.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator71 = offsetComparator68.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator72 = kafkaSpoutMessageIdComparator66.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator68);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator73 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator73;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator75 = offsetComparator73.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator73;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator77 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator77;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator79 = offsetComparator77.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator80 = offsetComparator73.thenComparing(kafkaSpoutMessageIdComparator79);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator81 = kafkaSpoutMessageIdComparator79.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator82 = kafkaSpoutMessageIdComparator66.thenComparing(kafkaSpoutMessageIdComparator79);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator83 = kafkaSpoutMessageIdComparator79.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator84 = kafkaSpoutMessageIdComparator23.thenComparing(kafkaSpoutMessageIdComparator79);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator23;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator40);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator58);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator66);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator70);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator71);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator72);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator75);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator79);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator80);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator81);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator82);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator83);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator84);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer4);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.RandomAccess, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>> randomAccessKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.RandomAccess, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>>();
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = offsetComparator18.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator25;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator20.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator17.thenComparing(kafkaSpoutMessageIdComparator29);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator32 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator32;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator32.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator39 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator39;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator39);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = kafkaSpoutMessageIdComparator34.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator43 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator43;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator45 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator46;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator46.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = offsetComparator45.thenComparing(kafkaSpoutMessageIdComparator48);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = offsetComparator43.thenComparing(kafkaSpoutMessageIdComparator49);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = offsetComparator39.thenComparing(kafkaSpoutMessageIdComparator50);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = kafkaSpoutMessageIdComparator50.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator52;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator31.thenComparing(kafkaSpoutMessageIdComparator52);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator52.reversed();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator49);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        java.lang.String str8 = strKafkaSpout0.toString();
        strKafkaSpout0.maxRetries = ' ';
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition11, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str11 = charSequenceConsumerRecord10.toString();
        int int12 = charSequenceConsumerRecord10.serializedValueSize();
        long long13 = charSequenceConsumerRecord10.timestamp();
        int int14 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str15 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        java.lang.CharSequence charSequence17 = charSequenceConsumerRecord10.key();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig3;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
        org.junit.Assert.assertNull(strKafkaConsumer5);
        org.junit.Assert.assertNull(spoutOutputCollector6);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig7;
        long long9 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str22 = charSequenceConsumerRecord21.topic();
        org.apache.kafka.common.record.TimestampType timestampType23 = charSequenceConsumerRecord21.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout27 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout27.maxRetries = (byte) -1;
        int int30 = strKafkaSpout27.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor31 = null;
        strKafkaSpout27.waitingToEmit = strConsumerRecordItor31;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer33 = strKafkaSpout27.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer34 = strKafkaSpout27.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType40, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long47 = charSequenceConsumerRecord46.offset();
        long long48 = charSequenceConsumerRecord46.checksum();
        int int49 = charSequenceConsumerRecord46.serializedKeySize();
        org.apache.kafka.common.header.Headers headers50 = charSequenceConsumerRecord46.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType23, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout27, (java.lang.CharSequence) "hi!", headers50);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType23, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) -1, (long) ' ', (long) (short) 0, timestampType23, (long) (short) 1, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        org.apache.kafka.common.record.TimestampType timestampType73 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) (short) 1, (long) '4', (long) '#', timestampType73, (long) 10, (int) (byte) -1, 10, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=null}");
        java.lang.String str80 = charSequenceConsumerRecord79.topic();
        org.apache.kafka.common.header.Headers headers81 = charSequenceConsumerRecord79.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", 0, (long) 52, (long) (byte) -1, timestampType23, (java.lang.Long) 1L, (int) (short) 0, (-1), (java.lang.CharSequence) "hi!", "hi!", headers81);
        long long83 = charSequenceConsumerRecord82.timestamp();
        java.util.Optional<java.lang.Integer> intOptional84 = charSequenceConsumerRecord82.leaderEpoch();
        int int85 = charSequenceConsumerRecord82.partition();
        long long86 = charSequenceConsumerRecord82.timestamp();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(timer33);
        org.junit.Assert.assertNull(strKafkaConsumer34);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(headers50);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(headers81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNotNull(intOptional84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
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
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator28;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator28.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = offsetComparator27.thenComparing(kafkaSpoutMessageIdComparator30);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator32 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator32;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator32.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator39 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator39;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator39);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = kafkaSpoutMessageIdComparator34.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator39);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = offsetComparator27.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator39);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = offsetComparator39.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator45 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator45;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator45.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator52 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator52;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator52);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator47.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator52);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = offsetComparator52.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator57 = kafkaSpoutMessageIdComparator44.thenComparing(kafkaSpoutMessageIdComparator56);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator58 = kafkaSpoutMessageIdComparator26.thenComparing(kafkaSpoutMessageIdComparator56);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = kafkaSpoutMessageIdComparator26.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator60 = kafkaSpoutMessageIdComparator59.reversed();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator58);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator60);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
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
        boolean boolean11 = strKafkaSpout0.initialized;
        strKafkaSpout0.numUncommittedOffsets = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = strKafkaSpout0.kafkaSpoutStreams;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]}), value = ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null}))", 0, 35L, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 0, null = 97, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str14 = charSequenceConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor23 = null;
        strKafkaSpout19.waitingToEmit = strConsumerRecordItor23;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer25 = strKafkaSpout19.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer26 = strKafkaSpout19.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType32, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long39 = charSequenceConsumerRecord38.offset();
        long long40 = charSequenceConsumerRecord38.checksum();
        int int41 = charSequenceConsumerRecord38.serializedKeySize();
        org.apache.kafka.common.header.Headers headers42 = charSequenceConsumerRecord38.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType15, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout19, (java.lang.CharSequence) "hi!", headers42);
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType53, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long60 = charSequenceConsumerRecord59.checksum();
        int int61 = charSequenceConsumerRecord59.partition();
        long long62 = charSequenceConsumerRecord59.offset();
        org.apache.kafka.common.header.Headers headers63 = charSequenceConsumerRecord59.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType68, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long75 = charSequenceConsumerRecord74.offset();
        int int76 = charSequenceConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = charSequenceConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 10, 10L, 0L, timestampType15, (java.lang.Long) 35L, (int) (byte) 0, (-1), (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers63, intOptional77);
        long long79 = charSequenceConsumerRecord78.checksum();
        long long80 = charSequenceConsumerRecord78.checksum();
        long long81 = charSequenceConsumerRecord78.timestamp();
        java.lang.CharSequence charSequence82 = charSequenceConsumerRecord78.key();
        long long83 = charSequenceConsumerRecord78.checksum();
        java.util.Optional<java.lang.Integer> intOptional84 = charSequenceConsumerRecord78.leaderEpoch();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(timer25);
        org.junit.Assert.assertNull(strKafkaConsumer26);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(headers63);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 35L + "'", long79 == 35L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 35L + "'", long80 == 35L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertEquals("'" + charSequence82 + "' != '" + "hi!" + "'", charSequence82, "hi!");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 35L + "'", long83 == 35L);
        org.junit.Assert.assertNotNull(intOptional84);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.timestamp();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        java.lang.String str13 = charSequenceConsumerRecord10.topic();
        int int14 = charSequenceConsumerRecord10.partition();
        long long15 = charSequenceConsumerRecord10.offset();
        long long16 = charSequenceConsumerRecord10.offset();
        int int17 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator5 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator12;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator16;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator23;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator18.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator7.thenComparing(kafkaSpoutMessageIdComparator26);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator27.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator27.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator27);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator32 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator32;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator32.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator31.thenComparing(kafkaSpoutMessageIdComparator34);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator36 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator36;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator36.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator43 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator43;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = kafkaSpoutMessageIdComparator38.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator31.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator43.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator49 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator49;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = offsetComparator49.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator56 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator56;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator56);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = kafkaSpoutMessageIdComparator51.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator56);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator60 = offsetComparator56.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator61 = kafkaSpoutMessageIdComparator48.thenComparing(kafkaSpoutMessageIdComparator60);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator62 = kafkaSpoutMessageIdComparator48.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator63;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator65 = offsetComparator63.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator70;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator70);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator73 = kafkaSpoutMessageIdComparator65.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator74 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator74;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator76 = offsetComparator74.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator77 = offsetComparator74.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator78 = offsetComparator70.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator74);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator79 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator79;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator81 = offsetComparator79.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator86 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator86;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord88 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator86);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator89 = kafkaSpoutMessageIdComparator81.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator86);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator90 = kafkaSpoutMessageIdComparator89.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator91 = kafkaSpoutMessageIdComparator90.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator92 = offsetComparator70.thenComparing(kafkaSpoutMessageIdComparator90);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator93 = kafkaSpoutMessageIdComparator48.thenComparing(kafkaSpoutMessageIdComparator90);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparator30.thenComparing(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator46);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator60);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator61);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator62);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator65);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator73);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator76);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator77);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator78);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator81);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator89);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator90);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator91);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator92);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator93);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        long long15 = charSequenceConsumerRecord10.timestamp();
        long long16 = charSequenceConsumerRecord10.offset();
        long long17 = charSequenceConsumerRecord10.offset();
        long long18 = charSequenceConsumerRecord10.offset();
        long long19 = charSequenceConsumerRecord10.checksum();
        int int20 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence21 = charSequenceConsumerRecord10.key();
        java.lang.String str22 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.timestamp();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        java.lang.String str13 = charSequenceConsumerRecord10.topic();
        int int14 = charSequenceConsumerRecord10.partition();
        java.lang.String str15 = charSequenceConsumerRecord10.topic();
        int int16 = charSequenceConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord10.headers();
        long long17 = charSequenceConsumerRecord10.timestamp();
        long long18 = charSequenceConsumerRecord10.offset();
        long long19 = charSequenceConsumerRecord10.checksum();
        java.lang.String str20 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 10, 1L, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=[]}");
        long long6 = charSequenceConsumerRecord5.checksum();
        java.lang.String str7 = charSequenceConsumerRecord5.value();
        int int8 = charSequenceConsumerRecord5.serializedKeySize();
        long long9 = charSequenceConsumerRecord5.checksum();
        long long10 = charSequenceConsumerRecord5.offset();
        java.lang.String str11 = charSequenceConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=[]}" + "'", str7, "KafkaSpout{acked=null, emitted=[]}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long6 = charSequenceConsumerRecord5.checksum();
        long long7 = charSequenceConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers8 = charSequenceConsumerRecord5.headers();
        java.lang.String str9 = charSequenceConsumerRecord5.toString();
        int int10 = charSequenceConsumerRecord5.serializedKeySize();
        int int11 = charSequenceConsumerRecord5.partition();
        long long12 = charSequenceConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str9, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
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
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor12 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor12;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout17 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout17.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = strKafkaSpout17.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout21 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout21.maxRetries = (byte) -1;
        int int24 = strKafkaSpout21.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray25 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet26 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet26, kafkaSpoutMessageIdArray25);
        strKafkaSpout21.emitted = kafkaSpoutMessageIdSet26;
        strKafkaSpout17.emitted = kafkaSpoutMessageIdSet26;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout30 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer31 = strKafkaSpout30.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = strKafkaSpout30.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams33 = null;
        strKafkaSpout30.kafkaSpoutStreams = kafkaSpoutStreams33;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout35 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout35.maxRetries = (byte) -1;
        int int38 = strKafkaSpout35.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor39 = null;
        strKafkaSpout35.waitingToEmit = strConsumerRecordItor39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig41 = null;
        strKafkaSpout35.kafkaSpoutConfig = strKafkaSpoutConfig41;
        int int43 = strKafkaSpout35.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy44 = null;
        strKafkaSpout35.firstPollOffsetStrategy = firstPollOffsetStrategy44;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet46 = strKafkaSpout35.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray47 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet48 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet48, kafkaSpoutMessageIdArray47);
        strKafkaSpout35.emitted = kafkaSpoutMessageIdSet48;
        strKafkaSpout30.emitted = kafkaSpoutMessageIdSet48;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}), partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = 35, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)", (int) (byte) -1, (long) (short) 1, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet26, (java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet48);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet48;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(timer31);
        org.junit.Assert.assertNull(firstPollOffsetStrategy32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet46);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
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
        java.lang.CharSequence charSequence19 = charSequenceConsumerRecord10.key();
        java.lang.String str20 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long14 = charSequenceConsumerRecord13.checksum();
        long long15 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord13.headers();
        java.lang.String str17 = charSequenceConsumerRecord13.toString();
        org.apache.kafka.common.header.Headers headers18 = charSequenceConsumerRecord13.headers();
        java.lang.String str19 = charSequenceConsumerRecord13.topic();
        long long20 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType31, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long38 = charSequenceConsumerRecord37.checksum();
        int int39 = charSequenceConsumerRecord37.partition();
        long long40 = charSequenceConsumerRecord37.timestamp();
        long long41 = charSequenceConsumerRecord37.offset();
        java.lang.String str42 = charSequenceConsumerRecord37.value();
        java.lang.String str43 = charSequenceConsumerRecord37.topic();
        int int44 = charSequenceConsumerRecord37.partition();
        org.apache.kafka.common.record.TimestampType timestampType45 = charSequenceConsumerRecord37.timestampType();
        int int46 = charSequenceConsumerRecord37.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional47 = charSequenceConsumerRecord37.leaderEpoch();
        int int48 = charSequenceConsumerRecord37.serializedValueSize();
        org.apache.kafka.common.header.Headers headers49 = charSequenceConsumerRecord37.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 100, (long) (short) 1, 52L, timestampType21, (java.lang.Long) 52L, (int) (short) 10, (int) (byte) 1, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "", headers49);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]})", (int) (byte) 0, 10L, (long) 32, timestampType21, (long) (byte) 10, (int) '4', 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        java.lang.String str57 = charSequenceConsumerRecord56.value();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str17, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNull(timestampType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intOptional47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(headers49);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})" + "'", str57, "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig12 = strKafkaSpout0.kafkaSpoutConfig;
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
        org.junit.Assert.assertNull(strKafkaConsumer11);
        org.junit.Assert.assertNull(strKafkaSpoutConfig12);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (-1), 10L, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)))");
        long long6 = charSequenceConsumerRecord5.timestamp();
        java.lang.CharSequence charSequence7 = charSequenceConsumerRecord5.key();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )" + "'", charSequence7, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )");
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) ' ', (long) (byte) 100, (long) (byte) -1, timestampType4, (long) (byte) -1, (int) (byte) 10, 10, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long11 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str12 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.record.TimestampType timestampType13 = charSequenceConsumerRecord10.timestampType();
        java.lang.CharSequence charSequence14 = charSequenceConsumerRecord10.key();
        int int15 = charSequenceConsumerRecord10.serializedValueSize();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        int int17 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str12, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNull(timestampType13);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", charSequence14, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        java.lang.String str9 = strKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService13;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(spoutOutputCollector10);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig17 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig17;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService19;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService21 = strKafkaSpout0.retryService;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strKafkaConsumer16);
        org.junit.Assert.assertNull(kafkaSpoutRetryService21);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor5 = strKafkaSpout0.waitingToEmit;
        int int6 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpout0.retryService;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
        org.junit.Assert.assertNull(strConsumerRecordItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = strKafkaSpout6.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = strKafkaSpout6.kafkaSpoutConfig;
        org.apache.kafka.common.record.TimestampType timestampType13 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout17 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = strKafkaSpout17.kafkaSpoutStreams;
        strKafkaSpout17.consumerAutoCommitMode = false;
        java.lang.String str21 = strKafkaSpout17.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout22.maxRetries = (byte) -1;
        int int25 = strKafkaSpout22.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray26 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet27 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet27, kafkaSpoutMessageIdArray26);
        strKafkaSpout22.emitted = kafkaSpoutMessageIdSet27;
        strKafkaSpout17.emitted = kafkaSpoutMessageIdSet27;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout31 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout31.maxRetries = (byte) -1;
        int int34 = strKafkaSpout31.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor35 = null;
        strKafkaSpout31.waitingToEmit = strConsumerRecordItor35;
        org.apache.kafka.common.TopicPartition topicPartition37 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection38 = strKafkaSpout31.toArrayList(topicPartition37);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer39 = strKafkaSpout31.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector40 = strKafkaSpout31.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout41 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout41.maxRetries = (byte) -1;
        int int44 = strKafkaSpout41.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray45 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet46 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet46, kafkaSpoutMessageIdArray45);
        strKafkaSpout41.emitted = kafkaSpoutMessageIdSet46;
        strKafkaSpout31.emitted = kafkaSpoutMessageIdSet46;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, (long) (short) -1, (long) (byte) 10, timestampType13, (long) (byte) 10, (int) (byte) -1, 0, (java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet27, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet46);
        strKafkaSpout6.emitted = kafkaSpoutMessageIdSet46;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet46;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer53 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer53;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder55 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder55;
        int int57 = strKafkaSpout0.maxRetries;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(strKafkaSpoutConfig8);
        org.junit.Assert.assertNull(kafkaSpoutStreams18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str21, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection38);
        org.junit.Assert.assertNull(timer39);
        org.junit.Assert.assertNull(spoutOutputCollector40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray4 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet5, kafkaSpoutMessageIdArray4);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet5;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig9 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig9;
        java.lang.String str11 = strKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor12 = strKafkaSpout0.waitingToEmit;
        long long13 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition14 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection15 = strKafkaSpout0.toArrayList(topicPartition14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=[]}" + "'", str11, "KafkaSpout{acked=null, emitted=[]}");
        org.junit.Assert.assertNull(strConsumerRecordItor12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(topicPartitionCollection15);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long14 = charSequenceConsumerRecord13.checksum();
        long long15 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord13.headers();
        java.lang.String str17 = charSequenceConsumerRecord13.toString();
        org.apache.kafka.common.header.Headers headers18 = charSequenceConsumerRecord13.headers();
        java.lang.String str19 = charSequenceConsumerRecord13.topic();
        long long20 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (byte) 1, (long) 100, timestampType21, (long) 1, 35, (int) (byte) 10, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType37, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int44 = charSequenceConsumerRecord43.serializedValueSize();
        java.lang.CharSequence charSequence45 = charSequenceConsumerRecord43.key();
        int int46 = charSequenceConsumerRecord43.serializedKeySize();
        int int47 = charSequenceConsumerRecord43.serializedKeySize();
        org.apache.kafka.common.header.Headers headers48 = charSequenceConsumerRecord43.headers();
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType53, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long60 = charSequenceConsumerRecord59.checksum();
        int int61 = charSequenceConsumerRecord59.partition();
        java.lang.String str62 = charSequenceConsumerRecord59.value();
        int int63 = charSequenceConsumerRecord59.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional64 = charSequenceConsumerRecord59.leaderEpoch();
        long long65 = charSequenceConsumerRecord59.timestamp();
        java.util.Optional<java.lang.Integer> intOptional66 = charSequenceConsumerRecord59.leaderEpoch();
        int int67 = charSequenceConsumerRecord59.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional68 = charSequenceConsumerRecord59.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 100, null = 10, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", 0, 0L, 0L, timestampType21, (java.lang.Long) 35L, (int) (short) -1, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "hi!", headers48, intOptional68);
        int int70 = charSequenceConsumerRecord69.serializedValueSize();
        java.lang.String str71 = charSequenceConsumerRecord69.value();
        int int72 = charSequenceConsumerRecord69.partition();
        java.lang.CharSequence charSequence73 = charSequenceConsumerRecord69.key();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str17, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence45 + "' != '" + "" + "'", charSequence45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertNotNull(headers48);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertNotNull(intOptional64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(intOptional66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intOptional68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + charSequence73 + "' != '" + "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", charSequence73, "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}), partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = 35, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)", (-1), (long) 100, (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null}), partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)");
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long14 = charSequenceConsumerRecord13.checksum();
        long long15 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord13.headers();
        java.lang.String str17 = charSequenceConsumerRecord13.toString();
        org.apache.kafka.common.header.Headers headers18 = charSequenceConsumerRecord13.headers();
        java.lang.String str19 = charSequenceConsumerRecord13.topic();
        long long20 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType22 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.CharSequence charSequence34 = charSequenceConsumerRecord33.key();
        org.apache.kafka.common.header.Headers headers35 = charSequenceConsumerRecord33.headers();
        java.util.Optional<java.lang.Integer> intOptional36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", 10, (long) 52, (-1L), timestampType22, (java.lang.Long) 35L, 100, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}), partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = 35, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)", headers35, intOptional36);
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType47, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long54 = charSequenceConsumerRecord53.timestamp();
        java.lang.CharSequence charSequence55 = charSequenceConsumerRecord53.key();
        int int56 = charSequenceConsumerRecord53.partition();
        java.lang.CharSequence charSequence57 = charSequenceConsumerRecord53.key();
        org.apache.kafka.common.header.Headers headers58 = charSequenceConsumerRecord53.headers();
        org.apache.kafka.common.record.TimestampType timestampType67 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType67, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        org.apache.kafka.common.record.TimestampType timestampType74 = charSequenceConsumerRecord73.timestampType();
        long long75 = charSequenceConsumerRecord73.offset();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Object>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) -1, 10L, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]})", (java.lang.Object) charSequenceConsumerRecord73);
        int int77 = charSequenceConsumerRecord73.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional78 = charSequenceConsumerRecord73.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 0, (long) (short) -1, (long) (-1), timestampType22, (java.lang.Long) 0L, (int) ' ', 100, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}))", "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", headers58, intOptional78);
        int int80 = charSequenceConsumerRecord79.serializedValueSize();
        org.apache.kafka.common.header.Headers headers81 = charSequenceConsumerRecord79.headers();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str17, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType22 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType22.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + charSequence34 + "' != '" + "" + "'", charSequence34, "");
        org.junit.Assert.assertNotNull(headers35);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertEquals("'" + charSequence55 + "' != '" + "" + "'", charSequence55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertEquals("'" + charSequence57 + "' != '" + "" + "'", charSequence57, "");
        org.junit.Assert.assertNotNull(headers58);
        org.junit.Assert.assertNull(timestampType74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intOptional78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertNotNull(headers81);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        long long15 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord10.headers();
        org.apache.kafka.common.record.TimestampType timestampType17 = charSequenceConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional18 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str19 = charSequenceConsumerRecord10.value();
        java.lang.String str20 = charSequenceConsumerRecord10.topic();
        int int21 = charSequenceConsumerRecord10.partition();
        java.util.Optional<java.lang.Integer> intOptional22 = charSequenceConsumerRecord10.leaderEpoch();
        int int23 = charSequenceConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(intOptional22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        long long12 = charSequenceConsumerRecord10.checksum();
        int int13 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence14 = charSequenceConsumerRecord10.key();
        java.util.Optional<java.lang.Integer> intOptional15 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertNotNull(intOptional15);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
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
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.topic();
        int int17 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType18 = charSequenceConsumerRecord10.timestampType();
        int int19 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional20 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str21 = charSequenceConsumerRecord10.value();
        java.util.Optional<java.lang.Integer> intOptional22 = charSequenceConsumerRecord10.leaderEpoch();
        int int23 = charSequenceConsumerRecord10.serializedKeySize();
        long long24 = charSequenceConsumerRecord10.offset();
        long long25 = charSequenceConsumerRecord10.timestamp();
        int int26 = charSequenceConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(intOptional22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.kafka.common.header.Headers>();
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str10 = strKafkaSpout0.toString();
        boolean boolean11 = strKafkaSpout0.initialized;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer12 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer12;
        java.util.Map map14 = null;
        org.apache.storm.task.TopologyContext topologyContext15 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.open(map14, topologyContext15, spoutOutputCollector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig10 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout15 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout15.maxRetries = (byte) -1;
        int int18 = strKafkaSpout15.maxRetries;
        strKafkaSpout15.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService21 = strKafkaSpout15.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor22 = strKafkaSpout15.waitingToEmit;
        strKafkaSpout15.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer25 = null;
        strKafkaSpout15.kafkaConsumer = strKafkaConsumer25;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder27 = null;
        strKafkaSpout15.tuplesBuilder = strKafkaSpoutTuplesBuilder27;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams29 = null;
        strKafkaSpout15.kafkaSpoutStreams = kafkaSpoutStreams29;
        org.apache.kafka.common.record.TimestampType timestampType38 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout42 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams43 = strKafkaSpout42.kafkaSpoutStreams;
        strKafkaSpout42.consumerAutoCommitMode = false;
        java.lang.String str46 = strKafkaSpout42.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout47 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout47.maxRetries = (byte) -1;
        int int50 = strKafkaSpout47.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray51 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet52 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet52, kafkaSpoutMessageIdArray51);
        strKafkaSpout47.emitted = kafkaSpoutMessageIdSet52;
        strKafkaSpout42.emitted = kafkaSpoutMessageIdSet52;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout56 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout56.maxRetries = (byte) -1;
        int int59 = strKafkaSpout56.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor60 = null;
        strKafkaSpout56.waitingToEmit = strConsumerRecordItor60;
        org.apache.kafka.common.TopicPartition topicPartition62 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection63 = strKafkaSpout56.toArrayList(topicPartition62);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer64 = strKafkaSpout56.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector65 = strKafkaSpout56.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout66 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout66.maxRetries = (byte) -1;
        int int69 = strKafkaSpout66.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray70 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet71 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet71, kafkaSpoutMessageIdArray70);
        strKafkaSpout66.emitted = kafkaSpoutMessageIdSet71;
        strKafkaSpout56.emitted = kafkaSpoutMessageIdSet71;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, (long) (short) -1, (long) (byte) 10, timestampType38, (long) (byte) 10, (int) (byte) -1, 0, (java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet52, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet71);
        org.apache.kafka.common.record.TimestampType timestampType83 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType83, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int90 = charSequenceConsumerRecord89.serializedValueSize();
        java.lang.CharSequence charSequence91 = charSequenceConsumerRecord89.key();
        org.apache.kafka.common.header.Headers headers92 = charSequenceConsumerRecord89.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray93 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList94 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList94, kafkaSpoutMessageIdArray93);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers92, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList94);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdSetConsumerRecord97 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 10, 100L, (java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet71, (java.lang.Cloneable) kafkaSpoutMessageIdList94);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iRichSpoutConsumerRecord98 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (byte) 0, (long) (byte) 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout15, (java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet71);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet71;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService21);
        org.junit.Assert.assertNull(strConsumerRecordItor22);
        org.junit.Assert.assertNull(kafkaSpoutStreams43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str46, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection63);
        org.junit.Assert.assertNull(timer64);
        org.junit.Assert.assertNull(spoutOutputCollector65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence91 + "' != '" + "" + "'", charSequence91, "");
        org.junit.Assert.assertNotNull(headers92);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator3;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator3;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator14;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator14);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = kafkaSpoutMessageIdComparator9.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator14);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator14.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator14.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator27;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator27);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator22.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator27);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator14.thenComparing(kafkaSpoutMessageIdComparator31);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator33 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator33.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = kafkaSpoutMessageIdComparator32.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator33);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator36 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator36;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator36.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator43 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator43;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = kafkaSpoutMessageIdComparator38.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = kafkaSpoutMessageIdComparator38.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator48;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = offsetComparator48.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator48;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator52 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator52;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = offsetComparator52.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = offsetComparator48.thenComparing(kafkaSpoutMessageIdComparator54);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = kafkaSpoutMessageIdComparator54.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator57 = kafkaSpoutMessageIdComparator47.thenComparing(kafkaSpoutMessageIdComparator54);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator58 = kafkaSpoutMessageIdComparator32.thenComparing(kafkaSpoutMessageIdComparator57);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = kafkaSpoutMessageIdComparator58.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator60 = kafkaSpoutMessageIdComparator3.thenComparing(kafkaSpoutMessageIdComparator59);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator61 = kafkaSpoutMessageIdComparator59.reversed();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator46);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator58);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator60);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator61);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        strKafkaSpout0.numUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpout0.retryService;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = strKafkaSpout0.collector;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer12 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer12;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor14 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor14;
        org.junit.Assert.assertNull(strKafkaSpoutConfig7);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(spoutOutputCollector11);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        java.lang.String str13 = charSequenceConsumerRecord10.value();
        int int14 = charSequenceConsumerRecord10.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional15 = charSequenceConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord10.headers();
        long long17 = charSequenceConsumerRecord10.checksum();
        int int18 = charSequenceConsumerRecord10.partition();
        java.lang.String str19 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 10, 1L, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=[]}");
        long long22 = charSequenceConsumerRecord21.checksum();
        org.apache.kafka.common.record.TimestampType timestampType23 = charSequenceConsumerRecord21.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 1, (long) (byte) 0, (long) (byte) 0, timestampType23, (long) 35, (int) '4', (int) (short) 10, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 1, (long) '#', 52L, timestampType23, (long) (byte) 0, (int) (byte) -1, (int) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.apache.kafka.common.record.TimestampType timestampType45 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) ' ', (long) (byte) 100, (long) (byte) -1, timestampType45, (long) (byte) -1, (int) (byte) 10, 10, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long52 = charSequenceConsumerRecord51.timestamp();
        java.lang.CharSequence charSequence53 = charSequenceConsumerRecord51.key();
        java.lang.String str54 = charSequenceConsumerRecord51.value();
        java.lang.String str55 = charSequenceConsumerRecord51.topic();
        java.lang.String str56 = charSequenceConsumerRecord51.value();
        org.apache.kafka.common.header.Headers headers57 = charSequenceConsumerRecord51.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (byte) 100, (long) '#', (long) (short) 0, timestampType23, (java.lang.Long) 35L, (int) '#', (int) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)))", "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", headers57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord64 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = -1, null = 100, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", 52, (long) (byte) 10, (-1L), timestampType23, (long) (-1), (int) (short) 100, (int) (byte) 100, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        int int65 = charSequenceConsumerRecord64.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional66 = charSequenceConsumerRecord64.leaderEpoch();
        int int67 = charSequenceConsumerRecord64.partition();
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertEquals("'" + charSequence53 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", charSequence53, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str54, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str55, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str56, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intOptional66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
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
        boolean boolean19 = strKafkaSpout0.initialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str26 = charSequenceConsumerRecord25.topic();
        org.apache.kafka.common.record.TimestampType timestampType27 = charSequenceConsumerRecord25.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType35 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType35, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long42 = charSequenceConsumerRecord41.checksum();
        int int43 = charSequenceConsumerRecord41.partition();
        long long44 = charSequenceConsumerRecord41.timestamp();
        java.lang.String str45 = charSequenceConsumerRecord41.toString();
        long long46 = charSequenceConsumerRecord41.timestamp();
        org.apache.kafka.common.header.Headers headers47 = charSequenceConsumerRecord41.headers();
        org.apache.kafka.common.record.TimestampType timestampType48 = charSequenceConsumerRecord41.timestampType();
        java.util.Optional<java.lang.Integer> intOptional49 = charSequenceConsumerRecord41.leaderEpoch();
        org.apache.storm.topology.IComponent iComponent50 = null;
        org.apache.kafka.common.record.TimestampType timestampType55 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType55, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long62 = charSequenceConsumerRecord61.checksum();
        int int63 = charSequenceConsumerRecord61.partition();
        long long64 = charSequenceConsumerRecord61.timestamp();
        java.lang.String str65 = charSequenceConsumerRecord61.toString();
        org.apache.kafka.common.header.Headers headers66 = charSequenceConsumerRecord61.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.IComponent> intOptionalConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.IComponent>("hi!", (int) ' ', (long) (byte) -1, (long) (-1), timestampType27, (java.lang.Long) 100L, (int) 'a', (-1), intOptional49, iComponent50, headers66);
        org.apache.storm.topology.IRichSpout iRichSpout72 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.IRichSpout> strComparableConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.IRichSpout>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", (int) (byte) 0, (long) 10, (long) (-1), timestampType27, (long) 0, (int) (short) 10, (int) (byte) 1, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", iRichSpout72);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", (int) (byte) 100, 100L, (long) (short) 100, timestampType27, (long) 'a', (int) ' ', (-1), (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", 52, 0L, (long) 97, timestampType27, (long) (byte) -1, (int) ' ', 10, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        java.lang.CharSequence charSequence86 = charSequenceConsumerRecord85.key();
        org.apache.kafka.common.record.TimestampType timestampType87 = charSequenceConsumerRecord85.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord93 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]})", 32, 0L, 100L, timestampType87, (long) (byte) 0, (int) (byte) 10, 0, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null}), partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)", "ConsumerRecord(topic = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 100, leaderEpoch = null, offset = 35, NoTimestampType = 0, serialized key size = 52, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = hi!)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + timestampType27 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType27.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str45, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(headers47);
        org.junit.Assert.assertNull(timestampType48);
        org.junit.Assert.assertNotNull(intOptional49);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str65, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers66);
        org.junit.Assert.assertEquals("'" + charSequence86 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})" + "'", charSequence86, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})");
        org.junit.Assert.assertTrue("'" + timestampType87 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType87.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = strKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        long long12 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional13 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        int int15 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str17 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        long long12 = charSequenceConsumerRecord10.offset();
        int int13 = charSequenceConsumerRecord10.partition();
        java.lang.String str14 = charSequenceConsumerRecord10.toString();
        java.lang.String str15 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
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
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = strKafkaSpout0.emitted;
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertNull(timer10);
        org.junit.Assert.assertNotNull(topicPartitionCollection12);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet13);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
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
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection13 = strKafkaSpout0.toArrayList(topicPartition12);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor14 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor14;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder16 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder16;
        java.lang.String str18 = strKafkaSpout0.toString();
        strKafkaSpout0.numUncommittedOffsets = 35L;
        java.lang.String str21 = strKafkaSpout0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertNotNull(topicPartitionCollection13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str18, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str21, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
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
        int int19 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.header.Headers headers20 = charSequenceConsumerRecord10.headers();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str22 = charSequenceConsumerRecord10.value();
        int int23 = charSequenceConsumerRecord10.serializedKeySize();
        long long24 = charSequenceConsumerRecord10.checksum();
        long long25 = charSequenceConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertNull(timestampType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 0, 0L, (long) 97, timestampType4, (long) '4', (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        int int11 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType12 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str13 = charSequenceConsumerRecord10.value();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        int int15 = charSequenceConsumerRecord10.serializedValueSize();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional17 = charSequenceConsumerRecord10.leaderEpoch();
        int int18 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(timestampType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(intOptional17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        boolean boolean9 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setAcked(topicPartition12, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer15 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor18 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig19 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig19;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords21 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy14);
        org.junit.Assert.assertNull(timer15);
        org.junit.Assert.assertNull(strConsumerRecordItor18);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
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
        strKafkaSpout0.numUncommittedOffsets = '4';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder15 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = strKafkaSpout0.collector;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder15);
        org.junit.Assert.assertNull(spoutOutputCollector16);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = null;
        strKafkaSpout0.collector = spoutOutputCollector2;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder4 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder4;
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig3 = strKafkaSpout0.kafkaSpoutConfig;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 10, 1L, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=[]}");
        long long18 = charSequenceConsumerRecord17.checksum();
        org.apache.kafka.common.record.TimestampType timestampType19 = charSequenceConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 1, (long) (byte) 0, (long) (byte) 0, timestampType19, (long) 35, (int) '4', (int) (short) 10, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) 1, (long) '#', 52L, timestampType19, (long) (byte) 0, (int) (byte) -1, (int) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.apache.kafka.common.record.TimestampType timestampType41 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType41, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long48 = charSequenceConsumerRecord47.checksum();
        int int49 = charSequenceConsumerRecord47.partition();
        java.lang.String str50 = charSequenceConsumerRecord47.value();
        int int51 = charSequenceConsumerRecord47.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional52 = charSequenceConsumerRecord47.leaderEpoch();
        org.apache.kafka.common.header.Headers headers53 = charSequenceConsumerRecord47.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 1, (long) 10, 0L, timestampType19, (java.lang.Long) 52L, (int) (short) 100, 97, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", headers53);
        int int55 = charSequenceConsumerRecord54.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertNotNull(intOptional52);
        org.junit.Assert.assertNotNull(headers53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str18 = charSequenceConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType19 = charSequenceConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout23.maxRetries = (byte) -1;
        int int26 = strKafkaSpout23.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor27 = null;
        strKafkaSpout23.waitingToEmit = strConsumerRecordItor27;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer29 = strKafkaSpout23.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer30 = strKafkaSpout23.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType36, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long43 = charSequenceConsumerRecord42.offset();
        long long44 = charSequenceConsumerRecord42.checksum();
        int int45 = charSequenceConsumerRecord42.serializedKeySize();
        org.apache.kafka.common.header.Headers headers46 = charSequenceConsumerRecord42.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType19, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout23, (java.lang.CharSequence) "hi!", headers46);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType19, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        org.apache.kafka.common.record.TimestampType timestampType63 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType63, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int70 = charSequenceConsumerRecord69.serializedValueSize();
        java.lang.CharSequence charSequence71 = charSequenceConsumerRecord69.key();
        org.apache.kafka.common.header.Headers headers72 = charSequenceConsumerRecord69.headers();
        org.apache.kafka.common.header.Headers headers73 = charSequenceConsumerRecord69.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) ' ', (long) 'a', (long) 1, timestampType19, (java.lang.Long) 10L, 32, (int) '4', (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", headers73);
        org.apache.kafka.common.header.Headers headers75 = charSequenceConsumerRecord74.headers();
        int int76 = charSequenceConsumerRecord74.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(timer29);
        org.junit.Assert.assertNull(strKafkaConsumer30);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(headers46);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence71 + "' != '" + "" + "'", charSequence71, "");
        org.junit.Assert.assertNotNull(headers72);
        org.junit.Assert.assertNotNull(headers73);
        org.junit.Assert.assertNotNull(headers75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 52 + "'", int76 == 52);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str15 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = strKafkaSpout0.firstPollOffsetStrategy;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertNull(firstPollOffsetStrategy14);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str14 = charSequenceConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor23 = null;
        strKafkaSpout19.waitingToEmit = strConsumerRecordItor23;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer25 = strKafkaSpout19.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer26 = strKafkaSpout19.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType32, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long39 = charSequenceConsumerRecord38.offset();
        long long40 = charSequenceConsumerRecord38.checksum();
        int int41 = charSequenceConsumerRecord38.serializedKeySize();
        org.apache.kafka.common.header.Headers headers42 = charSequenceConsumerRecord38.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType15, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout19, (java.lang.CharSequence) "hi!", headers42);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType15, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        long long50 = charSequenceConsumerRecord49.checksum();
        long long51 = charSequenceConsumerRecord49.offset();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(timer25);
        org.junit.Assert.assertNull(strKafkaConsumer26);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers12 = charSequenceConsumerRecord10.headers();
        long long13 = charSequenceConsumerRecord10.offset();
        int int14 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.value();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!), partition = 1, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", 35, 35L, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor3 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = 0;
        boolean boolean6 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = strKafkaSpout0.kafkaSpoutConfig;
        java.lang.String str9 = strKafkaSpout0.toString();
        org.junit.Assert.assertNull(strConsumerRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
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
        org.apache.kafka.common.record.TimestampType timestampType28 = charSequenceConsumerRecord25.timestampType();
        int int29 = charSequenceConsumerRecord25.serializedValueSize();
        int int30 = charSequenceConsumerRecord25.serializedValueSize();
        int int31 = charSequenceConsumerRecord25.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertNull(timestampType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        strKafkaSpout0.maxRetries = 1;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService6;
        strKafkaSpout0.numUncommittedOffsets = 'a';
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        java.lang.String str8 = strKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        strKafkaSpout0.collector = spoutOutputCollector12;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strConsumerRecordItor9);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        boolean boolean7 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams9;
        boolean boolean11 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = strKafkaSpout0.collector;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(spoutOutputCollector12);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", 100, (long) (byte) 100, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType6 = charSequenceConsumerRecord5.timestampType();
        java.lang.String str7 = charSequenceConsumerRecord5.topic();
        long long8 = charSequenceConsumerRecord5.checksum();
        java.lang.String str9 = charSequenceConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str9, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer1 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder5 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig7 = strKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer1);
        org.junit.Assert.assertNull(firstPollOffsetStrategy2);
        org.junit.Assert.assertNull(strKafkaSpoutConfig7);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 1, 1L, (long) (byte) 10, timestampType4, (long) '#', (int) (byte) 100, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        java.lang.String str11 = charSequenceConsumerRecord10.value();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        long long14 = charSequenceConsumerRecord10.checksum();
        long long15 = charSequenceConsumerRecord10.checksum();
        long long16 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType17 = charSequenceConsumerRecord10.timestampType();
        long long18 = charSequenceConsumerRecord10.checksum();
        org.apache.kafka.common.header.Headers headers19 = charSequenceConsumerRecord10.headers();
        long long20 = charSequenceConsumerRecord10.checksum();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.CharSequence charSequence6 = charSequenceConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers7 = charSequenceConsumerRecord5.headers();
        org.apache.kafka.common.record.TimestampType timestampType8 = charSequenceConsumerRecord5.timestampType();
        int int9 = charSequenceConsumerRecord5.serializedKeySize();
        java.lang.String str10 = charSequenceConsumerRecord5.topic();
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.lang.String str7 = strKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.record.TimestampType timestampType13 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 0, 0L, (long) 97, timestampType13, (long) '4', (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        int int20 = charSequenceConsumerRecord19.partition();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord19.timestampType();
        java.lang.String str22 = charSequenceConsumerRecord19.value();
        java.lang.CharSequence charSequence23 = charSequenceConsumerRecord19.key();
        long long24 = charSequenceConsumerRecord19.checksum();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) long24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(timestampType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str18 = charSequenceConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType19 = charSequenceConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout23.maxRetries = (byte) -1;
        int int26 = strKafkaSpout23.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor27 = null;
        strKafkaSpout23.waitingToEmit = strConsumerRecordItor27;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer29 = strKafkaSpout23.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer30 = strKafkaSpout23.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType36, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long43 = charSequenceConsumerRecord42.offset();
        long long44 = charSequenceConsumerRecord42.checksum();
        int int45 = charSequenceConsumerRecord42.serializedKeySize();
        org.apache.kafka.common.header.Headers headers46 = charSequenceConsumerRecord42.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType19, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout23, (java.lang.CharSequence) "hi!", headers46);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType19, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) -1, (long) ' ', (long) (short) 0, timestampType19, (long) (short) 1, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        org.apache.kafka.common.header.Headers headers60 = charSequenceConsumerRecord59.headers();
        org.apache.kafka.common.header.Headers headers61 = charSequenceConsumerRecord59.headers();
        int int62 = charSequenceConsumerRecord59.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(timer29);
        org.junit.Assert.assertNull(strKafkaConsumer30);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(headers46);
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertNotNull(headers61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>>();
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord10.key();
        long long16 = charSequenceConsumerRecord10.offset();
        long long17 = charSequenceConsumerRecord10.checksum();
        long long18 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers19 = charSequenceConsumerRecord10.headers();
        long long20 = charSequenceConsumerRecord10.checksum();
        java.util.Optional<java.lang.Integer> intOptional21 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(intOptional21);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator36 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator36;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator36.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator36.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator39;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = kafkaSpoutMessageIdComparator39.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = offsetComparator7.thenComparing(kafkaSpoutMessageIdComparator39);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId43 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = offsetComparator7.compare(kafkaSpoutMessageId43, kafkaSpoutMessageId44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = strKafkaSpout0.emitted;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        boolean boolean10 = strKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str14 = charSequenceConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor23 = null;
        strKafkaSpout19.waitingToEmit = strConsumerRecordItor23;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer25 = strKafkaSpout19.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer26 = strKafkaSpout19.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType32, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long39 = charSequenceConsumerRecord38.offset();
        long long40 = charSequenceConsumerRecord38.checksum();
        int int41 = charSequenceConsumerRecord38.serializedKeySize();
        org.apache.kafka.common.header.Headers headers42 = charSequenceConsumerRecord38.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType15, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout19, (java.lang.CharSequence) "hi!", headers42);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType15, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        java.lang.CharSequence charSequence50 = charSequenceConsumerRecord49.key();
        org.apache.kafka.common.record.TimestampType timestampType51 = charSequenceConsumerRecord49.timestampType();
        long long52 = charSequenceConsumerRecord49.checksum();
        org.apache.kafka.common.record.TimestampType timestampType53 = charSequenceConsumerRecord49.timestampType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(timer25);
        org.junit.Assert.assertNull(strKafkaConsumer26);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertEquals("'" + charSequence50 + "' != '" + "" + "'", charSequence50, "");
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertTrue("'" + timestampType53 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType53.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 10, 0L, (java.lang.CharSequence) "", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        long long6 = charSequenceConsumerRecord5.checksum();
        java.lang.String str7 = charSequenceConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional8 = charSequenceConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers9 = charSequenceConsumerRecord5.headers();
        int int10 = charSequenceConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str7, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.initialized = false;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector10);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = strKafkaSpout0.collector;
        boolean boolean11 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", 97, 32L, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=[]}", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)");
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor7;
        long long9 = strKafkaSpout0.numUncommittedOffsets;
        int int10 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder11 = strKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder11);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.partition();
        int int15 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        long long17 = charSequenceConsumerRecord10.checksum();
        long long18 = charSequenceConsumerRecord10.checksum();
        java.lang.String str19 = charSequenceConsumerRecord10.topic();
        long long20 = charSequenceConsumerRecord10.checksum();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)", (int) (byte) 100, 97L, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) -1, 1L, (long) '#', timestampType14, 0L, (int) (byte) 1, (int) 'a', (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = 97, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", (int) (short) 100, (long) (short) -1, (long) '#', timestampType14, (long) (short) 100, 1, (int) (short) 10, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = 97, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) '#', (long) '4', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "KafkaSpout{acked=null, emitted=[]}");
        java.lang.CharSequence charSequence6 = charSequenceConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers7 = charSequenceConsumerRecord5.headers();
        int int8 = charSequenceConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )" + "'", charSequence6, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
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
        org.apache.kafka.common.record.TimestampType timestampType20 = charSequenceConsumerRecord10.timestampType();
        int int21 = charSequenceConsumerRecord10.partition();
        java.lang.String str22 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertNull(timestampType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        java.lang.String str12 = charSequenceConsumerRecord10.toString();
        int int13 = charSequenceConsumerRecord10.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional14 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        int int17 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str18 = charSequenceConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(intOptional14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig10 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams12;
        strKafkaSpout0.numUncommittedOffsets = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder7);
        org.junit.Assert.assertNull(firstPollOffsetStrategy16);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        boolean boolean12 = strKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.nextTuple();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
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
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet13 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService14;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
        org.junit.Assert.assertNull(timer10);
        org.junit.Assert.assertNotNull(topicPartitionCollection12);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet13);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 1, 1L, (long) (byte) 10, timestampType4, (long) '#', (int) (byte) 100, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        java.lang.String str11 = charSequenceConsumerRecord10.value();
        org.apache.kafka.common.header.Headers headers12 = charSequenceConsumerRecord10.headers();
        long long13 = charSequenceConsumerRecord10.offset();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str11 = charSequenceConsumerRecord10.toString();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        java.lang.CharSequence charSequence13 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        long long15 = charSequenceConsumerRecord10.offset();
        long long16 = charSequenceConsumerRecord10.offset();
        int int17 = charSequenceConsumerRecord10.partition();
        int int18 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        boolean boolean10 = strKafkaSpout0.consumerAutoCommitMode;
        strKafkaSpout0.maxRetries = (short) 10;
        strKafkaSpout0.maxRetries = 35;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        int int12 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional13 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str14 = charSequenceConsumerRecord10.topic();
        int int15 = charSequenceConsumerRecord10.serializedValueSize();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str14 = charSequenceConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout19.maxRetries = (byte) -1;
        int int22 = strKafkaSpout19.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor23 = null;
        strKafkaSpout19.waitingToEmit = strConsumerRecordItor23;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer25 = strKafkaSpout19.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer26 = strKafkaSpout19.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType32, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long39 = charSequenceConsumerRecord38.offset();
        long long40 = charSequenceConsumerRecord38.checksum();
        int int41 = charSequenceConsumerRecord38.serializedKeySize();
        org.apache.kafka.common.header.Headers headers42 = charSequenceConsumerRecord38.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType15, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout19, (java.lang.CharSequence) "hi!", headers42);
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType53, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long60 = charSequenceConsumerRecord59.checksum();
        int int61 = charSequenceConsumerRecord59.partition();
        long long62 = charSequenceConsumerRecord59.offset();
        org.apache.kafka.common.header.Headers headers63 = charSequenceConsumerRecord59.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType68, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long75 = charSequenceConsumerRecord74.offset();
        int int76 = charSequenceConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = charSequenceConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 10, 10L, 0L, timestampType15, (java.lang.Long) 35L, (int) (byte) 0, (-1), (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers63, intOptional77);
        long long79 = charSequenceConsumerRecord78.checksum();
        long long80 = charSequenceConsumerRecord78.checksum();
        int int81 = charSequenceConsumerRecord78.serializedKeySize();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(timer25);
        org.junit.Assert.assertNull(strKafkaConsumer26);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(headers63);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 35L + "'", long79 == 35L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 35L + "'", long80 == 35L);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams10;
        boolean boolean12 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams14;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = strKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(spoutOutputCollector13);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (-1), (long) ' ', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.util.Optional<java.lang.Integer> intOptional14 = charSequenceConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType23 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType23, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long30 = charSequenceConsumerRecord29.checksum();
        int int31 = charSequenceConsumerRecord29.partition();
        long long32 = charSequenceConsumerRecord29.timestamp();
        long long33 = charSequenceConsumerRecord29.offset();
        int int34 = charSequenceConsumerRecord29.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType35 = charSequenceConsumerRecord29.timestampType();
        int int36 = charSequenceConsumerRecord29.partition();
        long long37 = charSequenceConsumerRecord29.checksum();
        java.lang.String str38 = charSequenceConsumerRecord29.toString();
        org.apache.kafka.common.header.Headers headers39 = charSequenceConsumerRecord29.headers();
        java.lang.Class<?> wildcardClass40 = charSequenceConsumerRecord29.getClass();
        org.apache.kafka.common.record.TimestampType timestampType45 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray49 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList50 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList50, kafkaSpoutMessageIdArray49);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Comparable<java.lang.String>> kafkaSpoutMessageIdCollectionConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Comparable<java.lang.String>>("KafkaSpout{acked=null, emitted=null}", (-1), (long) (short) -1, (long) 10, timestampType45, (long) 1, (int) 'a', (-1), (java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList50, (java.lang.Comparable<java.lang.String>) "KafkaSpout{acked=null, emitted=null}");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.util.RandomAccess> genericDeclarationConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.util.RandomAccess>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", 10, 35L, (long) '#', timestampType15, (long) 'a', (int) (byte) 100, 97, (java.lang.reflect.GenericDeclaration) wildcardClass40, (java.util.RandomAccess) kafkaSpoutMessageIdList50);
        org.apache.kafka.common.record.TimestampType timestampType64 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType64, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long71 = charSequenceConsumerRecord70.offset();
        java.lang.String str72 = charSequenceConsumerRecord70.topic();
        org.apache.kafka.common.header.Headers headers73 = charSequenceConsumerRecord70.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (-1), (long) ' ', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.util.Optional<java.lang.Integer> intOptional80 = charSequenceConsumerRecord79.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional81 = charSequenceConsumerRecord79.leaderEpoch();
        long long82 = charSequenceConsumerRecord79.timestamp();
        java.lang.String str83 = charSequenceConsumerRecord79.value();
        java.util.Optional<java.lang.Integer> intOptional84 = charSequenceConsumerRecord79.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!), partition = 1, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", (int) (short) 10, 0L, (long) 10, timestampType15, (java.lang.Long) 35L, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = , partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers73, intOptional84);
        org.junit.Assert.assertNotNull(intOptional14);
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNull(timestampType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str38, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(headers73);
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertNotNull(intOptional81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str83, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional84);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        int int8 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = strKafkaSpout0.tuplesBuilder;
        strKafkaSpout0.initialized = false;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        strKafkaSpout0.collector = spoutOutputCollector12;
        strKafkaSpout0.numUncommittedOffsets = 1L;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = null;
        strKafkaSpout0.collector = spoutOutputCollector16;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig18 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig18;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords7 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.topic();
        int int17 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType18 = charSequenceConsumerRecord10.timestampType();
        int int19 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional20 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str21 = charSequenceConsumerRecord10.value();
        java.lang.String str22 = charSequenceConsumerRecord10.toString();
        int int23 = charSequenceConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        java.lang.String str12 = charSequenceConsumerRecord10.value();
        java.lang.String str13 = charSequenceConsumerRecord10.toString();
        java.lang.String str14 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional15 = charSequenceConsumerRecord10.leaderEpoch();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str17 = charSequenceConsumerRecord10.value();
        java.lang.String str18 = charSequenceConsumerRecord10.value();
        java.util.Optional<java.lang.Integer> intOptional19 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(intOptional19);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType27, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int34 = charSequenceConsumerRecord33.serializedValueSize();
        java.lang.CharSequence charSequence35 = charSequenceConsumerRecord33.key();
        org.apache.kafka.common.header.Headers headers36 = charSequenceConsumerRecord33.headers();
        java.util.Optional<java.lang.Integer> intOptional37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType17, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers36, intOptional37);
        org.apache.kafka.common.record.TimestampType timestampType46 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType46, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int53 = charSequenceConsumerRecord52.serializedValueSize();
        java.lang.CharSequence charSequence54 = charSequenceConsumerRecord52.key();
        org.apache.kafka.common.header.Headers headers55 = charSequenceConsumerRecord52.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray56 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList57 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList57, kafkaSpoutMessageIdArray56);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers55, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList57);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headersConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("", (int) '#', 1L, headers36, kafkaSpoutMessageIdList57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) 'a', (long) (byte) 1, (long) (byte) 0, timestampType4, (java.lang.Long) (-1L), (int) (short) 100, 1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=null}", headers36);
        org.apache.kafka.common.header.Headers headers62 = charSequenceConsumerRecord61.headers();
        java.lang.String str63 = charSequenceConsumerRecord61.toString();
        org.apache.kafka.common.record.TimestampType timestampType64 = charSequenceConsumerRecord61.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType65 = charSequenceConsumerRecord61.timestampType();
        long long66 = charSequenceConsumerRecord61.timestamp();
        java.util.Optional<java.lang.Integer> intOptional67 = charSequenceConsumerRecord61.leaderEpoch();
        long long68 = charSequenceConsumerRecord61.timestamp();
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "" + "'", charSequence35, "");
        org.junit.Assert.assertNotNull(headers36);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence54 + "' != '" + "" + "'", charSequence54, "");
        org.junit.Assert.assertNotNull(headers55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(headers62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})" + "'", str63, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.junit.Assert.assertNull(timestampType64);
        org.junit.Assert.assertNull(timestampType65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(intOptional67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long18 = charSequenceConsumerRecord17.checksum();
        long long19 = charSequenceConsumerRecord17.timestamp();
        org.apache.kafka.common.header.Headers headers20 = charSequenceConsumerRecord17.headers();
        java.lang.String str21 = charSequenceConsumerRecord17.toString();
        org.apache.kafka.common.header.Headers headers22 = charSequenceConsumerRecord17.headers();
        java.lang.String str23 = charSequenceConsumerRecord17.topic();
        long long24 = charSequenceConsumerRecord17.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType25 = charSequenceConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (byte) 1, (long) 100, timestampType25, (long) 1, 35, (int) (byte) 10, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType41 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType41, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int48 = charSequenceConsumerRecord47.serializedValueSize();
        java.lang.CharSequence charSequence49 = charSequenceConsumerRecord47.key();
        org.apache.kafka.common.header.Headers headers50 = charSequenceConsumerRecord47.headers();
        int int51 = charSequenceConsumerRecord47.partition();
        int int52 = charSequenceConsumerRecord47.partition();
        java.lang.CharSequence charSequence53 = charSequenceConsumerRecord47.key();
        long long54 = charSequenceConsumerRecord47.checksum();
        long long55 = charSequenceConsumerRecord47.checksum();
        org.apache.kafka.common.header.Headers headers56 = charSequenceConsumerRecord47.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 0, null = 97, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) '4', 0L, (long) 100, timestampType25, (java.lang.Long) 1L, (-1), (int) 'a', (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", headers56);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", (-1), 0L, (long) 35, timestampType25, (long) (byte) 100, 0, 32, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 97, leaderEpoch = null, offset = 100, NoTimestampType = 97, serialized key size = 97, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=[]}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str21, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType25 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType25.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence49 + "' != '" + "" + "'", charSequence49, "");
        org.junit.Assert.assertNotNull(headers50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertEquals("'" + charSequence53 + "' != '" + "" + "'", charSequence53, "");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(headers56);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
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
        long long13 = strKafkaSpout0.numUncommittedOffsets;
        java.lang.String str14 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams15;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor17 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor17;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder19 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder19;
        boolean boolean21 = strKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str14, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpout0.retryService;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder14 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout15 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean16 = strKafkaSpout15.waitingToEmit();
        strKafkaSpout15.maxRetries = 1;
        boolean boolean19 = strKafkaSpout15.consumerAutoCommitMode;
        boolean boolean20 = strKafkaSpout15.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService21 = null;
        strKafkaSpout15.retryService = kafkaSpoutRetryService21;
        strKafkaSpout15.numUncommittedOffsets = (-1L);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout25 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout25.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = strKafkaSpout25.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout29 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout29.maxRetries = (byte) -1;
        int int32 = strKafkaSpout29.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray33 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet34 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet34, kafkaSpoutMessageIdArray33);
        strKafkaSpout29.emitted = kafkaSpoutMessageIdSet34;
        strKafkaSpout25.emitted = kafkaSpoutMessageIdSet34;
        strKafkaSpout15.emitted = kafkaSpoutMessageIdSet34;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet39 = strKafkaSpout15.emitted;
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet39;
        long long41 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector42 = null;
        strKafkaSpout0.collector = spoutOutputCollector42;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer44 = strKafkaSpout0.kafkaConsumer;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strKafkaConsumer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strKafkaConsumer12);
        org.junit.Assert.assertNull(spoutOutputCollector13);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdSet39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(strKafkaConsumer44);
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        strKafkaSpout0.maxRetries = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(spoutOutputCollector9);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer11 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer12 = strKafkaSpout0.commitTimer;
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(timer11);
        org.junit.Assert.assertNull(timer12);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        strKafkaSpout0.collector = spoutOutputCollector12;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy11);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout4 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean5 = strKafkaSpout4.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder6 = null;
        strKafkaSpout4.tuplesBuilder = strKafkaSpoutTuplesBuilder6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        strKafkaSpout4.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig10 = strKafkaSpout4.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = null;
        strKafkaSpout4.waitingToEmit = strConsumerRecordItor11;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor13 = null;
        strKafkaSpout4.waitingToEmit = strConsumerRecordItor13;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor15 = null;
        strKafkaSpout4.waitingToEmit = strConsumerRecordItor15;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer17 = strKafkaSpout4.commitTimer;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.topology.IComponent> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.topology.IComponent>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (short) -1, (long) (byte) 0, "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", (org.apache.storm.topology.IComponent) strKafkaSpout4);
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout4.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig10);
        org.junit.Assert.assertNull(timer17);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.topic();
        int int17 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType18 = charSequenceConsumerRecord10.timestampType();
        int int19 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional20 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str21 = charSequenceConsumerRecord10.topic();
        java.lang.String str22 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord10.headers();
        org.apache.kafka.common.record.TimestampType timestampType24 = charSequenceConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional25 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertNull(timestampType24);
        org.junit.Assert.assertNotNull(intOptional25);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str22 = charSequenceConsumerRecord21.topic();
        org.apache.kafka.common.record.TimestampType timestampType23 = charSequenceConsumerRecord21.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType31, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long38 = charSequenceConsumerRecord37.checksum();
        int int39 = charSequenceConsumerRecord37.partition();
        long long40 = charSequenceConsumerRecord37.timestamp();
        java.lang.String str41 = charSequenceConsumerRecord37.toString();
        long long42 = charSequenceConsumerRecord37.timestamp();
        org.apache.kafka.common.header.Headers headers43 = charSequenceConsumerRecord37.headers();
        org.apache.kafka.common.record.TimestampType timestampType44 = charSequenceConsumerRecord37.timestampType();
        java.util.Optional<java.lang.Integer> intOptional45 = charSequenceConsumerRecord37.leaderEpoch();
        org.apache.storm.topology.IComponent iComponent46 = null;
        org.apache.kafka.common.record.TimestampType timestampType51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType51, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long58 = charSequenceConsumerRecord57.checksum();
        int int59 = charSequenceConsumerRecord57.partition();
        long long60 = charSequenceConsumerRecord57.timestamp();
        java.lang.String str61 = charSequenceConsumerRecord57.toString();
        org.apache.kafka.common.header.Headers headers62 = charSequenceConsumerRecord57.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.IComponent> intOptionalConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.IComponent>("hi!", (int) ' ', (long) (byte) -1, (long) (-1), timestampType23, (java.lang.Long) 100L, (int) 'a', (-1), intOptional45, iComponent46, headers62);
        org.apache.storm.topology.IRichSpout iRichSpout68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.IRichSpout> strComparableConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.IRichSpout>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", (int) (byte) 0, (long) 10, (long) (-1), timestampType23, (long) 0, (int) (short) 10, (int) (byte) 1, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", iRichSpout68);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", (int) (byte) 100, 100L, (long) (short) 100, timestampType23, (long) 'a', (int) ' ', (-1), (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", 52, 0L, (long) 97, timestampType23, (long) (byte) -1, (int) ' ', 10, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        long long82 = charSequenceConsumerRecord81.timestamp();
        long long83 = charSequenceConsumerRecord81.checksum();
        int int84 = charSequenceConsumerRecord81.partition();
        org.apache.kafka.common.header.Headers headers85 = charSequenceConsumerRecord81.headers();
        int int86 = charSequenceConsumerRecord81.partition();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str41, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(headers43);
        org.junit.Assert.assertNull(timestampType44);
        org.junit.Assert.assertNotNull(intOptional45);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str61, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers62);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 97L + "'", long82 == 97L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 52 + "'", int84 == 52);
        org.junit.Assert.assertNotNull(headers85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 52 + "'", int86 == 52);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (byte) -1, (long) '4', (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "hi!");
        java.lang.String str6 = charSequenceConsumerRecord5.topic();
        int int7 = charSequenceConsumerRecord5.serializedKeySize();
        long long8 = charSequenceConsumerRecord5.offset();
        java.lang.String str9 = charSequenceConsumerRecord5.toString();
        java.lang.CharSequence charSequence10 = charSequenceConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType11 = charSequenceConsumerRecord5.timestampType();
        long long12 = charSequenceConsumerRecord5.offset();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=[]}" + "'", str6, "KafkaSpout{acked=null, emitted=[]}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)" + "'", str9, "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)");
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", charSequence10, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 10, 100L, (long) 10, timestampType4, (-1L), (int) (short) 10, (int) (byte) 100, (java.lang.CharSequence) "", "KafkaSpout{acked=null, emitted=null}");
        java.lang.String str11 = charSequenceConsumerRecord10.value();
        long long12 = charSequenceConsumerRecord10.checksum();
        int int13 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord10.timestampType();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertNull(timestampType15);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 1, 1L, (long) (byte) 10, timestampType4, (long) '#', (int) (byte) 100, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        long long11 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType12 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str13 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(timestampType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 10, 1L, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=[]}");
        int int6 = charSequenceConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType7 = charSequenceConsumerRecord5.timestampType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig31 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = strKafkaSpout0.firstPollOffsetStrategy;
        strKafkaSpout0.numUncommittedOffsets = 35;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor35 = strKafkaSpout0.waitingToEmit;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection16);
        org.junit.Assert.assertNull(timer17);
        org.junit.Assert.assertNull(spoutOutputCollector18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig31);
        org.junit.Assert.assertNull(firstPollOffsetStrategy32);
        org.junit.Assert.assertNull(strConsumerRecordItor35);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator13;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator12.thenComparing(kafkaSpoutMessageIdComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator26 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator26;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = offsetComparator26.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator33 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator33;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator33);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator28.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator33);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator37;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator37.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator44;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = kafkaSpoutMessageIdComparator39.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = kafkaSpoutMessageIdComparator28.thenComparing(kafkaSpoutMessageIdComparator47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator49 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator49;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = offsetComparator49.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = offsetComparator49.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = kafkaSpoutMessageIdComparator47.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator49);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator11.thenComparing(kafkaSpoutMessageIdComparator53);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator53.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator53;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator57 = kafkaSpoutMessageIdComparator53.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator53;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator57);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long10 = charSequenceConsumerRecord9.checksum();
        long long11 = charSequenceConsumerRecord9.timestamp();
        org.apache.kafka.common.header.Headers headers12 = charSequenceConsumerRecord9.headers();
        java.lang.String str13 = charSequenceConsumerRecord9.toString();
        org.apache.kafka.common.header.Headers headers14 = charSequenceConsumerRecord9.headers();
        java.lang.String str15 = charSequenceConsumerRecord9.topic();
        long long16 = charSequenceConsumerRecord9.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType17 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType18 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", 0, (long) (byte) 0, 0L, timestampType18, (long) 100, 97, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!)", "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        long long25 = charSequenceConsumerRecord24.offset();
        int int26 = charSequenceConsumerRecord24.partition();
        long long27 = charSequenceConsumerRecord24.offset();
        int int28 = charSequenceConsumerRecord24.serializedKeySize();
        long long29 = charSequenceConsumerRecord24.timestamp();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str13, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = strKafkaSpout0.toArrayList(topicPartition8);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor10;
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService1;
        java.lang.String str3 = strKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = strKafkaSpout0.toArrayList(topicPartition4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 100, 1L, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=[]}");
        org.apache.kafka.common.record.TimestampType timestampType10 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType20, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long27 = charSequenceConsumerRecord26.offset();
        java.lang.String str28 = charSequenceConsumerRecord26.value();
        java.util.Optional<java.lang.Integer> intOptional29 = charSequenceConsumerRecord26.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType30 = charSequenceConsumerRecord26.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType31 = charSequenceConsumerRecord26.timestampType();
        long long32 = charSequenceConsumerRecord26.checksum();
        org.apache.kafka.common.header.Headers headers33 = charSequenceConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (-1), (long) 35, 100L, timestampType10, (java.lang.Long) 35L, (int) (byte) 0, (int) (short) 100, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)))", headers33);
        java.lang.CharSequence charSequence35 = charSequenceConsumerRecord34.key();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(intOptional29);
        org.junit.Assert.assertNull(timestampType30);
        org.junit.Assert.assertNull(timestampType31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )" + "'", charSequence35, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )");
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str22 = charSequenceConsumerRecord21.topic();
        org.apache.kafka.common.record.TimestampType timestampType23 = charSequenceConsumerRecord21.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType31, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long38 = charSequenceConsumerRecord37.checksum();
        int int39 = charSequenceConsumerRecord37.partition();
        java.lang.String str40 = charSequenceConsumerRecord37.value();
        int int41 = charSequenceConsumerRecord37.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional42 = charSequenceConsumerRecord37.leaderEpoch();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout43 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet44 = strKafkaSpout43.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor45 = null;
        strKafkaSpout43.waitingToEmit = strConsumerRecordItor45;
        boolean boolean47 = strKafkaSpout43.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig48 = null;
        strKafkaSpout43.kafkaSpoutConfig = strKafkaSpoutConfig48;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy50 = strKafkaSpout43.firstPollOffsetStrategy;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, org.apache.storm.topology.base.BaseComponent> objConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, org.apache.storm.topology.base.BaseComponent>("", (int) (short) 100, (long) (short) 1, (long) (byte) 10, timestampType23, (long) 1, (int) 'a', (-1), (java.lang.Object) charSequenceConsumerRecord37, (org.apache.storm.topology.base.BaseComponent) strKafkaSpout43);
        org.apache.kafka.common.record.TimestampType timestampType61 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType61, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long68 = charSequenceConsumerRecord67.checksum();
        int int69 = charSequenceConsumerRecord67.partition();
        java.lang.String str70 = charSequenceConsumerRecord67.value();
        int int71 = charSequenceConsumerRecord67.serializedKeySize();
        org.apache.kafka.common.header.Headers headers72 = charSequenceConsumerRecord67.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str79 = charSequenceConsumerRecord78.topic();
        java.util.Optional<java.lang.Integer> intOptional80 = charSequenceConsumerRecord78.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", 0, (long) (short) 10, (long) (-1), timestampType23, (java.lang.Long) 35L, 10, (int) (short) 10, (java.lang.CharSequence) "", "KafkaSpout{acked=null, emitted=null}", headers72, intOptional80);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord87 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 0, (long) (byte) -1, (long) (short) 10, timestampType23, (-1L), 100, 10, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord93 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", 10, (long) (short) 0, 35L, timestampType23, (long) ' ', 10, (int) (byte) 100, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 100, null = 10, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})");
        java.lang.String str94 = charSequenceConsumerRecord93.topic();
        org.apache.kafka.common.record.TimestampType timestampType95 = charSequenceConsumerRecord93.timestampType();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(intOptional42);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(firstPollOffsetStrategy50);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52 + "'", int71 == 52);
        org.junit.Assert.assertNotNull(headers72);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})" + "'", str94, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})");
        org.junit.Assert.assertTrue("'" + timestampType95 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType95.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        int int11 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams14;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer16 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer16;
        org.apache.kafka.common.TopicPartition topicPartition18 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection19 = strKafkaSpout0.toArrayList(topicPartition18);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaConsumer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(topicPartitionCollection19);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
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
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder12 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder12;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams14;
        long long16 = strKafkaSpout0.numUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long6 = charSequenceConsumerRecord5.checksum();
        long long7 = charSequenceConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers8 = charSequenceConsumerRecord5.headers();
        java.lang.String str9 = charSequenceConsumerRecord5.toString();
        org.apache.kafka.common.header.Headers headers10 = charSequenceConsumerRecord5.headers();
        java.lang.String str11 = charSequenceConsumerRecord5.topic();
        long long12 = charSequenceConsumerRecord5.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType13 = charSequenceConsumerRecord5.timestampType();
        java.lang.String str14 = charSequenceConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional15 = charSequenceConsumerRecord5.leaderEpoch();
        long long16 = charSequenceConsumerRecord5.timestamp();
        java.lang.String str17 = charSequenceConsumerRecord5.value();
        java.util.Optional<java.lang.Integer> intOptional18 = charSequenceConsumerRecord5.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str9, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional18);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
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
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor20 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor20;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService22 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService22;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor24 = strKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition25 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection26 = strKafkaSpout0.toArrayList(topicPartition25);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor27 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer28 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService29 = strKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = strKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor24);
        org.junit.Assert.assertNotNull(topicPartitionCollection26);
        org.junit.Assert.assertNull(strConsumerRecordItor27);
        org.junit.Assert.assertNull(timer28);
        org.junit.Assert.assertNull(kafkaSpoutRetryService29);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        boolean boolean10 = strKafkaSpout0.initialized;
        int int11 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor12 = strKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor13 = strKafkaSpout0.waitingToEmit;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(strConsumerRecordItor12);
        org.junit.Assert.assertNull(strConsumerRecordItor13);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig16 = strKafkaSpout0.kafkaSpoutConfig;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig16);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = strKafkaSpout0.toArrayList(topicPartition7);
        boolean boolean9 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection13 = strKafkaSpout0.toArrayList(topicPartition12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig14 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig14;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection13);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str11 = charSequenceConsumerRecord10.toString();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        java.lang.CharSequence charSequence13 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        int int16 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str17 = charSequenceConsumerRecord10.value();
        java.lang.String str18 = charSequenceConsumerRecord10.toString();
        long long19 = charSequenceConsumerRecord10.offset();
        int int20 = charSequenceConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder2;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector2 = null;
        strKafkaSpout0.collector = spoutOutputCollector2;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder4 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder4;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer11 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder12 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig14 = strKafkaSpout0.kafkaSpoutConfig;
        boolean boolean15 = strKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strKafkaConsumer11);
        org.junit.Assert.assertNull(strKafkaSpoutConfig14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)))", (int) (byte) 0, (long) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]})", "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, null = 1, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )");
        int int6 = charSequenceConsumerRecord5.partition();
        long long7 = charSequenceConsumerRecord5.offset();
        int int8 = charSequenceConsumerRecord5.serializedKeySize();
        int int9 = charSequenceConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        strKafkaSpout0.collector = spoutOutputCollector3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig5 = strKafkaSpout0.kafkaSpoutConfig;
        java.lang.String str6 = strKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) 'a', (long) 10, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=[]}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.ack((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strKafkaSpoutConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator1;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator8;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator8);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator3.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator8);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator11);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator13;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator24;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator31;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator26.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = kafkaSpoutMessageIdComparator15.thenComparing(kafkaSpoutMessageIdComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator12.thenComparing(kafkaSpoutMessageIdComparator35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator37;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator37.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator37;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator41 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator41;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = offsetComparator41.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = offsetComparator37.thenComparing(kafkaSpoutMessageIdComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator37);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator46;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator46.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator53 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator53;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator53);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = kafkaSpoutMessageIdComparator48.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator53);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator57 = offsetComparator53.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator58 = offsetComparator53.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator59 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator59;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator61 = offsetComparator59.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator66 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator66;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator66);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator69 = kafkaSpoutMessageIdComparator61.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator66);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator70 = kafkaSpoutMessageIdComparator61.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator71 = offsetComparator53.thenComparing(kafkaSpoutMessageIdComparator70);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator72 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator73 = offsetComparator72.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator74 = kafkaSpoutMessageIdComparator71.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator72);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator72;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator76 = kafkaSpoutMessageIdComparator45.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator72);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId77 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId78 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int79 = offsetComparator72.compare(kafkaSpoutMessageId77, kafkaSpoutMessageId78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator58);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator61);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator69);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator70);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator71);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator73);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator74);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator76);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long14 = charSequenceConsumerRecord13.checksum();
        long long15 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord13.headers();
        java.lang.String str17 = charSequenceConsumerRecord13.toString();
        org.apache.kafka.common.header.Headers headers18 = charSequenceConsumerRecord13.headers();
        java.lang.String str19 = charSequenceConsumerRecord13.topic();
        long long20 = charSequenceConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (byte) 1, (long) 100, timestampType21, (long) 1, 35, (int) (byte) 10, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType37, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int44 = charSequenceConsumerRecord43.serializedValueSize();
        java.lang.CharSequence charSequence45 = charSequenceConsumerRecord43.key();
        int int46 = charSequenceConsumerRecord43.serializedKeySize();
        int int47 = charSequenceConsumerRecord43.serializedKeySize();
        org.apache.kafka.common.header.Headers headers48 = charSequenceConsumerRecord43.headers();
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType53, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long60 = charSequenceConsumerRecord59.checksum();
        int int61 = charSequenceConsumerRecord59.partition();
        java.lang.String str62 = charSequenceConsumerRecord59.value();
        int int63 = charSequenceConsumerRecord59.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional64 = charSequenceConsumerRecord59.leaderEpoch();
        long long65 = charSequenceConsumerRecord59.timestamp();
        java.util.Optional<java.lang.Integer> intOptional66 = charSequenceConsumerRecord59.leaderEpoch();
        int int67 = charSequenceConsumerRecord59.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional68 = charSequenceConsumerRecord59.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 100, null = 10, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", 0, 0L, 0L, timestampType21, (java.lang.Long) 35L, (int) (short) -1, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "hi!", headers48, intOptional68);
        int int70 = charSequenceConsumerRecord69.serializedValueSize();
        java.lang.String str71 = charSequenceConsumerRecord69.value();
        int int72 = charSequenceConsumerRecord69.partition();
        int int73 = charSequenceConsumerRecord69.partition();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str17, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence45 + "' != '" + "" + "'", charSequence45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertNotNull(headers48);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertNotNull(intOptional64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(intOptional66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intOptional68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
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
        long long13 = strKafkaSpout0.numUncommittedOffsets;
        java.lang.String str14 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService15;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords17 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str14, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
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
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = strKafkaSpout0.toArrayList(topicPartition10);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder12 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig13 = strKafkaSpout0.kafkaSpoutConfig;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder12);
        org.junit.Assert.assertNull(strKafkaSpoutConfig13);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        int int12 = charSequenceConsumerRecord10.serializedValueSize();
        int int13 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence14 = charSequenceConsumerRecord10.key();
        java.lang.String str15 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional16 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(intOptional16);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
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
        strKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService18;
        strKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.declareOutputFields(outputFieldsDeclarer22);
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
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        java.lang.String str12 = charSequenceConsumerRecord10.toString();
        java.lang.String str13 = charSequenceConsumerRecord10.value();
        long long14 = charSequenceConsumerRecord10.offset();
        org.apache.kafka.common.record.TimestampType timestampType15 = charSequenceConsumerRecord10.timestampType();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(timestampType15);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 0, null = 97, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (int) (byte) 1, (long) 10, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = 97, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = )");
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
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
        int int13 = strKafkaSpout0.maxRetries;
        boolean boolean14 = strKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", 100, (long) (byte) 100, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType10 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 52, 35L, (long) 0, timestampType10, 100L, (int) (short) -1, (int) (byte) -1, (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService10;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor12 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        strKafkaSpout0.collector = spoutOutputCollector13;
        boolean boolean15 = strKafkaSpout0.initialized;
        strKafkaSpout0.maxRetries = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder18 = strKafkaSpout0.tuplesBuilder;
        boolean boolean19 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams20;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strConsumerRecordItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", (int) (byte) 1, (long) (short) 10, (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 100, null = 10, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", "hi!");
        java.lang.String str6 = charSequenceConsumerRecord5.topic();
        int int7 = charSequenceConsumerRecord5.partition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)" + "'", str6, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator4;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator6);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator13;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord15 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator13);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = kafkaSpoutMessageIdComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator21;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator21.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator20.thenComparing(kafkaSpoutMessageIdComparator23);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator25;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator23.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator19.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator17.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator31.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator32);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator32.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = offsetComparator35.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator42 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator42;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = kafkaSpoutMessageIdComparator37.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator42);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator46;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator46.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator53 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator53;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator53);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = kafkaSpoutMessageIdComparator48.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator53);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator57 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator57;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = offsetComparator57.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator64 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator64;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator64);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = kafkaSpoutMessageIdComparator59.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator64);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator68 = kafkaSpoutMessageIdComparator48.thenComparing(kafkaSpoutMessageIdComparator67);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator69 = offsetComparator42.thenComparing(kafkaSpoutMessageIdComparator68);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator70;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator72 = offsetComparator70.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator77 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator77;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator77);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator80 = kafkaSpoutMessageIdComparator72.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator77);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator81 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator81;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator83 = offsetComparator81.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator88 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator88;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord90 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator88);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator91 = kafkaSpoutMessageIdComparator83.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator88);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator92 = kafkaSpoutMessageIdComparator72.thenComparing(kafkaSpoutMessageIdComparator91);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator93 = kafkaSpoutMessageIdComparator69.thenComparing(kafkaSpoutMessageIdComparator91);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparator93.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator93;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator96 = kafkaSpoutMessageIdComparator32.thenComparing(kafkaSpoutMessageIdComparator93);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator32;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator68);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator69);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator72);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator80);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator83);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator91);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator92);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator93);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator96);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
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
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = strKafkaSpout0.emitted;
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection13 = strKafkaSpout0.toArrayList(topicPartition12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = strKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor15 = strKafkaSpout0.waitingToEmit;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(topicPartitionCollection13);
        org.junit.Assert.assertNull(firstPollOffsetStrategy14);
        org.junit.Assert.assertNull(strConsumerRecordItor15);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpout0.retryService;
        strKafkaSpout0.maxRetries = 10;
        boolean boolean13 = strKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
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
        strKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer17 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector18 = strKafkaSpout0.collector;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer19 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer19;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy16);
        org.junit.Assert.assertNull(strKafkaConsumer17);
        org.junit.Assert.assertNull(spoutOutputCollector18);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        boolean boolean5 = strKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str6 = strKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig9 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig9;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor11 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService12;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strConsumerRecordItor11);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        strKafkaSpout0.maxRetries = (short) 0;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = strKafkaSpout0.waitingToEmit;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strConsumerRecordItor8);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        strKafkaSpout0.maxRetries = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType12, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long19 = charSequenceConsumerRecord18.timestamp();
        org.apache.kafka.common.header.Headers headers20 = charSequenceConsumerRecord18.headers();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout21 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout21.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = null;
        strKafkaSpout21.kafkaSpoutStreams = kafkaSpoutStreams24;
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>> headersConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", (int) '#', (long) 32, 52L, timestampType4, (long) 35, (int) (short) 0, (int) (short) 10, headers20, strKafkaSpout21);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor27 = null;
        strKafkaSpout21.waitingToEmit = strConsumerRecordItor27;
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(headers20);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 10, 1L, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=[]}");
        long long10 = charSequenceConsumerRecord9.checksum();
        org.apache.kafka.common.record.TimestampType timestampType11 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType19, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int26 = charSequenceConsumerRecord25.serializedValueSize();
        int int27 = charSequenceConsumerRecord25.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType32, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long39 = charSequenceConsumerRecord38.checksum();
        int int40 = charSequenceConsumerRecord38.partition();
        java.lang.String str41 = charSequenceConsumerRecord38.value();
        int int42 = charSequenceConsumerRecord38.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional43 = charSequenceConsumerRecord38.leaderEpoch();
        long long44 = charSequenceConsumerRecord38.timestamp();
        java.util.Optional<java.lang.Integer> intOptional45 = charSequenceConsumerRecord38.leaderEpoch();
        int int46 = charSequenceConsumerRecord38.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional47 = charSequenceConsumerRecord38.leaderEpoch();
        java.lang.Class<?> wildcardClass48 = charSequenceConsumerRecord38.getClass();
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType53, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long60 = charSequenceConsumerRecord59.checksum();
        int int61 = charSequenceConsumerRecord59.partition();
        java.lang.String str62 = charSequenceConsumerRecord59.value();
        int int63 = charSequenceConsumerRecord59.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional64 = charSequenceConsumerRecord59.leaderEpoch();
        org.apache.kafka.common.header.Headers headers65 = charSequenceConsumerRecord59.headers();
        org.apache.kafka.common.record.TimestampType timestampType70 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) ' ', (long) (byte) 100, (long) (byte) -1, timestampType70, (long) (byte) -1, (int) (byte) 10, 10, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long77 = charSequenceConsumerRecord76.timestamp();
        java.lang.String str78 = charSequenceConsumerRecord76.toString();
        long long79 = charSequenceConsumerRecord76.offset();
        java.lang.String str80 = charSequenceConsumerRecord76.value();
        java.util.Optional<java.lang.Integer> intOptional81 = charSequenceConsumerRecord76.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>, java.lang.reflect.Type> charSequenceConsumerRecordConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>, java.lang.reflect.Type>("hi!", 0, (long) (short) 100, 0L, timestampType11, (java.lang.Long) (-1L), 0, (int) (short) 1, charSequenceConsumerRecord25, (java.lang.reflect.Type) wildcardClass48, headers65, intOptional81);
        int int83 = charSequenceConsumerRecord25.partition();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(intOptional43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(intOptional45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intOptional47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertNotNull(intOptional64);
        org.junit.Assert.assertNotNull(headers65);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str78, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 100L + "'", long79 == 100L);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str80, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
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
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.waitingToEmit();
        boolean boolean3 = strKafkaSpout0.consumerAutoCommitMode;
        boolean boolean4 = strKafkaSpout0.initialized;
        strKafkaSpout0.numUncommittedOffsets = (short) 1;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor7;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType27, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int34 = charSequenceConsumerRecord33.serializedValueSize();
        java.lang.CharSequence charSequence35 = charSequenceConsumerRecord33.key();
        org.apache.kafka.common.header.Headers headers36 = charSequenceConsumerRecord33.headers();
        java.util.Optional<java.lang.Integer> intOptional37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType17, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers36, intOptional37);
        org.apache.kafka.common.record.TimestampType timestampType46 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType46, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int53 = charSequenceConsumerRecord52.serializedValueSize();
        java.lang.CharSequence charSequence54 = charSequenceConsumerRecord52.key();
        org.apache.kafka.common.header.Headers headers55 = charSequenceConsumerRecord52.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray56 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList57 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList57, kafkaSpoutMessageIdArray56);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers55, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList57);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headersConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("", (int) '#', 1L, headers36, kafkaSpoutMessageIdList57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) 'a', (long) (byte) 1, (long) (byte) 0, timestampType4, (java.lang.Long) (-1L), (int) (short) 100, 1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=null}", headers36);
        java.lang.String str62 = charSequenceConsumerRecord61.toString();
        java.lang.CharSequence charSequence63 = charSequenceConsumerRecord61.key();
        long long64 = charSequenceConsumerRecord61.offset();
        org.apache.kafka.common.header.Headers headers65 = charSequenceConsumerRecord61.headers();
        java.lang.CharSequence charSequence66 = charSequenceConsumerRecord61.key();
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "" + "'", charSequence35, "");
        org.junit.Assert.assertNotNull(headers36);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence54 + "' != '" + "" + "'", charSequence54, "");
        org.junit.Assert.assertNotNull(headers55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})" + "'", str62, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.junit.Assert.assertEquals("'" + charSequence63 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", charSequence63, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(headers65);
        org.junit.Assert.assertEquals("'" + charSequence66 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", charSequence66, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long18 = charSequenceConsumerRecord17.checksum();
        long long19 = charSequenceConsumerRecord17.timestamp();
        int int20 = charSequenceConsumerRecord17.partition();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (-1), (long) ' ', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long33 = charSequenceConsumerRecord32.timestamp();
        java.lang.String str34 = charSequenceConsumerRecord32.topic();
        org.apache.kafka.common.header.Headers headers35 = charSequenceConsumerRecord32.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]})", (int) 'a', 52L, (long) 35, timestampType21, (java.lang.Long) 1L, (int) (byte) 0, (int) ' ', (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=[]}", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", headers35);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", 100, (long) (byte) 1, (long) (byte) 1, timestampType21, (long) 10, 10, (int) (short) 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long54 = charSequenceConsumerRecord53.checksum();
        long long55 = charSequenceConsumerRecord53.timestamp();
        org.apache.kafka.common.header.Headers headers56 = charSequenceConsumerRecord53.headers();
        org.apache.kafka.common.header.Headers headers57 = charSequenceConsumerRecord53.headers();
        java.util.Optional<java.lang.Integer> intOptional58 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", 1, (long) (byte) 100, (long) 10, timestampType21, (java.lang.Long) 35L, 35, 97, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers57, intOptional58);
        java.lang.String str60 = charSequenceConsumerRecord59.topic();
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(headers35);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})" + "'", str60, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})");
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long6 = charSequenceConsumerRecord5.checksum();
        long long7 = charSequenceConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers8 = charSequenceConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers9 = charSequenceConsumerRecord5.headers();
        int int10 = charSequenceConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = KafkaSpout{acked=null, emitted=[]}, partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), value = hi!), partition = 1, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", (int) (short) 10, (long) 'a', (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}))");
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.CharSequence charSequence11 = charSequenceConsumerRecord10.key();
        long long12 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str13 = charSequenceConsumerRecord10.value();
        int int14 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str15 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers16 = charSequenceConsumerRecord10.headers();
        java.lang.String str17 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.CharSequence charSequence14 = charSequenceConsumerRecord13.key();
        java.lang.String str15 = charSequenceConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (byte) 10, (long) (byte) 100, (long) 97, timestampType16, (long) 1, 10, 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "KafkaSpout{acked=null, emitted=null}");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 100, null = 10, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", (int) (short) -1, (long) (byte) 100, (long) (byte) 0, timestampType16, 0L, (int) (short) 100, (-1), (java.lang.CharSequence) "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)");
        int int29 = charSequenceConsumerRecord28.partition();
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        java.lang.String str11 = charSequenceConsumerRecord10.toString();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        int int13 = charSequenceConsumerRecord10.partition();
        java.lang.String str14 = charSequenceConsumerRecord10.topic();
        long long15 = charSequenceConsumerRecord10.offset();
        java.lang.String str16 = charSequenceConsumerRecord10.value();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        strKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = strKafkaSpout0.emitted;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = strKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = strKafkaSpout0.emitted;
        boolean boolean6 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder7 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer9 = strKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strConsumerRecordItor4);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(timer9);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor2;
        boolean boolean4 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer5 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer5;
        boolean boolean7 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator14;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator14.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator13.thenComparing(kafkaSpoutMessageIdComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator11.thenComparing(kafkaSpoutMessageIdComparator17);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator7.thenComparing(kafkaSpoutMessageIdComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator19.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator21;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator21.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator28;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator28);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator23.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator28);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator28.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = kafkaSpoutMessageIdComparator32.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator20.thenComparing(kafkaSpoutMessageIdComparator32);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator34;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator34.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = kafkaSpoutMessageIdComparator34.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator37;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor6 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = strKafkaSpout0.collector;
        boolean boolean11 = strKafkaSpout0.waitingToEmit();
        boolean boolean12 = strKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder2;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig6 = strKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor7;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor9 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor9;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService11;
        boolean boolean13 = strKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator11;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator14;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator14.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator13.thenComparing(kafkaSpoutMessageIdComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator11.thenComparing(kafkaSpoutMessageIdComparator17);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator7.thenComparing(kafkaSpoutMessageIdComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator18.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator18.reversed();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", 100, (long) (byte) 100, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.record.TimestampType timestampType6 = charSequenceConsumerRecord5.timestampType();
        long long7 = charSequenceConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
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
        org.apache.kafka.common.header.Headers headers21 = charSequenceConsumerRecord10.headers();
        int int22 = charSequenceConsumerRecord10.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional23 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str24 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers25 = charSequenceConsumerRecord10.headers();
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
        org.junit.Assert.assertNotNull(headers21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str24, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers25);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        strKafkaSpout0.initialized = true;
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder10 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService12;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = strKafkaSpout0.retryService;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        java.lang.String str4 = strKafkaSpout0.toString();
        strKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer11 = strKafkaSpout0.commitTimer;
        boolean boolean12 = strKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer13 = strKafkaSpout0.commitTimer;
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(timer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timer13);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        strKafkaSpout0.numUncommittedOffsets = 10L;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = strKafkaSpout0.collector;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector10);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
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
        int int19 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.String str20 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord10.timestampType();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str20, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNull(timestampType21);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator14;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator14.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator21;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator21);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator16.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator21);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator13.thenComparing(kafkaSpoutMessageIdComparator24);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator12.thenComparing(kafkaSpoutMessageIdComparator24);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator28;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator28.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator35);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = kafkaSpoutMessageIdComparator30.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator39 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator39;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = offsetComparator39.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator46;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = kafkaSpoutMessageIdComparator41.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = kafkaSpoutMessageIdComparator30.thenComparing(kafkaSpoutMessageIdComparator49);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = offsetComparator12.thenComparing(kafkaSpoutMessageIdComparator50);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator11.thenComparing(kafkaSpoutMessageIdComparator53);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator55 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator56 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator57 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator57;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = offsetComparator57.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator64 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator64;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator64);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = kafkaSpoutMessageIdComparator59.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator64);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator68 = offsetComparator56.thenComparing(kafkaSpoutMessageIdComparator67);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator69 = kafkaSpoutMessageIdComparator67.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator70 = offsetComparator55.thenComparing(kafkaSpoutMessageIdComparator69);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator71 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator49);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator68);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator69);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator70);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator71);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor2 = strKafkaSpout0.waitingToEmit;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams4;
        boolean boolean6 = strKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection10 = strKafkaSpout0.toArrayList(topicPartition9);
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords12 = strKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (short) 0;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = strKafkaSpout0.emitted;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = null;
        strKafkaSpout0.collector = spoutOutputCollector5;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord10.key();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        java.lang.String str17 = charSequenceConsumerRecord10.toString();
        int int18 = charSequenceConsumerRecord10.partition();
        long long19 = charSequenceConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", (-1), (-1L), (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "hi!");
        long long6 = charSequenceConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
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
        boolean boolean12 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor15 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder16 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder16;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = strKafkaSpout0.retryService;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor15);
        org.junit.Assert.assertNull(kafkaSpoutRetryService18);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.offset();
        int int12 = charSequenceConsumerRecord10.serializedValueSize();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.CharSequence charSequence15 = charSequenceConsumerRecord10.key();
        int int16 = charSequenceConsumerRecord10.partition();
        int int17 = charSequenceConsumerRecord10.serializedValueSize();
        long long18 = charSequenceConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 0, 0L, (long) 97, timestampType4, (long) '4', (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        int int11 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType12 = charSequenceConsumerRecord10.timestampType();
        java.lang.String str13 = charSequenceConsumerRecord10.value();
        java.lang.String str14 = charSequenceConsumerRecord10.value();
        java.lang.String str15 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(timestampType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str15, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        int int24 = charSequenceConsumerRecord20.partition();
        java.lang.CharSequence charSequence25 = charSequenceConsumerRecord20.key();
        int int26 = charSequenceConsumerRecord20.serializedValueSize();
        int int27 = charSequenceConsumerRecord20.serializedValueSize();
        long long28 = charSequenceConsumerRecord20.checksum();
        org.apache.kafka.common.header.Headers headers29 = charSequenceConsumerRecord20.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)))", (int) (byte) 10, (long) (short) 10, 0L, timestampType4, (java.lang.Long) 32L, (int) 'a', (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 32, leaderEpoch = null, offset = 100, null = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null}), partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = 35, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)", headers29);
        org.apache.kafka.common.record.TimestampType timestampType31 = charSequenceConsumerRecord30.timestampType();
        int int32 = charSequenceConsumerRecord30.serializedKeySize();
        int int33 = charSequenceConsumerRecord30.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertNull(timestampType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType17 = charSequenceConsumerRecord10.timestampType();
        int int18 = charSequenceConsumerRecord10.partition();
        java.util.Optional<java.lang.Integer> intOptional19 = charSequenceConsumerRecord10.leaderEpoch();
        int int20 = charSequenceConsumerRecord10.serializedKeySize();
        int int21 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord10.key();
        int int23 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers24 = charSequenceConsumerRecord10.headers();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(headers24);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer6 = strKafkaSpout0.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService9;
        java.lang.String str11 = strKafkaSpout0.toString();
        boolean boolean12 = strKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(timer6);
        org.junit.Assert.assertNull(strKafkaConsumer7);
        org.junit.Assert.assertNull(strKafkaSpoutConfig8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator2 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator2.thenComparing(kafkaSpoutMessageIdComparator5);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator6);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator10 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator10;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator10.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator17 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator17;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator17);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator17);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = offsetComparator17.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator22;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator24;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator31;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator26.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = kafkaSpoutMessageIdComparator26.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator36 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator37;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator37.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator44;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = kafkaSpoutMessageIdComparator39.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator36.thenComparing(kafkaSpoutMessageIdComparator47);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = kafkaSpoutMessageIdComparator35.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator36);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator49;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = kafkaSpoutMessageIdComparator22.thenComparing(kafkaSpoutMessageIdComparator49);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = kafkaSpoutMessageIdComparator49.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator49);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator54 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator54;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = offsetComparator54.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator61 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator61;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator61);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator64 = kafkaSpoutMessageIdComparator56.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator61);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator65 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator65;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator65.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator72 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator72;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator72);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator75 = kafkaSpoutMessageIdComparator67.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator72);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator76 = kafkaSpoutMessageIdComparator56.thenComparing(kafkaSpoutMessageIdComparator75);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator77 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator77;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator79 = offsetComparator77.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator80 = offsetComparator77.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator81 = kafkaSpoutMessageIdComparator75.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator77);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator82 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator82;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator84 = offsetComparator82.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator82;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator86 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator86;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator88 = offsetComparator86.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator89 = offsetComparator82.thenComparing(kafkaSpoutMessageIdComparator88);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator90 = kafkaSpoutMessageIdComparator88.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator91 = kafkaSpoutMessageIdComparator75.thenComparing(kafkaSpoutMessageIdComparator88);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator92 = kafkaSpoutMessageIdComparator53.thenComparing(kafkaSpoutMessageIdComparator88);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator49);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator64);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator75);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator76);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator79);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator80);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator81);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator84);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator88);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator89);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator90);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator91);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator92);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor7 = strKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig8 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig8;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder13 = strKafkaSpout0.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strConsumerRecordItor7);
        org.junit.Assert.assertNull(timer10);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder13);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
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
        strKafkaSpout0.initialized = true;
        strKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig17 = strKafkaSpout0.kafkaSpoutConfig;
        strKafkaSpout0.numUncommittedOffsets = (short) 0;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(timer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig17);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) (short) 1, (long) '4', (long) '#', timestampType4, (long) 10, (int) (byte) -1, 10, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=null}");
        long long11 = charSequenceConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType12 = charSequenceConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional13 = charSequenceConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType14 = charSequenceConsumerRecord10.timestampType();
        int int15 = charSequenceConsumerRecord10.partition();
        long long16 = charSequenceConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(timestampType12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = strKafkaSpout0.tuplesBuilder;
        strKafkaSpout0.consumerAutoCommitMode = true;
        boolean boolean11 = strKafkaSpout0.commit();
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
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
        int int19 = charSequenceConsumerRecord10.partition();
        int int20 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str21 = charSequenceConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers22 = charSequenceConsumerRecord10.headers();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers22);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
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
        int int40 = charSequenceConsumerRecord25.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType41 = charSequenceConsumerRecord25.timestampType();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNull(timestampType41);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService9;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(strKafkaConsumer8);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers13 = charSequenceConsumerRecord10.headers();
        int int14 = charSequenceConsumerRecord10.partition();
        int int15 = charSequenceConsumerRecord10.partition();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        long long17 = charSequenceConsumerRecord10.checksum();
        java.lang.String str18 = charSequenceConsumerRecord10.value();
        java.lang.CharSequence charSequence19 = charSequenceConsumerRecord10.key();
        java.lang.CharSequence charSequence20 = charSequenceConsumerRecord10.key();
        java.lang.CharSequence charSequence21 = charSequenceConsumerRecord10.key();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpout0.firstPollOffsetStrategy;
        strKafkaSpout0.initialized = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer8 = strKafkaSpout0.kafkaConsumer;
        int int9 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.String, java.lang.CharSequence> strConsumerRecords10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.setWaitingToEmit(strConsumerRecords10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(strKafkaConsumer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType14, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int21 = charSequenceConsumerRecord20.serializedValueSize();
        java.lang.CharSequence charSequence22 = charSequenceConsumerRecord20.key();
        org.apache.kafka.common.header.Headers headers23 = charSequenceConsumerRecord20.headers();
        int int24 = charSequenceConsumerRecord20.partition();
        java.lang.CharSequence charSequence25 = charSequenceConsumerRecord20.key();
        long long26 = charSequenceConsumerRecord20.offset();
        java.lang.CharSequence charSequence27 = charSequenceConsumerRecord20.key();
        java.util.Optional<java.lang.Integer> intOptional28 = charSequenceConsumerRecord20.leaderEpoch();
        long long29 = charSequenceConsumerRecord20.checksum();
        java.lang.String str30 = charSequenceConsumerRecord20.topic();
        java.lang.String str31 = charSequenceConsumerRecord20.toString();
        org.apache.kafka.common.header.Headers headers32 = charSequenceConsumerRecord20.headers();
        org.apache.kafka.common.record.TimestampType timestampType37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType37, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long44 = charSequenceConsumerRecord43.checksum();
        int int45 = charSequenceConsumerRecord43.partition();
        long long46 = charSequenceConsumerRecord43.timestamp();
        long long47 = charSequenceConsumerRecord43.offset();
        int int48 = charSequenceConsumerRecord43.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType49 = charSequenceConsumerRecord43.timestampType();
        int int50 = charSequenceConsumerRecord43.partition();
        long long51 = charSequenceConsumerRecord43.offset();
        int int52 = charSequenceConsumerRecord43.partition();
        java.lang.String str53 = charSequenceConsumerRecord43.value();
        java.lang.String str54 = charSequenceConsumerRecord43.topic();
        org.apache.kafka.common.header.Headers headers55 = charSequenceConsumerRecord43.headers();
        java.lang.String str56 = charSequenceConsumerRecord43.toString();
        java.util.Optional<java.lang.Integer> intOptional57 = charSequenceConsumerRecord43.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]}), value = ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null}))", (int) (short) -1, (long) 52, 35L, timestampType4, (java.lang.Long) 97L, (int) (short) 10, (int) 'a', (java.lang.CharSequence) "hi!", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", headers32, intOptional57);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + charSequence27 + "' != '" + "" + "'", charSequence27, "");
        org.junit.Assert.assertNotNull(intOptional28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str31, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(headers32);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNull(timestampType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(headers55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str56, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional57);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        strKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = strKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = strKafkaSpout0.collector;
        java.lang.String str7 = strKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor8 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor8;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer10 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(spoutOutputCollector6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(strKafkaConsumer10);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType27, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int34 = charSequenceConsumerRecord33.serializedValueSize();
        java.lang.CharSequence charSequence35 = charSequenceConsumerRecord33.key();
        org.apache.kafka.common.header.Headers headers36 = charSequenceConsumerRecord33.headers();
        java.util.Optional<java.lang.Integer> intOptional37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", 100, (long) (byte) 0, (long) '#', timestampType17, (java.lang.Long) (-1L), (int) (byte) 1, 0, (java.lang.CharSequence) "KafkaSpout{acked=null, emitted=null}", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", headers36, intOptional37);
        org.apache.kafka.common.record.TimestampType timestampType46 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType46, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int53 = charSequenceConsumerRecord52.serializedValueSize();
        java.lang.CharSequence charSequence54 = charSequenceConsumerRecord52.key();
        org.apache.kafka.common.header.Headers headers55 = charSequenceConsumerRecord52.headers();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray56 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdList57 = new java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList57, kafkaSpoutMessageIdArray56);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("hi!", 10, (long) (byte) 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers55, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdList57);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headersConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("", (int) '#', 1L, headers36, kafkaSpoutMessageIdList57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) 'a', (long) (byte) 1, (long) (byte) 0, timestampType4, (java.lang.Long) (-1L), (int) (short) 100, 1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=null}", headers36);
        long long62 = charSequenceConsumerRecord61.checksum();
        long long63 = charSequenceConsumerRecord61.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType64 = charSequenceConsumerRecord61.timestampType();
        int int65 = charSequenceConsumerRecord61.partition();
        long long66 = charSequenceConsumerRecord61.checksum();
        int int67 = charSequenceConsumerRecord61.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "" + "'", charSequence35, "");
        org.junit.Assert.assertNotNull(headers36);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence54 + "' != '" + "" + "'", charSequence54, "");
        org.junit.Assert.assertNotNull(headers55);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNull(timestampType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        long long10 = charSequenceConsumerRecord9.checksum();
        long long11 = charSequenceConsumerRecord9.timestamp();
        org.apache.kafka.common.header.Headers headers12 = charSequenceConsumerRecord9.headers();
        java.lang.String str13 = charSequenceConsumerRecord9.toString();
        org.apache.kafka.common.header.Headers headers14 = charSequenceConsumerRecord9.headers();
        java.lang.String str15 = charSequenceConsumerRecord9.topic();
        long long16 = charSequenceConsumerRecord9.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType17 = charSequenceConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (byte) 1, (long) 100, timestampType17, (long) 1, 35, (int) (byte) 10, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 100, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = )", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.apache.kafka.common.header.Headers headers24 = charSequenceConsumerRecord23.headers();
        java.lang.String str25 = charSequenceConsumerRecord23.topic();
        java.lang.String str26 = charSequenceConsumerRecord23.topic();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", str13, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
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
        int int20 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType21 = charSequenceConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional22 = charSequenceConsumerRecord10.leaderEpoch();
        java.lang.String str23 = charSequenceConsumerRecord10.value();
        java.lang.String str24 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional25 = charSequenceConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(timestampType21);
        org.junit.Assert.assertNotNull(intOptional22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(intOptional25);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        strKafkaSpout0.collector = spoutOutputCollector7;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = strKafkaSpout0.collector;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
        org.junit.Assert.assertNull(spoutOutputCollector9);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = strKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = strKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strKafkaSpout11.kafkaSpoutStreams;
        strKafkaSpout11.consumerAutoCommitMode = false;
        java.lang.String str15 = strKafkaSpout11.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout16 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout16.maxRetries = (byte) -1;
        int int19 = strKafkaSpout16.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray20 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet21 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet21, kafkaSpoutMessageIdArray20);
        strKafkaSpout16.emitted = kafkaSpoutMessageIdSet21;
        strKafkaSpout11.emitted = kafkaSpoutMessageIdSet21;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout25 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout25.maxRetries = (byte) -1;
        int int28 = strKafkaSpout25.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor29 = null;
        strKafkaSpout25.waitingToEmit = strConsumerRecordItor29;
        org.apache.kafka.common.TopicPartition topicPartition31 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection32 = strKafkaSpout25.toArrayList(topicPartition31);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer33 = strKafkaSpout25.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector34 = strKafkaSpout25.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout35 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout35.maxRetries = (byte) -1;
        int int38 = strKafkaSpout35.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray39 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet40 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet40, kafkaSpoutMessageIdArray39);
        strKafkaSpout35.emitted = kafkaSpoutMessageIdSet40;
        strKafkaSpout25.emitted = kafkaSpoutMessageIdSet40;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, (long) (short) -1, (long) (byte) 10, timestampType7, (long) (byte) 10, (int) (byte) -1, 0, (java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet21, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet40);
        strKafkaSpout0.emitted = kafkaSpoutMessageIdSet40;
        strKafkaSpout0.maxRetries = '4';
        strKafkaSpout0.numUncommittedOffsets = 0L;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor50 = strKafkaSpout0.waitingToEmit;
        boolean boolean51 = strKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strKafkaSpoutConfig2);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str15, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection32);
        org.junit.Assert.assertNull(timer33);
        org.junit.Assert.assertNull(spoutOutputCollector34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        int int17 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers18 = charSequenceConsumerRecord10.headers();
        int int19 = charSequenceConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig13 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig13;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator15;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator15.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator22;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator22);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator17.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator22);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator28;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator28.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator35;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator35);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = kafkaSpoutMessageIdComparator30.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator35);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = kafkaSpoutMessageIdComparator30.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator40 = offsetComparator22.thenComparing(kafkaSpoutMessageIdComparator39);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = kafkaSpoutMessageIdComparator41.reversed();
        // The following exception was thrown during execution in test generation
        try {
            strKafkaSpout0.fail((java.lang.Object) kafkaSpoutMessageIdComparator41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$ReverseComparator2 cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator40);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = strKafkaSpout0.toArrayList(topicPartition6);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer8 = strKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder9 = strKafkaSpout0.tuplesBuilder;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = strKafkaSpout0.waitingToEmit;
        strKafkaSpout0.maxRetries = ' ';
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        org.junit.Assert.assertNull(timer8);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
        org.junit.Assert.assertNull(strConsumerRecordItor10);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator26.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator26.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator28.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator29;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.topology.base.BaseComponent baseComponent7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent> offsetComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent>("ConsumerRecord(topic = , partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 10, (long) 52, offsetComparator3, baseComponent7);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator9 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator16;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator16.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator3.thenComparing(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig20 = strKafkaSpout3.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout21 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean22 = strKafkaSpout21.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder23 = null;
        strKafkaSpout21.tuplesBuilder = strKafkaSpoutTuplesBuilder23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = null;
        strKafkaSpout21.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig27 = strKafkaSpout21.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor28 = null;
        strKafkaSpout21.waitingToEmit = strConsumerRecordItor28;
        org.apache.kafka.common.record.TimestampType timestampType34 = null;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout38 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams39 = strKafkaSpout38.kafkaSpoutStreams;
        strKafkaSpout38.consumerAutoCommitMode = false;
        java.lang.String str42 = strKafkaSpout38.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout43 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout43.maxRetries = (byte) -1;
        int int46 = strKafkaSpout43.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray47 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet48 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet48, kafkaSpoutMessageIdArray47);
        strKafkaSpout43.emitted = kafkaSpoutMessageIdSet48;
        strKafkaSpout38.emitted = kafkaSpoutMessageIdSet48;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout52 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout52.maxRetries = (byte) -1;
        int int55 = strKafkaSpout52.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor56 = null;
        strKafkaSpout52.waitingToEmit = strConsumerRecordItor56;
        org.apache.kafka.common.TopicPartition topicPartition58 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection59 = strKafkaSpout52.toArrayList(topicPartition58);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer60 = strKafkaSpout52.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector61 = strKafkaSpout52.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout62 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout62.maxRetries = (byte) -1;
        int int65 = strKafkaSpout62.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray66 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet67 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet67, kafkaSpoutMessageIdArray66);
        strKafkaSpout62.emitted = kafkaSpoutMessageIdSet67;
        strKafkaSpout52.emitted = kafkaSpoutMessageIdSet67;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (byte) 0, (long) (short) -1, (long) (byte) 10, timestampType34, (long) (byte) 10, (int) (byte) -1, 0, (java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet48, (java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet67);
        strKafkaSpout21.emitted = kafkaSpoutMessageIdSet48;
        strKafkaSpout3.emitted = kafkaSpoutMessageIdSet48;
        int int74 = strKafkaSpout3.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor75 = null;
        strKafkaSpout3.waitingToEmit = strConsumerRecordItor75;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder17);
        org.junit.Assert.assertNull(strKafkaSpoutConfig20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strKafkaSpoutConfig27);
        org.junit.Assert.assertNull(kafkaSpoutStreams39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str42, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(topicPartitionCollection59);
        org.junit.Assert.assertNull(timer60);
        org.junit.Assert.assertNull(spoutOutputCollector61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
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
        strKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strKafkaSpout0.getNamedTopics();
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
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str22 = charSequenceConsumerRecord21.topic();
        org.apache.kafka.common.record.TimestampType timestampType23 = charSequenceConsumerRecord21.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout27 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout27.maxRetries = (byte) -1;
        int int30 = strKafkaSpout27.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor31 = null;
        strKafkaSpout27.waitingToEmit = strConsumerRecordItor31;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer33 = strKafkaSpout27.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer34 = strKafkaSpout27.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType40, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long47 = charSequenceConsumerRecord46.offset();
        long long48 = charSequenceConsumerRecord46.checksum();
        int int49 = charSequenceConsumerRecord46.serializedKeySize();
        org.apache.kafka.common.header.Headers headers50 = charSequenceConsumerRecord46.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType23, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout27, (java.lang.CharSequence) "hi!", headers50);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType23, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        java.lang.CharSequence charSequence58 = charSequenceConsumerRecord57.key();
        java.lang.String str59 = charSequenceConsumerRecord57.value();
        org.apache.kafka.common.record.TimestampType timestampType60 = charSequenceConsumerRecord57.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", 10, (long) (short) 100, (long) (byte) 0, timestampType60, (long) ' ', (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", 10, (long) 52, (long) (short) 0, timestampType60, (long) (short) 10, (int) '4', 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})", "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 1, null = 0, serialized key size = 1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        java.util.Optional<java.lang.Integer> intOptional73 = charSequenceConsumerRecord72.leaderEpoch();
        java.lang.String str74 = charSequenceConsumerRecord72.topic();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(timer33);
        org.junit.Assert.assertNull(strKafkaConsumer34);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(headers50);
        org.junit.Assert.assertEquals("'" + charSequence58 + "' != '" + "" + "'", charSequence58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + timestampType60 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType60.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})" + "'", str74, "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 52, null = 35, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=null})");
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        int int15 = charSequenceConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType16 = charSequenceConsumerRecord10.timestampType();
        java.lang.CharSequence charSequence17 = charSequenceConsumerRecord10.key();
        long long18 = charSequenceConsumerRecord10.checksum();
        org.apache.kafka.common.header.Headers headers19 = charSequenceConsumerRecord10.headers();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(headers19);
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator7;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator13;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator20;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator12.thenComparing(kafkaSpoutMessageIdComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator26 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator26;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = offsetComparator26.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator33 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator33;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator33);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator28.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator33);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator37;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator39 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator40 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator40;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = offsetComparator40.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = offsetComparator39.thenComparing(kafkaSpoutMessageIdComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = offsetComparator37.thenComparing(kafkaSpoutMessageIdComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator33.thenComparing(kafkaSpoutMessageIdComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = kafkaSpoutMessageIdComparator25.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator33);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator33.reversed();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator46);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str18 = charSequenceConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType19 = charSequenceConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout23.maxRetries = (byte) -1;
        int int26 = strKafkaSpout23.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor27 = null;
        strKafkaSpout23.waitingToEmit = strConsumerRecordItor27;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer29 = strKafkaSpout23.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer30 = strKafkaSpout23.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType36, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long43 = charSequenceConsumerRecord42.offset();
        long long44 = charSequenceConsumerRecord42.checksum();
        int int45 = charSequenceConsumerRecord42.serializedKeySize();
        org.apache.kafka.common.header.Headers headers46 = charSequenceConsumerRecord42.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType19, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout23, (java.lang.CharSequence) "hi!", headers46);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType19, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        java.lang.CharSequence charSequence54 = charSequenceConsumerRecord53.key();
        org.apache.kafka.common.record.TimestampType timestampType55 = charSequenceConsumerRecord53.timestampType();
        java.lang.CharSequence charSequence56 = charSequenceConsumerRecord53.key();
        int int57 = charSequenceConsumerRecord53.partition();
        long long58 = charSequenceConsumerRecord53.timestamp();
        java.util.Optional<java.lang.Integer> intOptional59 = charSequenceConsumerRecord53.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType60 = charSequenceConsumerRecord53.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = -1, NoTimestampType = 10, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = KafkaSpout{acked=null, emitted=null})", 1, (long) (short) 1, (long) '#', timestampType60, 1L, 52, 1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 0, NoTimestampType = 0, serialized key size = -1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = )", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 0, leaderEpoch = null, offset = 0, null = 97, serialized key size = 32, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(timer29);
        org.junit.Assert.assertNull(strKafkaConsumer30);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(headers46);
        org.junit.Assert.assertEquals("'" + charSequence54 + "' != '" + "" + "'", charSequence54, "");
        org.junit.Assert.assertTrue("'" + timestampType55 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType55.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + charSequence56 + "' != '" + "" + "'", charSequence56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(intOptional59);
        org.junit.Assert.assertTrue("'" + timestampType60 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType60.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str6 = charSequenceConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional7 = charSequenceConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers8 = charSequenceConsumerRecord5.headers();
        int int9 = charSequenceConsumerRecord5.serializedKeySize();
        org.apache.kafka.common.header.Headers headers10 = charSequenceConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers11 = charSequenceConsumerRecord5.headers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertNotNull(headers11);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        boolean boolean2 = strKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection4 = strKafkaSpout0.toArrayList(topicPartition3);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer7 = strKafkaSpout0.kafkaConsumer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strKafkaConsumer7);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 100, (long) (byte) 10, (java.lang.CharSequence) "", "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        java.lang.String str26 = charSequenceConsumerRecord25.topic();
        org.apache.kafka.common.record.TimestampType timestampType27 = charSequenceConsumerRecord25.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout31 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout31.maxRetries = (byte) -1;
        int int34 = strKafkaSpout31.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor35 = null;
        strKafkaSpout31.waitingToEmit = strConsumerRecordItor35;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer37 = strKafkaSpout31.commitTimer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer38 = strKafkaSpout31.kafkaConsumer;
        org.apache.kafka.common.record.TimestampType timestampType44 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType44, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long51 = charSequenceConsumerRecord50.offset();
        long long52 = charSequenceConsumerRecord50.checksum();
        int int53 = charSequenceConsumerRecord50.serializedKeySize();
        org.apache.kafka.common.header.Headers headers54 = charSequenceConsumerRecord50.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence> iRichSpoutConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.topology.IRichSpout, java.lang.CharSequence>("", (int) (short) 100, (long) (byte) 1, 0L, timestampType27, (java.lang.Long) 35L, (int) (short) -1, 0, (org.apache.storm.topology.IRichSpout) strKafkaSpout31, (java.lang.CharSequence) "hi!", headers54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) 1, 0L, (long) (byte) 0, timestampType27, (long) ' ', (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "", "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (short) -1, (long) ' ', (long) (short) 0, timestampType27, (long) (short) 1, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        org.apache.kafka.common.record.TimestampType timestampType77 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("hi!", (int) (short) 1, (long) '4', (long) '#', timestampType77, (long) 10, (int) (byte) -1, 10, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "KafkaSpout{acked=null, emitted=null}");
        java.lang.String str84 = charSequenceConsumerRecord83.topic();
        org.apache.kafka.common.header.Headers headers85 = charSequenceConsumerRecord83.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", 0, (long) 52, (long) (byte) -1, timestampType27, (java.lang.Long) 1L, (int) (short) 0, (-1), (java.lang.CharSequence) "hi!", "hi!", headers85);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 100, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = KafkaSpout{acked=null, emitted=[]})", 100, (long) 97, 0L, timestampType27, 1L, (int) (byte) 100, 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))", "ConsumerRecord(topic = KafkaSpout{acked=null, emitted=null}, partition = 10, leaderEpoch = null, offset = -1, null = 35, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = KafkaSpout{acked=null, emitted=null}, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
        java.lang.CharSequence charSequence93 = charSequenceConsumerRecord92.key();
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + timestampType27 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType27.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(timer37);
        org.junit.Assert.assertNull(strKafkaConsumer38);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertNotNull(headers54);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(headers85);
        org.junit.Assert.assertEquals("'" + charSequence93 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))" + "'", charSequence93, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!), value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!))");
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer4 = strKafkaSpout0.kafkaConsumer;
        strKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        java.lang.String str9 = strKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = strKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        strKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig15 = strKafkaSpout0.kafkaSpoutConfig;
        long long16 = strKafkaSpout0.numUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(strKafkaConsumer4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(spoutOutputCollector10);
        org.junit.Assert.assertNull(strKafkaSpoutConfig15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        int int11 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence12 = charSequenceConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType13 = charSequenceConsumerRecord10.timestampType();
        int int14 = charSequenceConsumerRecord10.partition();
        int int15 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.CharSequence charSequence16 = charSequenceConsumerRecord10.key();
        java.lang.String str17 = charSequenceConsumerRecord10.toString();
        long long18 = charSequenceConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNull(timestampType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        boolean boolean1 = strKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = strKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = strKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor4 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService6;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strKafkaSpout0.emitTupleIfNotEmitted(strConsumerRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (long) (short) -1, timestampType4, (-1L), (int) '4', (int) (short) -1, (java.lang.CharSequence) "", "hi!");
        long long11 = charSequenceConsumerRecord10.checksum();
        int int12 = charSequenceConsumerRecord10.partition();
        long long13 = charSequenceConsumerRecord10.timestamp();
        long long14 = charSequenceConsumerRecord10.offset();
        java.lang.String str15 = charSequenceConsumerRecord10.value();
        java.lang.String str16 = charSequenceConsumerRecord10.topic();
        int int17 = charSequenceConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType18 = charSequenceConsumerRecord10.timestampType();
        int int19 = charSequenceConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional20 = charSequenceConsumerRecord10.leaderEpoch();
        int int21 = charSequenceConsumerRecord10.serializedValueSize();
        java.lang.String str22 = charSequenceConsumerRecord10.toString();
        long long23 = charSequenceConsumerRecord10.timestamp();
        java.lang.String str24 = charSequenceConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = kafkaSpoutMessageIdComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator17;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator17;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String> charSequenceConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.String>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", (int) (short) 1, 1L, (long) (byte) 10, timestampType4, (long) '#', (int) (byte) 100, (int) (short) -1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", "");
        java.lang.String str11 = charSequenceConsumerRecord10.value();
        java.lang.String str12 = charSequenceConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional13 = charSequenceConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers14 = charSequenceConsumerRecord10.headers();
        org.apache.kafka.common.header.Headers headers15 = charSequenceConsumerRecord10.headers();
        int int16 = charSequenceConsumerRecord10.serializedKeySize();
        java.lang.CharSequence charSequence17 = charSequenceConsumerRecord10.key();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)" + "'", charSequence17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)");
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
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
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor20 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor20;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer22 = strKafkaSpout0.kafkaConsumer;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strKafkaConsumer22);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
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
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator67;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator67);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator70 = offsetComparator67.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator71 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator72 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator72;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator74 = offsetComparator72.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator79 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator79;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> strConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("KafkaSpout{acked=null, emitted=null}", (int) 'a', (long) 0, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 0, null = -1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = hi!)", offsetComparator79);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator82 = kafkaSpoutMessageIdComparator74.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator79);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator83 = offsetComparator71.thenComparing(kafkaSpoutMessageIdComparator82);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator84 = kafkaSpoutMessageIdComparator82.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator85 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator85;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator87 = offsetComparator85.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator85;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator89 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator89;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator91 = offsetComparator89.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator92 = offsetComparator85.thenComparing(kafkaSpoutMessageIdComparator91);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator93 = offsetComparator85.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparator84.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator85);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator95 = kafkaSpoutMessageIdComparator70.thenComparing(kafkaSpoutMessageIdComparator84);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator96 = kafkaSpoutMessageIdComparator58.thenComparing(kafkaSpoutMessageIdComparator84);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator97 = kafkaSpoutMessageIdComparator96.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator98 = kafkaSpoutMessageIdComparator96.reversed();
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
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator70);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator74);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator82);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator83);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator84);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator87);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator91);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator92);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator93);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator95);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator96);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator97);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator98);
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.GenericDeclaration> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = strKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig2 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig2;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = strKafkaSpout0.collector;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        strKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder8 = null;
        strKafkaSpout0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer10 = strKafkaSpout0.commitTimer;
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
        org.junit.Assert.assertNull(spoutOutputCollector4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(timer10);
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor1 = null;
        strKafkaSpout0.waitingToEmit = strConsumerRecordItor1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer3 = null;
        strKafkaSpout0.kafkaConsumer = strKafkaConsumer3;
        long long5 = strKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.CharSequence> strKafkaConsumer6 = strKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig9 = null;
        strKafkaSpout0.kafkaSpoutConfig = strKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strKafkaSpout0.retryService = kafkaSpoutRetryService11;
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
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>();
        strKafkaSpout0.maxRetries = (byte) -1;
        int int3 = strKafkaSpout0.maxRetries;
        strKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        boolean boolean9 = strKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> strConsumerRecordItor10 = strKafkaSpout0.waitingToEmit;
        long long11 = strKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strConsumerRecordItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.record.TimestampType> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.record.TimestampType> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.record.TimestampType>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}
