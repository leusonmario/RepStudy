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
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.common.header.Headers headers10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (java.lang.Long) 100L, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1, headers10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.String>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.CharSequence>.Timer timer4 = kafkaSpout0.new Timer((long) (short) -1, 1L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.Comparable<java.lang.String>> offsetComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.Comparable<java.lang.String>> offsetComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.Comparable<java.lang.String>>(offsetComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator9 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.common.header.Headers headers10 = null;
        java.util.Optional<java.lang.Integer> intOptional11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> offsetComparatorConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>("", (int) (short) 1, (long) ' ', (long) ' ', timestampType4, (java.lang.Long) 0L, 0, 1, offsetComparator8, offsetComparator9, headers10, intOptional11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer timer4 = kafkaSpout0.new Timer((long) (byte) 100, 0L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = org.apache.kafka.clients.consumer.ConsumerRecord.NULL_CHECKSUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.slf4j.Logger logger0 = null;
        org.apache.storm.kafka.spout.KafkaSpout.LOG = logger0;
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.reflect.AnnotatedElement>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.lang.Class<?> wildcardClass8 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator66 = offsetComparator63.reversed();
        org.apache.kafka.common.header.Headers headers68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) -1, 0L, 0L, timestampType14, (java.lang.Long) 100L, (int) (short) 100, (int) (short) -1, kafkaSpoutMessageIdComparator66, "", headers68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator66);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.slf4j.Logger logger0 = org.apache.storm.kafka.spout.KafkaSpout.LOG;
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        java.util.Map map4 = null;
        org.apache.storm.task.TopologyContext topologyContext5 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map4, topologyContext5, spoutOutputCollector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.lang.Class<?>> timestampTypeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.lang.Class<?>>();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.reflect.GenericDeclaration> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = offsetComparator3.compare(kafkaSpoutMessageId6, kafkaSpoutMessageId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        long long0 = org.apache.kafka.clients.consumer.ConsumerRecord.NO_TIMESTAMP;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.storm.topology.base.BaseComponent>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationKafkaSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationKafkaSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(genericDeclarationKafkaSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = org.apache.kafka.clients.consumer.ConsumerRecord.NULL_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.lang.Class<?> wildcardClass10 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = firstPollOffsetStrategy3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        java.util.Map map4 = null;
        org.apache.storm.task.TopologyContext topologyContext5 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map4, topologyContext5, spoutOutputCollector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.storm.spout.ISpout> cloneableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.storm.spout.ISpout>();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.topology.base.BaseRichSpout> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.topology.base.BaseRichSpout> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.topology.base.BaseRichSpout>(kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator0 = null;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator0;
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        java.util.Map map7 = null;
        org.apache.storm.task.TopologyContext topologyContext8 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map7, topologyContext8, spoutOutputCollector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.spout.ISpout, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(iSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout60 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService61 = null;
        genericDeclarationKafkaSpout60.retryService = kafkaSpoutRetryService61;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray63 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet64 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet64, kafkaSpoutMessageIdArray63);
        genericDeclarationKafkaSpout60.emitted = kafkaSpoutMessageIdSet64;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout67 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService68 = null;
        genericDeclarationKafkaSpout67.retryService = kafkaSpoutRetryService68;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray70 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet71 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet71, kafkaSpoutMessageIdArray70);
        genericDeclarationKafkaSpout67.emitted = kafkaSpoutMessageIdSet71;
        genericDeclarationKafkaSpout60.emitted = kafkaSpoutMessageIdSet71;
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator80 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator80, "");
        java.lang.String str83 = kafkaSpoutMessageIdComparatorConsumerRecord82.topic();
        org.apache.kafka.common.header.Headers headers84 = kafkaSpoutMessageIdComparatorConsumerRecord82.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.AnnotatedElement> kafkaSpoutMessageIdCollectionConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.AnnotatedElement>("hi!", (-1), (long) (byte) 0, (long) 0, timestampType14, (java.lang.Long) 1L, (int) (short) -1, (int) (byte) 10, (java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet71, (java.lang.reflect.AnnotatedElement) wildcardClass76, headers84);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(headers84);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, org.apache.storm.topology.base.BaseRichSpout> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, org.apache.storm.topology.base.BaseRichSpout>();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>.Timer timer4 = kafkaSpout0.new Timer((long) (short) 1, (long) '#', timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.util.Optional<java.lang.Integer> intOptional11 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(intOptional11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IComponent, org.apache.storm.topology.base.BaseRichSpout> iComponentKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.storm.topology.base.BaseRichSpout> iComponentKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.storm.topology.base.BaseRichSpout>(iComponentKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.Class<?> wildcardClass12 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = offsetComparator3.compare(kafkaSpoutMessageId6, kafkaSpoutMessageId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>(genericDeclarationKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap3 = genericDeclarationKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder4 = genericDeclarationKafkaSpout0.tuplesBuilder;
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
        org.junit.Assert.assertNull(genericDeclarationKafkaSpoutTuplesBuilder4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = offsetComparator6.compare(kafkaSpoutMessageId11, kafkaSpoutMessageId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = genericDeclarationKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.declareOutputFields(outputFieldsDeclarer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = genericDeclarationKafkaSpout0.emitTupleIfNotEmitted(genericDeclarationConsumerRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.spout.ISpout> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.spout.ISpout>();
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedValueSize();
        java.lang.Class<?> wildcardClass12 = kafkaSpoutMessageIdComparatorConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = offsetComparator3.compare(kafkaSpoutMessageId7, kafkaSpoutMessageId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        java.util.Map map8 = null;
        org.apache.storm.task.TopologyContext topologyContext9 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map8, topologyContext9, spoutOutputCollector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = genericDeclarationKafkaSpout0.emitted;
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator3.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(charSequenceKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.spout.ISpout> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.spout.ISpout> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.spout.ISpout>(kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> timestampTypeEnumKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> timestampTypeEnumKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>(timestampTypeEnumKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout7 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        genericDeclarationKafkaSpout7.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray10 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet11, kafkaSpoutMessageIdArray10);
        genericDeclarationKafkaSpout7.emitted = kafkaSpoutMessageIdSet11;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet11;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator0 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord6 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator4, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator8.reversed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator0.thenComparing(kafkaSpoutMessageIdComparator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdComparator0);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder4 = genericDeclarationKafkaSpout0.tuplesBuilder;
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.ack(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
        org.junit.Assert.assertNull(genericDeclarationKafkaSpoutTuplesBuilder4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.String>("", (int) (short) 0, (long) (byte) 0, (java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout7 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        genericDeclarationKafkaSpout7.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray10 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet11, kafkaSpoutMessageIdArray10);
        genericDeclarationKafkaSpout7.emitted = kafkaSpoutMessageIdSet11;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet11;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.fail(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder3 = null;
        genericDeclarationKafkaSpout0.tuplesBuilder = genericDeclarationKafkaSpoutTuplesBuilder3;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords5 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setWaitingToEmit(genericDeclarationConsumerRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer4 = kafkaSpout0.new Timer(10L, (long) (short) 1, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, org.apache.storm.topology.base.BaseComponent> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70, "");
        java.lang.String str73 = kafkaSpoutMessageIdComparatorConsumerRecord72.topic();
        org.apache.kafka.common.header.Headers headers74 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.common.header.Headers headers75 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType14, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "KafkaSpout{acked=null, emitted=null}", headers75);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator77 = offsetComparator63.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId78 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int80 = offsetComparator63.compare(kafkaSpoutMessageId78, kafkaSpoutMessageId79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertNotNull(headers75);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator77);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> timerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> timerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>(timerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strComparableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strComparableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(strComparableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> offsetComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> offsetComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>(offsetComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        java.lang.Class<?> wildcardClass6 = genericDeclarationKafkaSpout0.getClass();
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = null;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet3;
        boolean boolean5 = genericDeclarationKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = genericDeclarationKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.io.Serializable>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", 10, (long) (-1), (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = offsetComparator6.compare(kafkaSpoutMessageId11, kafkaSpoutMessageId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer6 = genericDeclarationKafkaSpout0.commitTimer;
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.spout.ISpout> timestampTypeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.spout.ISpout>();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer4 = kafkaSpout0.new Timer((long) (short) 100, (long) '4', timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator15, "");
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType32, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator48, "");
        org.apache.kafka.common.record.TimestampType timestampType51 = kafkaSpoutMessageIdComparatorConsumerRecord50.timestampType();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType51, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass56, (java.lang.reflect.GenericDeclaration) wildcardClass58);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType18, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass37, timestampType51);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator74 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator74, "");
        java.lang.String str77 = kafkaSpoutMessageIdComparatorConsumerRecord76.topic();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.common.header.Headers headers79 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType18, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "KafkaSpout{acked=null, emitted=null}", headers79);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator90 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator90, "");
        java.lang.String str93 = kafkaSpoutMessageIdComparatorConsumerRecord92.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparatorConsumerRecord92.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) '4', 100L, kafkaSpoutMessageIdComparator94, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord98 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (short) 0, (long) ' ', (-1L), timestampType18, (long) (byte) -1, (int) (short) 1, (int) '4', kafkaSpoutMessageIdComparator94, "KafkaSpout{acked=null, emitted=null}");
        org.apache.kafka.common.header.Headers headers99 = kafkaSpoutMessageIdComparatorConsumerRecord98.headers();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertNotNull(headers99);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.kafka.common.header.Header>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.kafka.common.header.Header>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.kafka.common.header.Header>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator3.thenComparing(kafkaSpoutMessageIdComparator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.util.Optional<java.lang.Integer> intOptional7 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional8 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.kafka.common.record.TimestampType> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.kafka.common.record.TimestampType> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.kafka.common.record.TimestampType>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.base.BaseRichSpout, org.apache.kafka.common.header.Headers> baseRichSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.kafka.common.header.Headers> baseRichSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.kafka.common.header.Headers>(baseRichSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>>();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator15, "");
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType32, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator48, "");
        org.apache.kafka.common.record.TimestampType timestampType51 = kafkaSpoutMessageIdComparatorConsumerRecord50.timestampType();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType51, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass56, (java.lang.reflect.GenericDeclaration) wildcardClass58);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType18, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass37, timestampType51);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator74 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator74, "");
        java.lang.String str77 = kafkaSpoutMessageIdComparatorConsumerRecord76.topic();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.common.header.Headers headers79 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType18, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "KafkaSpout{acked=null, emitted=null}", headers79);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator90 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator90, "");
        java.lang.String str93 = kafkaSpoutMessageIdComparatorConsumerRecord92.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparatorConsumerRecord92.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) '4', 100L, kafkaSpoutMessageIdComparator94, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord98 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (short) 0, (long) ' ', (-1L), timestampType18, (long) (byte) -1, (int) (short) 1, (int) '4', kafkaSpoutMessageIdComparator94, "KafkaSpout{acked=null, emitted=null}");
        org.apache.kafka.common.record.TimestampType timestampType99 = kafkaSpoutMessageIdComparatorConsumerRecord98.timestampType();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertTrue("'" + timestampType99 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType99.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = genericDeclarationKafkaSpout0.emitted;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = genericDeclarationKafkaSpout0.emitTupleIfNotEmitted(genericDeclarationConsumerRecord4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.declareOutputFields(outputFieldsDeclarer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.io.Serializable>.Timer timer4 = kafkaSpout0.new Timer((long) '#', (long) ' ', timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.kafka.common.header.Headers> timestampTypeEnumKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.kafka.common.header.Headers> timestampTypeEnumKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.kafka.common.header.Headers>(timestampTypeEnumKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.Cloneable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.Cloneable>();
        java.lang.Class<?> wildcardClass1 = objKafkaSpout0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedValueSize();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedKeySize();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord10.timestamp();
        java.lang.String str14 = kafkaSpoutMessageIdComparatorConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator3.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator6.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", 0, (long) 1, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator6.thenComparing(kafkaSpoutMessageIdComparator12);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = offsetComparator6.compare(kafkaSpoutMessageId15, kafkaSpoutMessageId16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> intOptionalKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, java.lang.reflect.Type>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.lang.Cloneable>.Timer timer4 = kafkaSpout0.new Timer((-1L), (long) (byte) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.base.BaseRichSpout> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.base.BaseRichSpout>();
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.topology.IComponent>.Timer timer4 = kafkaSpout0.new Timer(0L, (long) (byte) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.lang.Cloneable> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.Cloneable> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.Cloneable>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.kafka.common.TopicPartition topicPartition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setAcked(topicPartition3, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.spout.ISpout> timestampTypeEnumKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.spout.ISpout> timestampTypeEnumKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.spout.ISpout>(timestampTypeEnumKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        genericDeclarationKafkaSpout0.consumerAutoCommitMode = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords6 = genericDeclarationKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object>();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator3.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.Comparable<java.lang.String>> headerIterableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.Comparable<java.lang.String>> headerIterableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.Comparable<java.lang.String>>(headerIterableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> iRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord8.topic();
        org.apache.kafka.common.header.Headers headers10 = kafkaSpoutMessageIdComparatorConsumerRecord8.headers();
        org.apache.kafka.common.header.Headers headers11 = kafkaSpoutMessageIdComparatorConsumerRecord8.headers();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord8.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) 100, (long) (-1), kafkaSpoutMessageIdComparator12, "");
        java.lang.Class<?> wildcardClass15 = kafkaSpoutMessageIdComparator12.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.io.Serializable> cloneableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.io.Serializable>();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Cloneable> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.lang.Cloneable> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.lang.Cloneable>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Cloneable> objKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.Cloneable> objKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.Cloneable>(objKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> genericDeclarationKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>.Timer timer4 = kafkaSpout0.new Timer((long) (short) 0, (long) 100, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder7 = genericDeclarationKafkaSpout0.tuplesBuilder;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = genericDeclarationKafkaSpout0.toArrayList(topicPartition8);
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords10 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setWaitingToEmit(genericDeclarationConsumerRecords10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(genericDeclarationKafkaSpoutTuplesBuilder7);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(consumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.topology.IRichSpout> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.storm.topology.IRichSpout> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.storm.topology.IRichSpout>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers9 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = genericDeclarationKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>> genericDeclarationKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>>();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Map map2 = null;
        org.apache.storm.task.TopologyContext topologyContext3 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map2, topologyContext3, spoutOutputCollector4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector6;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedValueSize();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedKeySize();
        int int13 = kafkaSpoutMessageIdComparatorConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.declareOutputFields(outputFieldsDeclarer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.common.header.Headers> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.common.header.Headers>();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator60 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType47, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator60, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator60;
        java.lang.Class<?> wildcardClass64 = offsetComparator60.getClass();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = genericDeclarationKafkaSpout0.collector;
        genericDeclarationKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70, "");
        java.lang.String str73 = kafkaSpoutMessageIdComparatorConsumerRecord72.topic();
        org.apache.kafka.common.header.Headers headers74 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.common.header.Headers headers75 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType14, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "KafkaSpout{acked=null, emitted=null}", headers75);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator77 = offsetComparator63.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator78 = offsetComparator63.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator79 = offsetComparator63.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId80 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId81 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int82 = offsetComparator63.compare(kafkaSpoutMessageId80, kafkaSpoutMessageId81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertNotNull(headers75);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator77);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator78);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator79);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Iterable<org.apache.kafka.common.header.Header>> consumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Iterable<org.apache.kafka.common.header.Header>>();
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = genericDeclarationKafkaSpout0.emitTupleIfNotEmitted(genericDeclarationConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator15, "");
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType32, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator48, "");
        org.apache.kafka.common.record.TimestampType timestampType51 = kafkaSpoutMessageIdComparatorConsumerRecord50.timestampType();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType51, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass56, (java.lang.reflect.GenericDeclaration) wildcardClass58);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType18, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass37, timestampType51);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator74 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator74, "");
        java.lang.String str77 = kafkaSpoutMessageIdComparatorConsumerRecord76.topic();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.common.header.Headers headers79 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType18, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "KafkaSpout{acked=null, emitted=null}", headers79);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator90 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator90, "");
        java.lang.String str93 = kafkaSpoutMessageIdComparatorConsumerRecord92.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparatorConsumerRecord92.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) '4', 100L, kafkaSpoutMessageIdComparator94, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord98 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (short) 0, (long) ' ', (-1L), timestampType18, (long) (byte) -1, (int) (short) 1, (int) '4', kafkaSpoutMessageIdComparator94, "KafkaSpout{acked=null, emitted=null}");
        long long99 = kafkaSpoutMessageIdComparatorConsumerRecord98.offset();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + 32L + "'", long99 == 32L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords4 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setWaitingToEmit(genericDeclarationConsumerRecords4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords6 = genericDeclarationKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>();
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers7 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers9 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(headers9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = offsetComparator3.compare(kafkaSpoutMessageId8, kafkaSpoutMessageId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator60 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType47, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator60, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator60;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId64 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = offsetComparator60.compare(kafkaSpoutMessageId64, kafkaSpoutMessageId65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.GenericDeclaration>.Timer timer4 = kafkaSpout0.new Timer((long) 1, (long) 1, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.Comparable<java.lang.String>> cloneableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        genericDeclarationKafkaSpout0.initialized = false;
        java.util.Map map5 = null;
        org.apache.storm.task.TopologyContext topologyContext6 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map5, topologyContext6, spoutOutputCollector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = genericDeclarationKafkaSpout0.toArrayList(topicPartition4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = genericDeclarationKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.base.BaseComponent, java.io.Serializable> baseComponentKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, java.io.Serializable> baseComponentKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, java.io.Serializable>(baseComponentKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder3 = genericDeclarationKafkaSpout0.tuplesBuilder;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor4 = null;
        genericDeclarationKafkaSpout0.waitingToEmit = genericDeclarationConsumerRecordItor4;
        org.junit.Assert.assertNull(genericDeclarationKafkaSpoutTuplesBuilder3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector4;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = genericDeclarationKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Comparable<java.lang.String>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator6.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = offsetComparator6.compare(kafkaSpoutMessageId12, kafkaSpoutMessageId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> kafkaSpoutMessageIdComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> kafkaSpoutMessageIdComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>(kafkaSpoutMessageIdComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer3 = genericDeclarationKafkaSpout0.commitTimer;
        int int4 = genericDeclarationKafkaSpout0.maxRetries;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector5;
        boolean boolean7 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertNull(timer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.io.Serializable> kafkaSpoutConsumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.io.Serializable> kafkaSpoutConsumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.io.Serializable>(kafkaSpoutConsumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.kafka.common.header.Headers> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.kafka.common.header.Headers> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, org.apache.kafka.common.header.Headers>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator19;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator25;
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = null;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = genericDeclarationKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = genericDeclarationKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> headerIterableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> headerIterableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>(headerIterableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer6 = null;
        genericDeclarationKafkaSpout0.kafkaConsumer = genericDeclarationKafkaConsumer6;
        java.lang.String str8 = genericDeclarationKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = genericDeclarationKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Cloneable> strComparableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Cloneable> strComparableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Cloneable>(strComparableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = genericDeclarationKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer4 = null;
        genericDeclarationKafkaSpout0.kafkaConsumer = genericDeclarationKafkaConsumer4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = genericDeclarationKafkaSpout0.emitTupleIfNotEmitted(genericDeclarationConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IRichSpout, java.lang.Object> iRichSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.Object> iRichSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.Object>(iRichSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.common.record.TimestampType, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(timestampTypeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.String>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator60 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType47, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator60, "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId63 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId64 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int65 = offsetComparator60.compare(kafkaSpoutMessageId63, kafkaSpoutMessageId64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.common.record.TimestampType timestampType9 = kafkaSpoutMessageIdComparatorConsumerRecord8.timestampType();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord8.serializedValueSize();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord8.value();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord8.value();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord8.value();
        int int14 = kafkaSpoutMessageIdComparatorConsumerRecord8.partition();
        long long15 = kafkaSpoutMessageIdComparatorConsumerRecord8.offset();
        java.lang.Class<?> wildcardClass16 = kafkaSpoutMessageIdComparatorConsumerRecord8.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("KafkaSpout{acked=null, emitted=null}", (int) (byte) 0, (long) 52, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass18);
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers9 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.topology.IComponent> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.topology.IComponent> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.topology.IComponent>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IRichSpout> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IRichSpout> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IRichSpout>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = genericDeclarationKafkaSpout0.retryService;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = offsetComparator3.compare(kafkaSpoutMessageId7, kafkaSpoutMessageId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers11 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.base.BaseRichSpout> intOptionalKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.base.BaseRichSpout>();
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.Optional<java.lang.Integer>> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.Optional<java.lang.Integer>> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.Optional<java.lang.Integer>>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType13 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.Class<?> wildcardClass14 = timestampType13.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers10 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        java.lang.Class<?> wildcardClass12 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.lang.Class<?> wildcardClass12 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.spout.ISpout> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.spout.ISpout> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.spout.ISpout>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.util.Optional<java.lang.Integer> intOptional7 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional8 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.lang.String> headersKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.lang.String>();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.spout.ISpout, java.io.Serializable> iSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.io.Serializable> iSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.io.Serializable>(iSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.util.Optional<java.lang.Integer> intOptional11 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType12 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        long long14 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(intOptional11);
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector4;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 0L;
        java.util.Map map8 = null;
        org.apache.storm.task.TopologyContext topologyContext9 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map8, topologyContext9, spoutOutputCollector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer3 = genericDeclarationKafkaSpout0.commitTimer;
        int int4 = genericDeclarationKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = genericDeclarationKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig4 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutConfig = genericDeclarationKafkaSpoutConfig4;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = genericDeclarationKafkaSpout0.emitted;
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setAcked(topicPartition4, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = '4';
        genericDeclarationKafkaSpout0.maxRetries = ' ';
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer4 = null;
        genericDeclarationKafkaSpout0.kafkaConsumer = genericDeclarationKafkaConsumer4;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = genericDeclarationKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer4 = kafkaSpout0.new Timer((long) (short) 1, 0L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.spout.ISpout, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(iSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        int int14 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.lang.Class<?> wildcardClass15 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = offsetComparator3.compare(kafkaSpoutMessageId9, kafkaSpoutMessageId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService2;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IRichSpout> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator6.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = offsetComparator6.compare(kafkaSpoutMessageId13, kafkaSpoutMessageId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional7 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.lang.String> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.String> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.String>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationKafkaSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationKafkaSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(genericDeclarationKafkaSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.storm.topology.base.BaseComponent>.Timer timer4 = kafkaSpout0.new Timer((long) 1, (long) 97, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        genericDeclarationKafkaSpout0.maxRetries = '#';
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = genericDeclarationKafkaSpout0.emitted;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator15, "");
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType32, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator48, "");
        org.apache.kafka.common.record.TimestampType timestampType51 = kafkaSpoutMessageIdComparatorConsumerRecord50.timestampType();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType51, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass56, (java.lang.reflect.GenericDeclaration) wildcardClass58);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType18, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass37, timestampType51);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator74 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator74, "");
        java.lang.String str77 = kafkaSpoutMessageIdComparatorConsumerRecord76.topic();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.common.header.Headers headers79 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType18, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "KafkaSpout{acked=null, emitted=null}", headers79);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator90 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator90, "");
        java.lang.String str93 = kafkaSpoutMessageIdComparatorConsumerRecord92.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparatorConsumerRecord92.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) '4', 100L, kafkaSpoutMessageIdComparator94, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord98 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (short) 0, (long) ' ', (-1L), timestampType18, (long) (byte) -1, (int) (short) 1, (int) '4', kafkaSpoutMessageIdComparator94, "KafkaSpout{acked=null, emitted=null}");
        long long99 = kafkaSpoutMessageIdComparatorConsumerRecord98.checksum();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + (-1L) + "'", long99 == (-1L));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = genericDeclarationKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long14 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers15 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.lang.Class<?> wildcardClass16 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector4;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 0L;
        java.lang.Class<?> wildcardClass8 = genericDeclarationKafkaSpout0.getClass();
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Object>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator14, "");
        org.apache.kafka.common.record.TimestampType timestampType17 = kafkaSpoutMessageIdComparatorConsumerRecord16.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator28, "");
        org.apache.kafka.common.record.TimestampType timestampType31 = kafkaSpoutMessageIdComparatorConsumerRecord30.timestampType();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType31, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass38);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator47 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47, "");
        org.apache.kafka.common.record.TimestampType timestampType50 = kafkaSpoutMessageIdComparatorConsumerRecord49.timestampType();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType50, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass55, (java.lang.reflect.GenericDeclaration) wildcardClass57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType17, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass36, timestampType50);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType50, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator63;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator63.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) -1, 0L, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId70 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId71 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int72 = offsetComparator63.compare(kafkaSpoutMessageId70, kafkaSpoutMessageId71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + timestampType50 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType50.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator14, "");
        org.apache.kafka.common.record.TimestampType timestampType17 = kafkaSpoutMessageIdComparatorConsumerRecord16.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator28, "");
        org.apache.kafka.common.record.TimestampType timestampType31 = kafkaSpoutMessageIdComparatorConsumerRecord30.timestampType();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType31, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass38);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator47 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47, "");
        org.apache.kafka.common.record.TimestampType timestampType50 = kafkaSpoutMessageIdComparatorConsumerRecord49.timestampType();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType50, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass55, (java.lang.reflect.GenericDeclaration) wildcardClass57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType17, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass36, timestampType50);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType50, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator63;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator63.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) -1, 0L, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        int int70 = kafkaSpoutMessageIdComparatorConsumerRecord69.serializedKeySize();
        int int71 = kafkaSpoutMessageIdComparatorConsumerRecord69.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + timestampType50 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType50.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords8 = genericDeclarationKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers7 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.Class<?> wildcardClass11 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator60 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType47, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator60, "hi!");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator63 = offsetComparator60.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId64 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = offsetComparator60.compare(kafkaSpoutMessageId64, kafkaSpoutMessageId65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator63);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.String>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator6.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = offsetComparator6.compare(kafkaSpoutMessageId13, kafkaSpoutMessageId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer3 = genericDeclarationKafkaSpout0.commitTimer;
        int int4 = genericDeclarationKafkaSpout0.maxRetries;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector5;
        java.lang.Class<?> wildcardClass7 = genericDeclarationKafkaSpout0.getClass();
        org.junit.Assert.assertNull(timer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.String> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.String>();
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseRichSpout> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseRichSpout> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseRichSpout>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.Class<?> wildcardClass11 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IComponent> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IComponent>();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.GenericDeclaration> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.storm.topology.base.BaseRichSpout>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = genericDeclarationKafkaSpout0.toArrayList(topicPartition4);
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.declareOutputFields(outputFieldsDeclarer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.reflect.GenericDeclaration> consumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.storm.topology.base.BaseComponent> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator14, "");
        org.apache.kafka.common.record.TimestampType timestampType17 = kafkaSpoutMessageIdComparatorConsumerRecord16.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator28, "");
        org.apache.kafka.common.record.TimestampType timestampType31 = kafkaSpoutMessageIdComparatorConsumerRecord30.timestampType();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType31, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass38);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator47 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47, "");
        org.apache.kafka.common.record.TimestampType timestampType50 = kafkaSpoutMessageIdComparatorConsumerRecord49.timestampType();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType50, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass55, (java.lang.reflect.GenericDeclaration) wildcardClass57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType17, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass36, timestampType50);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType50, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator63;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator63.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) -1, 0L, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        int int70 = kafkaSpoutMessageIdComparatorConsumerRecord69.serializedKeySize();
        java.lang.String str71 = kafkaSpoutMessageIdComparatorConsumerRecord69.topic();
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + timestampType50 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType50.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "KafkaSpout{acked=null, emitted=[]}" + "'", str71, "KafkaSpout{acked=null, emitted=[]}");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70, "");
        java.lang.String str73 = kafkaSpoutMessageIdComparatorConsumerRecord72.topic();
        org.apache.kafka.common.header.Headers headers74 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.common.header.Headers headers75 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType14, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "KafkaSpout{acked=null, emitted=null}", headers75);
        java.util.Optional<java.lang.Integer> intOptional77 = kafkaSpoutMessageIdComparatorConsumerRecord76.leaderEpoch();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        java.util.Optional<java.lang.Integer> intOptional79 = kafkaSpoutMessageIdComparatorConsumerRecord76.leaderEpoch();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator80 = kafkaSpoutMessageIdComparatorConsumerRecord76.key();
        long long81 = kafkaSpoutMessageIdComparatorConsumerRecord76.offset();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertNotNull(headers75);
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(intOptional79);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers7 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.lang.Class<?> wildcardClass10 = intOptional9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.Optional<java.lang.Integer>> serializableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.Optional<java.lang.Integer>>();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional7 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.Optional<java.lang.Integer>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", 10, (long) (-1), (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = offsetComparator6.compare(kafkaSpoutMessageId12, kafkaSpoutMessageId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable>();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.kafka.common.header.Headers> timestampTypeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.kafka.common.header.Headers>();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.lang.String str4 = genericDeclarationKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str4, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = genericDeclarationKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.base.BaseComponent, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> baseComponentKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> baseComponentKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(baseComponentKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7, "");
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord9.serializedValueSize();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator21, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator21.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator21.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) -1, (long) 0, (long) (-1), timestampType14, (long) 100, (int) (byte) 10, (int) '#', kafkaSpoutMessageIdComparator25, "KafkaSpout{acked=null, emitted=null}");
        org.apache.kafka.common.header.Headers headers28 = kafkaSpoutMessageIdComparatorConsumerRecord27.headers();
        java.lang.String str29 = kafkaSpoutMessageIdComparatorConsumerRecord27.value();
        java.util.Optional<java.lang.Integer> intOptional30 = kafkaSpoutMessageIdComparatorConsumerRecord27.leaderEpoch();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(headers28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str29, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertNotNull(intOptional30);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.lang.Class<?> wildcardClass10 = kafkaSpoutMessageIdComparator9.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> genericDeclarationKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> genericDeclarationKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>(genericDeclarationKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.lang.String> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.lang.String>();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setAcked(topicPartition4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = offsetComparator6.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (byte) -1, (long) ' ', kafkaSpoutMessageIdComparator10, "KafkaSpout{acked=null, emitted=null}");
        org.apache.kafka.common.header.Headers headers13 = kafkaSpoutMessageIdComparatorConsumerRecord12.headers();
        java.util.Optional<java.lang.Integer> intOptional14 = kafkaSpoutMessageIdComparatorConsumerRecord12.leaderEpoch();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertNotNull(intOptional14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparatorConsumerRecord10.key();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator11;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional10 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        int int13 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.util.Optional<java.lang.Integer> intOptional14 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intOptional14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator6.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator6.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", 32, (long) 0, kafkaSpoutMessageIdComparator11, "KafkaSpout{acked=null, emitted=null}");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator11;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean4 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = genericDeclarationKafkaSpout0.retryService;
        java.lang.Class<?> wildcardClass6 = genericDeclarationKafkaSpout0.getClass();
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.base.BaseComponent, java.lang.Comparable<java.lang.String>> baseComponentKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, java.lang.Comparable<java.lang.String>> baseComponentKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, java.lang.Comparable<java.lang.String>>(baseComponentKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (short) 100;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector6;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = genericDeclarationKafkaSpout0.toArrayList(topicPartition8);
        genericDeclarationKafkaSpout0.initialized = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>.Timer timer4 = kafkaSpout0.new Timer(0L, 10L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, org.apache.kafka.common.header.Headers> headersKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, org.apache.kafka.common.header.Headers>();
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService2;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.GenericDeclaration> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>> consumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.reflect.Type> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.reflect.Type>();
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = kafkaSpoutMessageIdComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator8.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = offsetComparator12.compare(kafkaSpoutMessageId17, kafkaSpoutMessageId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.CharSequence> cloneableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.CharSequence>();
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.base.BaseComponent> intOptionalKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = genericDeclarationKafkaSpout0.emitTupleIfNotEmitted(genericDeclarationConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        int int1 = genericDeclarationKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setAcked(topicPartition4, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable>();
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.Object> iRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.Object>();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator12.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) ' ', (long) (short) -1, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12, "hi!");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (byte) -1, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId23 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = offsetComparator12.compare(kafkaSpoutMessageId23, kafkaSpoutMessageId24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.spout.ISpout, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> iSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> iSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>(iSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = null;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = genericDeclarationKafkaSpout0.emitted;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords6 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setWaitingToEmit(genericDeclarationConsumerRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.String> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.String>();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable>();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map map3 = null;
        org.apache.storm.task.TopologyContext topologyContext4 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map3, topologyContext4, spoutOutputCollector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator9 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator9, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator9, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator9.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator9.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) ' ', (long) (short) -1, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator9, "hi!");
        long long18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestamp();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator66 = offsetComparator63.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) -1, (long) (-1), 0L, timestampType14, (long) 'a', (int) '#', (int) '4', kafkaSpoutMessageIdComparator66, "KafkaSpout{acked=null, emitted=[]}");
        java.lang.String str69 = kafkaSpoutMessageIdComparatorConsumerRecord68.toString();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator66);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, org.apache.storm.topology.base.BaseComponent> headersKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        int int8 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator21, "");
        org.apache.kafka.common.record.TimestampType timestampType24 = kafkaSpoutMessageIdComparatorConsumerRecord23.timestampType();
        int int25 = kafkaSpoutMessageIdComparatorConsumerRecord23.serializedValueSize();
        java.lang.String str26 = kafkaSpoutMessageIdComparatorConsumerRecord23.value();
        int int27 = kafkaSpoutMessageIdComparatorConsumerRecord23.partition();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService29 = null;
        genericDeclarationKafkaSpout28.retryService = kafkaSpoutRetryService29;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray31 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32, kafkaSpoutMessageIdArray31);
        genericDeclarationKafkaSpout28.emitted = kafkaSpoutMessageIdSet32;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("", (int) (byte) -1, 1L, 0L, timestampType14, (long) (short) -1, (int) 'a', (int) (short) 0, (java.lang.Object) int27, (java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator42 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator42, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator42.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator42;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (-1), (long) ' ', (long) '#', timestampType14, 10L, 0, 32, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator42, "KafkaSpout{acked=null, emitted=null}");
        int int49 = kafkaSpoutMessageIdComparatorConsumerRecord48.serializedKeySize();
        long long50 = kafkaSpoutMessageIdComparatorConsumerRecord48.offset();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType24 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType24.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object>.Timer timer4 = kafkaSpout0.new Timer((long) (byte) 1, 10L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.Type> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.Type>();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = genericDeclarationKafkaSpout0.emitted;
        genericDeclarationKafkaSpout0.initialized = false;
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        long long6 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        java.lang.String str7 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        int int8 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer3 = genericDeclarationKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords5 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setWaitingToEmit(genericDeclarationConsumerRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer3);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70, "");
        java.lang.String str73 = kafkaSpoutMessageIdComparatorConsumerRecord72.topic();
        org.apache.kafka.common.header.Headers headers74 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.common.header.Headers headers75 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType14, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "KafkaSpout{acked=null, emitted=null}", headers75);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator77 = kafkaSpoutMessageIdComparatorConsumerRecord76.key();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator87 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator87, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator90 = offsetComparator87.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", 0, (long) 1, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator87, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator93 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparator93.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator95 = offsetComparator87.thenComparing(kafkaSpoutMessageIdComparator93);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord97 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", 10, (long) (byte) 1, kafkaSpoutMessageIdComparator93, "KafkaSpout{acked=null, emitted=null}");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator98 = kafkaSpoutMessageIdComparator93.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator99 = kafkaSpoutMessageIdComparator77.thenComparing(kafkaSpoutMessageIdComparator93);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertNotNull(headers75);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator77);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator90);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator93);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator95);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator98);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator99);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.lang.Cloneable> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.lang.Cloneable>();
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>> consumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>> consumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>(consumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        java.util.Optional<java.lang.Integer> intOptional13 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        int int14 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IRichSpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iRichSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iRichSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(iRichSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutConsumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        org.apache.kafka.common.header.Headers headers12 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        int int13 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers7 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = ' ';
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        long long6 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70, "");
        java.lang.String str73 = kafkaSpoutMessageIdComparatorConsumerRecord72.topic();
        org.apache.kafka.common.header.Headers headers74 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.common.header.Headers headers75 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType14, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "KafkaSpout{acked=null, emitted=null}", headers75);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId77 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId78 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int79 = offsetComparator63.compare(kafkaSpoutMessageId77, kafkaSpoutMessageId78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertNotNull(headers75);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = ' ';
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.topology.base.BaseComponent>.Timer timer4 = kafkaSpout0.new Timer((long) 10, 10L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Cloneable>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig3 = genericDeclarationKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = genericDeclarationKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = genericDeclarationKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationKafkaSpoutConfig3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.lang.Iterable<org.apache.kafka.common.header.Header>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str14 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Optional<java.lang.Integer>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> intOptionalKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> intOptionalKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(intOptionalKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer7 = genericDeclarationKafkaSpout0.commitTimer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor8 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.declareOutputFields(outputFieldsDeclarer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(timer7);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        int int15 = kafkaSpoutMessageIdComparatorConsumerRecord13.serializedValueSize();
        java.lang.String str16 = kafkaSpoutMessageIdComparatorConsumerRecord13.value();
        java.lang.String str17 = kafkaSpoutMessageIdComparatorConsumerRecord13.value();
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = offsetComparator25.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) -1, (long) 0, (long) (-1), timestampType18, (long) 100, (int) (byte) 10, (int) '#', kafkaSpoutMessageIdComparator29, "KafkaSpout{acked=null, emitted=null}");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator38 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator38, "");
        org.apache.kafka.common.record.TimestampType timestampType41 = kafkaSpoutMessageIdComparatorConsumerRecord40.timestampType();
        long long42 = kafkaSpoutMessageIdComparatorConsumerRecord40.timestamp();
        long long43 = kafkaSpoutMessageIdComparatorConsumerRecord40.offset();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = kafkaSpoutMessageIdComparatorConsumerRecord40.key();
        org.apache.kafka.common.header.Headers headers46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (short) -1, (-1L), (-1L), timestampType18, (java.lang.Long) 32L, (int) ' ', (int) (byte) -1, kafkaSpoutMessageIdComparator44, "KafkaSpout{acked=null, emitted=[]}", headers46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Headers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        org.junit.Assert.assertTrue("'" + timestampType41 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType41.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>();
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> headerIterableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(headerIterableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator3;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = offsetComparator3.compare(kafkaSpoutMessageId7, kafkaSpoutMessageId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> serializableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Cloneable cloneable4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Cloneable> strComparableConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Cloneable>("hi!", (int) (byte) 100, (long) 32, (java.lang.Comparable<java.lang.String>) "", cloneable4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7, "");
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord9.serializedValueSize();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        java.lang.String str14 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        java.lang.String str15 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        org.apache.kafka.common.record.TimestampType timestampType16 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23, "");
        java.lang.String str26 = kafkaSpoutMessageIdComparatorConsumerRecord25.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparatorConsumerRecord25.key();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator27.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator32 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator32, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator32.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator27.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator32);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator32;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator32;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) 'a', (long) (short) 10, 0L, timestampType16, 10L, 1, 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator32, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId41 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = offsetComparator32.compare(kafkaSpoutMessageId41, kafkaSpoutMessageId42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator6;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) -1, (long) 35, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.lang.Class<?> wildcardClass13 = offsetComparator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.kafka.common.record.TimestampType> serializableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, org.apache.kafka.common.record.TimestampType> serializableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, org.apache.kafka.common.record.TimestampType>(serializableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.common.record.TimestampType, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(timestampTypeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator70 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator70, "");
        java.lang.String str73 = kafkaSpoutMessageIdComparatorConsumerRecord72.topic();
        org.apache.kafka.common.header.Headers headers74 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.common.header.Headers headers75 = kafkaSpoutMessageIdComparatorConsumerRecord72.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType14, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "KafkaSpout{acked=null, emitted=null}", headers75);
        java.util.Optional<java.lang.Integer> intOptional77 = kafkaSpoutMessageIdComparatorConsumerRecord76.leaderEpoch();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        java.util.Optional<java.lang.Integer> intOptional79 = kafkaSpoutMessageIdComparatorConsumerRecord76.leaderEpoch();
        java.lang.String str80 = kafkaSpoutMessageIdComparatorConsumerRecord76.value();
        int int81 = kafkaSpoutMessageIdComparatorConsumerRecord76.serializedKeySize();
        int int82 = kafkaSpoutMessageIdComparatorConsumerRecord76.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertNotNull(headers75);
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(intOptional79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str80, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers9 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers10 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.util.Optional<java.lang.Integer> intOptional12 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers13 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(headers13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.apache.kafka.common.record.TimestampType timestampType11 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(consumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.String str7 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType9 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>.Timer timer3 = genericDeclarationKafkaSpout0.commitTimer;
        int int4 = genericDeclarationKafkaSpout0.maxRetries;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = null;
        genericDeclarationKafkaSpout0.collector = spoutOutputCollector5;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.declareOutputFields(outputFieldsDeclarer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = kafkaSpoutMessageIdComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator7.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator12;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = offsetComparator12.compare(kafkaSpoutMessageId18, kafkaSpoutMessageId19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(charSequenceKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.kafka.common.record.TimestampType>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor5 = genericDeclarationKafkaSpout0.waitingToEmit;
        genericDeclarationKafkaSpout0.maxRetries = '4';
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer8 = genericDeclarationKafkaSpout0.kafkaConsumer;
        genericDeclarationKafkaSpout0.numUncommittedOffsets = 'a';
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor5);
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", 0, (long) 100, kafkaSpoutMessageIdComparator9, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.storm.topology.base.BaseComponent> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer6 = null;
        genericDeclarationKafkaSpout0.kafkaConsumer = genericDeclarationKafkaConsumer6;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional10 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType12 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator60 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType47, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator60, "hi!");
        int int63 = kafkaSpoutMessageIdComparatorConsumerRecord62.serializedKeySize();
        java.lang.String str64 = kafkaSpoutMessageIdComparatorConsumerRecord62.value();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25, "");
        org.apache.kafka.common.record.TimestampType timestampType28 = kafkaSpoutMessageIdComparatorConsumerRecord27.timestampType();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType28, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator44, "");
        org.apache.kafka.common.record.TimestampType timestampType47 = kafkaSpoutMessageIdComparatorConsumerRecord46.timestampType();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType47, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass52, (java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType14, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass33, timestampType47);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator60 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType47, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator60, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator60;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator64 = offsetComparator60.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator60;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId66 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId67 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int68 = offsetComparator60.compare(kafkaSpoutMessageId66, kafkaSpoutMessageId67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator64);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> serializableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> serializableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(serializableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers7 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers8 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType12 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int13 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> kafkaSpoutMessageIdComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> kafkaSpoutMessageIdComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>(kafkaSpoutMessageIdComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService4;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder4 = null;
        genericDeclarationKafkaSpout0.tuplesBuilder = genericDeclarationKafkaSpoutTuplesBuilder4;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder4 = genericDeclarationKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
        org.junit.Assert.assertNull(genericDeclarationKafkaSpoutTuplesBuilder4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str10 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        int int13 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecords7 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setWaitingToEmit(genericDeclarationConsumerRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> genericDeclarationKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence>();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> intOptionalKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Optional<java.lang.Integer>, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.topology.IComponent> kafkaSpoutMessageIdComparatorConsumerRecordKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>, org.apache.storm.topology.IComponent>();
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        java.lang.String str13 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        genericDeclarationKafkaSpout0.maxRetries = (byte) -1;
        boolean boolean3 = genericDeclarationKafkaSpout0.waitingToEmit();
        genericDeclarationKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = genericDeclarationKafkaSpout0.emitTupleIfNotEmitted(genericDeclarationConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7, "");
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord9.partition();
        org.apache.kafka.common.record.TimestampType timestampType11 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator26 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator26, "");
        org.apache.kafka.common.record.TimestampType timestampType29 = kafkaSpoutMessageIdComparatorConsumerRecord28.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator40 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator40, "");
        org.apache.kafka.common.record.TimestampType timestampType43 = kafkaSpoutMessageIdComparatorConsumerRecord42.timestampType();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType43, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass48, (java.lang.reflect.GenericDeclaration) wildcardClass50);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator59 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator59, "");
        org.apache.kafka.common.record.TimestampType timestampType62 = kafkaSpoutMessageIdComparatorConsumerRecord61.timestampType();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType62, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass67, (java.lang.reflect.GenericDeclaration) wildcardClass69);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType29, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass48, timestampType62);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator78 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator78, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator85 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord87 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator85, "");
        java.lang.String str88 = kafkaSpoutMessageIdComparatorConsumerRecord87.topic();
        org.apache.kafka.common.header.Headers headers89 = kafkaSpoutMessageIdComparatorConsumerRecord87.headers();
        org.apache.kafka.common.header.Headers headers90 = kafkaSpoutMessageIdComparatorConsumerRecord87.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord91 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType29, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator78, "KafkaSpout{acked=null, emitted=null}", headers90);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator92 = offsetComparator78.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator93 = offsetComparator78.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = offsetComparator78.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) -1, (long) (byte) 0, (long) (short) 10, timestampType11, 0L, (-1), 52, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator78, "KafkaSpout{acked=null, emitted=[]}");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId97 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId98 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int99 = offsetComparator78.compare(kafkaSpoutMessageId97, kafkaSpoutMessageId98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType29 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType29.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType43 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType43.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + timestampType62 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType62.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(headers89);
        org.junit.Assert.assertNotNull(headers90);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator92);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator93);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.topology.IRichSpout> timestampTypeEnumKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.topology.IRichSpout> timestampTypeEnumKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.topology.IRichSpout>(timestampTypeEnumKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable>();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator19;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId26 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = offsetComparator19.compare(kafkaSpoutMessageId26, kafkaSpoutMessageId27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.io.Serializable> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.io.Serializable>();
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.storm.topology.IRichSpout> headerIterableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7, "");
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord9.value();
        int int12 = kafkaSpoutMessageIdComparatorConsumerRecord9.serializedValueSize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparatorConsumerRecord9.key();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator3.thenComparing(kafkaSpoutMessageIdComparator13);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19, "");
        java.lang.String str22 = kafkaSpoutMessageIdComparatorConsumerRecord21.topic();
        org.apache.kafka.common.header.Headers headers23 = kafkaSpoutMessageIdComparatorConsumerRecord21.headers();
        java.lang.String str24 = kafkaSpoutMessageIdComparatorConsumerRecord21.toString();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparatorConsumerRecord21.key();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator25;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator13.thenComparing(kafkaSpoutMessageIdComparator25);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (-1), (long) '#', kafkaSpoutMessageIdComparator27, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator7, "");
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord9.partition();
        org.apache.kafka.common.record.TimestampType timestampType11 = kafkaSpoutMessageIdComparatorConsumerRecord9.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator18;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("hi!", (int) (short) 10, (long) 32, (long) (short) 0, timestampType11, (-1L), 97, 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18, "");
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId25 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = offsetComparator18.compare(kafkaSpoutMessageId25, kafkaSpoutMessageId26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer4 = null;
        genericDeclarationKafkaSpout0.kafkaConsumer = genericDeclarationKafkaConsumer4;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = genericDeclarationKafkaSpout0.emitted;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setAcked(topicPartition7, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = genericDeclarationKafkaSpout0.emitted;
        java.util.Map map4 = null;
        org.apache.storm.task.TopologyContext topologyContext5 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.open(map4, topologyContext5, spoutOutputCollector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams2);
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> typeKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(typeKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = genericDeclarationKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean4 = genericDeclarationKafkaSpout0.consumerAutoCommitMode;
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.Optional<java.lang.Integer>>.Timer timer4 = kafkaSpout0.new Timer(1L, (long) 52, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator14 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator14, "");
        org.apache.kafka.common.record.TimestampType timestampType17 = kafkaSpoutMessageIdComparatorConsumerRecord16.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator28, "");
        org.apache.kafka.common.record.TimestampType timestampType31 = kafkaSpoutMessageIdComparatorConsumerRecord30.timestampType();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType31, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass38);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator47 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47, "");
        org.apache.kafka.common.record.TimestampType timestampType50 = kafkaSpoutMessageIdComparatorConsumerRecord49.timestampType();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType50, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass55, (java.lang.reflect.GenericDeclaration) wildcardClass57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType17, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass36, timestampType50);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator63 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType50, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "hi!");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator63;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator63.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) (short) -1, 0L, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator63, "");
        int int70 = kafkaSpoutMessageIdComparatorConsumerRecord69.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + timestampType50 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType50.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.GenericDeclaration>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.topology.base.BaseRichSpout> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.topology.base.BaseRichSpout>();
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.Class<?>> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.Class<?>>();
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, org.apache.storm.topology.IRichSpout> genericDeclarationKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long14 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.Object> timerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.Object> timerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, java.lang.Object>(timerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator15, "");
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType32, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator48, "");
        org.apache.kafka.common.record.TimestampType timestampType51 = kafkaSpoutMessageIdComparatorConsumerRecord50.timestampType();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType51, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass56, (java.lang.reflect.GenericDeclaration) wildcardClass58);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType18, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass37, timestampType51);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator64 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", (int) (short) 0, (long) (byte) 1, (long) (short) 100, timestampType51, 0L, (int) (byte) 10, (int) (short) 100, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator64, "hi!");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator64.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator68 = kafkaSpoutMessageIdComparator3.thenComparing(kafkaSpoutMessageIdComparator67);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (int) 'a', (long) (short) 1, kafkaSpoutMessageIdComparator68, "");
        java.lang.String str71 = kafkaSpoutMessageIdComparatorConsumerRecord70.value();
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer1 = genericDeclarationKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor2 = genericDeclarationKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor3 = genericDeclarationKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer4 = null;
        genericDeclarationKafkaSpout0.kafkaConsumer = genericDeclarationKafkaConsumer4;
        boolean boolean6 = genericDeclarationKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer1);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor2);
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        long long12 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long13 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        long long14 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers15 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional16 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long17 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.Optional<java.lang.Integer>> serializableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.Optional<java.lang.Integer>> serializableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.Optional<java.lang.Integer>>(serializableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.common.record.TimestampType timestampType9 = kafkaSpoutMessageIdComparatorConsumerRecord8.timestampType();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord8.serializedValueSize();
        java.lang.String str11 = kafkaSpoutMessageIdComparatorConsumerRecord8.value();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord8.value();
        org.apache.kafka.common.record.TimestampType timestampType13 = kafkaSpoutMessageIdComparatorConsumerRecord8.timestampType();
        int int14 = kafkaSpoutMessageIdComparatorConsumerRecord8.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparatorConsumerRecord8.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) -1, (long) '4', kafkaSpoutMessageIdComparator15, "");
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout> baseComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6, "");
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedValueSize();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord10.topic();
        int int13 = kafkaSpoutMessageIdComparatorConsumerRecord10.serializedValueSize();
        long long14 = kafkaSpoutMessageIdComparatorConsumerRecord10.checksum();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = null;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet3;
        genericDeclarationKafkaSpout0.initialized = true;
        java.lang.String str7 = genericDeclarationKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.lang.reflect.AnnotatedElement> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener> timerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>>();
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.kafka.common.record.TimestampType> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.kafka.common.record.TimestampType> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.kafka.common.record.TimestampType>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType14, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass19, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        int int33 = kafkaSpoutMessageIdComparatorConsumerRecord31.serializedValueSize();
        java.lang.String str34 = kafkaSpoutMessageIdComparatorConsumerRecord31.value();
        java.lang.String str35 = kafkaSpoutMessageIdComparatorConsumerRecord31.value();
        org.apache.kafka.common.record.TimestampType timestampType36 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        int int37 = kafkaSpoutMessageIdComparatorConsumerRecord31.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = kafkaSpoutMessageIdComparatorConsumerRecord31.key();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator45 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator45, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (short) 100, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator45, "");
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator45;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = kafkaSpoutMessageIdComparator38.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator45);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = kafkaSpoutMessageIdComparator51.reversed();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", 52, (long) (short) 10, 1L, timestampType14, (long) 'a', 52, (int) '#', kafkaSpoutMessageIdComparator52, "KafkaSpout{acked=null, emitted=null}");
        java.lang.String str55 = kafkaSpoutMessageIdComparatorConsumerRecord54.value();
        int int56 = kafkaSpoutMessageIdComparatorConsumerRecord54.serializedKeySize();
        int int57 = kafkaSpoutMessageIdComparatorConsumerRecord54.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + timestampType36 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType36.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str55, "KafkaSpout{acked=null, emitted=null}");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>> timestampTypeEnumKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>> timestampTypeEnumKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>>(timestampTypeEnumKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.lang.String str12 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.lang.String str14 = kafkaSpoutMessageIdComparatorConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        java.lang.String str6 = kafkaSpoutMessageIdComparatorConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers7 = kafkaSpoutMessageIdComparatorConsumerRecord5.headers();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        long long9 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.CharSequence>.Timer>.Timer timer4 = kafkaSpout0.new Timer((long) (byte) 10, 100L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.topology.IRichSpout, java.lang.String> iRichSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.String> iRichSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.String>(iRichSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.IRichSpout> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long7 = kafkaSpoutMessageIdComparatorConsumerRecord5.checksum();
        long long8 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional9 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        long long10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional11 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(intOptional11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = genericDeclarationKafkaSpout0.retryService;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = genericDeclarationKafkaSpout0.collector;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.setAcked(topicPartition5, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.storm.topology.base.BaseComponent> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IRichSpout> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.reflect.Type type4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.reflect.Type> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.reflect.Type>("KafkaSpout{acked=null, emitted=[]}", (int) ' ', (-1L), "", type4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>("", 0, (long) (byte) 100, (java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "KafkaSpout{acked=null, emitted=[]}");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService1;
        long long3 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        genericDeclarationKafkaSpout0.retryService = kafkaSpoutRetryService4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = genericDeclarationKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>.Timer timer4 = kafkaSpout0.new Timer((long) '#', (long) 100, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        java.lang.String str7 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int8 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.lang.Class<?> wildcardClass10 = kafkaSpoutMessageIdComparatorConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        int int6 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationConsumerRecordItor1 = genericDeclarationKafkaSpout0.waitingToEmit;
        boolean boolean2 = genericDeclarationKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaConsumer3 = genericDeclarationKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig4 = null;
        genericDeclarationKafkaSpout0.kafkaSpoutConfig = genericDeclarationKafkaSpoutConfig4;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = genericDeclarationKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(genericDeclarationConsumerRecordItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(genericDeclarationKafkaConsumer3);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>>.KafkaSpoutConsumerRebalanceListener>.Timer timer4 = kafkaSpout0.new Timer((long) (byte) 100, 1L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.common.header.Headers, java.lang.reflect.GenericDeclaration> headersKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.lang.reflect.GenericDeclaration> headersKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.header.Headers, java.lang.reflect.GenericDeclaration>(headersKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Object>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        int int9 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        int int10 = kafkaSpoutMessageIdComparatorConsumerRecord5.partition();
        long long11 = kafkaSpoutMessageIdComparatorConsumerRecord5.offset();
        java.util.Optional<java.lang.Integer> intOptional12 = kafkaSpoutMessageIdComparatorConsumerRecord5.leaderEpoch();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11, "");
        org.apache.kafka.common.record.TimestampType timestampType14 = kafkaSpoutMessageIdComparatorConsumerRecord13.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator21, "");
        org.apache.kafka.common.record.TimestampType timestampType24 = kafkaSpoutMessageIdComparatorConsumerRecord23.timestampType();
        int int25 = kafkaSpoutMessageIdComparatorConsumerRecord23.serializedValueSize();
        java.lang.String str26 = kafkaSpoutMessageIdComparatorConsumerRecord23.value();
        int int27 = kafkaSpoutMessageIdComparatorConsumerRecord23.partition();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService29 = null;
        genericDeclarationKafkaSpout28.retryService = kafkaSpoutRetryService29;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray31 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32, kafkaSpoutMessageIdArray31);
        genericDeclarationKafkaSpout28.emitted = kafkaSpoutMessageIdSet32;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>("", (int) (byte) -1, 1L, 0L, timestampType14, (long) (short) -1, (int) 'a', (int) (short) 0, (java.lang.Object) int27, (java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator42 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator42, "");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator42.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator42;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=[]}", (-1), (long) ' ', (long) '#', timestampType14, 10L, 0, 32, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator42, "KafkaSpout{acked=null, emitted=null}");
        int int49 = kafkaSpoutMessageIdComparatorConsumerRecord48.serializedKeySize();
        int int50 = kafkaSpoutMessageIdComparatorConsumerRecord48.partition();
        long long51 = kafkaSpoutMessageIdComparatorConsumerRecord48.timestamp();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType24 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType24.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35L + "'", long51 == 35L);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = null;
        genericDeclarationKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = null;
        genericDeclarationKafkaSpout0.emitted = kafkaSpoutMessageIdSet3;
        boolean boolean5 = genericDeclarationKafkaSpout0.waitingToEmit();
        long long6 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        java.lang.String str7 = genericDeclarationKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = genericDeclarationKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7, "KafkaSpout{acked=null, emitted=null}");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3, "");
        org.apache.kafka.common.record.TimestampType timestampType6 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int7 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedValueSize();
        java.lang.String str8 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        java.lang.String str9 = kafkaSpoutMessageIdComparatorConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType10 = kafkaSpoutMessageIdComparatorConsumerRecord5.timestampType();
        int int11 = kafkaSpoutMessageIdComparatorConsumerRecord5.serializedKeySize();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparatorConsumerRecord5.key();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = kafkaSpoutMessageIdComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator13;
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Cloneable> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Cloneable>();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.topology.IComponent> timestampTypeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.common.record.TimestampType, org.apache.storm.topology.IComponent>();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator15, "");
        org.apache.kafka.common.record.TimestampType timestampType18 = kafkaSpoutMessageIdComparatorConsumerRecord17.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator29 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator29, "");
        org.apache.kafka.common.record.TimestampType timestampType32 = kafkaSpoutMessageIdComparatorConsumerRecord31.timestampType();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType32, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass39);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator48 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator48, "");
        org.apache.kafka.common.record.TimestampType timestampType51 = kafkaSpoutMessageIdComparatorConsumerRecord50.timestampType();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("", 100, 10L, (long) 10, timestampType51, (long) (short) 10, (int) (short) -1, (int) '#', (java.lang.reflect.GenericDeclaration) wildcardClass56, (java.lang.reflect.GenericDeclaration) wildcardClass58);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType> typeConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.common.record.TimestampType>("hi!", (int) (byte) 0, (long) (byte) 10, 10L, timestampType18, (long) (short) 10, (int) (short) 0, (int) (byte) 0, (java.lang.reflect.Type) wildcardClass37, timestampType51);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (-1), (long) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator74 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator74, "");
        java.lang.String str77 = kafkaSpoutMessageIdComparatorConsumerRecord76.topic();
        org.apache.kafka.common.header.Headers headers78 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.common.header.Headers headers79 = kafkaSpoutMessageIdComparatorConsumerRecord76.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("KafkaSpout{acked=null, emitted=null}", 100, (long) (byte) -1, (long) (byte) 1, timestampType18, (java.lang.Long) 100L, 0, (int) (byte) 10, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67, "KafkaSpout{acked=null, emitted=null}", headers79);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator87 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) (short) 0, (java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator87, "");
        java.lang.String str90 = kafkaSpoutMessageIdComparatorConsumerRecord89.topic();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator91 = kafkaSpoutMessageIdComparatorConsumerRecord89.key();
        org.apache.kafka.common.header.Headers headers92 = kafkaSpoutMessageIdComparatorConsumerRecord89.headers();
        long long93 = kafkaSpoutMessageIdComparatorConsumerRecord89.checksum();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator94 = kafkaSpoutMessageIdComparatorConsumerRecord89.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdComparatorConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>("", (int) (byte) 10, (long) 1, (long) 32, timestampType18, (long) 32, 97, (int) (byte) 10, kafkaSpoutMessageIdComparator94, "KafkaSpout{acked=null, emitted=null}");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator97 = kafkaSpoutMessageIdComparator94.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator98 = kafkaSpoutMessageIdComparator97.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator99 = kafkaSpoutMessageIdComparator97.reversed();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator91);
        org.junit.Assert.assertNotNull(headers92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-1L) + "'", long93 == (-1L));
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator94);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator97);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator98);
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator99);
    }
}

