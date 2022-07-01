import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList6);
        long long9 = strBuilder8.partitionRefreshPeriodMs;
        strBuilder8.offsetCommitPeriodMs = 2147483647;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder8.setSSLKeystore("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "");
        long long15 = strBuilder14.partitionRefreshPeriodMs;
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(strBuilder14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strConsumerRecordFuncSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]> strKafkaSpoutConfigBuilder21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]>("hi!", strKafkaSpoutConfigSerializableDeserializer12, strArraySerializableDeserializer13, (java.util.Collection<java.lang.String>) strList18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.lang.String[]> strConsumerRecordFuncBuilder22 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.lang.String[]>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strConsumerRecordFuncSerializableDeserializer9, strArraySerializableDeserializer10, (java.util.Collection<java.lang.String>) strList18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer5, strSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer2, strSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList18);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList30);
        strBuilder32.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = strBuilder32.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder32.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService38 = null;
        strBuilder37.retryService = kafkaSpoutRetryService38;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = strBuilder37.kafkaProps;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator41 = strBuilder37.translator;
        org.apache.storm.tuple.Fields fields42 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder26.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator41, fields42, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=-1, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder26.setPollTimeoutMs((long) (byte) 1);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strRecordTranslator41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder11.setMaxPollRecords(100);
        int int16 = strBuilder11.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder11.setFetchMinBytes(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder18.setSSLTruststore("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList25);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass28 = strBuilder27.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder27.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList34);
        strBuilder36.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = strBuilder36.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder40 = strBuilder27.setProp(strMap39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy41 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder40.firstPollOffsetStrategy = firstPollOffsetStrategy41;
        strBuilder21.firstPollOffsetStrategy = firstPollOffsetStrategy41;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder45 = strBuilder21.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=LATEST, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.Type> typeSerializableDeserializer48 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer49 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer51 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer52 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer54 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer55 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer58 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer59 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer61 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer62 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=100, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder73 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer61, strSerializableDeserializer62, (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer58, strSerializableDeserializer59, (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=LATEST, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=52, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer54, strSerializableDeserializer55, (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder77 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=LATEST, subscription=null, translator=null, retryService=null}", strSerializableDeserializer51, strSerializableDeserializer52, (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder78 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", typeSerializableDeserializer48, serializableSerializableDeserializer49, (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!,KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList71);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService80 = null;
        strBuilder79.retryService = kafkaSpoutRetryService80;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator82 = strBuilder79.translator;
        org.apache.storm.tuple.Fields fields83 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder84 = strBuilder21.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator82, fields83);
        int int85 = strBuilder21.maxUncommittedOffsets;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy29 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy29.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy41 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy41.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strRecordTranslator82);
        org.junit.Assert.assertNotNull(strBuilder84);
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService9;
        long long11 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService12;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strKafkaSpoutConfig0.kafkaProps;
        strKafkaSpoutConfig0.maxRetries = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(strRecordTranslator6);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass9 = strBuilder8.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList15);
        strBuilder17.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strBuilder17.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder8.setProp(strMap20);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator22 = null;
        strBuilder8.translator = strRecordTranslator22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator25 = strKafkaSpoutConfig24.translator;
        long long26 = strKafkaSpoutConfig24.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = strKafkaSpoutConfig24.kafkaProps;
        java.lang.String str28 = strKafkaSpoutConfig24.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer29 = null;
        strKafkaSpoutConfig24.valueDes = objSerializableDeserializer29;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer32 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer33 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer35 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer36 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList40);
        strBuilder42.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = strBuilder42.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = strBuilder42.setPartitionRefreshPeriodMs((long) 1);
        int int48 = strBuilder47.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = strBuilder47.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = strBuilder47.setSecurityProtocol("hi!");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList58);
        strBuilder60.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = strBuilder60.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder68 = strBuilder66.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList72);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass75 = strBuilder74.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy76 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder74.firstPollOffsetStrategy = firstPollOffsetStrategy76;
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder83 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList81);
        strBuilder83.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap86 = strBuilder83.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder87 = strBuilder74.setProp(strMap86);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder88 = strBuilder66.setProp(strMap86);
        org.apache.storm.kafka.spout.Subscription subscription89 = strBuilder66.subscription;
        strBuilder54.subscription = subscription89;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer35, strSerializableDeserializer36, subscription89);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder92 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer32, strSerializableDeserializer33, subscription89);
        strKafkaSpoutConfig24.subscription = subscription89;
        strBuilder8.subscription = subscription89;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder95 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, subscription89);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder97 = strBuilder95.setGroupId("hi!");
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass98 = strBuilder95.valueDesClazz;
        java.util.Map<java.lang.String, java.lang.Object> strMap99 = strBuilder95.kafkaProps;
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNull(strRecordTranslator25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str28, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy76 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy76.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(subscription89);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertNull(wildcardClass98);
        org.junit.Assert.assertNotNull(strMap99);
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.List<java.lang.String>> strListSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strBuilderSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer8, strSerializableDeserializer9, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", serializableSerializableDeserializer5, objSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strListBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=10, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strListSerializableDeserializer2, strBuilderSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList12);
        long long18 = strBuilder17.pollTimeoutMs;
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        long long7 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator9 = null;
        strKafkaSpoutConfig0.translator = strRecordTranslator9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int12 = strKafkaSpoutConfig11.getMaxTupleRetries();
        long long13 = strKafkaSpoutConfig11.getPollTimeoutMs();
        strKafkaSpoutConfig11.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = strKafkaSpoutConfig11.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator17 = strKafkaSpoutConfig11.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = strKafkaSpoutConfig11.getFirstPollOffsetStrategy();
        long long19 = strKafkaSpoutConfig11.offsetCommitPeriodMs;
        java.lang.String str20 = strKafkaSpoutConfig11.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService21 = null;
        strKafkaSpoutConfig11.retryService = kafkaSpoutRetryService21;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer23 = strKafkaSpoutConfig11.getValueDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription24 = strKafkaSpoutConfig11.getSubscription();
        strKafkaSpoutConfig11.partitionRefreshPeriodMs = 97;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator28 = strKafkaSpoutConfig27.translator;
        long long29 = strKafkaSpoutConfig27.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = strKafkaSpoutConfig27.kafkaProps;
        java.lang.String str31 = strKafkaSpoutConfig27.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = strKafkaSpoutConfig27.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer33 = strKafkaSpoutConfig27.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer34 = strKafkaSpoutConfig27.getValueDeserializer();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator35 = strKafkaSpoutConfig27.getTranslator();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList39);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass42 = strBuilder41.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder41.firstPollOffsetStrategy = firstPollOffsetStrategy43;
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder50 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList48);
        strBuilder50.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = strBuilder50.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = strBuilder41.setProp(strMap53);
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = strBuilder41.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap55);
        strKafkaSpoutConfig27.kafkaProps = strMap56;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy58 = strKafkaSpoutConfig27.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig27.offsetCommitPeriodMs = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer63 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer64 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer66 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList72);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]> strKafkaSpoutConfigBuilder75 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]>("hi!", strKafkaSpoutConfigSerializableDeserializer66, strArraySerializableDeserializer67, (java.util.Collection<java.lang.String>) strList72);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer63, strSerializableDeserializer64, (java.util.Collection<java.lang.String>) strList72);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder77 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList72);
        int int78 = strBuilder77.maxRetries;
        java.util.Map<java.lang.String, java.lang.Object> strMap79 = strBuilder77.kafkaProps;
        strKafkaSpoutConfig27.kafkaProps = strMap79;
        strKafkaSpoutConfig11.kafkaProps = strMap79;
        strKafkaSpoutConfig0.kafkaProps = strMap79;
        java.util.Map<java.lang.String, java.lang.Object> strMap83 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy16);
        org.junit.Assert.assertNull(strRecordTranslator17);
        org.junit.Assert.assertNull(firstPollOffsetStrategy18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str20, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(objDeserializer23);
        org.junit.Assert.assertNull(subscription24);
        org.junit.Assert.assertNull(strRecordTranslator28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str31, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNull(objDeserializer33);
        org.junit.Assert.assertNull(objDeserializer34);
        org.junit.Assert.assertNull(strRecordTranslator35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy43 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy43.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(firstPollOffsetStrategy58);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNotNull(strMap83);
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder9.setSSLTruststore("hi!", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder9.setFetchMinBytes(100);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        strBuilder14.keyDes = strSerializableDeserializer15;
        int int17 = strBuilder14.maxUncommittedOffsets;
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator7 = null;
        strBuilder5.translator = strRecordTranslator7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets(1);
        strBuilder5.maxUncommittedOffsets = 2147483647;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder5.setPartitionRefreshPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder5.setPollTimeoutMs((long) (short) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setMaxPartitionFectchBytes((int) (short) 1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = null;
        strBuilder18.keyDes = strSerializableDeserializer19;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        int int7 = strKafkaSpoutConfig0.maxRetries;
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = strKafkaSpoutConfig0.kafkaProps;
        long long10 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", pattern12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder13.setOffsetCommitPeriodMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder15.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "");
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass19 = strBuilder15.valueDesClazz;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer22 = null;
        java.util.regex.Pattern pattern23 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer21, strSerializableDeserializer22, pattern23);
        strBuilder24.maxUncommittedOffsets = 100;
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList30);
        strBuilder32.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = strBuilder32.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap35);
        strBuilder24.kafkaProps = strMap36;
        strBuilder15.kafkaProps = strMap36;
        strKafkaSpoutConfig0.kafkaProps = strMap36;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setMaxUncommittedOffsets(10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strBuilder7.retryService;
        strBuilder7.maxRetries = (short) 100;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = strBuilder7.valueDes;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder7.setGroupId("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=10, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.util.regex.Pattern pattern15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", pattern15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int18 = strKafkaSpoutConfig17.getMaxTupleRetries();
        strKafkaSpoutConfig17.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig17.maxUncommittedOffsets = 35;
        strKafkaSpoutConfig17.maxUncommittedOffsets = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int26 = strKafkaSpoutConfig25.getMaxTupleRetries();
        long long27 = strKafkaSpoutConfig25.getPollTimeoutMs();
        strKafkaSpoutConfig25.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = strKafkaSpoutConfig25.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator31 = strKafkaSpoutConfig25.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = strKafkaSpoutConfig25.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig33 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int34 = strKafkaSpoutConfig33.getMaxTupleRetries();
        strKafkaSpoutConfig33.maxRetries = 1;
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList40);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = strBuilder42.kafkaProps;
        strKafkaSpoutConfig33.kafkaProps = strMap43;
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = strKafkaSpoutConfig33.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = strKafkaSpoutConfig33.kafkaProps;
        strKafkaSpoutConfig25.kafkaProps = strMap46;
        strKafkaSpoutConfig17.kafkaProps = strMap46;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder16.setProp(strMap46);
        strBuilder7.kafkaProps = strMap46;
        java.util.Properties properties51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = strBuilder7.setProp(properties51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
// flaky:         org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNull(strSerializableDeserializer11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy30);
        org.junit.Assert.assertNull(strRecordTranslator31);
        org.junit.Assert.assertNull(firstPollOffsetStrategy32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = null;
        strKafkaSpoutConfig0.translator = strRecordTranslator5;
        int int7 = strKafkaSpoutConfig0.maxRetries;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strRecordTranslator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer8 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService9;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator11 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.pollTimeoutMs = 97;
        long long14 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(strRecordTranslator6);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertNull(strDeserializer8);
        org.junit.Assert.assertNull(strRecordTranslator11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.List<java.lang.String>> strListSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        strBuilder11.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder11.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder11.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder11.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig21.maxRetries = (short) 1;
        long long24 = strKafkaSpoutConfig21.offsetCommitPeriodMs;
        java.lang.String str25 = strKafkaSpoutConfig21.toString();
        int int26 = strKafkaSpoutConfig21.getMaxTupleRetries();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList30);
        strBuilder32.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = strBuilder32.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder32.setPartitionRefreshPeriodMs((long) 1);
        int int38 = strBuilder37.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder37.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder37.setSecurityProtocol("hi!");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder50 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList48);
        strBuilder50.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = strBuilder50.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder58 = strBuilder56.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder64 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList62);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass65 = strBuilder64.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder64.firstPollOffsetStrategy = firstPollOffsetStrategy66;
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder73 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList71);
        strBuilder73.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = strBuilder73.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder77 = strBuilder64.setProp(strMap76);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder78 = strBuilder56.setProp(strMap76);
        org.apache.storm.kafka.spout.Subscription subscription79 = strBuilder56.subscription;
        strBuilder44.subscription = subscription79;
        subscription79.refreshAssignment();
        strKafkaSpoutConfig21.subscription = subscription79;
        strBuilder11.subscription = subscription79;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.String[]> strListBuilder84 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.String[]>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=1, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strListSerializableDeserializer4, strArraySerializableDeserializer5, subscription79);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder85 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=10, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription79);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str25, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy66 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy66.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(subscription79);
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPollTimeoutMs((long) 2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setPartitionRefreshPeriodMs(0L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder5.setMaxPartitionFectchBytes((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder14.setPartitionRefreshPeriodMs(30000L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder14.setSSLKeystore("KafkaSpoutConfig{kafkaProps={ssl.keystore.password=hi!, ssl.key.password=KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}, ssl.keystore.location=KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=100, maxUncommittedOffsets=100, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=30000, offsetCommitPeriodMs=52, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        int int11 = strBuilder10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder10.setPartitionRefreshPeriodMs(100L);
        long long14 = strBuilder13.pollTimeoutMs;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxRetries = 1;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strBuilder9.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = strKafkaSpoutConfig0.kafkaProps;
        long long14 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList18);
        strBuilder20.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder20.setSSLKeystore("", "", "hi!");
        int int27 = strBuilder26.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = strBuilder26.setSSLKeystore("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = strBuilder31.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap32;
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer35 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(strDeserializer35);
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]> strKafkaSpoutConfigBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]>("hi!", strKafkaSpoutConfigSerializableDeserializer7, strArraySerializableDeserializer8, (java.util.Collection<java.lang.String>) strList13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, (java.util.Collection<java.lang.String>) strList13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=32, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy19 = strBuilder18.firstPollOffsetStrategy;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy19 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy19.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        int int4 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass7 = strKafkaSpoutConfig0.valueDesClazz;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer8 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(strDeserializer8);
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer3 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer4 = strKafkaSpoutConfig0.valueDes;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        strBuilder11.keyDes = strSerializableDeserializer12;
        long long14 = strBuilder11.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        strBuilder25.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = strBuilder25.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = strBuilder25.setPartitionRefreshPeriodMs((long) 1);
        int int31 = strBuilder30.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder30.setSecurityProtocol("hi!");
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList41);
        strBuilder43.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder43.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder49.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList55);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass58 = strBuilder57.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy59 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder57.firstPollOffsetStrategy = firstPollOffsetStrategy59;
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        strBuilder66.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = strBuilder66.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = strBuilder57.setProp(strMap69);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = strBuilder49.setProp(strMap69);
        org.apache.storm.kafka.spout.Subscription subscription72 = strBuilder49.subscription;
        strBuilder37.subscription = subscription72;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer18, strSerializableDeserializer19, subscription72);
        strBuilder11.subscription = subscription72;
        strKafkaSpoutConfig0.subscription = subscription72;
        int int77 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.Subscription subscription78 = strKafkaSpoutConfig0.subscription;
        long long79 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str80 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy81 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass82 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator83 = null;
        strKafkaSpoutConfig0.translator = strRecordTranslator83;
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strDeserializer3);
        org.junit.Assert.assertNull(objSerializableDeserializer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy59 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy59.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(subscription72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(subscription78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy81);
        org.junit.Assert.assertNull(wildcardClass82);
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Iterable<java.lang.String>> strIterableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer10, strSerializableDeserializer11, (java.util.Collection<java.lang.String>) strList14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.Iterable<java.lang.String>> strListBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.Iterable<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strListSerializableDeserializer7, strIterableSerializableDeserializer8, (java.util.Collection<java.lang.String>) strList14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, (java.util.Collection<java.lang.String>) strList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList22);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer25 = null;
        strBuilder24.keyDes = strSerializableDeserializer25;
        long long27 = strBuilder24.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder24.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = strBuilder24.setPollTimeoutMs((long) 0);
        java.util.regex.Pattern pattern33 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder34 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", pattern33);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator35 = strBuilder34.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = strBuilder24.setRecordTranslator(strRecordTranslator35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder38 = strBuilder36.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder40 = strBuilder36.setMaxUncommittedOffsets((int) (byte) 1);
        org.apache.storm.kafka.spout.Subscription subscription41 = strBuilder36.subscription;
        strBuilder18.subscription = subscription41;
        subscription41.refreshAssignment();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=2147483647, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription41);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strRecordTranslator35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(subscription41);
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer7 = strKafkaSpoutConfig0.getKeyDeserializer();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractList<java.lang.String>> strListSerializableDeserializer16 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer17 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer22 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractList<java.lang.String>> strListSerializableDeserializer23 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>> strCollectionBuilder26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strCollectionSerializableDeserializer22, strListSerializableDeserializer23, strArray25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer19, strSerializableDeserializer20, strArray25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strListBuilder28 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>("hi!", strListSerializableDeserializer16, strKafkaSpoutConfigSerializableDeserializer17, strArray25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer13, strSerializableDeserializer14, strArray25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig30 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig30.maxRetries = (short) 1;
        long long33 = strKafkaSpoutConfig30.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass34 = strKafkaSpoutConfig30.keyDesClazz;
        strKafkaSpoutConfig30.pollTimeoutMs = 0L;
        int int37 = strKafkaSpoutConfig30.maxUncommittedOffsets;
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
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = strBuilder43.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap57);
        strKafkaSpoutConfig30.kafkaProps = strMap58;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder29.setProp(strMap58);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer67 = null;
        strBuilder66.keyDes = strSerializableDeserializer67;
        long long69 = strBuilder66.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = strBuilder66.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder73 = strBuilder66.setPollTimeoutMs((long) 0);
        java.util.regex.Pattern pattern75 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", pattern75);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator77 = strBuilder76.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder78 = strBuilder66.setRecordTranslator(strRecordTranslator77);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder80 = strBuilder78.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder82 = strBuilder78.setMaxUncommittedOffsets((int) (byte) 1);
        org.apache.storm.kafka.spout.Subscription subscription83 = strBuilder78.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = strBuilder78.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder85 = strBuilder60.setProp(strMap84);
        strKafkaSpoutConfig0.kafkaProps = strMap84;
        java.lang.String str87 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.maxRetries = 'a';
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 97L;
        boolean boolean92 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(strDeserializer7);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy45 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy45.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 32L + "'", long69 == 32L);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strRecordTranslator77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(subscription83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=1, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str87, "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=1, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }
}
