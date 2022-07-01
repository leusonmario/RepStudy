import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType10, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj14, (java.io.Serializable) 1);
        long long17 = objConsumerRecord16.timestamp();
        long long18 = objConsumerRecord16.timestamp();
        int int19 = objConsumerRecord16.serializedKeySize();
        java.lang.Object obj20 = objConsumerRecord16.key();
        org.apache.kafka.common.header.Headers headers21 = objConsumerRecord16.headers();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        java.lang.String str37 = objConsumerRecord36.toString();
        java.lang.String str38 = objConsumerRecord36.toString();
        java.lang.Class<?> wildcardClass39 = objConsumerRecord36.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass39);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (short) 100, (long) 100, (java.lang.Object) objConsumerRecord16, (java.io.Serializable) (short) -1);
        int int42 = objConsumerRecord16.partition();
        long long43 = objConsumerRecord16.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType48 = null;
        java.lang.Object obj52 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType48, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj52, (java.io.Serializable) 1);
        long long55 = objConsumerRecord54.timestamp();
        long long56 = objConsumerRecord54.timestamp();
        int int57 = objConsumerRecord54.serializedKeySize();
        org.apache.kafka.common.header.Headers headers58 = objConsumerRecord54.headers();
        java.lang.Object obj59 = objConsumerRecord54.key();
        java.lang.Class<?> wildcardClass60 = objConsumerRecord54.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", (int) (short) 1, (long) (short) 1, (java.lang.Object) objConsumerRecord16, (java.io.Serializable) wildcardClass60);
        java.lang.String str62 = objConsumerRecord61.toString();
        long long63 = objConsumerRecord61.checksum();
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(headers21);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str37, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str38, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(headers58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #), partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str62, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #), partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        java.lang.Object obj28 = objConsumerRecord26.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType12, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord26, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType4, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord30, (java.io.Serializable) 10.0f);
        java.lang.String str33 = objConsumerRecord32.topic();
        long long34 = objConsumerRecord32.offset();
        int int35 = objConsumerRecord32.partition();
        java.lang.String str36 = objConsumerRecord32.topic();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord32.leaderEpoch();
        long long38 = objConsumerRecord32.checksum();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord32.leaderEpoch();
        java.lang.Object obj40 = objConsumerRecord32.key();
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str33, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str36, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        java.lang.Object obj9 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj9, (java.io.Serializable) (byte) 100);
        java.lang.Object obj12 = objConsumerRecord11.key();
        java.lang.String str13 = objConsumerRecord11.toString();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord11.timestampType();
        long long15 = objConsumerRecord11.checksum();
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        long long28 = objConsumerRecord26.timestamp();
        int int29 = objConsumerRecord26.serializedKeySize();
        org.apache.kafka.common.header.Headers headers30 = objConsumerRecord26.headers();
        java.lang.Object obj31 = objConsumerRecord26.key();
        java.lang.Class<?> wildcardClass32 = objConsumerRecord26.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, (long) (short) 10, (java.lang.Object) long15, (java.io.Serializable) wildcardClass32);
        int int34 = objConsumerRecord33.serializedValueSize();
        int int35 = objConsumerRecord33.serializedKeySize();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) 10, 32L, (java.lang.Object) objConsumerRecord33, (java.io.Serializable) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.apache.kafka.common.record.TimestampType timestampType38 = objConsumerRecord37.timestampType();
        int int39 = objConsumerRecord37.serializedValueSize();
        long long40 = objConsumerRecord37.checksum();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(headers30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType38 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType38.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        int int15 = objConsumerRecord13.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) false);
        java.lang.String str19 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord13.timestampType();
        java.lang.Object obj21 = objConsumerRecord13.key();
        int int22 = objConsumerRecord13.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(timestampType20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.timestamp();
        long long20 = objConsumerRecord18.timestamp();
        int int21 = objConsumerRecord18.serializedKeySize();
        long long22 = objConsumerRecord18.timestamp();
        long long23 = objConsumerRecord18.offset();
        long long24 = objConsumerRecord18.offset();
        java.util.Optional<java.lang.Integer> intOptional25 = objConsumerRecord18.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        long long37 = objConsumerRecord36.timestamp();
        java.util.Optional<java.lang.Integer> intOptional38 = objConsumerRecord36.leaderEpoch();
        long long39 = objConsumerRecord36.checksum();
        java.lang.String str40 = objConsumerRecord36.topic();
        java.io.Serializable serializable41 = objConsumerRecord36.value();
        org.apache.kafka.common.record.TimestampType timestampType42 = objConsumerRecord36.timestampType();
        java.lang.Class<?> wildcardClass43 = objConsumerRecord36.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1)", (int) ' ', (long) 'a', 97L, timestampType4, (long) 32, (-1), 52, (java.lang.Object) objConsumerRecord18, (java.io.Serializable) wildcardClass43);
        org.apache.kafka.common.header.Headers headers45 = objConsumerRecord44.headers();
        int int46 = objConsumerRecord44.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(intOptional25);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertNotNull(intOptional38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + 1 + "'", serializable41, 1);
        org.junit.Assert.assertNull(timestampType42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.timestamp();
        long long20 = objConsumerRecord18.timestamp();
        int int21 = objConsumerRecord18.serializedKeySize();
        java.lang.Object obj22 = objConsumerRecord18.key();
        org.apache.kafka.common.header.Headers headers23 = objConsumerRecord18.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord18.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '4', (long) (short) 100, (java.lang.Object) (-1.0d), (java.io.Serializable) (-1.0d));
        java.lang.String str31 = objConsumerRecord30.topic();
        java.lang.Object obj32 = objConsumerRecord30.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> intOptionalConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1)", (int) '4', (long) (short) 1, (long) '4', timestampType4, (long) (short) 10, (int) (byte) -1, 52, intOptional24, objConsumerRecord30);
        java.lang.String str34 = objConsumerRecord30.topic();
        long long35 = objConsumerRecord30.timestamp();
        int int36 = objConsumerRecord30.partition();
        int int37 = objConsumerRecord30.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertNotNull(intOptional24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str31, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str34, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.offset();
        long long12 = objConsumerRecord10.checksum();
        long long13 = objConsumerRecord10.offset();
        int int14 = objConsumerRecord10.serializedKeySize();
        long long15 = objConsumerRecord10.timestamp();
        int int16 = objConsumerRecord10.serializedKeySize();
        int int17 = objConsumerRecord10.serializedKeySize();
        java.lang.String str18 = objConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        java.io.Serializable serializable13 = objConsumerRecord10.value();
        java.lang.String str14 = objConsumerRecord10.topic();
        java.lang.String str15 = objConsumerRecord10.toString();
        int int16 = objConsumerRecord10.serializedKeySize();
        int int17 = objConsumerRecord10.partition();
        long long18 = objConsumerRecord10.offset();
        long long19 = objConsumerRecord10.offset();
        java.io.Serializable serializable20 = objConsumerRecord10.value();
        java.lang.String str21 = objConsumerRecord10.topic();
        int int22 = objConsumerRecord10.serializedKeySize();
        java.lang.String str23 = objConsumerRecord10.topic();
        org.apache.kafka.common.header.Headers headers24 = objConsumerRecord10.headers();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + 1 + "'", serializable13, 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + 1 + "'", serializable20, 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(headers24);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.offset();
        java.lang.String str13 = objConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers14 = objConsumerRecord10.headers();
        java.lang.String str15 = objConsumerRecord10.toString();
        int int16 = objConsumerRecord10.serializedValueSize();
        int int17 = objConsumerRecord10.serializedValueSize();
        int int18 = objConsumerRecord10.partition();
        int int19 = objConsumerRecord10.serializedValueSize();
        long long20 = objConsumerRecord10.checksum();
        int int21 = objConsumerRecord10.serializedValueSize();
        int int22 = objConsumerRecord10.serializedValueSize();
        long long23 = objConsumerRecord10.checksum();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.common.record.TimestampType timestampType22 = null;
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        java.lang.Object obj35 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType31, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj35, (java.io.Serializable) 1);
        long long38 = objConsumerRecord37.timestamp();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord37.leaderEpoch();
        long long40 = objConsumerRecord37.offset();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> charSequenceConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("", (int) '4', (long) 'a', 0L, timestampType22, 10L, (-1), (int) (short) 0, (java.lang.CharSequence) "hi!", objConsumerRecord37);
        java.lang.Class<?> wildcardClass42 = charSequenceConsumerRecord41.getClass();
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        java.lang.Object obj51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType47, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj51, (java.io.Serializable) 1);
        long long54 = objConsumerRecord53.timestamp();
        java.lang.Object obj55 = objConsumerRecord53.key();
        long long56 = objConsumerRecord53.checksum();
        java.lang.Class<?> wildcardClass57 = objConsumerRecord53.getClass();
        org.apache.kafka.common.record.TimestampType timestampType62 = null;
        java.lang.Object obj69 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj69, (java.io.Serializable) (byte) 100);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) 100, (long) (byte) 10, (long) 0, timestampType62, (-1L), 1, (int) (short) 1, (java.lang.Object) 'a', (java.io.Serializable) (short) 1);
        org.apache.kafka.common.header.Headers headers74 = objConsumerRecord73.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>("hi!", 10, (long) (-1), 1L, timestampType14, (java.lang.Long) 52L, (int) (byte) 1, 10, (java.lang.reflect.GenericDeclaration) wildcardClass42, (java.lang.reflect.AnnotatedElement) wildcardClass57, headers74);
        org.apache.kafka.common.record.TimestampType timestampType80 = null;
        java.lang.Object obj84 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType80, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj84, (java.io.Serializable) 1);
        java.lang.String str87 = objConsumerRecord86.toString();
        java.util.Optional<java.lang.Integer> intOptional88 = objConsumerRecord86.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) 'a', (long) 100, timestampType4, (java.lang.Long) 100L, (int) (byte) 10, (int) (byte) 1, obj8, (java.io.Serializable) 1, headers74, intOptional88);
        long long90 = objConsumerRecord89.timestamp();
        java.util.Optional<java.lang.Integer> intOptional91 = objConsumerRecord89.leaderEpoch();
        long long92 = objConsumerRecord89.offset();
        java.io.Serializable serializable93 = objConsumerRecord89.value();
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str87, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional88);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 100L + "'", long90 == 100L);
        org.junit.Assert.assertNotNull(intOptional91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 97L + "'", long92 == 97L);
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 1 + "'", serializable93, 1);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        java.lang.Object obj14 = objConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord10.headers();
        org.apache.kafka.common.header.Headers headers16 = objConsumerRecord10.headers();
        int int17 = objConsumerRecord10.serializedValueSize();
        java.lang.Object obj18 = objConsumerRecord10.key();
        java.lang.String str19 = objConsumerRecord10.toString();
        long long20 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = objConsumerRecord10.timestampType();
        java.lang.Object obj22 = objConsumerRecord10.key();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNull(timestampType21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        java.lang.String str14 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord10.leaderEpoch();
        int int16 = objConsumerRecord10.serializedKeySize();
        int int17 = objConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType13 = null;
        java.lang.Object obj17 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType13, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj17, (java.io.Serializable) 1);
        long long20 = objConsumerRecord19.timestamp();
        java.util.Optional<java.lang.Integer> intOptional21 = objConsumerRecord19.leaderEpoch();
        long long22 = objConsumerRecord19.offset();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> charSequenceConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("", (int) '4', (long) 'a', 0L, timestampType4, 10L, (-1), (int) (short) 0, (java.lang.CharSequence) "hi!", objConsumerRecord19);
        long long24 = objConsumerRecord19.checksum();
        long long25 = objConsumerRecord19.timestamp();
        java.lang.String str26 = objConsumerRecord19.toString();
        int int27 = objConsumerRecord19.partition();
        java.lang.String str28 = objConsumerRecord19.topic();
        org.apache.kafka.common.record.TimestampType timestampType29 = objConsumerRecord19.timestampType();
        int int30 = objConsumerRecord19.partition();
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str26, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(timestampType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        java.lang.Object obj9 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj9, (java.io.Serializable) (byte) 100);
        java.lang.Object obj12 = objConsumerRecord11.key();
        java.lang.String str13 = objConsumerRecord11.toString();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord11.timestampType();
        long long15 = objConsumerRecord11.checksum();
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        long long28 = objConsumerRecord26.timestamp();
        int int29 = objConsumerRecord26.serializedKeySize();
        org.apache.kafka.common.header.Headers headers30 = objConsumerRecord26.headers();
        java.lang.Object obj31 = objConsumerRecord26.key();
        java.lang.Class<?> wildcardClass32 = objConsumerRecord26.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, (long) (short) 10, (java.lang.Object) long15, (java.io.Serializable) wildcardClass32);
        java.lang.String str34 = objConsumerRecord33.topic();
        java.lang.Object obj35 = objConsumerRecord33.key();
        long long36 = objConsumerRecord33.offset();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord33.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType38 = objConsumerRecord33.timestampType();
        java.lang.Object obj50 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj50, (java.io.Serializable) (byte) 100);
        java.lang.Object obj53 = objConsumerRecord52.key();
        java.lang.String str54 = objConsumerRecord52.toString();
        org.apache.kafka.common.record.TimestampType timestampType55 = objConsumerRecord52.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType55, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        org.apache.kafka.common.record.TimestampType timestampType69 = null;
        java.lang.Object obj73 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType69, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj73, (java.io.Serializable) 1);
        long long76 = objConsumerRecord75.timestamp();
        java.util.Optional<java.lang.Integer> intOptional77 = objConsumerRecord75.leaderEpoch();
        int int78 = objConsumerRecord75.serializedValueSize();
        java.lang.String str79 = objConsumerRecord75.topic();
        java.util.Optional<java.lang.Integer> intOptional80 = objConsumerRecord75.leaderEpoch();
        org.apache.kafka.common.header.Headers headers81 = objConsumerRecord75.headers();
        java.lang.Object obj82 = objConsumerRecord75.key();
        org.apache.kafka.common.record.TimestampType timestampType83 = objConsumerRecord75.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = -1)", (int) '4', (long) (byte) 100, 52L, timestampType55, (long) (short) 0, 100, 0, (java.lang.Object) objConsumerRecord75, (java.io.Serializable) 10L);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100)", (int) (short) 1, (long) 10, (java.lang.Object) objConsumerRecord33, (java.io.Serializable) "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = -1)");
        java.lang.Object obj87 = objConsumerRecord86.key();
        int int88 = objConsumerRecord86.partition();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(headers30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + timestampType38 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType38.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str54, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType55 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType55.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertNotNull(headers81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(timestampType83);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.offset();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        java.lang.String str14 = objConsumerRecord10.toString();
        long long15 = objConsumerRecord10.offset();
        long long16 = objConsumerRecord10.timestamp();
        long long17 = objConsumerRecord10.offset();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord10.headers();
        int int19 = objConsumerRecord10.partition();
        java.lang.Class<?> wildcardClass20 = objConsumerRecord10.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        java.lang.Object obj28 = objConsumerRecord26.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType12, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord26, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType4, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord30, (java.io.Serializable) 10.0f);
        int int33 = objConsumerRecord32.partition();
        java.lang.Object obj34 = objConsumerRecord32.key();
        org.apache.kafka.common.record.TimestampType timestampType35 = objConsumerRecord32.timestampType();
        int int36 = objConsumerRecord32.partition();
        int int37 = objConsumerRecord32.serializedKeySize();
        long long38 = objConsumerRecord32.offset();
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertNull(timestampType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        java.lang.Object obj6 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj6, (java.io.Serializable) (byte) 100);
        java.lang.Object obj9 = objConsumerRecord8.key();
        java.lang.String str10 = objConsumerRecord8.toString();
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord8.timestampType();
        long long12 = objConsumerRecord8.checksum();
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        java.lang.Object obj21 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType17, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj21, (java.io.Serializable) 1);
        long long24 = objConsumerRecord23.timestamp();
        long long25 = objConsumerRecord23.timestamp();
        int int26 = objConsumerRecord23.serializedKeySize();
        org.apache.kafka.common.header.Headers headers27 = objConsumerRecord23.headers();
        java.lang.Object obj28 = objConsumerRecord23.key();
        java.lang.Class<?> wildcardClass29 = objConsumerRecord23.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, (long) (short) 10, (java.lang.Object) long12, (java.io.Serializable) wildcardClass29);
        java.lang.String str31 = objConsumerRecord30.topic();
        java.lang.Object obj32 = objConsumerRecord30.key();
        java.lang.String str33 = objConsumerRecord30.toString();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str10, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(headers27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1L) + "'", obj32, (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str33, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        java.lang.Object obj28 = objConsumerRecord26.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType12, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord26, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType4, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord30, (java.io.Serializable) 10.0f);
        java.lang.String str33 = objConsumerRecord32.topic();
        long long34 = objConsumerRecord32.offset();
        int int35 = objConsumerRecord32.partition();
        java.lang.String str36 = objConsumerRecord32.topic();
        java.lang.Object obj37 = objConsumerRecord32.key();
        java.lang.Object obj38 = objConsumerRecord32.key();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord32.leaderEpoch();
        int int40 = objConsumerRecord32.partition();
        int int41 = objConsumerRecord32.partition();
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str33, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str36, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        java.lang.Object obj7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj7, (java.io.Serializable) (byte) 100);
        java.lang.Object obj10 = objConsumerRecord9.key();
        java.lang.String str11 = objConsumerRecord9.toString();
        long long12 = objConsumerRecord9.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType13 = objConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType21 = null;
        org.apache.kafka.common.record.TimestampType timestampType29 = null;
        java.lang.Object obj33 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType29, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj33, (java.io.Serializable) 1);
        long long36 = objConsumerRecord35.timestamp();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord35.leaderEpoch();
        long long38 = objConsumerRecord35.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType21, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord35, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional41 = objConsumerRecord35.leaderEpoch();
        java.lang.String str42 = objConsumerRecord35.topic();
        java.lang.Object obj43 = objConsumerRecord35.key();
        java.lang.String str44 = objConsumerRecord35.toString();
        java.lang.String str45 = objConsumerRecord35.topic();
        org.apache.kafka.common.header.Headers headers46 = objConsumerRecord35.headers();
        long long47 = objConsumerRecord35.offset();
        org.apache.kafka.common.record.TimestampType timestampType48 = objConsumerRecord35.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType53, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType60 = objConsumerRecord59.timestampType();
        long long61 = objConsumerRecord59.timestamp();
        java.util.Optional<java.lang.Integer> intOptional62 = objConsumerRecord59.leaderEpoch();
        long long63 = objConsumerRecord59.checksum();
        org.apache.kafka.common.header.Headers headers64 = objConsumerRecord59.headers();
        long long65 = objConsumerRecord59.checksum();
        java.lang.Class<?> wildcardClass66 = objConsumerRecord59.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false), partition = 32, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType))", (-1), 0L, 52L, timestampType13, 1L, 0, 35, (java.lang.Object) objConsumerRecord35, (java.io.Serializable) wildcardClass66);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str11, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str44, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(headers46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(timestampType48);
        org.junit.Assert.assertNull(timestampType60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(intOptional62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(headers64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj11, (java.io.Serializable) (byte) 100);
        java.lang.Object obj14 = objConsumerRecord13.key();
        java.lang.String str15 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType24 = null;
        java.lang.Object obj28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType24, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj28, (java.io.Serializable) 1);
        long long31 = objConsumerRecord30.offset();
        long long32 = objConsumerRecord30.checksum();
        org.apache.kafka.common.header.Headers headers33 = objConsumerRecord30.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) (short) 1, (long) 0, timestampType16, 10L, 97, (int) '4', (java.lang.Object) headers33, (java.io.Serializable) 0.0d);
        org.apache.kafka.common.record.TimestampType timestampType43 = null;
        java.lang.Object obj47 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType43, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj47, (java.io.Serializable) 1);
        java.lang.String str50 = objConsumerRecord49.toString();
        long long51 = objConsumerRecord49.offset();
        org.apache.kafka.common.header.Headers headers52 = objConsumerRecord49.headers();
        java.lang.String str53 = objConsumerRecord49.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (int) 'a', 35L, (long) 0, timestampType16, 52L, (int) '#', 10, (java.lang.Object) objConsumerRecord49, (java.io.Serializable) true);
        int int56 = objConsumerRecord55.partition();
        java.lang.String str57 = objConsumerRecord55.topic();
        int int58 = objConsumerRecord55.partition();
        org.apache.kafka.common.header.Headers headers59 = objConsumerRecord55.headers();
        java.lang.String str60 = objConsumerRecord55.toString();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str50, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str53, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str57, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNotNull(headers59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 97, leaderEpoch = null, offset = 35, NoTimestampType = 0, serialized key size = 35, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)" + "'", str60, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 97, leaderEpoch = null, offset = 35, NoTimestampType = 0, serialized key size = 35, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)");
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        int int13 = objConsumerRecord10.serializedValueSize();
        java.lang.String str14 = objConsumerRecord10.topic();
        java.lang.Object obj15 = objConsumerRecord10.key();
        long long16 = objConsumerRecord10.checksum();
        java.lang.Object obj17 = objConsumerRecord10.key();
        long long18 = objConsumerRecord10.offset();
        long long19 = objConsumerRecord10.offset();
        int int20 = objConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.offset();
        long long12 = objConsumerRecord10.checksum();
        long long13 = objConsumerRecord10.offset();
        int int14 = objConsumerRecord10.serializedKeySize();
        long long15 = objConsumerRecord10.timestamp();
        java.lang.Object obj16 = objConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers17 = objConsumerRecord10.headers();
        int int18 = objConsumerRecord10.serializedKeySize();
        java.lang.String str19 = objConsumerRecord10.toString();
        int int20 = objConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        long long13 = objConsumerRecord10.timestamp();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        long long15 = objConsumerRecord10.offset();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord10.timestampType();
        int int17 = objConsumerRecord10.serializedValueSize();
        long long18 = objConsumerRecord10.offset();
        long long19 = objConsumerRecord10.checksum();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 1 + "'", serializable14, 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.offset();
        java.lang.String str13 = objConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers14 = objConsumerRecord10.headers();
        java.lang.String str15 = objConsumerRecord10.toString();
        int int16 = objConsumerRecord10.serializedValueSize();
        int int17 = objConsumerRecord10.serializedValueSize();
        java.lang.String str18 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional19 = objConsumerRecord10.leaderEpoch();
        int int20 = objConsumerRecord10.partition();
        java.lang.String str21 = objConsumerRecord10.toString();
        int int22 = objConsumerRecord10.partition();
        java.lang.Object obj23 = objConsumerRecord10.key();
        int int24 = objConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        java.lang.Object obj3 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj3, (java.io.Serializable) (byte) 100);
        java.lang.Object obj6 = objConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType7 = objConsumerRecord5.timestampType();
        long long8 = objConsumerRecord5.timestamp();
        int int9 = objConsumerRecord5.serializedKeySize();
        java.lang.Object obj10 = objConsumerRecord5.key();
        int int11 = objConsumerRecord5.partition();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        org.apache.kafka.common.record.TimestampType timestampType11 = null;
        org.apache.kafka.common.record.TimestampType timestampType19 = null;
        java.lang.Object obj23 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType19, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj23, (java.io.Serializable) 1);
        long long26 = objConsumerRecord25.timestamp();
        java.util.Optional<java.lang.Integer> intOptional27 = objConsumerRecord25.leaderEpoch();
        long long28 = objConsumerRecord25.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType11, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord25, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional31 = objConsumerRecord25.leaderEpoch();
        java.lang.Object obj39 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj39, (java.io.Serializable) (byte) 100);
        java.lang.Object obj42 = objConsumerRecord41.key();
        java.lang.String str43 = objConsumerRecord41.toString();
        org.apache.kafka.common.record.TimestampType timestampType44 = objConsumerRecord41.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType44, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.kafka.common.record.TimestampType> intOptionalConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, org.apache.kafka.common.record.TimestampType>("", (-1), (long) (byte) -1, intOptional31, timestampType44);
        java.lang.Object obj55 = null;
        org.apache.kafka.common.record.TimestampType timestampType60 = null;
        java.lang.Object obj64 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType60, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj64, (java.io.Serializable) 1);
        java.lang.String str67 = objConsumerRecord66.toString();
        long long68 = objConsumerRecord66.offset();
        org.apache.kafka.common.header.Headers headers69 = objConsumerRecord66.headers();
        java.lang.String str70 = objConsumerRecord66.toString();
        long long71 = objConsumerRecord66.offset();
        long long72 = objConsumerRecord66.checksum();
        int int73 = objConsumerRecord66.partition();
        java.lang.Class<?> wildcardClass74 = objConsumerRecord66.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)", 100, (long) 35, (long) ' ', timestampType44, (long) '4', 35, (int) (short) 0, obj55, (java.io.Serializable) wildcardClass74);
        org.apache.kafka.common.record.TimestampType timestampType76 = objConsumerRecord75.timestampType();
        long long77 = objConsumerRecord75.offset();
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertNotNull(intOptional27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertNotNull(intOptional31);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str43, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType44 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType44.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str67, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNotNull(headers69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str70, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + timestampType76 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType76.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 35L + "'", long77 == 35L);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        long long13 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord10.timestampType();
        long long15 = objConsumerRecord10.timestamp();
        int int16 = objConsumerRecord10.serializedValueSize();
        long long17 = objConsumerRecord10.offset();
        org.apache.kafka.common.record.TimestampType timestampType18 = objConsumerRecord10.timestampType();
        int int19 = objConsumerRecord10.partition();
        long long20 = objConsumerRecord10.offset();
        java.io.Serializable serializable21 = objConsumerRecord10.value();
        long long22 = objConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + 1 + "'", serializable21, 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        long long13 = objConsumerRecord10.timestamp();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        long long15 = objConsumerRecord10.offset();
        long long16 = objConsumerRecord10.timestamp();
        java.io.Serializable serializable17 = objConsumerRecord10.value();
        org.apache.kafka.common.record.TimestampType timestampType18 = objConsumerRecord10.timestampType();
        long long19 = objConsumerRecord10.offset();
        long long20 = objConsumerRecord10.offset();
        java.util.Optional<java.lang.Integer> intOptional21 = objConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers22 = objConsumerRecord10.headers();
        java.lang.String str23 = objConsumerRecord10.topic();
        java.lang.String str24 = objConsumerRecord10.toString();
        java.lang.String str25 = objConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 1 + "'", serializable14, 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertNotNull(headers22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str24, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.offset();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        java.lang.String str14 = objConsumerRecord10.toString();
        long long15 = objConsumerRecord10.offset();
        long long16 = objConsumerRecord10.checksum();
        int int17 = objConsumerRecord10.partition();
        int int18 = objConsumerRecord10.serializedKeySize();
        int int19 = objConsumerRecord10.partition();
        java.io.Serializable serializable20 = objConsumerRecord10.value();
        org.apache.kafka.common.record.TimestampType timestampType21 = objConsumerRecord10.timestampType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = timestampType21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + 1 + "'", serializable20, 1);
        org.junit.Assert.assertNull(timestampType21);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers14 = objConsumerRecord10.headers();
        int int15 = objConsumerRecord10.serializedKeySize();
        long long16 = objConsumerRecord10.timestamp();
        long long17 = objConsumerRecord10.checksum();
        java.lang.String str18 = objConsumerRecord10.topic();
        java.lang.String str19 = objConsumerRecord10.toString();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType17 = objConsumerRecord13.timestampType();
        long long18 = objConsumerRecord13.offset();
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord13.timestampType();
        int int20 = objConsumerRecord13.serializedKeySize();
        long long21 = objConsumerRecord13.checksum();
        int int22 = objConsumerRecord13.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        java.lang.String str37 = objConsumerRecord36.toString();
        java.util.Optional<java.lang.Integer> intOptional38 = objConsumerRecord36.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord36.leaderEpoch();
        long long40 = objConsumerRecord36.offset();
        int int41 = objConsumerRecord36.serializedKeySize();
        java.lang.Object obj42 = objConsumerRecord36.key();
        int int43 = objConsumerRecord36.serializedValueSize();
        java.lang.String str44 = objConsumerRecord36.toString();
        org.apache.kafka.common.record.TimestampType timestampType52 = null;
        java.lang.Object obj56 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType52, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj56, (java.io.Serializable) 1);
        long long59 = objConsumerRecord58.timestamp();
        java.util.Optional<java.lang.Integer> intOptional60 = objConsumerRecord58.leaderEpoch();
        long long61 = objConsumerRecord58.checksum();
        org.apache.kafka.common.record.TimestampType timestampType62 = objConsumerRecord58.timestampType();
        java.lang.Object obj69 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj69, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType76 = null;
        java.lang.Object obj80 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType76, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj80, (java.io.Serializable) 1);
        long long83 = objConsumerRecord82.timestamp();
        java.lang.Object obj84 = objConsumerRecord82.key();
        long long85 = objConsumerRecord82.checksum();
        java.lang.Class<?> wildcardClass86 = objConsumerRecord82.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord87 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj69, (java.io.Serializable) wildcardClass86);
        java.lang.Object obj88 = objConsumerRecord87.key();
        long long89 = objConsumerRecord87.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType90 = objConsumerRecord87.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType91 = objConsumerRecord87.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 0, (-1L), (java.lang.Object) objConsumerRecord58, (java.io.Serializable) timestampType91);
        java.lang.Class<?> wildcardClass93 = timestampType91.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord94 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 0, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = Optional.empty, value = 100)", (int) (byte) 1, 52L, (java.lang.Object) objConsumerRecord36, (java.io.Serializable) timestampType91);
        java.io.Serializable serializable95 = objConsumerRecord94.value();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 0, null = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 10, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 0)", (int) (short) 10, (long) 0, (java.lang.Object) int22, serializable95);
        org.apache.kafka.common.record.TimestampType timestampType97 = objConsumerRecord96.timestampType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str37, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional38);
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str44, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertNotNull(intOptional60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNull(timestampType62);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 52L + "'", long83 == 52L);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType90 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType90.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType91 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType91.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + serializable95 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable95.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType97 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType97.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        long long14 = objConsumerRecord10.timestamp();
        long long15 = objConsumerRecord10.offset();
        long long16 = objConsumerRecord10.offset();
        java.util.Optional<java.lang.Integer> intOptional17 = objConsumerRecord10.leaderEpoch();
        long long18 = objConsumerRecord10.offset();
        java.lang.String str19 = objConsumerRecord10.topic();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord10.timestampType();
        java.io.Serializable serializable21 = objConsumerRecord10.value();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(intOptional17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(timestampType20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + 1 + "'", serializable21, 1);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '4', (long) (short) 100, (java.lang.Object) (-1.0d), (java.io.Serializable) (-1.0d));
        java.lang.Object obj6 = objConsumerRecord5.key();
        java.lang.String str7 = objConsumerRecord5.topic();
        java.io.Serializable serializable8 = objConsumerRecord5.value();
        long long9 = objConsumerRecord5.offset();
        java.lang.Object obj10 = objConsumerRecord5.key();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str7, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8, (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType15, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj19, (java.io.Serializable) 1);
        long long22 = objConsumerRecord21.timestamp();
        java.util.Optional<java.lang.Integer> intOptional23 = objConsumerRecord21.leaderEpoch();
        long long24 = objConsumerRecord21.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType7, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord21, (java.io.Serializable) '#');
        java.io.Serializable serializable27 = objConsumerRecord26.value();
        org.apache.kafka.common.record.TimestampType timestampType28 = objConsumerRecord26.timestampType();
        java.lang.String str29 = objConsumerRecord26.toString();
        org.apache.kafka.common.record.TimestampType timestampType34 = null;
        org.apache.kafka.common.record.TimestampType timestampType42 = null;
        java.lang.Object obj46 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType42, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj46, (java.io.Serializable) 1);
        long long49 = objConsumerRecord48.timestamp();
        java.util.Optional<java.lang.Integer> intOptional50 = objConsumerRecord48.leaderEpoch();
        long long51 = objConsumerRecord48.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType34, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord48, (java.io.Serializable) '#');
        java.lang.Class<?> wildcardClass54 = objConsumerRecord53.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 32, (long) '#', (java.lang.Object) objConsumerRecord26, (java.io.Serializable) wildcardClass54);
        int int56 = objConsumerRecord55.serializedValueSize();
        int int57 = objConsumerRecord55.serializedValueSize();
        java.io.Serializable serializable58 = objConsumerRecord55.value();
        long long59 = objConsumerRecord55.offset();
        long long60 = objConsumerRecord55.checksum();
        int int61 = objConsumerRecord55.partition();
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + '#' + "'", serializable27, '#');
        org.junit.Assert.assertNull(timestampType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)" + "'", str29, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
        org.junit.Assert.assertNotNull(intOptional50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(serializable58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 35L + "'", long59 == 35L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        java.util.Optional<java.lang.Integer> intOptional28 = objConsumerRecord26.leaderEpoch();
        long long29 = objConsumerRecord26.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType12, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord26, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional32 = objConsumerRecord26.leaderEpoch();
        java.lang.String str33 = objConsumerRecord26.topic();
        long long34 = objConsumerRecord26.checksum();
        java.util.Optional<java.lang.Integer> intOptional35 = objConsumerRecord26.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType44 = null;
        java.lang.Object obj48 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType44, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj48, (java.io.Serializable) 1);
        long long51 = objConsumerRecord50.timestamp();
        java.util.Optional<java.lang.Integer> intOptional52 = objConsumerRecord50.leaderEpoch();
        int int53 = objConsumerRecord50.serializedValueSize();
        java.lang.String str54 = objConsumerRecord50.topic();
        java.lang.String str55 = objConsumerRecord50.topic();
        java.lang.Class<?> wildcardClass56 = objConsumerRecord50.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) 1, (long) 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", (java.lang.reflect.AnnotatedElement) wildcardClass56);
        org.apache.kafka.common.record.TimestampType timestampType62 = null;
        java.lang.Object obj66 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType62, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj66, (java.io.Serializable) 1);
        java.lang.String str69 = objConsumerRecord68.toString();
        java.util.Optional<java.lang.Integer> intOptional70 = objConsumerRecord68.leaderEpoch();
        int int71 = objConsumerRecord68.serializedKeySize();
        long long72 = objConsumerRecord68.timestamp();
        org.apache.kafka.common.header.Headers headers73 = objConsumerRecord68.headers();
        org.apache.kafka.common.header.Headers headers74 = objConsumerRecord68.headers();
        java.lang.Object obj78 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj78, (java.io.Serializable) (byte) 100);
        long long81 = objConsumerRecord80.timestamp();
        java.util.Optional<java.lang.Integer> intOptional82 = objConsumerRecord80.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional83 = objConsumerRecord80.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord84 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 0, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 52, (long) (byte) 1, 10L, timestampType4, (java.lang.Long) 0L, (int) (byte) 100, 32, (java.lang.Object) objConsumerRecord26, (java.io.Serializable) "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", headers74, intOptional83);
        org.apache.kafka.common.record.TimestampType timestampType85 = objConsumerRecord84.timestampType();
        java.util.Optional<java.lang.Integer> intOptional86 = objConsumerRecord84.leaderEpoch();
        java.io.Serializable serializable87 = objConsumerRecord84.value();
        long long88 = objConsumerRecord84.timestamp();
        int int89 = objConsumerRecord84.serializedValueSize();
        long long90 = objConsumerRecord84.timestamp();
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(intOptional28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertNotNull(intOptional32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(intOptional35);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertNotNull(intOptional52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str69, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 52L + "'", long72 == 52L);
        org.junit.Assert.assertNotNull(headers73);
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertNotNull(intOptional82);
        org.junit.Assert.assertNotNull(intOptional83);
        org.junit.Assert.assertNull(timestampType85);
        org.junit.Assert.assertNotNull(intOptional86);
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)" + "'", serializable87, "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 10L + "'", long88 == 10L);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 32 + "'", int89 == 32);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 10L + "'", long90 == 10L);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType10, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj14, (java.io.Serializable) 1);
        long long17 = objConsumerRecord16.timestamp();
        java.util.Optional<java.lang.Integer> intOptional18 = objConsumerRecord16.leaderEpoch();
        long long19 = objConsumerRecord16.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType24 = null;
        java.lang.Object obj28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType24, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj28, (java.io.Serializable) 1);
        java.lang.String str31 = objConsumerRecord30.toString();
        java.lang.String str32 = objConsumerRecord30.toString();
        java.lang.Class<?> wildcardClass33 = objConsumerRecord30.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (short) 10, (java.lang.Object) objConsumerRecord16, (java.io.Serializable) wildcardClass33);
        org.apache.kafka.common.record.TimestampType timestampType39 = null;
        java.lang.Object obj43 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType39, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj43, (java.io.Serializable) 1);
        long long46 = objConsumerRecord45.timestamp();
        java.util.Optional<java.lang.Integer> intOptional47 = objConsumerRecord45.leaderEpoch();
        long long48 = objConsumerRecord45.timestamp();
        java.io.Serializable serializable49 = objConsumerRecord45.value();
        long long50 = objConsumerRecord45.offset();
        org.apache.kafka.common.record.TimestampType timestampType51 = objConsumerRecord45.timestampType();
        java.lang.String str52 = objConsumerRecord45.toString();
        java.lang.Class<?> wildcardClass53 = objConsumerRecord45.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)", (int) 'a', (long) (-1), (java.lang.Object) wildcardClass33, (java.io.Serializable) wildcardClass53);
        java.io.Serializable serializable55 = objConsumerRecord54.value();
        org.apache.kafka.common.header.Headers headers56 = objConsumerRecord54.headers();
        java.lang.String str57 = objConsumerRecord54.topic();
        java.io.Serializable serializable58 = objConsumerRecord54.value();
        org.apache.kafka.common.record.TimestampType timestampType59 = objConsumerRecord54.timestampType();
        java.lang.Object obj60 = objConsumerRecord54.key();
        java.io.Serializable serializable61 = objConsumerRecord54.value();
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str31, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str32, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 52L + "'", long46 == 52L);
        org.junit.Assert.assertNotNull(intOptional47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertEquals("'" + serializable49 + "' != '" + 1 + "'", serializable49, 1);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNull(timestampType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str52, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(serializable55);
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)" + "'", str57, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)");
        org.junit.Assert.assertNotNull(serializable58);
        org.junit.Assert.assertTrue("'" + timestampType59 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType59.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertNotNull(serializable61);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        long long14 = objConsumerRecord10.timestamp();
        long long15 = objConsumerRecord10.offset();
        long long16 = objConsumerRecord10.offset();
        java.util.Optional<java.lang.Integer> intOptional17 = objConsumerRecord10.leaderEpoch();
        java.lang.Object obj18 = objConsumerRecord10.key();
        java.lang.String str19 = objConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(intOptional17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(intOptional20);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        int int15 = objConsumerRecord13.serializedValueSize();
        java.lang.Object obj16 = objConsumerRecord13.key();
        int int17 = objConsumerRecord13.serializedValueSize();
        java.lang.Object obj18 = objConsumerRecord13.key();
        java.util.Optional<java.lang.Integer> intOptional19 = objConsumerRecord13.leaderEpoch();
        java.lang.Class<?> wildcardClass20 = objConsumerRecord13.getClass();
        java.lang.Object obj27 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj27, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType34 = null;
        java.lang.Object obj38 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType34, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj38, (java.io.Serializable) 1);
        long long41 = objConsumerRecord40.timestamp();
        java.lang.Object obj42 = objConsumerRecord40.key();
        long long43 = objConsumerRecord40.checksum();
        java.lang.Class<?> wildcardClass44 = objConsumerRecord40.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj27, (java.io.Serializable) wildcardClass44);
        java.lang.Object obj46 = objConsumerRecord45.key();
        long long47 = objConsumerRecord45.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType48 = objConsumerRecord45.timestampType();
        java.lang.Object obj49 = objConsumerRecord45.key();
        java.lang.String str50 = objConsumerRecord45.toString();
        long long51 = objConsumerRecord45.offset();
        int int52 = objConsumerRecord45.partition();
        long long53 = objConsumerRecord45.checksum();
        java.lang.String str54 = objConsumerRecord45.topic();
        java.io.Serializable serializable55 = objConsumerRecord45.value();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 0, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = Optional.empty, value = 100), partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord))", 32, (long) (byte) 10, (java.lang.Object) wildcardClass20, serializable55);
        org.apache.kafka.common.header.Headers headers57 = objConsumerRecord56.headers();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType48 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType48.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str50, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35L + "'", long51 == 35L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(serializable55);
        org.junit.Assert.assertNotNull(headers57);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        long long16 = objConsumerRecord13.timestamp();
        java.io.Serializable serializable17 = objConsumerRecord13.value();
        org.apache.kafka.common.record.TimestampType timestampType22 = null;
        java.lang.Object obj26 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType22, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj26, (java.io.Serializable) 1);
        long long29 = objConsumerRecord28.timestamp();
        java.util.Optional<java.lang.Integer> intOptional30 = objConsumerRecord28.leaderEpoch();
        int int31 = objConsumerRecord28.serializedValueSize();
        java.lang.String str32 = objConsumerRecord28.topic();
        java.lang.String str33 = objConsumerRecord28.topic();
        java.lang.Class<?> wildcardClass34 = objConsumerRecord28.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", (int) '#', (long) (byte) 0, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) wildcardClass34);
        java.util.Optional<java.lang.Integer> intOptional36 = objConsumerRecord35.leaderEpoch();
        long long37 = objConsumerRecord35.offset();
        long long38 = objConsumerRecord35.offset();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertNotNull(intOptional30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(intOptional36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        org.apache.kafka.common.record.TimestampType timestampType22 = null;
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        java.lang.Object obj35 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType31, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj35, (java.io.Serializable) 1);
        long long38 = objConsumerRecord37.timestamp();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord37.leaderEpoch();
        long long40 = objConsumerRecord37.offset();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> charSequenceConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("", (int) '4', (long) 'a', 0L, timestampType22, 10L, (-1), (int) (short) 0, (java.lang.CharSequence) "hi!", objConsumerRecord37);
        java.lang.Class<?> wildcardClass42 = charSequenceConsumerRecord41.getClass();
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        java.lang.Object obj51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType47, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj51, (java.io.Serializable) 1);
        long long54 = objConsumerRecord53.timestamp();
        java.lang.Object obj55 = objConsumerRecord53.key();
        long long56 = objConsumerRecord53.checksum();
        java.lang.Class<?> wildcardClass57 = objConsumerRecord53.getClass();
        org.apache.kafka.common.record.TimestampType timestampType62 = null;
        java.lang.Object obj69 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj69, (java.io.Serializable) (byte) 100);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) 100, (long) (byte) 10, (long) 0, timestampType62, (-1L), 1, (int) (short) 1, (java.lang.Object) 'a', (java.io.Serializable) (short) 1);
        org.apache.kafka.common.header.Headers headers74 = objConsumerRecord73.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>("hi!", 10, (long) (-1), 1L, timestampType14, (java.lang.Long) 52L, (int) (byte) 1, 10, (java.lang.reflect.GenericDeclaration) wildcardClass42, (java.lang.reflect.AnnotatedElement) wildcardClass57, headers74);
        org.apache.kafka.common.record.TimestampType timestampType80 = null;
        java.lang.Object obj84 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType80, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj84, (java.io.Serializable) 1);
        java.lang.String str87 = objConsumerRecord86.toString();
        java.util.Optional<java.lang.Integer> intOptional88 = objConsumerRecord86.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) 'a', (long) 100, timestampType4, (java.lang.Long) 100L, (int) (byte) 10, (int) (byte) 1, obj8, (java.io.Serializable) 1, headers74, intOptional88);
        long long90 = objConsumerRecord89.timestamp();
        int int91 = objConsumerRecord89.partition();
        long long92 = objConsumerRecord89.timestamp();
        int int93 = objConsumerRecord89.partition();
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str87, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional88);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 100L + "'", long90 == 100L);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 100L + "'", long92 == 100L);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj12 = null;
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        java.lang.Object obj21 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType17, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj21, (java.io.Serializable) 1);
        long long24 = objConsumerRecord23.timestamp();
        java.util.Optional<java.lang.Integer> intOptional25 = objConsumerRecord23.leaderEpoch();
        long long26 = objConsumerRecord23.checksum();
        java.lang.String str27 = objConsumerRecord23.topic();
        java.lang.Class<?> wildcardClass28 = objConsumerRecord23.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) 10, (long) 1, obj12, (java.io.Serializable) wildcardClass28);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 0, null = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", 1, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (byte) 10, (int) (short) -1, (java.lang.Object) 0, (java.io.Serializable) (byte) 10);
        long long31 = objConsumerRecord30.offset();
        java.lang.String str32 = objConsumerRecord30.toString();
        java.lang.String str33 = objConsumerRecord30.toString();
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNotNull(intOptional25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 0, null = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 1, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str32, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 0, null = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 1, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 0, null = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 1, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str33, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 0, null = 0, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 1, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType17 = objConsumerRecord13.timestampType();
        long long18 = objConsumerRecord13.offset();
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord13.timestampType();
        org.apache.kafka.common.header.Headers headers20 = objConsumerRecord13.headers();
        org.apache.kafka.common.header.Headers headers21 = objConsumerRecord13.headers();
        long long22 = objConsumerRecord13.timestamp();
        java.lang.Object obj29 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj29, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType36 = null;
        java.lang.Object obj40 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType36, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj40, (java.io.Serializable) 1);
        long long43 = objConsumerRecord42.timestamp();
        java.lang.Object obj44 = objConsumerRecord42.key();
        long long45 = objConsumerRecord42.checksum();
        java.lang.Class<?> wildcardClass46 = objConsumerRecord42.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj29, (java.io.Serializable) wildcardClass46);
        java.lang.Object obj48 = objConsumerRecord47.key();
        long long49 = objConsumerRecord47.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType50 = objConsumerRecord47.timestampType();
        java.lang.Object obj51 = objConsumerRecord47.key();
        java.io.Serializable serializable52 = objConsumerRecord47.value();
        int int53 = objConsumerRecord47.serializedKeySize();
        long long54 = objConsumerRecord47.checksum();
        java.lang.Class<?> wildcardClass55 = objConsumerRecord47.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = null)", (int) (byte) 0, 1L, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) wildcardClass55);
        java.lang.String str57 = objConsumerRecord56.topic();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertNotNull(headers21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType50 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType50.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(serializable52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = null)" + "'", str57, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = null)");
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType15, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.header.Headers headers22 = objConsumerRecord21.headers();
        long long23 = objConsumerRecord21.offset();
        java.lang.Class<?> wildcardClass24 = objConsumerRecord21.getClass();
        org.apache.kafka.common.record.TimestampType timestampType33 = null;
        java.lang.Object obj37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType33, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj37, (java.io.Serializable) 1);
        java.lang.String str40 = objConsumerRecord39.toString();
        java.lang.String str41 = objConsumerRecord39.toString();
        java.lang.Class<?> wildcardClass42 = objConsumerRecord39.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass42);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>("", 100, (long) 35, (java.lang.reflect.GenericDeclaration) wildcardClass24, (java.lang.reflect.AnnotatedElement) wildcardClass42);
        org.apache.kafka.common.record.TimestampType timestampType50 = null;
        java.lang.Object obj54 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType50, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj54, (java.io.Serializable) 1);
        java.lang.String str57 = objConsumerRecord56.topic();
        int int58 = objConsumerRecord56.serializedKeySize();
        int int59 = objConsumerRecord56.serializedValueSize();
        long long60 = objConsumerRecord56.offset();
        int int61 = objConsumerRecord56.serializedValueSize();
        org.apache.kafka.common.header.Headers headers62 = objConsumerRecord56.headers();
        org.apache.kafka.common.record.TimestampType timestampType67 = null;
        java.lang.Object obj71 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType67, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj71, (java.io.Serializable) 1);
        long long74 = objConsumerRecord73.offset();
        long long75 = objConsumerRecord73.checksum();
        org.apache.kafka.common.header.Headers headers76 = objConsumerRecord73.headers();
        java.lang.String str77 = objConsumerRecord73.toString();
        int int78 = objConsumerRecord73.serializedValueSize();
        int int79 = objConsumerRecord73.serializedValueSize();
        int int80 = objConsumerRecord73.partition();
        long long81 = objConsumerRecord73.checksum();
        java.util.Optional<java.lang.Integer> intOptional82 = objConsumerRecord73.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false), partition = 32, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType))", (int) (short) 1, (long) 100, 32L, timestampType4, (java.lang.Long) (-1L), 52, 97, (java.lang.reflect.AnnotatedElement) wildcardClass24, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 35, leaderEpoch = null, offset = 1, NoTimestampType = 52, serialized key size = -1, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = Optional.empty, value = 10.0)", headers62, intOptional82);
        org.junit.Assert.assertNotNull(headers22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str40, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str41, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(headers62);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(headers76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str77, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(intOptional82);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType4, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord10.timestampType();
        java.lang.String str12 = objConsumerRecord10.toString();
        int int13 = objConsumerRecord10.serializedValueSize();
        long long14 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType15 = objConsumerRecord10.timestampType();
        java.lang.String str16 = objConsumerRecord10.toString();
        int int17 = objConsumerRecord10.serializedValueSize();
        java.io.Serializable serializable18 = objConsumerRecord10.value();
        org.junit.Assert.assertNull(timestampType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str12, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNull(timestampType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str16, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + 10 + "'", serializable18, 10);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        java.lang.Object obj3 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj3, (java.io.Serializable) (byte) 100);
        long long6 = objConsumerRecord5.timestamp();
        int int7 = objConsumerRecord5.serializedValueSize();
        java.io.Serializable serializable8 = objConsumerRecord5.value();
        long long9 = objConsumerRecord5.timestamp();
        java.lang.String str10 = objConsumerRecord5.topic();
        java.lang.Object obj11 = objConsumerRecord5.key();
        int int12 = objConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 100 + "'", serializable8, (byte) 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        java.lang.Object obj7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj7, (java.io.Serializable) (byte) 100);
        java.lang.Object obj10 = objConsumerRecord9.key();
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = null;
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        java.lang.Object obj31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType27, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj31, (java.io.Serializable) 1);
        long long34 = objConsumerRecord33.timestamp();
        java.util.Optional<java.lang.Integer> intOptional35 = objConsumerRecord33.leaderEpoch();
        long long36 = objConsumerRecord33.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType19, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord33, (java.io.Serializable) '#');
        int int39 = objConsumerRecord38.partition();
        java.util.Optional<java.lang.Integer> intOptional40 = objConsumerRecord38.leaderEpoch();
        long long41 = objConsumerRecord38.checksum();
        org.apache.kafka.common.header.Headers headers42 = objConsumerRecord38.headers();
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        org.apache.kafka.common.record.TimestampType timestampType56 = null;
        java.lang.Object obj60 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType56, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj60, (java.io.Serializable) 1);
        long long63 = objConsumerRecord62.timestamp();
        java.util.Optional<java.lang.Integer> intOptional64 = objConsumerRecord62.leaderEpoch();
        long long65 = objConsumerRecord62.offset();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> charSequenceConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("", (int) '4', (long) 'a', 0L, timestampType47, 10L, (-1), (int) (short) 0, (java.lang.CharSequence) "hi!", objConsumerRecord62);
        java.lang.Class<?> wildcardClass67 = charSequenceConsumerRecord66.getClass();
        org.apache.kafka.common.record.TimestampType timestampType72 = null;
        org.apache.kafka.common.record.TimestampType timestampType80 = null;
        java.lang.Object obj84 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType80, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj84, (java.io.Serializable) 1);
        long long87 = objConsumerRecord86.offset();
        long long88 = objConsumerRecord86.checksum();
        long long89 = objConsumerRecord86.timestamp();
        java.lang.String str90 = objConsumerRecord86.topic();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", 0, (long) (short) 100, (long) '4', timestampType72, 0L, (int) (byte) 10, 35, (java.lang.Object) objConsumerRecord86, (java.io.Serializable) true);
        org.apache.kafka.common.header.Headers headers93 = objConsumerRecord92.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord94 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = class org.apache.kafka.clients.consumer.ConsumerRecord, value = null)", (int) (byte) 0, (long) 32, (long) 100, timestampType11, (java.lang.Long) 97L, (int) (short) 100, (int) (byte) 10, (java.lang.Object) objConsumerRecord38, (java.io.Serializable) wildcardClass67, headers93);
        org.apache.kafka.common.header.Headers headers95 = objConsumerRecord38.headers();
        long long96 = objConsumerRecord38.offset();
        int int97 = objConsumerRecord38.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional98 = objConsumerRecord38.leaderEpoch();
        long long99 = objConsumerRecord38.offset();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertNotNull(intOptional35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intOptional40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 52L + "'", long63 == 52L);
        org.junit.Assert.assertNotNull(intOptional64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 52L + "'", long89 == 52L);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(headers93);
        org.junit.Assert.assertNotNull(headers95);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-1L) + "'", long96 == (-1L));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 100 + "'", int97 == 100);
        org.junit.Assert.assertNotNull(intOptional98);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + (-1L) + "'", long99 == (-1L));
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        java.lang.Object obj6 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj6, (java.io.Serializable) (byte) 100);
        long long9 = objConsumerRecord8.timestamp();
        java.util.Optional<java.lang.Integer> intOptional10 = objConsumerRecord8.leaderEpoch();
        long long11 = objConsumerRecord8.offset();
        int int12 = objConsumerRecord8.partition();
        int int13 = objConsumerRecord8.partition();
        long long14 = objConsumerRecord8.timestamp();
        java.lang.String str15 = objConsumerRecord8.topic();
        org.apache.kafka.common.header.Headers headers16 = objConsumerRecord8.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 0, leaderEpoch = null, offset = 100, null = 52, serialized key size = 10, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)", 1, (long) (short) 10, (java.lang.Object) headers16, (java.io.Serializable) "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        java.lang.Object obj19 = objConsumerRecord18.key();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "RecordHeaders(headers = [], isReadOnly = false)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "RecordHeaders(headers = [], isReadOnly = false)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "RecordHeaders(headers = [], isReadOnly = false)");
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        java.lang.Class<?> wildcardClass16 = objConsumerRecord13.getClass();
        org.apache.kafka.common.record.TimestampType timestampType21 = null;
        org.apache.kafka.common.record.TimestampType timestampType29 = null;
        org.apache.kafka.common.record.TimestampType timestampType37 = null;
        java.lang.Object obj41 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType37, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj41, (java.io.Serializable) 1);
        long long44 = objConsumerRecord43.timestamp();
        java.util.Optional<java.lang.Integer> intOptional45 = objConsumerRecord43.leaderEpoch();
        long long46 = objConsumerRecord43.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType29, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord43, (java.io.Serializable) '#');
        java.lang.Class<?> wildcardClass49 = objConsumerRecord48.getClass();
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        java.lang.Object obj58 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType54, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj58, (java.io.Serializable) 1);
        java.lang.String str61 = objConsumerRecord60.toString();
        java.lang.String str62 = objConsumerRecord60.toString();
        long long63 = objConsumerRecord60.offset();
        java.lang.String str64 = objConsumerRecord60.topic();
        java.lang.Class<?> wildcardClass65 = objConsumerRecord60.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) '4', (long) '4', (long) '#', timestampType21, 0L, (int) (byte) 100, (int) ' ', (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.AnnotatedElement) wildcardClass65);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", (int) (byte) 100, (long) 'a', (java.lang.Object) wildcardClass16, (java.io.Serializable) timestampType21);
        long long68 = objConsumerRecord67.checksum();
        java.lang.Object obj69 = objConsumerRecord67.key();
        java.lang.Object obj70 = objConsumerRecord67.key();
        java.io.Serializable serializable71 = objConsumerRecord67.value();
        java.lang.Object obj72 = objConsumerRecord67.key();
        org.apache.kafka.common.record.TimestampType timestampType73 = objConsumerRecord67.timestampType();
        int int74 = objConsumerRecord67.partition();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 52L + "'", long44 == 52L);
        org.junit.Assert.assertNotNull(intOptional45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 52L + "'", long46 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str61, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str62, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertNull(serializable71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "class org.apache.kafka.clients.consumer.ConsumerRecord");
        org.junit.Assert.assertTrue("'" + timestampType73 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType73.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        java.lang.String str19 = objConsumerRecord18.toString();
        java.lang.String str20 = objConsumerRecord18.toString();
        org.apache.kafka.common.record.TimestampType timestampType26 = null;
        java.lang.Object obj30 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType26, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj30, (java.io.Serializable) 1);
        java.lang.String str33 = objConsumerRecord32.toString();
        long long34 = objConsumerRecord32.offset();
        org.apache.kafka.common.header.Headers headers35 = objConsumerRecord32.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) (byte) 100, (long) (byte) 1, (long) (short) 1, timestampType4, (java.lang.Long) 10L, (int) (short) 0, (int) (short) 1, (java.lang.Object) str20, (java.io.Serializable) 10, headers35);
        java.io.Serializable serializable37 = objConsumerRecord36.value();
        java.lang.Object obj38 = objConsumerRecord36.key();
        int int39 = objConsumerRecord36.serializedKeySize();
        java.lang.String str40 = objConsumerRecord36.topic();
        long long41 = objConsumerRecord36.checksum();
        int int42 = objConsumerRecord36.serializedValueSize();
        long long43 = objConsumerRecord36.offset();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str20, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str33, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(headers35);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + 10 + "'", serializable37, 10);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", obj38, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        int int12 = objConsumerRecord10.serializedValueSize();
        java.lang.String str13 = objConsumerRecord10.toString();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        long long15 = objConsumerRecord10.offset();
        java.lang.String str16 = objConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional17 = objConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord10.headers();
        java.util.Optional<java.lang.Integer> intOptional19 = objConsumerRecord10.leaderEpoch();
        java.io.Serializable serializable20 = objConsumerRecord10.value();
        long long21 = objConsumerRecord10.timestamp();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 1 + "'", serializable14, 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(intOptional17);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + 1 + "'", serializable20, 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        org.apache.kafka.common.record.TimestampType timestampType8 = null;
        java.lang.Object obj12 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType8, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj12, (java.io.Serializable) 1);
        long long15 = objConsumerRecord14.timestamp();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord14.leaderEpoch();
        long long17 = objConsumerRecord14.timestamp();
        java.io.Serializable serializable18 = objConsumerRecord14.value();
        long long19 = objConsumerRecord14.offset();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord14.timestampType();
        java.lang.String str21 = objConsumerRecord14.toString();
        org.apache.kafka.common.header.Headers headers22 = objConsumerRecord14.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.Iterable<org.apache.kafka.common.header.Header>> strConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.Iterable<org.apache.kafka.common.header.Header>>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = null)", (int) ' ', (long) (short) 10, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false), partition = 10, leaderEpoch = null, offset = 100, NoTimestampType = 10, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = null)", (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers22);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + 1 + "'", serializable18, 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(timestampType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers22);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        java.lang.Object obj3 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj3, (java.io.Serializable) (byte) 100);
        java.lang.Object obj6 = objConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType7 = objConsumerRecord5.timestampType();
        long long8 = objConsumerRecord5.timestamp();
        int int9 = objConsumerRecord5.serializedKeySize();
        long long10 = objConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers11 = objConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers12 = objConsumerRecord5.headers();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertNotNull(headers12);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj11, (java.io.Serializable) (byte) 100);
        java.lang.Object obj14 = objConsumerRecord13.key();
        java.lang.String str15 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType16, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        long long37 = objConsumerRecord36.timestamp();
        java.util.Optional<java.lang.Integer> intOptional38 = objConsumerRecord36.leaderEpoch();
        int int39 = objConsumerRecord36.serializedValueSize();
        java.lang.String str40 = objConsumerRecord36.topic();
        java.util.Optional<java.lang.Integer> intOptional41 = objConsumerRecord36.leaderEpoch();
        org.apache.kafka.common.header.Headers headers42 = objConsumerRecord36.headers();
        java.lang.Object obj43 = objConsumerRecord36.key();
        org.apache.kafka.common.record.TimestampType timestampType44 = objConsumerRecord36.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = -1)", (int) '4', (long) (byte) 100, 52L, timestampType16, (long) (short) 0, 100, 0, (java.lang.Object) objConsumerRecord36, (java.io.Serializable) 10L);
        java.lang.Object obj47 = objConsumerRecord36.key();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertNotNull(intOptional38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(timestampType44);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.lang.String str12 = objConsumerRecord10.toString();
        long long13 = objConsumerRecord10.offset();
        java.lang.String str14 = objConsumerRecord10.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = objConsumerRecord10.timestampType();
        int int16 = objConsumerRecord10.serializedValueSize();
        long long17 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord10.headers();
        java.io.Serializable serializable19 = objConsumerRecord10.value();
        long long20 = objConsumerRecord10.offset();
        int int21 = objConsumerRecord10.serializedValueSize();
        java.lang.Object obj22 = objConsumerRecord10.key();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(timestampType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + 1 + "'", serializable19, 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType7, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord13.timestampType();
        java.lang.String str15 = objConsumerRecord13.toString();
        long long16 = objConsumerRecord13.offset();
        java.io.Serializable serializable17 = objConsumerRecord13.value();
        int int18 = objConsumerRecord13.partition();
        long long19 = objConsumerRecord13.offset();
        java.lang.String str20 = objConsumerRecord13.toString();
        int int21 = objConsumerRecord13.serializedValueSize();
        java.lang.Object obj28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj28, (java.io.Serializable) (byte) 100);
        java.lang.Object obj31 = objConsumerRecord30.key();
        int int32 = objConsumerRecord30.partition();
        org.apache.kafka.common.header.Headers headers33 = objConsumerRecord30.headers();
        org.apache.kafka.common.record.TimestampType timestampType38 = null;
        org.apache.kafka.common.record.TimestampType timestampType46 = null;
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        java.lang.Object obj58 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType54, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj58, (java.io.Serializable) 1);
        long long61 = objConsumerRecord60.timestamp();
        java.lang.Object obj62 = objConsumerRecord60.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord64 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType46, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord60, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType38, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord64, (java.io.Serializable) 10.0f);
        java.lang.Class<?> wildcardClass67 = objConsumerRecord66.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 0, (long) ' ', (java.lang.Object) headers33, (java.io.Serializable) wildcardClass67);
        int int69 = objConsumerRecord68.partition();
        java.lang.String str70 = objConsumerRecord68.toString();
        java.io.Serializable serializable71 = objConsumerRecord68.value();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) '4', 100L, (java.lang.Object) objConsumerRecord13, serializable71);
        long long73 = objConsumerRecord72.timestamp();
        long long74 = objConsumerRecord72.timestamp();
        int int75 = objConsumerRecord72.serializedKeySize();
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str15, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 10 + "'", serializable17, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str20, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str70, "ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertNotNull(serializable71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType15, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj19, (java.io.Serializable) 1);
        long long22 = objConsumerRecord21.timestamp();
        java.util.Optional<java.lang.Integer> intOptional23 = objConsumerRecord21.leaderEpoch();
        long long24 = objConsumerRecord21.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType7, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord21, (java.io.Serializable) '#');
        org.apache.kafka.common.header.Headers headers27 = objConsumerRecord21.headers();
        long long28 = objConsumerRecord21.timestamp();
        int int29 = objConsumerRecord21.partition();
        java.lang.Object obj36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj36, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType43 = null;
        java.lang.Object obj47 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType43, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj47, (java.io.Serializable) 1);
        long long50 = objConsumerRecord49.timestamp();
        java.lang.Object obj51 = objConsumerRecord49.key();
        long long52 = objConsumerRecord49.checksum();
        java.lang.Class<?> wildcardClass53 = objConsumerRecord49.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj36, (java.io.Serializable) wildcardClass53);
        java.lang.Object obj55 = objConsumerRecord54.key();
        long long56 = objConsumerRecord54.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType57 = objConsumerRecord54.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType58 = objConsumerRecord54.timestampType();
        long long59 = objConsumerRecord54.checksum();
        java.util.Optional<java.lang.Integer> intOptional60 = objConsumerRecord54.leaderEpoch();
        java.lang.Class<?> wildcardClass61 = objConsumerRecord54.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 52, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class java.util.Optional)", (int) (byte) 10, (long) (short) 10, (java.lang.Object) objConsumerRecord21, (java.io.Serializable) wildcardClass61);
        int int63 = objConsumerRecord62.serializedKeySize();
        java.io.Serializable serializable64 = objConsumerRecord62.value();
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNotNull(headers27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 52L + "'", long50 == 52L);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType57 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType57.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType58 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType58.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNotNull(intOptional60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(serializable64);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 1, (long) '4', (java.lang.Object) objConsumerRecord13, (java.io.Serializable) (-1.0d));
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord18.timestampType();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord18.leaderEpoch();
        java.lang.String str21 = objConsumerRecord18.toString();
        long long22 = objConsumerRecord18.offset();
        int int23 = objConsumerRecord18.partition();
        long long24 = objConsumerRecord18.checksum();
        java.lang.Object obj25 = objConsumerRecord18.key();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)" + "'", str21, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType4, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.header.Headers headers11 = objConsumerRecord10.headers();
        long long12 = objConsumerRecord10.offset();
        int int13 = objConsumerRecord10.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord10.timestampType();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord10.headers();
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertNotNull(headers15);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        java.lang.Object obj6 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj6, (java.io.Serializable) (byte) 100);
        long long9 = objConsumerRecord8.timestamp();
        int int10 = objConsumerRecord8.serializedValueSize();
        long long11 = objConsumerRecord8.checksum();
        org.apache.kafka.common.record.TimestampType timestampType12 = objConsumerRecord8.timestampType();
        int int13 = objConsumerRecord8.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType18 = null;
        org.apache.kafka.common.record.TimestampType timestampType26 = null;
        org.apache.kafka.common.record.TimestampType timestampType34 = null;
        java.lang.Object obj38 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType34, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj38, (java.io.Serializable) 1);
        long long41 = objConsumerRecord40.timestamp();
        java.util.Optional<java.lang.Integer> intOptional42 = objConsumerRecord40.leaderEpoch();
        long long43 = objConsumerRecord40.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType26, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord40, (java.io.Serializable) '#');
        java.lang.Object obj46 = objConsumerRecord45.key();
        org.apache.kafka.common.record.TimestampType timestampType51 = null;
        java.lang.Object obj55 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType51, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj55, (java.io.Serializable) 1);
        long long58 = objConsumerRecord57.timestamp();
        long long59 = objConsumerRecord57.timestamp();
        long long60 = objConsumerRecord57.offset();
        java.lang.Class<?> wildcardClass61 = objConsumerRecord57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 52, (long) 1, 100L, timestampType18, (long) 'a', (int) (short) -1, 32, obj46, (java.io.Serializable) wildcardClass61);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 10, 100L, (java.lang.Object) objConsumerRecord8, (java.io.Serializable) 32);
        int int64 = objConsumerRecord63.partition();
        java.lang.Object obj65 = objConsumerRecord63.key();
        java.io.Serializable serializable66 = objConsumerRecord63.value();
        java.lang.String str67 = objConsumerRecord63.topic();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertNotNull(intOptional42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 52L + "'", long58 == 52L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertEquals("'" + serializable66 + "' != '" + 32 + "'", serializable66, 32);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        long long15 = objConsumerRecord13.offset();
        org.apache.kafka.common.header.Headers headers16 = objConsumerRecord13.headers();
        java.lang.String str17 = objConsumerRecord13.toString();
        long long18 = objConsumerRecord13.offset();
        long long19 = objConsumerRecord13.checksum();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord13.leaderEpoch();
        java.lang.Object obj21 = objConsumerRecord13.key();
        long long22 = objConsumerRecord13.offset();
        org.apache.kafka.common.header.Headers headers23 = objConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        java.lang.Object obj35 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType31, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj35, (java.io.Serializable) 1);
        long long38 = objConsumerRecord37.timestamp();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord37.leaderEpoch();
        long long40 = objConsumerRecord37.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType45 = null;
        java.lang.Object obj49 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType45, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj49, (java.io.Serializable) 1);
        java.lang.String str52 = objConsumerRecord51.toString();
        java.lang.String str53 = objConsumerRecord51.toString();
        java.lang.Class<?> wildcardClass54 = objConsumerRecord51.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (short) 10, (java.lang.Object) objConsumerRecord37, (java.io.Serializable) wildcardClass54);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> headersConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 35, NoTimestampType = 32, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false))", (int) ' ', (long) 0, headers23, objConsumerRecord37);
        org.apache.kafka.common.header.Headers headers57 = objConsumerRecord37.headers();
        org.apache.kafka.common.header.Headers headers58 = objConsumerRecord37.headers();
        java.io.Serializable serializable59 = objConsumerRecord37.value();
        int int60 = objConsumerRecord37.serializedKeySize();
        java.lang.String str61 = objConsumerRecord37.topic();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str52, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str53, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertNotNull(headers58);
        org.junit.Assert.assertEquals("'" + serializable59 + "' != '" + 1 + "'", serializable59, 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType10, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj14, (java.io.Serializable) 1);
        java.lang.String str17 = objConsumerRecord16.toString();
        long long18 = objConsumerRecord16.offset();
        org.apache.kafka.common.header.Headers headers19 = objConsumerRecord16.headers();
        java.lang.String str20 = objConsumerRecord16.toString();
        long long21 = objConsumerRecord16.offset();
        java.util.Optional<java.lang.Integer> intOptional22 = objConsumerRecord16.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        long long37 = objConsumerRecord36.timestamp();
        long long38 = objConsumerRecord36.timestamp();
        java.lang.Class<?> wildcardClass39 = objConsumerRecord36.getClass();
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        java.lang.Object obj51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType47, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj51, (java.io.Serializable) 1);
        long long54 = objConsumerRecord53.timestamp();
        int int55 = objConsumerRecord53.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional56 = objConsumerRecord53.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord53, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType59 = objConsumerRecord58.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders)", 10, 100L, (java.lang.reflect.AnnotatedElement) wildcardClass39, (java.io.Serializable) timestampType59);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (short) 0, (long) (byte) 10, (java.lang.Object) intOptional22, (java.io.Serializable) wildcardClass39);
        java.io.Serializable serializable62 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 0, 35L, (java.lang.Object) objConsumerRecord61, serializable62);
        org.apache.kafka.common.header.Headers headers64 = objConsumerRecord63.headers();
        org.apache.kafka.common.record.TimestampType timestampType65 = objConsumerRecord63.timestampType();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str20, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(intOptional22);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(intOptional56);
        org.junit.Assert.assertTrue("'" + timestampType59 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType59.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers64);
        org.junit.Assert.assertTrue("'" + timestampType65 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType65.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        java.lang.Object obj3 = null;
        org.apache.kafka.common.record.TimestampType timestampType11 = null;
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType11, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj15, (java.io.Serializable) 1);
        java.lang.String str18 = objConsumerRecord17.toString();
        java.util.Optional<java.lang.Integer> intOptional19 = objConsumerRecord17.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord17.leaderEpoch();
        int int21 = objConsumerRecord17.partition();
        long long22 = objConsumerRecord17.offset();
        org.apache.kafka.common.record.TimestampType timestampType23 = objConsumerRecord17.timestampType();
        java.lang.Object obj31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj31, (java.io.Serializable) (byte) 100);
        java.lang.Object obj34 = objConsumerRecord33.key();
        org.apache.kafka.common.record.TimestampType timestampType35 = objConsumerRecord33.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType49 = null;
        java.lang.Object obj53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType49, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj53, (java.io.Serializable) 1);
        long long56 = objConsumerRecord55.timestamp();
        int int57 = objConsumerRecord55.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional58 = objConsumerRecord55.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord55, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType61 = objConsumerRecord55.timestampType();
        java.lang.String str62 = objConsumerRecord55.topic();
        long long63 = objConsumerRecord55.timestamp();
        java.lang.Object obj64 = objConsumerRecord55.key();
        org.apache.kafka.common.header.Headers headers65 = objConsumerRecord55.headers();
        org.apache.kafka.common.record.TimestampType timestampType70 = null;
        java.lang.Object obj74 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType70, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj74, (java.io.Serializable) 1);
        org.apache.kafka.common.record.TimestampType timestampType77 = objConsumerRecord76.timestampType();
        java.util.Optional<java.lang.Integer> intOptional78 = objConsumerRecord76.leaderEpoch();
        long long79 = objConsumerRecord76.offset();
        int int80 = objConsumerRecord76.partition();
        java.lang.Class<?> wildcardClass81 = objConsumerRecord76.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.GenericDeclaration> headerIterableConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders)", (int) (byte) 1, (long) (byte) 0, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers65, (java.lang.reflect.GenericDeclaration) wildcardClass81);
        java.io.Serializable serializable83 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord84 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)", (int) (byte) -1, (long) 'a', (long) 35, timestampType35, (long) '4', 100, (int) (byte) 100, (java.lang.Object) headers65, serializable83);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", 1, (long) 10, (java.lang.Object) timestampType23, (java.io.Serializable) timestampType35);
        org.apache.kafka.common.record.TimestampType timestampType86 = objConsumerRecord85.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord87 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1.0, value = class java.util.Optional)", (int) '#', (long) 52, obj3, (java.io.Serializable) timestampType86);
        long long88 = objConsumerRecord87.timestamp();
        java.lang.Class<?> wildcardClass89 = objConsumerRecord87.getClass();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(timestampType23);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + timestampType35 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType35.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(intOptional58);
        org.junit.Assert.assertNull(timestampType61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 52L + "'", long63 == 52L);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(headers65);
        org.junit.Assert.assertNull(timestampType77);
        org.junit.Assert.assertNotNull(intOptional78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + timestampType86 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType86.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        java.lang.String str19 = objConsumerRecord18.toString();
        java.lang.String str20 = objConsumerRecord18.toString();
        org.apache.kafka.common.record.TimestampType timestampType26 = null;
        java.lang.Object obj30 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType26, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj30, (java.io.Serializable) 1);
        java.lang.String str33 = objConsumerRecord32.toString();
        long long34 = objConsumerRecord32.offset();
        org.apache.kafka.common.header.Headers headers35 = objConsumerRecord32.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) (byte) 100, (long) (byte) 1, (long) (short) 1, timestampType4, (java.lang.Long) 10L, (int) (short) 0, (int) (short) 1, (java.lang.Object) str20, (java.io.Serializable) 10, headers35);
        java.io.Serializable serializable37 = objConsumerRecord36.value();
        java.lang.Object obj38 = objConsumerRecord36.key();
        int int39 = objConsumerRecord36.serializedKeySize();
        java.lang.String str40 = objConsumerRecord36.topic();
        int int41 = objConsumerRecord36.serializedValueSize();
        java.io.Serializable serializable42 = objConsumerRecord36.value();
        java.lang.Object obj43 = objConsumerRecord36.key();
        java.lang.String str44 = objConsumerRecord36.toString();
        long long45 = objConsumerRecord36.timestamp();
        java.lang.Object obj46 = objConsumerRecord36.key();
        java.lang.String str47 = objConsumerRecord36.toString();
        java.util.Optional<java.lang.Integer> intOptional48 = objConsumerRecord36.leaderEpoch();
        org.apache.kafka.common.header.Headers headers49 = objConsumerRecord36.headers();
        java.lang.String str50 = objConsumerRecord36.toString();
        java.lang.String str51 = objConsumerRecord36.toString();
        long long52 = objConsumerRecord36.timestamp();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str20, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str33, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(headers35);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + 10 + "'", serializable37, 10);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", obj38, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + 10 + "'", serializable42, 10);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", obj43, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)" + "'", str44, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", obj46, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)" + "'", str47, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)");
        org.junit.Assert.assertNotNull(intOptional48);
        org.junit.Assert.assertNotNull(headers49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)" + "'", str50, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)" + "'", str51, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        java.lang.Object obj28 = objConsumerRecord26.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType12, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord26, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType4, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord30, (java.io.Serializable) 10.0f);
        int int33 = objConsumerRecord32.partition();
        java.lang.Object obj34 = objConsumerRecord32.key();
        long long35 = objConsumerRecord32.offset();
        java.lang.String str36 = objConsumerRecord32.topic();
        java.lang.Object obj37 = objConsumerRecord32.key();
        long long38 = objConsumerRecord32.checksum();
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str36, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        long long15 = objConsumerRecord13.timestamp();
        long long16 = objConsumerRecord13.offset();
        java.lang.String str17 = objConsumerRecord13.toString();
        java.util.Optional<java.lang.Integer> intOptional18 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        org.apache.kafka.common.record.TimestampType timestampType38 = null;
        java.lang.Object obj42 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType38, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj42, (java.io.Serializable) 1);
        long long45 = objConsumerRecord44.timestamp();
        java.util.Optional<java.lang.Integer> intOptional46 = objConsumerRecord44.leaderEpoch();
        long long47 = objConsumerRecord44.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType30, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord44, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional50 = objConsumerRecord44.leaderEpoch();
        java.lang.String str51 = objConsumerRecord44.topic();
        java.lang.Object obj52 = objConsumerRecord44.key();
        java.lang.String str53 = objConsumerRecord44.toString();
        java.lang.String str54 = objConsumerRecord44.topic();
        org.apache.kafka.common.header.Headers headers55 = objConsumerRecord44.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '4', (long) (short) 100, (java.lang.Object) (-1.0d), (java.io.Serializable) (-1.0d));
        org.apache.kafka.common.record.TimestampType timestampType62 = objConsumerRecord61.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> headerIterableConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 0, leaderEpoch = null, offset = 100, null = 52, serialized key size = 10, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)", (int) (short) -1, (long) ' ', (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers55, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType62);
        java.lang.Object obj67 = null;
        org.apache.kafka.common.record.TimestampType timestampType72 = null;
        java.lang.Object obj76 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType72, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj76, (java.io.Serializable) 1);
        java.lang.String str79 = objConsumerRecord78.toString();
        java.lang.String str80 = objConsumerRecord78.toString();
        long long81 = objConsumerRecord78.offset();
        java.lang.String str82 = objConsumerRecord78.topic();
        long long83 = objConsumerRecord78.offset();
        org.apache.kafka.common.header.Headers headers84 = objConsumerRecord78.headers();
        java.util.Optional<java.lang.Integer> intOptional85 = objConsumerRecord78.leaderEpoch();
        java.lang.Class<?> wildcardClass86 = objConsumerRecord78.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord87 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 10, (long) (-1), (long) (byte) 1, timestampType62, (long) '4', (int) 'a', 0, obj67, (java.io.Serializable) wildcardClass86);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord88 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = class org.apache.kafka.clients.consumer.ConsumerRecord, value = null)", (int) (short) -1, (long) 100, (java.lang.Object) intOptional18, (java.io.Serializable) wildcardClass86);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
        org.junit.Assert.assertNotNull(intOptional46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertNotNull(intOptional50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str53, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(headers55);
        org.junit.Assert.assertTrue("'" + timestampType62 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType62.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str79, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str80, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNotNull(headers84);
        org.junit.Assert.assertNotNull(intOptional85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.offset();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        java.lang.String str14 = objConsumerRecord10.topic();
        java.lang.String str15 = objConsumerRecord10.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional17 = objConsumerRecord10.leaderEpoch();
        java.io.Serializable serializable18 = objConsumerRecord10.value();
        java.lang.Object obj19 = objConsumerRecord10.key();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord10.leaderEpoch();
        java.lang.String str21 = objConsumerRecord10.toString();
        org.apache.kafka.common.record.TimestampType timestampType22 = objConsumerRecord10.timestampType();
        long long23 = objConsumerRecord10.checksum();
        java.lang.Class<?> wildcardClass24 = objConsumerRecord10.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertNotNull(intOptional17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + 1 + "'", serializable18, 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(timestampType22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.lang.String str12 = objConsumerRecord10.toString();
        long long13 = objConsumerRecord10.offset();
        java.lang.String str14 = objConsumerRecord10.topic();
        long long15 = objConsumerRecord10.offset();
        org.apache.kafka.common.header.Headers headers16 = objConsumerRecord10.headers();
        int int17 = objConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType18 = objConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional19 = objConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertNotNull(intOptional19);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj11, (java.io.Serializable) (byte) 100);
        java.lang.Object obj14 = objConsumerRecord13.key();
        java.lang.String str15 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType29 = null;
        java.lang.Object obj33 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType29, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj33, (java.io.Serializable) 1);
        java.lang.String str36 = objConsumerRecord35.toString();
        java.lang.String str37 = objConsumerRecord35.toString();
        java.lang.Class<?> wildcardClass38 = objConsumerRecord35.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass38);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) '#', 100L, (long) 'a', timestampType16, (long) (byte) 100, (int) (byte) -1, 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (java.lang.reflect.AnnotatedElement) wildcardClass38);
        org.apache.kafka.common.record.TimestampType timestampType48 = null;
        java.lang.Object obj52 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType48, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj52, (java.io.Serializable) 1);
        long long55 = objConsumerRecord54.timestamp();
        java.lang.Object obj56 = objConsumerRecord54.key();
        long long57 = objConsumerRecord54.checksum();
        long long58 = objConsumerRecord54.checksum();
        org.apache.kafka.common.record.TimestampType timestampType59 = objConsumerRecord54.timestampType();
        org.apache.kafka.common.header.Headers headers60 = objConsumerRecord54.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        java.lang.Object obj72 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType68, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj72, (java.io.Serializable) 1);
        long long75 = objConsumerRecord74.timestamp();
        int int76 = objConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = objConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord74, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType80 = objConsumerRecord79.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), 1L, (long) (short) 1, timestampType16, (long) 10, (int) (byte) 0, (int) '#', (java.lang.Object) headers60, (java.io.Serializable) timestampType80);
        int int82 = objConsumerRecord81.partition();
        int int83 = objConsumerRecord81.serializedKeySize();
        java.lang.String str84 = objConsumerRecord81.toString();
        int int85 = objConsumerRecord81.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional86 = objConsumerRecord81.leaderEpoch();
        int int87 = objConsumerRecord81.partition();
        int int88 = objConsumerRecord81.serializedValueSize();
        int int89 = objConsumerRecord81.serializedKeySize();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str36, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str37, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNull(timestampType59);
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 52L + "'", long75 == 52L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertTrue("'" + timestampType80 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType80.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)" + "'", str84, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 35 + "'", int85 == 35);
        org.junit.Assert.assertNotNull(intOptional86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        org.apache.kafka.common.record.TimestampType timestampType14 = null;
        java.lang.Object obj18 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType14, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj18, (java.io.Serializable) 1);
        long long21 = objConsumerRecord20.timestamp();
        int int22 = objConsumerRecord20.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional23 = objConsumerRecord20.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord20, (java.io.Serializable) false);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 0, (long) 97, (java.lang.Object) false, (java.io.Serializable) (short) 100);
        org.apache.kafka.common.record.TimestampType timestampType28 = objConsumerRecord27.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType29 = objConsumerRecord27.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType38 = null;
        java.lang.Object obj42 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType38, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj42, (java.io.Serializable) 1);
        java.lang.String str45 = objConsumerRecord44.toString();
        int int46 = objConsumerRecord44.serializedValueSize();
        int int47 = objConsumerRecord44.serializedKeySize();
        org.apache.kafka.common.header.Headers headers48 = objConsumerRecord44.headers();
        java.lang.String str49 = objConsumerRecord44.toString();
        int int50 = objConsumerRecord44.partition();
        org.apache.kafka.common.record.TimestampType timestampType55 = null;
        java.lang.Object obj59 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType55, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj59, (java.io.Serializable) 1);
        java.lang.String str62 = objConsumerRecord61.toString();
        long long63 = objConsumerRecord61.offset();
        java.lang.String str64 = objConsumerRecord61.toString();
        java.lang.String str65 = objConsumerRecord61.toString();
        org.apache.kafka.common.header.Headers headers66 = objConsumerRecord61.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> strConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 1, null = 0, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 0.0)", 1, (long) (byte) 10, 0L, timestampType29, (java.lang.Long) 0L, 0, (int) (byte) -1, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = 100, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), value = 10)", objConsumerRecord44, headers66);
        java.lang.Object obj68 = objConsumerRecord44.key();
        java.lang.Object obj69 = objConsumerRecord44.key();
        long long70 = objConsumerRecord44.offset();
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType29 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType29.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str45, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(headers48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str49, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str62, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str64, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str65, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.lang.Object obj12 = objConsumerRecord10.key();
        long long13 = objConsumerRecord10.checksum();
        long long14 = objConsumerRecord10.checksum();
        java.lang.String str15 = objConsumerRecord10.topic();
        int int16 = objConsumerRecord10.partition();
        org.apache.kafka.common.record.TimestampType timestampType17 = objConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional18 = objConsumerRecord10.leaderEpoch();
        int int19 = objConsumerRecord10.partition();
        java.lang.String str20 = objConsumerRecord10.topic();
        java.lang.String str21 = objConsumerRecord10.topic();
        int int22 = objConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.timestamp();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord18.leaderEpoch();
        long long21 = objConsumerRecord18.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType4, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord18, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord18.leaderEpoch();
        java.lang.String str25 = objConsumerRecord18.topic();
        java.io.Serializable serializable26 = objConsumerRecord18.value();
        long long27 = objConsumerRecord18.timestamp();
        long long28 = objConsumerRecord18.checksum();
        org.apache.kafka.common.header.Headers headers29 = objConsumerRecord18.headers();
        int int30 = objConsumerRecord18.partition();
        java.lang.String str31 = objConsumerRecord18.topic();
        org.apache.kafka.common.record.TimestampType timestampType32 = objConsumerRecord18.timestampType();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertNotNull(intOptional24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + 1 + "'", serializable26, 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(timestampType32);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.offset();
        long long12 = objConsumerRecord10.checksum();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        java.lang.String str14 = objConsumerRecord10.toString();
        int int15 = objConsumerRecord10.serializedValueSize();
        java.io.Serializable serializable16 = objConsumerRecord10.value();
        java.lang.String str17 = objConsumerRecord10.toString();
        java.io.Serializable serializable18 = objConsumerRecord10.value();
        java.io.Serializable serializable19 = objConsumerRecord10.value();
        java.lang.Object obj20 = objConsumerRecord10.key();
        long long21 = objConsumerRecord10.timestamp();
        long long22 = objConsumerRecord10.offset();
        java.lang.Object obj23 = objConsumerRecord10.key();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1 + "'", serializable16, 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + 1 + "'", serializable18, 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + 1 + "'", serializable19, 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        long long16 = objConsumerRecord13.checksum();
        java.lang.String str17 = objConsumerRecord13.topic();
        int int18 = objConsumerRecord13.serializedKeySize();
        long long19 = objConsumerRecord13.checksum();
        org.apache.kafka.common.record.TimestampType timestampType24 = null;
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        java.lang.Object obj44 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType40, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj44, (java.io.Serializable) 1);
        long long47 = objConsumerRecord46.timestamp();
        java.lang.Object obj48 = objConsumerRecord46.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType32, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord46, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType24, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord50, (java.io.Serializable) 10.0f);
        java.lang.String str53 = objConsumerRecord52.topic();
        org.apache.kafka.common.header.Headers headers54 = objConsumerRecord52.headers();
        java.io.Serializable serializable55 = objConsumerRecord52.value();
        org.apache.kafka.common.header.Headers headers56 = objConsumerRecord52.headers();
        java.lang.Object obj57 = objConsumerRecord52.key();
        long long58 = objConsumerRecord52.checksum();
        java.lang.Class<?> wildcardClass59 = objConsumerRecord52.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 35, NoTimestampType = 10, serialized key size = 100, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 10.0)", 100, (long) '4', (java.lang.Object) long19, (java.io.Serializable) wildcardClass59);
        long long61 = objConsumerRecord60.timestamp();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str53, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertNotNull(headers54);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + 10.0f + "'", serializable55, 10.0f);
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 35, null = 0, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1.0)");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 52L + "'", long58 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        org.apache.kafka.common.record.TimestampType timestampType18 = null;
        java.lang.Object obj22 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType18, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj22, (java.io.Serializable) 1);
        long long25 = objConsumerRecord24.timestamp();
        java.util.Optional<java.lang.Integer> intOptional26 = objConsumerRecord24.leaderEpoch();
        long long27 = objConsumerRecord24.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        java.lang.Object obj36 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType32, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj36, (java.io.Serializable) 1);
        java.lang.String str39 = objConsumerRecord38.toString();
        java.lang.String str40 = objConsumerRecord38.toString();
        java.lang.Class<?> wildcardClass41 = objConsumerRecord38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (short) 10, (java.lang.Object) objConsumerRecord24, (java.io.Serializable) wildcardClass41);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.reflect.AnnotatedElement> objConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 10, 10L, (java.lang.Object) (-1.0f), (java.lang.reflect.AnnotatedElement) wildcardClass41);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = -1, null = 10, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = #)", 35, (-1L), (java.lang.reflect.GenericDeclaration) wildcardClass41, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.io.Serializable> charSequenceConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = 97, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 0)", 97, 97L, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100))", (java.io.Serializable) "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        java.lang.Class<?> wildcardClass47 = charSequenceConsumerRecord46.getClass();
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertNotNull(intOptional26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str39, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str40, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType15, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj19, (java.io.Serializable) 1);
        java.lang.String str22 = objConsumerRecord21.toString();
        long long23 = objConsumerRecord21.offset();
        java.lang.String str24 = objConsumerRecord21.toString();
        org.apache.kafka.common.header.Headers headers25 = objConsumerRecord21.headers();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        java.lang.String str37 = objConsumerRecord36.toString();
        long long38 = objConsumerRecord36.offset();
        java.lang.String str39 = objConsumerRecord36.toString();
        java.lang.String str40 = objConsumerRecord36.toString();
        org.apache.kafka.common.header.Headers headers41 = objConsumerRecord36.headers();
        org.apache.kafka.common.record.TimestampType timestampType46 = null;
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        java.lang.Object obj58 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType54, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj58, (java.io.Serializable) 1);
        java.lang.String str61 = objConsumerRecord60.toString();
        java.lang.String str62 = objConsumerRecord60.toString();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        java.lang.Object obj72 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType68, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj72, (java.io.Serializable) 1);
        java.lang.String str75 = objConsumerRecord74.toString();
        long long76 = objConsumerRecord74.offset();
        org.apache.kafka.common.header.Headers headers77 = objConsumerRecord74.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) (byte) 100, (long) (byte) 1, (long) (short) 1, timestampType46, (java.lang.Long) 10L, (int) (short) 0, (int) (short) 1, (java.lang.Object) str62, (java.io.Serializable) 10, headers77);
        java.util.Optional<java.lang.Integer> intOptional79 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, org.apache.kafka.common.header.Headers> headersConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, org.apache.kafka.common.header.Headers>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", (int) (short) -1, (long) 35, (long) (short) 10, timestampType7, (java.lang.Long) 100L, (int) ' ', (int) ' ', headers25, headers41, headers77, intOptional79);
        org.apache.kafka.common.record.TimestampType timestampType85 = null;
        java.lang.Object obj89 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord91 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType85, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj89, (java.io.Serializable) 1);
        long long92 = objConsumerRecord91.offset();
        long long93 = objConsumerRecord91.timestamp();
        int int94 = objConsumerRecord91.partition();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> headerIterableConsumerRecord95 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", (int) ' ', (long) '#', (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers77, objConsumerRecord91);
        org.apache.kafka.common.record.TimestampType timestampType96 = objConsumerRecord91.timestampType();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str24, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers25);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str37, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str39, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str40, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers41);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str61, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str62, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str75, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNotNull(headers77);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 52L + "'", long93 == 52L);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 10 + "'", int94 == 10);
        org.junit.Assert.assertNull(timestampType96);
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType10, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj14, (java.io.Serializable) 1);
        long long17 = objConsumerRecord16.timestamp();
        java.lang.Object obj18 = objConsumerRecord16.key();
        long long19 = objConsumerRecord16.checksum();
        org.apache.kafka.common.record.TimestampType timestampType24 = null;
        java.lang.Object obj28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType24, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj28, (java.io.Serializable) 1);
        long long31 = objConsumerRecord30.timestamp();
        java.util.Optional<java.lang.Integer> intOptional32 = objConsumerRecord30.leaderEpoch();
        long long33 = objConsumerRecord30.timestamp();
        java.lang.Class<?> wildcardClass34 = objConsumerRecord30.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) -1, (long) 0, (java.lang.Object) objConsumerRecord16, (java.io.Serializable) wildcardClass34);
        java.util.Optional<java.lang.Integer> intOptional36 = objConsumerRecord16.leaderEpoch();
        org.apache.kafka.common.header.Headers headers37 = objConsumerRecord16.headers();
        org.apache.kafka.common.record.TimestampType timestampType48 = null;
        java.lang.Object obj52 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType48, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj52, (java.io.Serializable) 1);
        java.lang.String str55 = objConsumerRecord54.toString();
        java.util.Optional<java.lang.Integer> intOptional56 = objConsumerRecord54.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional57 = objConsumerRecord54.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 1, (long) '4', (java.lang.Object) objConsumerRecord54, (java.io.Serializable) (-1.0d));
        org.apache.kafka.common.record.TimestampType timestampType60 = objConsumerRecord59.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType65 = null;
        java.lang.Object obj69 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType65, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj69, (java.io.Serializable) 1);
        java.lang.String str72 = objConsumerRecord71.toString();
        long long73 = objConsumerRecord71.offset();
        org.apache.kafka.common.header.Headers headers74 = objConsumerRecord71.headers();
        java.lang.String str75 = objConsumerRecord71.topic();
        java.util.Optional<java.lang.Integer> intOptional76 = objConsumerRecord71.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>> timestampTypeEnumConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = class org.apache.kafka.clients.consumer.ConsumerRecord, value = null)", (int) (short) 100, 0L, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType60, intOptional76);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100)", (int) (byte) 100, (long) (byte) -1, (java.lang.Object) headers37, (java.io.Serializable) "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = class org.apache.kafka.clients.consumer.ConsumerRecord, value = null)");
        java.lang.String str79 = objConsumerRecord78.topic();
        org.apache.kafka.common.record.TimestampType timestampType80 = objConsumerRecord78.timestampType();
        long long81 = objConsumerRecord78.timestamp();
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNotNull(intOptional32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(intOptional36);
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str55, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional56);
        org.junit.Assert.assertNotNull(intOptional57);
        org.junit.Assert.assertTrue("'" + timestampType60 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType60.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str72, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(intOptional76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100)" + "'", str79, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType80 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType80.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 0, (long) (byte) 10, (java.lang.Object) "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", (java.io.Serializable) 1L);
        long long6 = objConsumerRecord5.checksum();
        java.util.Optional<java.lang.Integer> intOptional7 = objConsumerRecord5.leaderEpoch();
        java.lang.String str8 = objConsumerRecord5.topic();
        java.io.Serializable serializable9 = objConsumerRecord5.value();
        java.lang.String str10 = objConsumerRecord5.toString();
        long long11 = objConsumerRecord5.offset();
        long long12 = objConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + 1L + "'", serializable9, 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #), value = 1)" + "'", str10, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #), value = 1)");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        int int15 = objConsumerRecord13.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord13.timestampType();
        long long20 = objConsumerRecord13.checksum();
        java.lang.String str21 = objConsumerRecord13.topic();
        int int22 = objConsumerRecord13.serializedKeySize();
        long long23 = objConsumerRecord13.checksum();
        java.io.Serializable serializable24 = objConsumerRecord13.value();
        java.lang.String str25 = objConsumerRecord13.topic();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + 1 + "'", serializable24, 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.lang.String str15 = objConsumerRecord13.toString();
        long long16 = objConsumerRecord13.offset();
        java.lang.String str17 = objConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = objConsumerRecord13.timestampType();
        int int19 = objConsumerRecord13.serializedValueSize();
        long long20 = objConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers21 = objConsumerRecord13.headers();
        java.io.Serializable serializable22 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) 1, (long) (byte) 0, (java.lang.Object) objConsumerRecord13, serializable22);
        int int24 = objConsumerRecord23.serializedValueSize();
        int int25 = objConsumerRecord23.partition();
        org.apache.kafka.common.header.Headers headers26 = objConsumerRecord23.headers();
        org.apache.kafka.common.header.Headers headers27 = objConsumerRecord23.headers();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(timestampType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNotNull(headers21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(headers26);
        org.junit.Assert.assertNotNull(headers27);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.lang.Object obj15 = objConsumerRecord13.key();
        java.lang.Object obj27 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj27, (java.io.Serializable) (byte) 100);
        java.lang.Object obj30 = objConsumerRecord29.key();
        java.lang.String str31 = objConsumerRecord29.toString();
        org.apache.kafka.common.record.TimestampType timestampType32 = objConsumerRecord29.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        java.lang.Object obj44 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType40, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj44, (java.io.Serializable) 1);
        long long47 = objConsumerRecord46.offset();
        long long48 = objConsumerRecord46.checksum();
        org.apache.kafka.common.header.Headers headers49 = objConsumerRecord46.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) (short) 1, (long) 0, timestampType32, 10L, 97, (int) '4', (java.lang.Object) headers49, (java.io.Serializable) 0.0d);
        java.lang.Object obj55 = null;
        java.io.Serializable serializable56 = null;
        org.apache.kafka.common.record.TimestampType timestampType64 = null;
        java.lang.Object obj68 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType64, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj68, (java.io.Serializable) 1);
        java.lang.String str71 = objConsumerRecord70.toString();
        long long72 = objConsumerRecord70.offset();
        org.apache.kafka.common.header.Headers headers73 = objConsumerRecord70.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.io.Serializable> headersConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.io.Serializable>("", (int) (short) 100, (long) 10, headers73, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType80 = null;
        java.lang.Object obj84 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType80, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj84, (java.io.Serializable) 1);
        java.lang.String str87 = objConsumerRecord86.toString();
        long long88 = objConsumerRecord86.offset();
        java.util.Optional<java.lang.Integer> intOptional89 = objConsumerRecord86.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord90 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) 10, (long) 100, 10L, timestampType32, (java.lang.Long) 100L, 0, (int) (short) -1, obj55, serializable56, headers73, intOptional89);
        java.lang.Class<?> wildcardClass91 = intOptional89.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", (int) (short) 0, (-1L), obj15, (java.io.Serializable) wildcardClass91);
        int int93 = objConsumerRecord92.partition();
        org.apache.kafka.common.record.TimestampType timestampType94 = objConsumerRecord92.timestampType();
        int int95 = objConsumerRecord92.partition();
        java.lang.String str96 = objConsumerRecord92.topic();
        java.util.Optional<java.lang.Integer> intOptional97 = objConsumerRecord92.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str31, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(headers49);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str71, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(headers73);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str87, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
        org.junit.Assert.assertNotNull(intOptional89);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + timestampType94 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType94.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)" + "'", str96, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)");
        org.junit.Assert.assertNotNull(intOptional97);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", (int) ' ', (long) (short) 0, (java.lang.Object) "", (java.io.Serializable) 1.0f);
        long long10 = objConsumerRecord9.checksum();
        org.apache.kafka.common.header.Headers headers11 = objConsumerRecord9.headers();
        long long12 = objConsumerRecord9.timestamp();
        java.lang.Object obj13 = objConsumerRecord9.key();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType22 = null;
        java.lang.Object obj26 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType22, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj26, (java.io.Serializable) 1);
        long long29 = objConsumerRecord28.timestamp();
        java.lang.Object obj30 = objConsumerRecord28.key();
        long long31 = objConsumerRecord28.checksum();
        long long32 = objConsumerRecord28.checksum();
        long long33 = objConsumerRecord28.timestamp();
        org.apache.kafka.common.header.Headers headers34 = objConsumerRecord28.headers();
        org.apache.kafka.common.record.TimestampType timestampType35 = objConsumerRecord28.timestampType();
        int int36 = objConsumerRecord28.partition();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord28.leaderEpoch();
        java.lang.Object obj38 = objConsumerRecord28.key();
        long long39 = objConsumerRecord28.timestamp();
        java.lang.Iterable<org.apache.kafka.common.header.Header> headerIterable40 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.lang.Iterable<org.apache.kafka.common.header.Header>> objConsumerRecordConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.lang.Iterable<org.apache.kafka.common.header.Header>>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 10, value = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10))", (int) (short) 100, 97L, (long) (-1), timestampType14, (long) (short) -1, 32, 0, objConsumerRecord28, headerIterable40);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertNotNull(headers34);
        org.junit.Assert.assertNull(timestampType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.timestamp();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord18.leaderEpoch();
        long long21 = objConsumerRecord18.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType4, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord18, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord18.leaderEpoch();
        java.lang.String str25 = objConsumerRecord18.topic();
        java.lang.Object obj26 = objConsumerRecord18.key();
        int int27 = objConsumerRecord18.serializedValueSize();
        long long28 = objConsumerRecord18.checksum();
        org.apache.kafka.common.header.Headers headers29 = objConsumerRecord18.headers();
        int int30 = objConsumerRecord18.partition();
        int int31 = objConsumerRecord18.partition();
        long long32 = objConsumerRecord18.checksum();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertNotNull(intOptional24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        java.lang.Object obj9 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj9, (java.io.Serializable) (byte) 100);
        java.lang.Object obj12 = objConsumerRecord11.key();
        java.lang.String str13 = objConsumerRecord11.toString();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord11.timestampType();
        long long15 = objConsumerRecord11.checksum();
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        long long28 = objConsumerRecord26.timestamp();
        int int29 = objConsumerRecord26.serializedKeySize();
        org.apache.kafka.common.header.Headers headers30 = objConsumerRecord26.headers();
        java.lang.Object obj31 = objConsumerRecord26.key();
        java.lang.Class<?> wildcardClass32 = objConsumerRecord26.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, (long) (short) 10, (java.lang.Object) long15, (java.io.Serializable) wildcardClass32);
        java.lang.String str34 = objConsumerRecord33.topic();
        java.lang.Object obj35 = objConsumerRecord33.key();
        long long36 = objConsumerRecord33.offset();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord33.leaderEpoch();
        java.lang.Object obj38 = objConsumerRecord33.key();
        java.lang.String str39 = objConsumerRecord33.topic();
        org.apache.kafka.common.record.TimestampType timestampType44 = null;
        java.lang.Object obj48 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType44, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj48, (java.io.Serializable) 1);
        long long51 = objConsumerRecord50.timestamp();
        java.util.Optional<java.lang.Integer> intOptional52 = objConsumerRecord50.leaderEpoch();
        long long53 = objConsumerRecord50.checksum();
        org.apache.kafka.common.record.TimestampType timestampType54 = objConsumerRecord50.timestampType();
        java.lang.String str55 = objConsumerRecord50.toString();
        int int56 = objConsumerRecord50.serializedValueSize();
        org.apache.kafka.common.header.Headers headers57 = objConsumerRecord50.headers();
        java.util.Optional<java.lang.Integer> intOptional58 = objConsumerRecord50.leaderEpoch();
        int int59 = objConsumerRecord50.serializedKeySize();
        int int60 = objConsumerRecord50.serializedValueSize();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = class org.apache.kafka.clients.consumer.ConsumerRecord, value = null)", 10, 1L, objConsumerRecord33, objConsumerRecord50);
        int int62 = objConsumerRecord33.partition();
        long long63 = objConsumerRecord33.offset();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(headers30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1L) + "'", obj38, (-1L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertNotNull(intOptional52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNull(timestampType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str55, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertNotNull(intOptional58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord10.timestampType();
        long long12 = objConsumerRecord10.checksum();
        long long13 = objConsumerRecord10.checksum();
        int int14 = objConsumerRecord10.serializedKeySize();
        java.lang.Object obj15 = objConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord10.timestampType();
        java.io.Serializable serializable17 = objConsumerRecord10.value();
        org.junit.Assert.assertNull(timestampType11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        org.apache.kafka.common.record.TimestampType timestampType23 = null;
        java.lang.Object obj27 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType23, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj27, (java.io.Serializable) 1);
        long long30 = objConsumerRecord29.timestamp();
        java.util.Optional<java.lang.Integer> intOptional31 = objConsumerRecord29.leaderEpoch();
        long long32 = objConsumerRecord29.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType15, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord29, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional35 = objConsumerRecord29.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 1L, (long) (short) 10, timestampType7, (long) (byte) 1, (int) (byte) 0, (int) ' ', (java.lang.Object) intOptional35, (java.io.Serializable) 100L);
        int int38 = objConsumerRecord37.serializedValueSize();
        java.lang.String str39 = objConsumerRecord37.topic();
        org.apache.kafka.common.record.TimestampType timestampType44 = null;
        java.lang.Object obj48 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType44, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj48, (java.io.Serializable) 1);
        java.lang.String str51 = objConsumerRecord50.toString();
        int int52 = objConsumerRecord50.serializedValueSize();
        java.lang.String str53 = objConsumerRecord50.toString();
        java.io.Serializable serializable54 = objConsumerRecord50.value();
        long long55 = objConsumerRecord50.offset();
        int int56 = objConsumerRecord50.serializedKeySize();
        java.lang.Class<?> wildcardClass57 = objConsumerRecord50.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false), partition = 1, leaderEpoch = null, offset = 1, null = 10, serialized key size = 0, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 100, (long) (-1), (java.lang.Object) objConsumerRecord37, (java.io.Serializable) wildcardClass57);
        long long59 = objConsumerRecord37.offset();
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(intOptional31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertNotNull(intOptional35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str39, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str51, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str53, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable54 + "' != '" + 1 + "'", serializable54, 1);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj19, (java.io.Serializable) (byte) 100);
        long long22 = objConsumerRecord21.timestamp();
        int int23 = objConsumerRecord21.serializedValueSize();
        long long24 = objConsumerRecord21.checksum();
        org.apache.kafka.common.record.TimestampType timestampType25 = objConsumerRecord21.timestampType();
        java.io.Serializable serializable26 = objConsumerRecord21.value();
        java.lang.Class<?> wildcardClass27 = serializable26.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (int) ' ', (long) (byte) 0, (java.lang.Object) objConsumerRecord13, serializable26);
        long long29 = objConsumerRecord28.timestamp();
        long long30 = objConsumerRecord28.offset();
        long long31 = objConsumerRecord28.checksum();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType25 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType25.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 100 + "'", serializable26, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        long long16 = objConsumerRecord13.timestamp();
        java.io.Serializable serializable17 = objConsumerRecord13.value();
        long long18 = objConsumerRecord13.offset();
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord13.timestampType();
        int int20 = objConsumerRecord13.serializedValueSize();
        long long21 = objConsumerRecord13.offset();
        long long22 = objConsumerRecord13.offset();
        int int23 = objConsumerRecord13.partition();
        int int24 = objConsumerRecord13.serializedValueSize();
        long long25 = objConsumerRecord13.offset();
        java.lang.String str26 = objConsumerRecord13.toString();
        java.lang.String str27 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType39 = null;
        java.lang.Object obj43 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType39, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj43, (java.io.Serializable) 1);
        org.apache.kafka.common.record.TimestampType timestampType46 = objConsumerRecord45.timestampType();
        long long47 = objConsumerRecord45.checksum();
        long long48 = objConsumerRecord45.timestamp();
        java.lang.String str49 = objConsumerRecord45.toString();
        org.apache.kafka.common.header.Headers headers50 = objConsumerRecord45.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", 100, (long) ' ', (java.lang.Object) headers50, (java.io.Serializable) (byte) -1);
        org.apache.kafka.common.record.TimestampType timestampType53 = objConsumerRecord52.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType61 = null;
        java.lang.Object obj65 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType61, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj65, (java.io.Serializable) 1);
        java.lang.String str68 = objConsumerRecord67.toString();
        long long69 = objConsumerRecord67.offset();
        org.apache.kafka.common.header.Headers headers70 = objConsumerRecord67.headers();
        java.lang.String str71 = objConsumerRecord67.toString();
        java.lang.String str72 = objConsumerRecord67.topic();
        int int73 = objConsumerRecord67.serializedKeySize();
        org.apache.kafka.common.header.Headers headers74 = objConsumerRecord67.headers();
        org.apache.kafka.common.record.TimestampType timestampType79 = null;
        java.lang.Object obj83 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType79, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj83, (java.io.Serializable) 1);
        java.lang.String str86 = objConsumerRecord85.toString();
        long long87 = objConsumerRecord85.offset();
        org.apache.kafka.common.header.Headers headers88 = objConsumerRecord85.headers();
        java.lang.String str89 = objConsumerRecord85.toString();
        long long90 = objConsumerRecord85.offset();
        java.io.Serializable serializable91 = objConsumerRecord85.value();
        long long92 = objConsumerRecord85.timestamp();
        java.lang.Class<?> wildcardClass93 = objConsumerRecord85.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord94 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 35, (long) (byte) 0, (long) 0, timestampType53, (long) 0, (int) ' ', (int) (short) 100, (java.lang.Object) headers74, (java.io.Serializable) wildcardClass93);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord95 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 35, NoTimestampType = 10, serialized key size = 100, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 10.0)", 100, (long) 35, (java.lang.Object) str27, (java.io.Serializable) timestampType53);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str26, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str27, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(timestampType46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str49, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers50);
        org.junit.Assert.assertTrue("'" + timestampType53 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType53.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str68, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNotNull(headers70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str71, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNotNull(headers74);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str86, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(headers88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str89, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L) + "'", long90 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 1 + "'", serializable91, 1);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 52L + "'", long92 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        long long13 = objConsumerRecord10.checksum();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord10.headers();
        int int16 = objConsumerRecord10.serializedKeySize();
        java.lang.String str17 = objConsumerRecord10.topic();
        java.lang.Class<?> wildcardClass18 = objConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 1 + "'", serializable14, 1);
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        org.apache.kafka.common.record.TimestampType timestampType8 = null;
        java.lang.Object obj12 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType8, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj12, (java.io.Serializable) 1);
        long long15 = objConsumerRecord14.timestamp();
        java.lang.Object obj16 = objConsumerRecord14.key();
        long long17 = objConsumerRecord14.checksum();
        long long18 = objConsumerRecord14.checksum();
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord14.timestampType();
        long long20 = objConsumerRecord14.checksum();
        org.apache.kafka.common.record.TimestampType timestampType21 = objConsumerRecord14.timestampType();
        int int22 = objConsumerRecord14.partition();
        java.util.Optional<java.lang.Integer> intOptional23 = objConsumerRecord14.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord14.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Object> charSequenceConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Object>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 97, leaderEpoch = null, offset = 35, NoTimestampType = 0, serialized key size = 35, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)", (int) 'a', (long) (byte) 100, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 0, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = NoTimestampType)", (java.lang.Object) objConsumerRecord14);
        long long26 = objConsumerRecord14.timestamp();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(timestampType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertNotNull(intOptional24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType15, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj19, (java.io.Serializable) 1);
        long long22 = objConsumerRecord21.timestamp();
        java.util.Optional<java.lang.Integer> intOptional23 = objConsumerRecord21.leaderEpoch();
        long long24 = objConsumerRecord21.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType7, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord21, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional27 = objConsumerRecord21.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        org.apache.kafka.common.record.TimestampType timestampType49 = null;
        java.lang.Object obj53 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType49, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj53, (java.io.Serializable) 1);
        long long56 = objConsumerRecord55.timestamp();
        java.util.Optional<java.lang.Integer> intOptional57 = objConsumerRecord55.leaderEpoch();
        long long58 = objConsumerRecord55.offset();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> charSequenceConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("", (int) '4', (long) 'a', 0L, timestampType40, 10L, (-1), (int) (short) 0, (java.lang.CharSequence) "hi!", objConsumerRecord55);
        java.lang.Class<?> wildcardClass60 = charSequenceConsumerRecord59.getClass();
        org.apache.kafka.common.record.TimestampType timestampType65 = null;
        java.lang.Object obj69 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType65, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj69, (java.io.Serializable) 1);
        long long72 = objConsumerRecord71.timestamp();
        java.lang.Object obj73 = objConsumerRecord71.key();
        long long74 = objConsumerRecord71.checksum();
        java.lang.Class<?> wildcardClass75 = objConsumerRecord71.getClass();
        org.apache.kafka.common.record.TimestampType timestampType80 = null;
        java.lang.Object obj87 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj87, (java.io.Serializable) (byte) 100);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord91 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) 100, (long) (byte) 10, (long) 0, timestampType80, (-1L), 1, (int) (short) 1, (java.lang.Object) 'a', (java.io.Serializable) (short) 1);
        org.apache.kafka.common.header.Headers headers92 = objConsumerRecord91.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationConsumerRecord93 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>("hi!", 10, (long) (-1), 1L, timestampType32, (java.lang.Long) 52L, (int) (byte) 1, 10, (java.lang.reflect.GenericDeclaration) wildcardClass60, (java.lang.reflect.AnnotatedElement) wildcardClass75, headers92);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord94 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (int) (byte) 1, (long) '4', (java.lang.Object) intOptional27, (java.io.Serializable) 10);
        java.lang.String str95 = objConsumerRecord94.topic();
        long long96 = objConsumerRecord94.checksum();
        java.lang.String str97 = objConsumerRecord94.toString();
        org.apache.kafka.common.record.TimestampType timestampType98 = objConsumerRecord94.timestampType();
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertNotNull(intOptional23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNotNull(intOptional27);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertNotNull(intOptional57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 52L + "'", long72 == 52L);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(headers92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str95, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-1L) + "'", long96 == (-1L));
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = Optional.empty, value = 10)" + "'", str97, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = Optional.empty, value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType98 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType98.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        java.lang.Object obj9 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj9, (java.io.Serializable) (byte) 100);
        java.lang.Object obj12 = objConsumerRecord11.key();
        java.lang.String str13 = objConsumerRecord11.toString();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord11.timestampType();
        long long15 = objConsumerRecord11.checksum();
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.timestamp();
        long long28 = objConsumerRecord26.timestamp();
        int int29 = objConsumerRecord26.serializedKeySize();
        org.apache.kafka.common.header.Headers headers30 = objConsumerRecord26.headers();
        java.lang.Object obj31 = objConsumerRecord26.key();
        java.lang.Class<?> wildcardClass32 = objConsumerRecord26.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, (long) (short) 10, (java.lang.Object) long15, (java.io.Serializable) wildcardClass32);
        java.lang.String str34 = objConsumerRecord33.topic();
        java.lang.Object obj35 = objConsumerRecord33.key();
        long long36 = objConsumerRecord33.offset();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord33.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType38 = objConsumerRecord33.timestampType();
        java.lang.Object obj50 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj50, (java.io.Serializable) (byte) 100);
        java.lang.Object obj53 = objConsumerRecord52.key();
        java.lang.String str54 = objConsumerRecord52.toString();
        org.apache.kafka.common.record.TimestampType timestampType55 = objConsumerRecord52.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType55, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        org.apache.kafka.common.record.TimestampType timestampType69 = null;
        java.lang.Object obj73 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType69, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj73, (java.io.Serializable) 1);
        long long76 = objConsumerRecord75.timestamp();
        java.util.Optional<java.lang.Integer> intOptional77 = objConsumerRecord75.leaderEpoch();
        int int78 = objConsumerRecord75.serializedValueSize();
        java.lang.String str79 = objConsumerRecord75.topic();
        java.util.Optional<java.lang.Integer> intOptional80 = objConsumerRecord75.leaderEpoch();
        org.apache.kafka.common.header.Headers headers81 = objConsumerRecord75.headers();
        java.lang.Object obj82 = objConsumerRecord75.key();
        org.apache.kafka.common.record.TimestampType timestampType83 = objConsumerRecord75.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = -1)", (int) '4', (long) (byte) 100, 52L, timestampType55, (long) (short) 0, 100, 0, (java.lang.Object) objConsumerRecord75, (java.io.Serializable) 10L);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100)", (int) (short) 1, (long) 10, (java.lang.Object) objConsumerRecord33, (java.io.Serializable) "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = -1)");
        java.lang.Object obj87 = objConsumerRecord86.key();
        long long88 = objConsumerRecord86.timestamp();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(headers30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + timestampType38 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType38.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str54, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType55 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType55.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertNotNull(headers81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(timestampType83);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = -1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType7, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord13.timestampType();
        java.lang.String str15 = objConsumerRecord13.toString();
        long long16 = objConsumerRecord13.offset();
        java.io.Serializable serializable17 = objConsumerRecord13.value();
        int int18 = objConsumerRecord13.partition();
        long long19 = objConsumerRecord13.offset();
        java.lang.String str20 = objConsumerRecord13.toString();
        java.lang.CharSequence charSequence24 = null;
        java.lang.Object obj32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj32, (java.io.Serializable) (byte) 100);
        java.lang.Object obj35 = objConsumerRecord34.key();
        java.lang.String str36 = objConsumerRecord34.toString();
        org.apache.kafka.common.record.TimestampType timestampType37 = objConsumerRecord34.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType45 = null;
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        java.lang.Object obj57 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType53, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj57, (java.io.Serializable) 1);
        long long60 = objConsumerRecord59.timestamp();
        java.util.Optional<java.lang.Integer> intOptional61 = objConsumerRecord59.leaderEpoch();
        long long62 = objConsumerRecord59.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord64 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType45, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord59, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional65 = objConsumerRecord59.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, java.lang.String> intOptionalConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, java.lang.String>("hi!", (int) (short) -1, (long) (short) 0, (long) (short) 0, timestampType37, (long) (byte) 0, (int) (byte) 0, 0, intOptional65, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.common.record.TimestampType> charSequenceConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.common.record.TimestampType>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) '4', (long) (byte) -1, charSequence24, timestampType37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders)", (int) (byte) -1, (long) (byte) 1, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) timestampType37);
        java.lang.String str70 = objConsumerRecord69.toString();
        org.apache.kafka.common.record.TimestampType timestampType71 = objConsumerRecord69.timestampType();
        java.lang.Object obj72 = objConsumerRecord69.key();
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str15, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 10 + "'", serializable17, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str20, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str36, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType37 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType37.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertNotNull(intOptional61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertNotNull(intOptional65);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), value = NoTimestampType)" + "'", str70, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), value = NoTimestampType)");
        org.junit.Assert.assertTrue("'" + timestampType71 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType71.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType4, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        int int11 = objConsumerRecord10.partition();
        int int12 = objConsumerRecord10.serializedValueSize();
        int int13 = objConsumerRecord10.serializedValueSize();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        java.lang.String str15 = objConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 10 + "'", serializable14, 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        java.lang.Object obj14 = objConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord10.headers();
        int int16 = objConsumerRecord10.partition();
        int int17 = objConsumerRecord10.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional18 = objConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers19 = objConsumerRecord10.headers();
        int int20 = objConsumerRecord10.serializedValueSize();
        java.lang.Class<?> wildcardClass21 = objConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType4, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        java.lang.String str11 = objConsumerRecord10.topic();
        int int12 = objConsumerRecord10.serializedValueSize();
        java.lang.String str13 = objConsumerRecord10.topic();
        long long14 = objConsumerRecord10.timestamp();
        java.lang.Object obj15 = objConsumerRecord10.key();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0L + "'", obj15, 0L);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        java.lang.Object obj10 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj10, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType17 = null;
        java.lang.Object obj21 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType17, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj21, (java.io.Serializable) 1);
        long long24 = objConsumerRecord23.timestamp();
        java.lang.Object obj25 = objConsumerRecord23.key();
        long long26 = objConsumerRecord23.checksum();
        java.lang.Class<?> wildcardClass27 = objConsumerRecord23.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj10, (java.io.Serializable) wildcardClass27);
        java.lang.Object obj29 = objConsumerRecord28.key();
        long long30 = objConsumerRecord28.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType31 = objConsumerRecord28.timestampType();
        java.lang.String str32 = objConsumerRecord28.toString();
        org.apache.kafka.common.header.Headers headers33 = objConsumerRecord28.headers();
        org.apache.kafka.common.record.TimestampType timestampType34 = objConsumerRecord28.timestampType();
        java.io.Serializable serializable35 = objConsumerRecord28.value();
        org.apache.kafka.common.header.Headers headers36 = objConsumerRecord28.headers();
        org.apache.kafka.common.record.TimestampType timestampType37 = objConsumerRecord28.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType45 = null;
        java.lang.Object obj49 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType45, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj49, (java.io.Serializable) 1);
        long long52 = objConsumerRecord51.timestamp();
        int int53 = objConsumerRecord51.serializedValueSize();
        java.lang.Object obj54 = objConsumerRecord51.key();
        int int55 = objConsumerRecord51.serializedKeySize();
        int int56 = objConsumerRecord51.serializedValueSize();
        org.apache.kafka.common.header.Headers headers57 = objConsumerRecord51.headers();
        java.io.Serializable serializable58 = objConsumerRecord51.value();
        java.lang.Object obj59 = objConsumerRecord51.key();
        java.util.Optional<java.lang.Integer> intOptional60 = objConsumerRecord51.leaderEpoch();
        long long61 = objConsumerRecord51.checksum();
        int int62 = objConsumerRecord51.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType70 = null;
        java.lang.Object obj74 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType70, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj74, (java.io.Serializable) 1);
        long long77 = objConsumerRecord76.timestamp();
        java.util.Optional<java.lang.Integer> intOptional78 = objConsumerRecord76.leaderEpoch();
        int int79 = objConsumerRecord76.serializedValueSize();
        java.lang.String str80 = objConsumerRecord76.topic();
        java.lang.String str81 = objConsumerRecord76.topic();
        java.lang.String str82 = objConsumerRecord76.topic();
        java.util.Optional<java.lang.Integer> intOptional83 = objConsumerRecord76.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", 0, 10L, (java.lang.Object) intOptional83, (java.io.Serializable) 32);
        java.lang.Class<?> wildcardClass86 = intOptional83.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord87 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 0, (long) (byte) 10, (long) 10, timestampType37, (-1L), (int) (short) 0, 52, (java.lang.Object) int62, (java.io.Serializable) wildcardClass86);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str32, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertTrue("'" + timestampType34 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType34.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(serializable35);
        org.junit.Assert.assertNotNull(headers36);
        org.junit.Assert.assertTrue("'" + timestampType37 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType37.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertEquals("'" + serializable58 + "' != '" + 1 + "'", serializable58, 1);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(intOptional60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 52L + "'", long77 == 52L);
        org.junit.Assert.assertNotNull(intOptional78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(intOptional83);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        long long15 = objConsumerRecord13.timestamp();
        int int16 = objConsumerRecord13.serializedKeySize();
        java.lang.Object obj17 = objConsumerRecord13.key();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        java.lang.Object obj31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType27, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj31, (java.io.Serializable) 1);
        java.lang.String str34 = objConsumerRecord33.toString();
        java.lang.String str35 = objConsumerRecord33.toString();
        java.lang.Class<?> wildcardClass36 = objConsumerRecord33.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass36);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (short) 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) (short) -1);
        int int39 = objConsumerRecord13.partition();
        java.lang.String str40 = objConsumerRecord13.topic();
        int int41 = objConsumerRecord13.serializedKeySize();
        int int42 = objConsumerRecord13.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional43 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.header.Headers headers44 = objConsumerRecord13.headers();
        org.apache.kafka.common.header.Headers headers45 = objConsumerRecord13.headers();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str34, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str35, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intOptional43);
        org.junit.Assert.assertNotNull(headers44);
        org.junit.Assert.assertNotNull(headers45);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        java.lang.Object obj7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj7, (java.io.Serializable) (byte) 100);
        java.lang.Object obj10 = objConsumerRecord9.key();
        java.lang.String str11 = objConsumerRecord9.toString();
        org.apache.kafka.common.record.TimestampType timestampType12 = objConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType12, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        int int19 = objConsumerRecord18.serializedKeySize();
        int int20 = objConsumerRecord18.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType21 = objConsumerRecord18.timestampType();
        java.lang.Object obj22 = objConsumerRecord18.key();
        long long23 = objConsumerRecord18.timestamp();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str11, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord10.timestampType();
        long long12 = objConsumerRecord10.checksum();
        long long13 = objConsumerRecord10.timestamp();
        java.lang.String str14 = objConsumerRecord10.toString();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord10.headers();
        long long16 = objConsumerRecord10.checksum();
        java.lang.String str17 = objConsumerRecord10.topic();
        org.junit.Assert.assertNull(timestampType11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj15, (java.io.Serializable) (byte) 100);
        java.lang.Object obj18 = objConsumerRecord17.key();
        java.lang.String str19 = objConsumerRecord17.toString();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType20, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", (int) (byte) -1, (long) 1, (long) 100, timestampType20, (long) '4', 32, (int) (byte) 100, (java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        java.lang.Object obj44 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType40, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj44, (java.io.Serializable) 1);
        java.lang.String str47 = objConsumerRecord46.toString();
        int int48 = objConsumerRecord46.serializedValueSize();
        java.lang.String str49 = objConsumerRecord46.toString();
        java.io.Serializable serializable50 = objConsumerRecord46.value();
        long long51 = objConsumerRecord46.offset();
        java.lang.String str52 = objConsumerRecord46.topic();
        java.lang.Object obj57 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj57, (java.io.Serializable) (byte) 100);
        long long60 = objConsumerRecord59.timestamp();
        org.apache.kafka.common.header.Headers headers61 = objConsumerRecord59.headers();
        org.apache.kafka.common.record.TimestampType timestampType66 = null;
        org.apache.kafka.common.record.TimestampType timestampType74 = null;
        java.lang.Object obj78 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType74, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj78, (java.io.Serializable) 1);
        long long81 = objConsumerRecord80.timestamp();
        java.util.Optional<java.lang.Integer> intOptional82 = objConsumerRecord80.leaderEpoch();
        long long83 = objConsumerRecord80.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType66, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord80, (java.io.Serializable) '#');
        int int86 = objConsumerRecord85.partition();
        java.util.Optional<java.lang.Integer> intOptional87 = objConsumerRecord85.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord88 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", (int) (short) 1, (long) 'a', (-1L), timestampType20, (java.lang.Long) 0L, (int) (short) 1, 35, (java.lang.Object) str52, (java.io.Serializable) 0.0f, headers61, intOptional87);
        java.io.Serializable serializable89 = objConsumerRecord88.value();
        org.apache.kafka.common.record.TimestampType timestampType90 = objConsumerRecord88.timestampType();
        java.lang.String str91 = objConsumerRecord88.toString();
        org.apache.kafka.common.header.Headers headers92 = objConsumerRecord88.headers();
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str47, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str49, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + 1 + "'", serializable50, 1);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(headers61);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 52L + "'", long81 == 52L);
        org.junit.Assert.assertNotNull(intOptional82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 52L + "'", long83 == 52L);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intOptional87);
        org.junit.Assert.assertEquals("'" + serializable89 + "' != '" + 0.0f + "'", serializable89, 0.0f);
        org.junit.Assert.assertTrue("'" + timestampType90 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType90.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 1, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 1, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 0.0)" + "'", str91, "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 1, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = 1, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 0.0)");
        org.junit.Assert.assertNotNull(headers92);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType10, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj14, (java.io.Serializable) 1);
        java.lang.String str17 = objConsumerRecord16.toString();
        long long18 = objConsumerRecord16.offset();
        java.lang.String str19 = objConsumerRecord16.toString();
        org.apache.kafka.common.header.Headers headers20 = objConsumerRecord16.headers();
        java.lang.String str21 = objConsumerRecord16.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", 1, (-1L), (java.lang.Object) str21, (java.io.Serializable) 'a');
        int int24 = objConsumerRecord23.partition();
        org.apache.kafka.common.record.TimestampType timestampType25 = objConsumerRecord23.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.lang.Object obj34 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType30, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj34, (java.io.Serializable) 1);
        long long37 = objConsumerRecord36.timestamp();
        long long38 = objConsumerRecord36.timestamp();
        int int39 = objConsumerRecord36.serializedKeySize();
        java.lang.Object obj40 = objConsumerRecord36.key();
        org.apache.kafka.common.header.Headers headers41 = objConsumerRecord36.headers();
        org.apache.kafka.common.header.Headers headers42 = objConsumerRecord36.headers();
        org.apache.kafka.common.record.TimestampType timestampType43 = objConsumerRecord36.timestampType();
        int int44 = objConsumerRecord36.partition();
        int int45 = objConsumerRecord36.serializedValueSize();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> timestampTypeConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>>("ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (short) 100, (long) (byte) 0, timestampType25, objConsumerRecord36);
        long long47 = objConsumerRecord36.timestamp();
        java.util.Optional<java.lang.Integer> intOptional48 = objConsumerRecord36.leaderEpoch();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + timestampType25 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType25.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(headers41);
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertNull(timestampType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertNotNull(intOptional48);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj14, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType21 = null;
        java.lang.Object obj25 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType21, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj25, (java.io.Serializable) 1);
        long long28 = objConsumerRecord27.timestamp();
        java.lang.Object obj29 = objConsumerRecord27.key();
        long long30 = objConsumerRecord27.checksum();
        java.lang.Class<?> wildcardClass31 = objConsumerRecord27.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj14, (java.io.Serializable) wildcardClass31);
        java.lang.Object obj33 = objConsumerRecord32.key();
        long long34 = objConsumerRecord32.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType35 = objConsumerRecord32.timestampType();
        java.lang.String str36 = objConsumerRecord32.toString();
        org.apache.kafka.common.header.Headers headers37 = objConsumerRecord32.headers();
        org.apache.kafka.common.record.TimestampType timestampType38 = objConsumerRecord32.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType39 = objConsumerRecord32.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType55 = null;
        java.lang.Object obj59 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType55, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj59, (java.io.Serializable) 1);
        long long62 = objConsumerRecord61.timestamp();
        int int63 = objConsumerRecord61.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional64 = objConsumerRecord61.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord61, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType67 = objConsumerRecord61.timestampType();
        java.lang.String str68 = objConsumerRecord61.toString();
        long long69 = objConsumerRecord61.offset();
        int int70 = objConsumerRecord61.serializedKeySize();
        org.apache.kafka.common.header.Headers headers71 = objConsumerRecord61.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, org.apache.kafka.common.header.Headers> strComparableConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, org.apache.kafka.common.header.Headers>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100)", (int) '4', (long) 1, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 100, null = 0, serialized key size = 52, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = class java.util.Optional)", headers71);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Iterable<org.apache.kafka.common.header.Header>> strComparableConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.Iterable<org.apache.kafka.common.header.Header>>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100), partition = 10, leaderEpoch = null, offset = 100, NoTimestampType = 32, serialized key size = 0, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 97, (long) '#', 35L, timestampType39, 0L, 10, (int) '4', (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 0, null = 32, serialized key size = 1, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)", (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers71);
        java.io.Serializable serializable77 = null;
        org.apache.kafka.common.record.TimestampType timestampType78 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, org.apache.kafka.common.record.TimestampType> serializableConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, org.apache.kafka.common.record.TimestampType>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10), partition = 35, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 10, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (short) 1, (long) (byte) 1, 32L, timestampType39, (long) (-1), (int) (byte) 1, 0, serializable77, timestampType78);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType35 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType35.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str36, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertTrue("'" + timestampType38 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType38.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType39 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType39.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(intOptional64);
        org.junit.Assert.assertNull(timestampType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str68, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(headers71);
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        long long15 = objConsumerRecord13.timestamp();
        int int16 = objConsumerRecord13.serializedKeySize();
        java.lang.Object obj17 = objConsumerRecord13.key();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        java.lang.Object obj31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType27, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj31, (java.io.Serializable) 1);
        java.lang.String str34 = objConsumerRecord33.toString();
        java.lang.String str35 = objConsumerRecord33.toString();
        java.lang.Class<?> wildcardClass36 = objConsumerRecord33.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass36);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (short) 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) (short) -1);
        int int39 = objConsumerRecord13.partition();
        long long40 = objConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers41 = objConsumerRecord13.headers();
        java.lang.String str42 = objConsumerRecord13.toString();
        long long43 = objConsumerRecord13.checksum();
        long long44 = objConsumerRecord13.checksum();
        org.apache.kafka.common.header.Headers headers45 = objConsumerRecord13.headers();
        long long46 = objConsumerRecord13.checksum();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str34, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str35, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertNotNull(headers41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str42, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        java.lang.Object obj6 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj6, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType13 = null;
        java.lang.Object obj17 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType13, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj17, (java.io.Serializable) 1);
        long long20 = objConsumerRecord19.timestamp();
        java.lang.Object obj21 = objConsumerRecord19.key();
        long long22 = objConsumerRecord19.checksum();
        java.lang.Class<?> wildcardClass23 = objConsumerRecord19.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj6, (java.io.Serializable) wildcardClass23);
        java.lang.Object obj25 = objConsumerRecord24.key();
        int int26 = objConsumerRecord24.partition();
        long long27 = objConsumerRecord24.offset();
        long long28 = objConsumerRecord24.offset();
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        int int12 = objConsumerRecord10.serializedValueSize();
        java.lang.Object obj13 = objConsumerRecord10.key();
        long long14 = objConsumerRecord10.offset();
        java.lang.String str15 = objConsumerRecord10.toString();
        java.lang.Object obj16 = objConsumerRecord10.key();
        org.apache.kafka.common.record.TimestampType timestampType17 = objConsumerRecord10.timestampType();
        java.io.Serializable serializable18 = objConsumerRecord10.value();
        java.lang.String str19 = objConsumerRecord10.topic();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + 1 + "'", serializable18, 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        int int15 = objConsumerRecord13.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType19 = objConsumerRecord13.timestampType();
        java.lang.String str20 = objConsumerRecord13.topic();
        int int21 = objConsumerRecord13.serializedKeySize();
        org.apache.kafka.common.header.Headers headers22 = objConsumerRecord13.headers();
        long long23 = objConsumerRecord13.checksum();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNull(timestampType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(headers22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional13 = objConsumerRecord10.leaderEpoch();
        int int14 = objConsumerRecord10.partition();
        long long15 = objConsumerRecord10.offset();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord10.timestampType();
        java.io.Serializable serializable17 = objConsumerRecord10.value();
        java.lang.String str18 = objConsumerRecord10.topic();
        java.lang.Object obj19 = objConsumerRecord10.key();
        long long20 = objConsumerRecord10.timestamp();
        java.io.Serializable serializable21 = objConsumerRecord10.value();
        long long22 = objConsumerRecord10.offset();
        long long23 = objConsumerRecord10.offset();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + 1 + "'", serializable21, 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj15, (java.io.Serializable) (byte) 100);
        java.lang.Object obj18 = objConsumerRecord17.key();
        java.lang.String str19 = objConsumerRecord17.toString();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord17.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType33 = null;
        java.lang.Object obj37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType33, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj37, (java.io.Serializable) 1);
        java.lang.String str40 = objConsumerRecord39.toString();
        java.lang.String str41 = objConsumerRecord39.toString();
        java.lang.Class<?> wildcardClass42 = objConsumerRecord39.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass42);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) '#', 100L, (long) 'a', timestampType20, (long) (byte) 100, (int) (byte) -1, 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (java.lang.reflect.AnnotatedElement) wildcardClass42);
        org.apache.kafka.common.record.TimestampType timestampType52 = null;
        java.lang.Object obj56 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType52, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj56, (java.io.Serializable) 1);
        java.lang.String str59 = objConsumerRecord58.toString();
        long long60 = objConsumerRecord58.offset();
        java.lang.String str61 = objConsumerRecord58.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", 100, (long) 97, (long) 'a', timestampType20, (long) (byte) 10, (int) (byte) 10, (int) (byte) -1, (java.lang.Object) objConsumerRecord58, (java.io.Serializable) (byte) 0);
        org.apache.kafka.common.record.TimestampType timestampType71 = null;
        org.apache.kafka.common.record.TimestampType timestampType80 = null;
        java.lang.Object obj84 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType80, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj84, (java.io.Serializable) 1);
        long long87 = objConsumerRecord86.timestamp();
        java.util.Optional<java.lang.Integer> intOptional88 = objConsumerRecord86.leaderEpoch();
        java.lang.Class<?> wildcardClass89 = objConsumerRecord86.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceConsumerRecord90 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '4', (long) 1, (long) 0, timestampType71, 100L, 1, (int) (short) 1, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (java.lang.reflect.GenericDeclaration) wildcardClass89);
        java.io.Serializable serializable91 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", 100, (long) (-1), (long) (short) -1, timestampType20, (long) 100, (int) (short) 0, (int) (byte) 100, (java.lang.Object) 1, serializable91);
        long long93 = objConsumerRecord92.timestamp();
        int int94 = objConsumerRecord92.serializedValueSize();
        java.lang.String str95 = objConsumerRecord92.topic();
        long long96 = objConsumerRecord92.offset();
        java.lang.Object obj97 = objConsumerRecord92.key();
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str40, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str41, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str59, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str61, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 52L + "'", long87 == 52L);
        org.junit.Assert.assertNotNull(intOptional88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-1L) + "'", long93 == (-1L));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 100 + "'", int94 == 100);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str95, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-1L) + "'", long96 == (-1L));
        org.junit.Assert.assertEquals("'" + obj97 + "' != '" + 1 + "'", obj97, 1);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.io.Serializable serializable11 = objConsumerRecord10.value();
        java.io.Serializable serializable12 = objConsumerRecord10.value();
        java.io.Serializable serializable13 = objConsumerRecord10.value();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord10.timestampType();
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + 1 + "'", serializable11, 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 1 + "'", serializable12, 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + 1 + "'", serializable13, 1);
        org.junit.Assert.assertNull(timestampType14);
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        java.lang.String str27 = objConsumerRecord26.toString();
        java.lang.String str28 = objConsumerRecord26.toString();
        org.apache.kafka.common.record.TimestampType timestampType34 = null;
        java.lang.Object obj38 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType34, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj38, (java.io.Serializable) 1);
        java.lang.String str41 = objConsumerRecord40.toString();
        long long42 = objConsumerRecord40.offset();
        org.apache.kafka.common.header.Headers headers43 = objConsumerRecord40.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) (byte) 100, (long) (byte) 1, (long) (short) 1, timestampType12, (java.lang.Long) 10L, (int) (short) 0, (int) (short) 1, (java.lang.Object) str28, (java.io.Serializable) 10, headers43);
        long long45 = objConsumerRecord44.checksum();
        long long46 = objConsumerRecord44.checksum();
        java.lang.String str47 = objConsumerRecord44.toString();
        org.apache.kafka.common.record.TimestampType timestampType52 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType52, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType59 = objConsumerRecord58.timestampType();
        java.lang.String str60 = objConsumerRecord58.toString();
        long long61 = objConsumerRecord58.offset();
        java.io.Serializable serializable62 = objConsumerRecord58.value();
        int int63 = objConsumerRecord58.partition();
        long long64 = objConsumerRecord58.offset();
        java.lang.String str65 = objConsumerRecord58.toString();
        long long66 = objConsumerRecord58.offset();
        int int67 = objConsumerRecord58.serializedKeySize();
        java.lang.Class<?> wildcardClass68 = objConsumerRecord58.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (short) 100, 1L, 52L, timestampType4, (long) 100, (int) (short) 10, (int) (byte) -1, (java.lang.Object) str47, (java.io.Serializable) wildcardClass68);
        org.apache.kafka.common.record.TimestampType timestampType70 = objConsumerRecord69.timestampType();
        long long71 = objConsumerRecord69.offset();
        java.lang.String str72 = objConsumerRecord69.topic();
        org.apache.kafka.common.record.TimestampType timestampType73 = objConsumerRecord69.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType74 = objConsumerRecord69.timestampType();
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str27, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str28, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str41, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(headers43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)" + "'", str47, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 1, null = 1, serialized key size = 0, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10)");
        org.junit.Assert.assertNull(timestampType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str60, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertEquals("'" + serializable62 + "' != '" + 10 + "'", serializable62, 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 100L + "'", long64 == 100L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str65, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L + "'", long66 == 100L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(timestampType70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str72, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertNull(timestampType73);
        org.junit.Assert.assertNull(timestampType74);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord13.timestampType();
        long long15 = objConsumerRecord13.checksum();
        long long16 = objConsumerRecord13.timestamp();
        java.lang.String str17 = objConsumerRecord13.toString();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord13.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", 100, (long) ' ', (java.lang.Object) headers18, (java.io.Serializable) (byte) -1);
        org.apache.kafka.common.record.TimestampType timestampType21 = objConsumerRecord20.timestampType();
        java.lang.Object obj22 = objConsumerRecord20.key();
        long long23 = objConsumerRecord20.offset();
        java.lang.String str24 = objConsumerRecord20.toString();
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "RecordHeaders(headers = [], isReadOnly = false)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "RecordHeaders(headers = [], isReadOnly = false)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "RecordHeaders(headers = [], isReadOnly = false)");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType), partition = 100, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = -1)" + "'", str24, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType), partition = 100, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = -1)");
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.topic();
        java.io.Serializable serializable12 = objConsumerRecord10.value();
        org.apache.kafka.common.record.TimestampType timestampType13 = objConsumerRecord10.timestampType();
        org.apache.kafka.common.header.Headers headers14 = objConsumerRecord10.headers();
        java.lang.String str15 = objConsumerRecord10.toString();
        java.lang.String str16 = objConsumerRecord10.topic();
        int int17 = objConsumerRecord10.partition();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 1 + "'", serializable12, 1);
        org.junit.Assert.assertNull(timestampType13);
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.header.Headers headers14 = objConsumerRecord10.headers();
        int int15 = objConsumerRecord10.serializedKeySize();
        long long16 = objConsumerRecord10.timestamp();
        java.lang.Object obj17 = objConsumerRecord10.key();
        java.lang.String str18 = objConsumerRecord10.toString();
        long long19 = objConsumerRecord10.checksum();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj11, (java.io.Serializable) (byte) 100);
        java.lang.Object obj14 = objConsumerRecord13.key();
        java.lang.String str15 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType29 = null;
        java.lang.Object obj33 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType29, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj33, (java.io.Serializable) 1);
        java.lang.String str36 = objConsumerRecord35.toString();
        java.lang.String str37 = objConsumerRecord35.toString();
        java.lang.Class<?> wildcardClass38 = objConsumerRecord35.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass38);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) '#', 100L, (long) 'a', timestampType16, (long) (byte) 100, (int) (byte) -1, 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (java.lang.reflect.AnnotatedElement) wildcardClass38);
        org.apache.kafka.common.record.TimestampType timestampType48 = null;
        java.lang.Object obj52 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType48, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj52, (java.io.Serializable) 1);
        long long55 = objConsumerRecord54.timestamp();
        java.lang.Object obj56 = objConsumerRecord54.key();
        long long57 = objConsumerRecord54.checksum();
        long long58 = objConsumerRecord54.checksum();
        org.apache.kafka.common.record.TimestampType timestampType59 = objConsumerRecord54.timestampType();
        org.apache.kafka.common.header.Headers headers60 = objConsumerRecord54.headers();
        org.apache.kafka.common.record.TimestampType timestampType68 = null;
        java.lang.Object obj72 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord74 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType68, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj72, (java.io.Serializable) 1);
        long long75 = objConsumerRecord74.timestamp();
        int int76 = objConsumerRecord74.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = objConsumerRecord74.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord74, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType80 = objConsumerRecord79.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), 1L, (long) (short) 1, timestampType16, (long) 10, (int) (byte) 0, (int) '#', (java.lang.Object) headers60, (java.io.Serializable) timestampType80);
        int int82 = objConsumerRecord81.partition();
        long long83 = objConsumerRecord81.timestamp();
        long long84 = objConsumerRecord81.checksum();
        java.io.Serializable serializable85 = objConsumerRecord81.value();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str36, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str37, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNull(timestampType59);
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 52L + "'", long75 == 52L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertTrue("'" + timestampType80 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType80.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10L + "'", long84 == 10L);
        org.junit.Assert.assertTrue("'" + serializable85 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable85.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!), partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 35, serialized key size = 35, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) ' ', (long) 0, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 35, NoTimestampType = 10, serialized key size = 100, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 10.0)", "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = -1), partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = null)");
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.topic();
        java.io.Serializable serializable12 = objConsumerRecord10.value();
        int int13 = objConsumerRecord10.partition();
        java.lang.Object obj14 = objConsumerRecord10.key();
        java.lang.String str15 = objConsumerRecord10.topic();
        java.io.Serializable serializable16 = objConsumerRecord10.value();
        java.io.Serializable serializable17 = objConsumerRecord10.value();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord10.headers();
        int int19 = objConsumerRecord10.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 1 + "'", serializable12, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1 + "'", serializable16, 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        int int13 = objConsumerRecord10.serializedValueSize();
        java.lang.String str14 = objConsumerRecord10.topic();
        java.lang.String str15 = objConsumerRecord10.topic();
        java.lang.String str16 = objConsumerRecord10.topic();
        int int17 = objConsumerRecord10.serializedValueSize();
        java.lang.String str18 = objConsumerRecord10.toString();
        int int19 = objConsumerRecord10.partition();
        int int20 = objConsumerRecord10.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional21 = objConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional22 = objConsumerRecord10.leaderEpoch();
        java.io.Serializable serializable23 = objConsumerRecord10.value();
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertNotNull(intOptional22);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + 1 + "'", serializable23, 1);
        org.junit.Assert.assertNotNull(intOptional24);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        long long15 = objConsumerRecord13.timestamp();
        int int16 = objConsumerRecord13.serializedKeySize();
        java.lang.Object obj17 = objConsumerRecord13.key();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        java.lang.Object obj31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType27, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj31, (java.io.Serializable) 1);
        java.lang.String str34 = objConsumerRecord33.toString();
        java.lang.String str35 = objConsumerRecord33.toString();
        java.lang.Class<?> wildcardClass36 = objConsumerRecord33.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass36);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (short) 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) (short) -1);
        int int39 = objConsumerRecord13.partition();
        long long40 = objConsumerRecord13.timestamp();
        org.apache.kafka.common.header.Headers headers41 = objConsumerRecord13.headers();
        java.lang.String str42 = objConsumerRecord13.toString();
        long long43 = objConsumerRecord13.checksum();
        long long44 = objConsumerRecord13.checksum();
        long long45 = objConsumerRecord13.timestamp();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str34, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str35, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertNotNull(headers41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str42, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType7, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord13.timestampType();
        java.lang.String str15 = objConsumerRecord13.toString();
        long long16 = objConsumerRecord13.offset();
        java.io.Serializable serializable17 = objConsumerRecord13.value();
        int int18 = objConsumerRecord13.partition();
        long long19 = objConsumerRecord13.offset();
        java.lang.String str20 = objConsumerRecord13.toString();
        java.lang.CharSequence charSequence24 = null;
        java.lang.Object obj32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj32, (java.io.Serializable) (byte) 100);
        java.lang.Object obj35 = objConsumerRecord34.key();
        java.lang.String str36 = objConsumerRecord34.toString();
        org.apache.kafka.common.record.TimestampType timestampType37 = objConsumerRecord34.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType45 = null;
        org.apache.kafka.common.record.TimestampType timestampType53 = null;
        java.lang.Object obj57 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType53, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj57, (java.io.Serializable) 1);
        long long60 = objConsumerRecord59.timestamp();
        java.util.Optional<java.lang.Integer> intOptional61 = objConsumerRecord59.leaderEpoch();
        long long62 = objConsumerRecord59.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord64 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType45, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord59, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional65 = objConsumerRecord59.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, java.lang.String> intOptionalConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, java.lang.String>("hi!", (int) (short) -1, (long) (short) 0, (long) (short) 0, timestampType37, (long) (byte) 0, (int) (byte) 0, 0, intOptional65, "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.common.record.TimestampType> charSequenceConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.common.record.TimestampType>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) '4', (long) (byte) -1, charSequence24, timestampType37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord69 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders)", (int) (byte) -1, (long) (byte) 1, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) timestampType37);
        org.apache.kafka.common.record.TimestampType timestampType70 = objConsumerRecord69.timestampType();
        java.io.Serializable serializable71 = objConsumerRecord69.value();
        long long72 = objConsumerRecord69.timestamp();
        org.apache.kafka.common.header.Headers headers73 = objConsumerRecord69.headers();
        int int74 = objConsumerRecord69.partition();
        long long75 = objConsumerRecord69.timestamp();
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str15, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 10 + "'", serializable17, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str20, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str36, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType37 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType37.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertNotNull(intOptional61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertNotNull(intOptional65);
        org.junit.Assert.assertTrue("'" + timestampType70 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType70.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + serializable71 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable71.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(headers73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.timestamp();
        java.lang.Object obj20 = objConsumerRecord18.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType4, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord18, (java.io.Serializable) (-1.0d));
        long long23 = objConsumerRecord18.timestamp();
        org.apache.kafka.common.header.Headers headers24 = objConsumerRecord18.headers();
        int int25 = objConsumerRecord18.serializedValueSize();
        int int26 = objConsumerRecord18.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertNotNull(headers24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", (int) ' ', (long) (short) 0, (java.lang.Object) "", (java.io.Serializable) 1.0f);
        long long14 = objConsumerRecord13.checksum();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.kafka.common.record.TimestampType> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.kafka.common.record.TimestampType>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (int) '#', 0L, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = 100, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), value = 10)", timestampType16);
        org.apache.kafka.common.record.TimestampType timestampType25 = null;
        java.lang.Object obj29 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType25, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj29, (java.io.Serializable) 1);
        long long32 = objConsumerRecord31.timestamp();
        java.util.Optional<java.lang.Integer> intOptional33 = objConsumerRecord31.leaderEpoch();
        long long34 = objConsumerRecord31.timestamp();
        java.io.Serializable serializable35 = objConsumerRecord31.value();
        long long36 = objConsumerRecord31.timestamp();
        java.lang.String str37 = objConsumerRecord31.toString();
        java.lang.Class<?> wildcardClass38 = objConsumerRecord31.getClass();
        org.apache.kafka.common.record.TimestampType timestampType39 = null;
        org.apache.kafka.common.record.TimestampType timestampType44 = null;
        java.lang.Object obj48 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType44, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj48, (java.io.Serializable) 1);
        long long51 = objConsumerRecord50.timestamp();
        long long52 = objConsumerRecord50.timestamp();
        int int53 = objConsumerRecord50.serializedKeySize();
        org.apache.kafka.common.header.Headers headers54 = objConsumerRecord50.headers();
        long long55 = objConsumerRecord50.checksum();
        org.apache.kafka.common.header.Headers headers56 = objConsumerRecord50.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, org.apache.kafka.common.record.TimestampType> genericDeclarationConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, org.apache.kafka.common.record.TimestampType>("ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = 32, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) 'a', (long) (byte) -1, 0L, timestampType16, (java.lang.Long) 10L, (int) (byte) 100, (int) (short) 0, (java.lang.reflect.GenericDeclaration) wildcardClass38, timestampType39, headers56);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertNotNull(intOptional33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + 1 + "'", serializable35, 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str37, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(headers54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(headers56);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType15, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj19, (java.io.Serializable) 1);
        java.lang.String str22 = objConsumerRecord21.toString();
        long long23 = objConsumerRecord21.offset();
        org.apache.kafka.common.header.Headers headers24 = objConsumerRecord21.headers();
        java.lang.String str25 = objConsumerRecord21.toString();
        long long26 = objConsumerRecord21.offset();
        long long27 = objConsumerRecord21.checksum();
        java.lang.Object obj28 = objConsumerRecord21.key();
        org.apache.kafka.common.record.TimestampType timestampType29 = objConsumerRecord21.timestampType();
        long long30 = objConsumerRecord21.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType31 = objConsumerRecord21.timestampType();
        java.lang.String str32 = objConsumerRecord21.topic();
        org.apache.kafka.common.header.Headers headers33 = objConsumerRecord21.headers();
        int int34 = objConsumerRecord21.serializedKeySize();
        java.lang.String str35 = objConsumerRecord21.topic();
        long long36 = objConsumerRecord21.checksum();
        org.apache.kafka.common.record.TimestampType timestampType41 = null;
        java.lang.Object obj45 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType41, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj45, (java.io.Serializable) 1);
        java.lang.String str48 = objConsumerRecord47.toString();
        java.util.Optional<java.lang.Integer> intOptional49 = objConsumerRecord47.leaderEpoch();
        int int50 = objConsumerRecord47.serializedKeySize();
        long long51 = objConsumerRecord47.timestamp();
        org.apache.kafka.common.header.Headers headers52 = objConsumerRecord47.headers();
        long long53 = objConsumerRecord47.offset();
        java.lang.Object obj54 = objConsumerRecord47.key();
        int int55 = objConsumerRecord47.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional56 = objConsumerRecord47.leaderEpoch();
        org.apache.kafka.common.header.Headers headers57 = objConsumerRecord47.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Iterable<org.apache.kafka.common.header.Header>> objConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Iterable<org.apache.kafka.common.header.Header>>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 32, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = 32, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 1, (long) (byte) 0, 0L, timestampType7, (long) '4', 97, 0, (java.lang.Object) objConsumerRecord21, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers57);
        org.apache.kafka.common.record.TimestampType timestampType63 = null;
        org.apache.kafka.common.record.TimestampType timestampType72 = null;
        java.lang.Object obj76 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType72, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj76, (java.io.Serializable) 1);
        java.lang.String str79 = objConsumerRecord78.toString();
        long long80 = objConsumerRecord78.offset();
        java.lang.String str81 = objConsumerRecord78.toString();
        long long82 = objConsumerRecord78.checksum();
        java.lang.Object obj83 = objConsumerRecord78.key();
        java.lang.Class<?> wildcardClass84 = objConsumerRecord78.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType), partition = 32, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 1.0)", (int) (short) -1, 10L, (long) 97, timestampType63, (long) (short) -1, (int) (short) -1, (int) (short) 1, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = , partition = 32, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 10, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1))", (java.lang.reflect.GenericDeclaration) wildcardClass84);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.GenericDeclaration> headerIterableConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 0, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = NoTimestampType)", 0, (long) (byte) 1, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers57, (java.lang.reflect.GenericDeclaration) wildcardClass84);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(headers24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str25, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(timestampType29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNull(timestampType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str48, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(intOptional56);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str79, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str81, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.offset();
        long long12 = objConsumerRecord10.checksum();
        long long13 = objConsumerRecord10.offset();
        int int14 = objConsumerRecord10.serializedKeySize();
        long long15 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers17 = objConsumerRecord10.headers();
        int int18 = objConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional19 = objConsumerRecord10.leaderEpoch();
        java.lang.String str20 = objConsumerRecord10.toString();
        java.lang.String str21 = objConsumerRecord10.topic();
        long long22 = objConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(intOptional19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str20, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.offset();
        long long20 = objConsumerRecord18.checksum();
        long long21 = objConsumerRecord18.timestamp();
        java.lang.String str22 = objConsumerRecord18.topic();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", 0, (long) (short) 100, (long) '4', timestampType4, 0L, (int) (byte) 10, 35, (java.lang.Object) objConsumerRecord18, (java.io.Serializable) true);
        java.lang.String str25 = objConsumerRecord18.topic();
        long long26 = objConsumerRecord18.offset();
        long long27 = objConsumerRecord18.offset();
        int int28 = objConsumerRecord18.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        long long12 = objConsumerRecord10.offset();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        java.lang.String str14 = objConsumerRecord10.toString();
        long long15 = objConsumerRecord10.offset();
        java.io.Serializable serializable16 = objConsumerRecord10.value();
        long long17 = objConsumerRecord10.timestamp();
        java.lang.Object obj18 = objConsumerRecord10.key();
        java.lang.String str19 = objConsumerRecord10.topic();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord10.timestampType();
        int int21 = objConsumerRecord10.partition();
        java.lang.Object obj22 = objConsumerRecord10.key();
        long long23 = objConsumerRecord10.timestamp();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1 + "'", serializable16, 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(timestampType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        org.apache.kafka.common.record.TimestampType timestampType15 = null;
        java.lang.Object obj19 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType15, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj19, (java.io.Serializable) 1);
        long long22 = objConsumerRecord21.offset();
        long long23 = objConsumerRecord21.checksum();
        org.apache.kafka.common.header.Headers headers24 = objConsumerRecord21.headers();
        java.lang.String str25 = objConsumerRecord21.toString();
        org.apache.kafka.common.header.Headers headers26 = objConsumerRecord21.headers();
        int int27 = objConsumerRecord21.partition();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders), partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (byte) 100, (long) 'a', (java.lang.Object) objConsumerRecord21, (java.io.Serializable) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.apache.kafka.common.record.TimestampType timestampType30 = objConsumerRecord29.timestampType();
        java.lang.reflect.Type type34 = null;
        org.apache.kafka.common.record.TimestampType timestampType46 = null;
        java.lang.Object obj50 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType46, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj50, (java.io.Serializable) 1);
        java.lang.String str53 = objConsumerRecord52.toString();
        java.util.Optional<java.lang.Integer> intOptional54 = objConsumerRecord52.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional55 = objConsumerRecord52.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 1, (long) '4', (java.lang.Object) objConsumerRecord52, (java.io.Serializable) (-1.0d));
        java.lang.String str58 = objConsumerRecord52.toString();
        int int59 = objConsumerRecord52.serializedKeySize();
        org.apache.kafka.common.header.Headers headers60 = objConsumerRecord52.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.String> headerIterableConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.String>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) 'a', 97L, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers60, "ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)");
        org.apache.kafka.common.record.TimestampType timestampType67 = null;
        java.lang.Object obj71 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType67, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj71, (java.io.Serializable) 1);
        java.lang.String str74 = objConsumerRecord73.toString();
        int int75 = objConsumerRecord73.serializedValueSize();
        java.lang.String str76 = objConsumerRecord73.toString();
        java.lang.String str77 = objConsumerRecord73.toString();
        java.lang.String str78 = objConsumerRecord73.topic();
        java.lang.String str79 = objConsumerRecord73.topic();
        java.lang.Object obj80 = objConsumerRecord73.key();
        java.util.Optional<java.lang.Integer> intOptional81 = objConsumerRecord73.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, java.lang.String> typeConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, java.lang.String>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 32)", 0, (long) (short) 100, 100L, timestampType30, (java.lang.Long) 0L, 0, (int) (byte) 10, type34, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 0, leaderEpoch = null, offset = 100, null = 52, serialized key size = 10, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)", headers60, intOptional81);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.common.header.Headers> charSequenceConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, org.apache.kafka.common.header.Headers>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 35, NoTimestampType = 97, serialized key size = 0, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 32, null = 1, serialized key size = 52, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), value = null)", (int) (short) 0, 100L, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 100, leaderEpoch = null, offset = 0, null = 32, serialized key size = 1, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = 10), partition = 0, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = -1)", headers60);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(headers24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str25, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(headers26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + timestampType30 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType30.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str53, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional54);
        org.junit.Assert.assertNotNull(intOptional55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str58, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str74, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str76, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str77, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(intOptional81);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.header.Headers headers12 = objConsumerRecord10.headers();
        org.apache.kafka.common.header.Headers headers13 = objConsumerRecord10.headers();
        int int14 = objConsumerRecord10.partition();
        int int15 = objConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord10.timestampType();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(timestampType16);
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        java.lang.Object obj14 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType10, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj14, (java.io.Serializable) 1);
        java.lang.String str17 = objConsumerRecord16.toString();
        long long18 = objConsumerRecord16.offset();
        java.lang.String str19 = objConsumerRecord16.toString();
        long long20 = objConsumerRecord16.checksum();
        int int21 = objConsumerRecord16.serializedValueSize();
        long long22 = objConsumerRecord16.checksum();
        org.apache.kafka.common.header.Headers headers23 = objConsumerRecord16.headers();
        org.apache.kafka.common.record.TimestampType timestampType31 = null;
        java.lang.Object obj35 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType31, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj35, (java.io.Serializable) 1);
        long long38 = objConsumerRecord37.timestamp();
        java.util.Optional<java.lang.Integer> intOptional39 = objConsumerRecord37.leaderEpoch();
        long long40 = objConsumerRecord37.checksum();
        org.apache.kafka.common.record.TimestampType timestampType41 = objConsumerRecord37.timestampType();
        java.lang.Object obj48 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj48, (java.io.Serializable) (byte) 100);
        org.apache.kafka.common.record.TimestampType timestampType55 = null;
        java.lang.Object obj59 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType55, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj59, (java.io.Serializable) 1);
        long long62 = objConsumerRecord61.timestamp();
        java.lang.Object obj63 = objConsumerRecord61.key();
        long long64 = objConsumerRecord61.checksum();
        java.lang.Class<?> wildcardClass65 = objConsumerRecord61.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) 1, (long) '#', obj48, (java.io.Serializable) wildcardClass65);
        java.lang.Object obj67 = objConsumerRecord66.key();
        long long68 = objConsumerRecord66.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType69 = objConsumerRecord66.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType70 = objConsumerRecord66.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 0, (-1L), (java.lang.Object) objConsumerRecord37, (java.io.Serializable) timestampType70);
        java.lang.Class<?> wildcardClass72 = objConsumerRecord71.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord73 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)", 0, (long) 97, (java.lang.Object) headers23, (java.io.Serializable) wildcardClass72);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) 0, (long) (short) 100, (java.lang.Object) "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)", (java.io.Serializable) true);
        java.lang.Object obj76 = objConsumerRecord75.key();
        java.lang.Object obj77 = objConsumerRecord75.key();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(intOptional39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNull(timestampType41);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType69 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType69.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType70 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType70.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)" + "'", obj76, "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)");
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)" + "'", obj77, "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)");
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj15, (java.io.Serializable) (byte) 100);
        java.lang.Object obj18 = objConsumerRecord17.key();
        java.lang.String str19 = objConsumerRecord17.toString();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord17.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType28 = null;
        java.lang.Object obj32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType28, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj32, (java.io.Serializable) 1);
        long long35 = objConsumerRecord34.offset();
        long long36 = objConsumerRecord34.checksum();
        org.apache.kafka.common.header.Headers headers37 = objConsumerRecord34.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) (short) 1, (long) 0, timestampType20, 10L, 97, (int) '4', (java.lang.Object) headers37, (java.io.Serializable) 0.0d);
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        java.lang.Object obj51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType47, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj51, (java.io.Serializable) 1);
        java.lang.String str54 = objConsumerRecord53.toString();
        long long55 = objConsumerRecord53.offset();
        org.apache.kafka.common.header.Headers headers56 = objConsumerRecord53.headers();
        java.lang.String str57 = objConsumerRecord53.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (int) 'a', 35L, (long) 0, timestampType20, 52L, (int) '#', 10, (java.lang.Object) objConsumerRecord53, (java.io.Serializable) true);
        java.lang.Object obj63 = null;
        org.apache.kafka.common.record.TimestampType timestampType69 = null;
        java.lang.Object obj73 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType69, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj73, (java.io.Serializable) 1);
        long long76 = objConsumerRecord75.timestamp();
        long long77 = objConsumerRecord75.timestamp();
        int int78 = objConsumerRecord75.serializedKeySize();
        org.apache.kafka.common.header.Headers headers79 = objConsumerRecord75.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), 35L, (long) 'a', timestampType20, (java.lang.Long) 0L, 0, 97, obj63, (java.io.Serializable) (byte) 1, headers79);
        java.util.Optional<java.lang.Integer> intOptional81 = objConsumerRecord80.leaderEpoch();
        int int82 = objConsumerRecord80.serializedKeySize();
        java.lang.String str83 = objConsumerRecord80.topic();
        long long84 = objConsumerRecord80.timestamp();
        long long85 = objConsumerRecord80.checksum();
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str54, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str57, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 52L + "'", long77 == 52L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertNotNull(intOptional81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 97L + "'", long84 == 97L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj15, (java.io.Serializable) (byte) 100);
        java.lang.Object obj18 = objConsumerRecord17.key();
        java.lang.String str19 = objConsumerRecord17.toString();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord17.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType28 = null;
        java.lang.Object obj32 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType28, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj32, (java.io.Serializable) 1);
        long long35 = objConsumerRecord34.offset();
        long long36 = objConsumerRecord34.checksum();
        org.apache.kafka.common.header.Headers headers37 = objConsumerRecord34.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) (short) 1, (long) 0, timestampType20, 10L, 97, (int) '4', (java.lang.Object) headers37, (java.io.Serializable) 0.0d);
        org.apache.kafka.common.record.TimestampType timestampType47 = null;
        java.lang.Object obj51 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType47, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj51, (java.io.Serializable) 1);
        java.lang.String str54 = objConsumerRecord53.toString();
        long long55 = objConsumerRecord53.offset();
        org.apache.kafka.common.header.Headers headers56 = objConsumerRecord53.headers();
        java.lang.String str57 = objConsumerRecord53.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", (int) 'a', 35L, (long) 0, timestampType20, 52L, (int) '#', 10, (java.lang.Object) objConsumerRecord53, (java.io.Serializable) true);
        java.lang.Object obj63 = null;
        org.apache.kafka.common.record.TimestampType timestampType69 = null;
        java.lang.Object obj73 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType69, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj73, (java.io.Serializable) 1);
        long long76 = objConsumerRecord75.timestamp();
        long long77 = objConsumerRecord75.timestamp();
        int int78 = objConsumerRecord75.serializedKeySize();
        org.apache.kafka.common.header.Headers headers79 = objConsumerRecord75.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), 35L, (long) 'a', timestampType20, (java.lang.Long) 0L, 0, 97, obj63, (java.io.Serializable) (byte) 1, headers79);
        java.util.Optional<java.lang.Integer> intOptional81 = objConsumerRecord80.leaderEpoch();
        java.io.Serializable serializable82 = objConsumerRecord80.value();
        java.lang.Object obj83 = objConsumerRecord80.key();
        java.lang.Object obj84 = objConsumerRecord80.key();
        java.lang.String str85 = objConsumerRecord80.toString();
        java.lang.Object obj86 = objConsumerRecord80.key();
        java.lang.String str87 = objConsumerRecord80.topic();
        int int88 = objConsumerRecord80.serializedKeySize();
        int int89 = objConsumerRecord80.partition();
        org.apache.kafka.common.header.Headers headers90 = objConsumerRecord80.headers();
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str54, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str57, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 52L + "'", long77 == 52L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertNotNull(intOptional81);
        org.junit.Assert.assertEquals("'" + serializable82 + "' != '" + (byte) 1 + "'", serializable82, (byte) 1);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 35, NoTimestampType = 97, serialized key size = 0, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str85, "ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 35, NoTimestampType = 97, serialized key size = 0, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(headers90);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.lang.String str15 = objConsumerRecord13.toString();
        long long16 = objConsumerRecord13.offset();
        java.lang.String str17 = objConsumerRecord13.topic();
        long long18 = objConsumerRecord13.offset();
        org.apache.kafka.common.header.Headers headers19 = objConsumerRecord13.headers();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType25 = null;
        java.lang.Object obj29 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType25, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj29, (java.io.Serializable) 1);
        java.lang.String str32 = objConsumerRecord31.toString();
        long long33 = objConsumerRecord31.timestamp();
        org.apache.kafka.common.header.Headers headers34 = objConsumerRecord31.headers();
        int int35 = objConsumerRecord31.partition();
        java.lang.Class<?> wildcardClass36 = objConsumerRecord31.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (short) 1, (long) (byte) 1, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) wildcardClass36);
        java.lang.String str38 = objConsumerRecord37.topic();
        org.apache.kafka.common.header.Headers headers39 = objConsumerRecord37.headers();
        int int40 = objConsumerRecord37.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str15, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str32, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertNotNull(headers34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str38, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = -1, null = 1, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertNotNull(headers39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '4', (long) (short) 100, (java.lang.Object) (-1.0d), (java.io.Serializable) (-1.0d));
        java.lang.String str9 = objConsumerRecord8.topic();
        long long10 = objConsumerRecord8.checksum();
        java.io.Serializable serializable11 = objConsumerRecord8.value();
        org.apache.kafka.common.record.TimestampType timestampType16 = null;
        java.lang.Object obj20 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType16, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj20, (java.io.Serializable) 1);
        java.lang.String str23 = objConsumerRecord22.toString();
        long long24 = objConsumerRecord22.offset();
        org.apache.kafka.common.header.Headers headers25 = objConsumerRecord22.headers();
        java.lang.String str26 = objConsumerRecord22.toString();
        long long27 = objConsumerRecord22.offset();
        long long28 = objConsumerRecord22.checksum();
        int int29 = objConsumerRecord22.partition();
        java.io.Serializable serializable30 = objConsumerRecord22.value();
        java.util.Optional<java.lang.Integer> intOptional31 = objConsumerRecord22.leaderEpoch();
        java.lang.Class<?> wildcardClass32 = intOptional31.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders)", (-1), (long) (byte) 1, (java.lang.Object) serializable11, (java.io.Serializable) wildcardClass32);
        int int34 = objConsumerRecord33.serializedValueSize();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str9, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (-1.0d) + "'", serializable11, (-1.0d));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str23, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(headers25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str26, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 1 + "'", serializable30, 1);
        org.junit.Assert.assertNotNull(intOptional31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj15, (java.io.Serializable) (byte) 100);
        java.lang.Object obj18 = objConsumerRecord17.key();
        java.lang.String str19 = objConsumerRecord17.toString();
        org.apache.kafka.common.record.TimestampType timestampType20 = objConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType20, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", (int) (byte) -1, (long) 1, (long) 100, timestampType20, (long) '4', 32, (int) (byte) 100, (java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        java.lang.Object obj44 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType40, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj44, (java.io.Serializable) 1);
        java.lang.String str47 = objConsumerRecord46.toString();
        int int48 = objConsumerRecord46.serializedValueSize();
        java.lang.String str49 = objConsumerRecord46.toString();
        java.io.Serializable serializable50 = objConsumerRecord46.value();
        long long51 = objConsumerRecord46.offset();
        java.lang.String str52 = objConsumerRecord46.topic();
        java.lang.Object obj57 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj57, (java.io.Serializable) (byte) 100);
        long long60 = objConsumerRecord59.timestamp();
        org.apache.kafka.common.header.Headers headers61 = objConsumerRecord59.headers();
        org.apache.kafka.common.record.TimestampType timestampType66 = null;
        org.apache.kafka.common.record.TimestampType timestampType74 = null;
        java.lang.Object obj78 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType74, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj78, (java.io.Serializable) 1);
        long long81 = objConsumerRecord80.timestamp();
        java.util.Optional<java.lang.Integer> intOptional82 = objConsumerRecord80.leaderEpoch();
        long long83 = objConsumerRecord80.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType66, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord80, (java.io.Serializable) '#');
        int int86 = objConsumerRecord85.partition();
        java.util.Optional<java.lang.Integer> intOptional87 = objConsumerRecord85.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord88 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", (int) (short) 1, (long) 'a', (-1L), timestampType20, (java.lang.Long) 0L, (int) (short) 1, 35, (java.lang.Object) str52, (java.io.Serializable) 0.0f, headers61, intOptional87);
        long long89 = objConsumerRecord88.timestamp();
        long long90 = objConsumerRecord88.timestamp();
        int int91 = objConsumerRecord88.partition();
        java.lang.Object obj92 = objConsumerRecord88.key();
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str47, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str49, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + 1 + "'", serializable50, 1);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(headers61);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 52L + "'", long81 == 52L);
        org.junit.Assert.assertNotNull(intOptional82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 52L + "'", long83 == 52L);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intOptional87);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L) + "'", long90 == (-1L));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + "" + "'", obj92, "");
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        int int15 = objConsumerRecord13.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) false);
        java.lang.String str19 = objConsumerRecord18.toString();
        int int20 = objConsumerRecord18.partition();
        long long21 = objConsumerRecord18.timestamp();
        int int22 = objConsumerRecord18.partition();
        java.io.Serializable serializable23 = objConsumerRecord18.value();
        int int24 = objConsumerRecord18.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + false + "'", serializable23, false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        org.apache.kafka.common.record.TimestampType timestampType10 = null;
        org.apache.kafka.common.record.TimestampType timestampType18 = null;
        java.lang.Object obj22 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType18, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj22, (java.io.Serializable) 1);
        long long25 = objConsumerRecord24.timestamp();
        java.util.Optional<java.lang.Integer> intOptional26 = objConsumerRecord24.leaderEpoch();
        long long27 = objConsumerRecord24.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType10, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord24, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional30 = objConsumerRecord24.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)", 100, 35L, (java.lang.Object) objConsumerRecord24, (java.io.Serializable) 10);
        java.util.Optional<java.lang.Integer> intOptional33 = objConsumerRecord24.leaderEpoch();
        java.lang.Object obj40 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj40, (java.io.Serializable) (byte) 100);
        java.lang.Object obj43 = objConsumerRecord42.key();
        int int44 = objConsumerRecord42.partition();
        org.apache.kafka.common.header.Headers headers45 = objConsumerRecord42.headers();
        org.apache.kafka.common.record.TimestampType timestampType50 = null;
        org.apache.kafka.common.record.TimestampType timestampType58 = null;
        org.apache.kafka.common.record.TimestampType timestampType66 = null;
        java.lang.Object obj70 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType66, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj70, (java.io.Serializable) 1);
        long long73 = objConsumerRecord72.timestamp();
        java.lang.Object obj74 = objConsumerRecord72.key();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable> objConsumerRecordConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.io.Serializable>("", 100, (long) '#', (long) (byte) 0, timestampType58, (long) (-1), (int) (byte) 0, (int) (short) 100, objConsumerRecord72, (java.io.Serializable) (-1.0d));
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (byte) -1, (long) 1, (long) (byte) 0, timestampType50, (long) '4', (int) (byte) 0, (int) 'a', (java.lang.Object) objConsumerRecordConsumerRecord76, (java.io.Serializable) 10.0f);
        java.lang.Class<?> wildcardClass79 = objConsumerRecord78.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 0, (long) ' ', (java.lang.Object) headers45, (java.io.Serializable) wildcardClass79);
        int int81 = objConsumerRecord80.partition();
        int int82 = objConsumerRecord80.partition();
        org.apache.kafka.common.record.TimestampType timestampType83 = objConsumerRecord80.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord84 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 0, leaderEpoch = null, offset = 100, null = 52, serialized key size = 10, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)", (int) (short) -1, (long) (short) -1, (java.lang.Object) intOptional33, (java.io.Serializable) timestampType83);
        long long85 = objConsumerRecord84.offset();
        int int86 = objConsumerRecord84.partition();
        org.apache.kafka.common.header.Headers headers87 = objConsumerRecord84.headers();
        long long88 = objConsumerRecord84.offset();
        java.lang.Object obj89 = objConsumerRecord84.key();
        int int90 = objConsumerRecord84.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertNotNull(intOptional26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(intOptional30);
        org.junit.Assert.assertNotNull(intOptional33);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + timestampType83 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType83.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(headers87);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "Optional.empty");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "Optional.empty");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "Optional.empty");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.offset();
        long long12 = objConsumerRecord10.checksum();
        long long13 = objConsumerRecord10.offset();
        int int14 = objConsumerRecord10.serializedKeySize();
        long long15 = objConsumerRecord10.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord10.timestampType();
        long long17 = objConsumerRecord10.offset();
        long long18 = objConsumerRecord10.offset();
        java.lang.Class<?> wildcardClass19 = objConsumerRecord10.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNull(timestampType16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        java.lang.Object obj3 = null;
        org.apache.kafka.common.record.TimestampType timestampType8 = null;
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj15, (java.io.Serializable) (byte) 100);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) 100, (long) (byte) 10, (long) 0, timestampType8, (-1L), 1, (int) (short) 1, (java.lang.Object) 'a', (java.io.Serializable) (short) 1);
        org.apache.kafka.common.header.Headers headers20 = objConsumerRecord19.headers();
        java.lang.Class<?> wildcardClass21 = headers20.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 97, 97L, obj3, (java.io.Serializable) wildcardClass21);
        org.apache.kafka.common.header.Headers headers23 = objConsumerRecord22.headers();
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord22.leaderEpoch();
        java.lang.Class<?> wildcardClass25 = intOptional24.getClass();
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertNotNull(intOptional24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional13 = objConsumerRecord10.leaderEpoch();
        int int14 = objConsumerRecord10.partition();
        int int15 = objConsumerRecord10.serializedValueSize();
        java.io.Serializable serializable16 = objConsumerRecord10.value();
        long long17 = objConsumerRecord10.offset();
        long long18 = objConsumerRecord10.checksum();
        long long19 = objConsumerRecord10.offset();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord10.leaderEpoch();
        long long21 = objConsumerRecord10.checksum();
        long long22 = objConsumerRecord10.offset();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1 + "'", serializable16, 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        java.lang.Object obj10 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj10, (java.io.Serializable) (byte) 100);
        java.lang.Object obj13 = objConsumerRecord12.key();
        java.lang.String str14 = objConsumerRecord12.toString();
        org.apache.kafka.common.record.TimestampType timestampType15 = objConsumerRecord12.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType20 = null;
        java.lang.Object obj24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType20, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj24, (java.io.Serializable) 1);
        long long27 = objConsumerRecord26.offset();
        long long28 = objConsumerRecord26.checksum();
        long long29 = objConsumerRecord26.timestamp();
        java.lang.String str30 = objConsumerRecord26.topic();
        java.io.Serializable serializable31 = objConsumerRecord26.value();
        java.lang.Class<?> wildcardClass32 = objConsumerRecord26.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.lang.reflect.GenericDeclaration> timestampTypeEnumConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 97, null = 100, serialized key size = 10, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", 35, (long) (short) 100, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType15, (java.lang.reflect.GenericDeclaration) wildcardClass32);
        org.apache.kafka.common.record.TimestampType timestampType44 = null;
        java.lang.Object obj48 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType44, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj48, (java.io.Serializable) 1);
        long long51 = objConsumerRecord50.timestamp();
        int int52 = objConsumerRecord50.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional53 = objConsumerRecord50.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 100, (long) 100, (java.lang.Object) objConsumerRecord50, (java.io.Serializable) false);
        org.apache.kafka.common.record.TimestampType timestampType56 = objConsumerRecord55.timestampType();
        long long57 = objConsumerRecord55.offset();
        org.apache.kafka.common.header.Headers headers58 = objConsumerRecord55.headers();
        org.apache.kafka.common.record.TimestampType timestampType66 = null;
        java.lang.Object obj70 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType66, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj70, (java.io.Serializable) 1);
        java.lang.String str73 = objConsumerRecord72.toString();
        java.util.Optional<java.lang.Integer> intOptional74 = objConsumerRecord72.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional75 = objConsumerRecord72.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) 1, (long) '4', (java.lang.Object) objConsumerRecord72, (java.io.Serializable) (-1.0d));
        org.apache.kafka.common.record.TimestampType timestampType78 = objConsumerRecord77.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType83 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType83, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType90 = objConsumerRecord89.timestampType();
        long long91 = objConsumerRecord89.timestamp();
        java.util.Optional<java.lang.Integer> intOptional92 = objConsumerRecord89.leaderEpoch();
        org.apache.kafka.common.header.Headers headers93 = objConsumerRecord89.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord94 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType), partition = 32, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 1.0)", (int) (byte) 1, 0L, (long) (short) 10, timestampType15, (java.lang.Long) (-1L), (int) (byte) 100, 10, (java.lang.Object) objConsumerRecord55, (java.io.Serializable) timestampType78, headers93);
        java.util.Optional<java.lang.Integer> intOptional95 = objConsumerRecord94.leaderEpoch();
        java.io.Serializable serializable96 = objConsumerRecord94.value();
        long long97 = objConsumerRecord94.offset();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str14, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + 1 + "'", serializable31, 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intOptional53);
        org.junit.Assert.assertTrue("'" + timestampType56 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType56.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 100L + "'", long57 == 100L);
        org.junit.Assert.assertNotNull(headers58);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str73, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional74);
        org.junit.Assert.assertNotNull(intOptional75);
        org.junit.Assert.assertTrue("'" + timestampType78 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType78.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNull(timestampType90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 10L + "'", long91 == 10L);
        org.junit.Assert.assertNotNull(intOptional92);
        org.junit.Assert.assertNotNull(headers93);
        org.junit.Assert.assertNotNull(intOptional95);
        org.junit.Assert.assertTrue("'" + serializable96 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable96.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.timestamp();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord18.leaderEpoch();
        long long21 = objConsumerRecord18.timestamp();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (short) -1, (long) (short) -1, (long) (byte) 10, timestampType4, 1L, (int) (short) 100, (int) (short) 100, (java.lang.Object) objConsumerRecord18, (java.io.Serializable) '#');
        java.util.Optional<java.lang.Integer> intOptional24 = objConsumerRecord18.leaderEpoch();
        java.lang.String str25 = objConsumerRecord18.topic();
        java.lang.Object obj26 = objConsumerRecord18.key();
        java.lang.String str27 = objConsumerRecord18.toString();
        java.io.Serializable serializable28 = objConsumerRecord18.value();
        long long29 = objConsumerRecord18.timestamp();
        int int30 = objConsumerRecord18.serializedValueSize();
        int int31 = objConsumerRecord18.serializedValueSize();
        java.io.Serializable serializable32 = objConsumerRecord18.value();
        java.lang.String str33 = objConsumerRecord18.topic();
        long long34 = objConsumerRecord18.timestamp();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertNotNull(intOptional24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str27, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + 1 + "'", serializable28, 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + 1 + "'", serializable32, 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        int int13 = objConsumerRecord10.serializedKeySize();
        java.lang.Object obj14 = objConsumerRecord10.key();
        org.apache.kafka.common.header.Headers headers15 = objConsumerRecord10.headers();
        int int16 = objConsumerRecord10.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType17 = objConsumerRecord10.timestampType();
        long long18 = objConsumerRecord10.timestamp();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(timestampType17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        int int12 = objConsumerRecord10.serializedValueSize();
        java.lang.String str13 = objConsumerRecord10.toString();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        long long15 = objConsumerRecord10.offset();
        int int16 = objConsumerRecord10.serializedKeySize();
        int int17 = objConsumerRecord10.serializedKeySize();
        int int18 = objConsumerRecord10.partition();
        org.apache.kafka.common.header.Headers headers19 = objConsumerRecord10.headers();
        java.lang.Object obj20 = objConsumerRecord10.key();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str13, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 1 + "'", serializable14, 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.lang.String str12 = objConsumerRecord10.toString();
        long long13 = objConsumerRecord10.offset();
        java.lang.String str14 = objConsumerRecord10.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = objConsumerRecord10.timestampType();
        int int16 = objConsumerRecord10.serializedValueSize();
        java.lang.String str17 = objConsumerRecord10.toString();
        org.apache.kafka.common.record.TimestampType timestampType18 = objConsumerRecord10.timestampType();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str12, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(timestampType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNull(timestampType18);
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        long long12 = objConsumerRecord10.timestamp();
        java.io.Serializable serializable13 = objConsumerRecord10.value();
        int int14 = objConsumerRecord10.serializedValueSize();
        long long15 = objConsumerRecord10.checksum();
        long long16 = objConsumerRecord10.checksum();
        java.io.Serializable serializable17 = objConsumerRecord10.value();
        java.io.Serializable serializable18 = objConsumerRecord10.value();
        int int19 = objConsumerRecord10.partition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + 1 + "'", serializable13, 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + 1 + "'", serializable17, 1);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + 1 + "'", serializable18, 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj11, (java.io.Serializable) (byte) 100);
        java.lang.Object obj14 = objConsumerRecord13.key();
        java.lang.String str15 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType24 = null;
        java.lang.Object obj28 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType24, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj28, (java.io.Serializable) 1);
        long long31 = objConsumerRecord30.offset();
        long long32 = objConsumerRecord30.checksum();
        org.apache.kafka.common.header.Headers headers33 = objConsumerRecord30.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) (short) 1, (long) 0, timestampType16, 10L, 97, (int) '4', (java.lang.Object) headers33, (java.io.Serializable) 0.0d);
        org.apache.kafka.common.record.TimestampType timestampType43 = null;
        java.lang.Object obj47 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType43, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj47, (java.io.Serializable) 1);
        java.lang.String str50 = objConsumerRecord49.toString();
        java.lang.String str51 = objConsumerRecord49.toString();
        long long52 = objConsumerRecord49.offset();
        java.util.Optional<java.lang.Integer> intOptional53 = objConsumerRecord49.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.lang.Comparable<java.lang.String>> objConsumerRecordConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.lang.Comparable<java.lang.String>>("ConsumerRecord(topic = hi!, partition = 35, leaderEpoch = null, offset = 0, null = 35, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = #)", 35, (long) (short) 100, 0L, timestampType16, 35L, (int) (short) 100, (int) (short) 0, objConsumerRecord49, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        long long56 = objConsumerRecord49.offset();
        java.lang.String str57 = objConsumerRecord49.topic();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str50, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str51, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(intOptional53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        int int13 = objConsumerRecord10.serializedValueSize();
        java.lang.String str14 = objConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.header.Headers headers16 = objConsumerRecord10.headers();
        java.lang.String str17 = objConsumerRecord10.toString();
        long long18 = objConsumerRecord10.offset();
        long long19 = objConsumerRecord10.offset();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str17, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        long long16 = objConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = null;
        java.lang.Object obj25 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType21, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj25, (java.io.Serializable) 1);
        java.lang.String str28 = objConsumerRecord27.toString();
        java.lang.String str29 = objConsumerRecord27.toString();
        java.lang.Class<?> wildcardClass30 = objConsumerRecord27.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (short) 10, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) wildcardClass30);
        long long32 = objConsumerRecord13.timestamp();
        java.lang.String str33 = objConsumerRecord13.topic();
        int int34 = objConsumerRecord13.partition();
        long long35 = objConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType36 = objConsumerRecord13.timestampType();
        int int37 = objConsumerRecord13.partition();
        long long38 = objConsumerRecord13.offset();
        long long39 = objConsumerRecord13.timestamp();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str28, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str29, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertNull(timestampType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        long long16 = objConsumerRecord13.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType21 = null;
        java.lang.Object obj25 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType21, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj25, (java.io.Serializable) 1);
        java.lang.String str28 = objConsumerRecord27.toString();
        java.lang.String str29 = objConsumerRecord27.toString();
        java.lang.Class<?> wildcardClass30 = objConsumerRecord27.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (short) 10, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) wildcardClass30);
        java.util.Optional<java.lang.Integer> intOptional32 = objConsumerRecord13.leaderEpoch();
        int int33 = objConsumerRecord13.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType34 = objConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType35 = objConsumerRecord13.timestampType();
        long long36 = objConsumerRecord13.checksum();
        java.util.Optional<java.lang.Integer> intOptional37 = objConsumerRecord13.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str28, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str29, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(intOptional32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNull(timestampType34);
        org.junit.Assert.assertNull(timestampType35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(intOptional37);
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional13 = objConsumerRecord10.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType14 = objConsumerRecord10.timestampType();
        long long15 = objConsumerRecord10.offset();
        long long16 = objConsumerRecord10.timestamp();
        int int17 = objConsumerRecord10.serializedKeySize();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertNull(timestampType14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional13 = objConsumerRecord10.leaderEpoch();
        int int14 = objConsumerRecord10.partition();
        int int15 = objConsumerRecord10.serializedValueSize();
        java.io.Serializable serializable16 = objConsumerRecord10.value();
        long long17 = objConsumerRecord10.offset();
        long long18 = objConsumerRecord10.checksum();
        int int19 = objConsumerRecord10.serializedValueSize();
        int int20 = objConsumerRecord10.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional21 = objConsumerRecord10.leaderEpoch();
        long long22 = objConsumerRecord10.offset();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1 + "'", serializable16, 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        long long15 = objConsumerRecord13.timestamp();
        int int16 = objConsumerRecord13.serializedKeySize();
        java.lang.Object obj17 = objConsumerRecord13.key();
        org.apache.kafka.common.header.Headers headers18 = objConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType27 = null;
        java.lang.Object obj31 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType27, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj31, (java.io.Serializable) 1);
        java.lang.String str34 = objConsumerRecord33.toString();
        java.lang.String str35 = objConsumerRecord33.toString();
        java.lang.Class<?> wildcardClass36 = objConsumerRecord33.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass36);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (int) (short) 100, (long) 100, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) (short) -1);
        int int39 = objConsumerRecord13.partition();
        java.lang.String str40 = objConsumerRecord13.topic();
        int int41 = objConsumerRecord13.serializedKeySize();
        int int42 = objConsumerRecord13.serializedKeySize();
        java.lang.String str43 = objConsumerRecord13.topic();
        java.util.Optional<java.lang.Integer> intOptional44 = objConsumerRecord13.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType45 = objConsumerRecord13.timestampType();
        java.io.Serializable serializable46 = objConsumerRecord13.value();
        java.lang.Class<?> wildcardClass47 = serializable46.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(headers18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str34, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str35, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(intOptional44);
        org.junit.Assert.assertNull(timestampType45);
        org.junit.Assert.assertEquals("'" + serializable46 + "' != '" + 1 + "'", serializable46, 1);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        int int13 = objConsumerRecord10.serializedValueSize();
        java.lang.String str14 = objConsumerRecord10.topic();
        java.io.Serializable serializable15 = objConsumerRecord10.value();
        java.lang.String str16 = objConsumerRecord10.topic();
        int int17 = objConsumerRecord10.serializedKeySize();
        long long18 = objConsumerRecord10.timestamp();
        int int19 = objConsumerRecord10.serializedValueSize();
        int int20 = objConsumerRecord10.serializedValueSize();
        java.lang.Object obj21 = objConsumerRecord10.key();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + 1 + "'", serializable15, 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.common.record.TimestampType timestampType12 = null;
        java.lang.Object obj16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType12, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj16, (java.io.Serializable) 1);
        long long19 = objConsumerRecord18.offset();
        long long20 = objConsumerRecord18.checksum();
        long long21 = objConsumerRecord18.timestamp();
        java.lang.String str22 = objConsumerRecord18.topic();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)", 0, (long) (short) 100, (long) '4', timestampType4, 0L, (int) (byte) 10, 35, (java.lang.Object) objConsumerRecord18, (java.io.Serializable) true);
        org.apache.kafka.common.header.Headers headers25 = objConsumerRecord24.headers();
        java.lang.String str26 = objConsumerRecord24.toString();
        int int27 = objConsumerRecord24.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType28 = objConsumerRecord24.timestampType();
        long long29 = objConsumerRecord24.offset();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headers25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 0, leaderEpoch = null, offset = 100, null = 52, serialized key size = 10, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)" + "'", str26, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 0, leaderEpoch = null, offset = 100, null = 52, serialized key size = 10, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNull(timestampType28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        org.apache.kafka.common.record.TimestampType timestampType11 = null;
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType11, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj15, (java.io.Serializable) 1);
        java.lang.String str18 = objConsumerRecord17.toString();
        java.lang.String str19 = objConsumerRecord17.toString();
        java.lang.Class<?> wildcardClass20 = objConsumerRecord17.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) '#', (long) (short) -1, (java.lang.CharSequence) "", (java.lang.reflect.Type) wildcardClass20);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", 10, (long) (byte) 100, (java.lang.Object) "", (java.io.Serializable) (short) 10);
        long long24 = objConsumerRecord23.offset();
        java.lang.String str25 = objConsumerRecord23.topic();
        org.apache.kafka.common.header.Headers headers26 = objConsumerRecord23.headers();
        org.apache.kafka.common.record.TimestampType timestampType27 = objConsumerRecord23.timestampType();
        int int28 = objConsumerRecord23.serializedKeySize();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str19, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(headers26);
        org.junit.Assert.assertTrue("'" + timestampType27 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType27.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        java.lang.String str14 = objConsumerRecord13.toString();
        java.util.Optional<java.lang.Integer> intOptional15 = objConsumerRecord13.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        int int17 = objConsumerRecord13.partition();
        int int18 = objConsumerRecord13.serializedValueSize();
        java.io.Serializable serializable19 = objConsumerRecord13.value();
        java.util.Optional<java.lang.Integer> intOptional20 = objConsumerRecord13.leaderEpoch();
        java.lang.String str21 = objConsumerRecord13.toString();
        int int22 = objConsumerRecord13.serializedValueSize();
        long long23 = objConsumerRecord13.checksum();
        java.lang.Object obj37 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj37, (java.io.Serializable) (byte) 100);
        java.lang.Object obj40 = objConsumerRecord39.key();
        java.lang.String str41 = objConsumerRecord39.toString();
        org.apache.kafka.common.record.TimestampType timestampType42 = objConsumerRecord39.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType50 = null;
        java.lang.Object obj54 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType50, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj54, (java.io.Serializable) 1);
        long long57 = objConsumerRecord56.offset();
        long long58 = objConsumerRecord56.checksum();
        org.apache.kafka.common.header.Headers headers59 = objConsumerRecord56.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (-1), (long) (short) 1, (long) 0, timestampType42, 10L, 97, (int) '4', (java.lang.Object) headers59, (java.io.Serializable) 0.0d);
        org.apache.kafka.common.record.TimestampType timestampType66 = null;
        java.lang.Object obj70 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType66, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj70, (java.io.Serializable) 1);
        java.lang.String str73 = objConsumerRecord72.toString();
        long long74 = objConsumerRecord72.offset();
        java.util.Optional<java.lang.Integer> intOptional75 = objConsumerRecord72.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>> timestampTypeEnumConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>>("hi!", (int) (byte) 100, (long) 'a', (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType42, intOptional75);
        java.lang.Class<?> wildcardClass77 = timestampTypeEnumConsumerRecord76.getClass();
        org.apache.kafka.common.record.TimestampType timestampType82 = null;
        java.lang.Object obj86 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord88 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType82, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj86, (java.io.Serializable) 1);
        long long89 = objConsumerRecord88.timestamp();
        java.util.Optional<java.lang.Integer> intOptional90 = objConsumerRecord88.leaderEpoch();
        int int91 = objConsumerRecord88.serializedValueSize();
        java.lang.String str92 = objConsumerRecord88.topic();
        java.lang.String str93 = objConsumerRecord88.topic();
        java.lang.Class<?> wildcardClass94 = objConsumerRecord88.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationConsumerRecord95 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", 1, (long) (short) 10, (java.lang.reflect.GenericDeclaration) wildcardClass77, (java.lang.reflect.GenericDeclaration) wildcardClass94);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", 35, (long) 10, (java.lang.Object) objConsumerRecord13, (java.io.Serializable) wildcardClass77);
        int int97 = objConsumerRecord13.serializedKeySize();
        java.lang.Object obj98 = objConsumerRecord13.key();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str14, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + 1 + "'", serializable19, 1);
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str41, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType42 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType42.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(headers59);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str73, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertNotNull(intOptional75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 52L + "'", long89 == 52L);
        org.junit.Assert.assertNotNull(intOptional90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 10 + "'", int97 == 10);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj11, (java.io.Serializable) (byte) 100);
        java.lang.Object obj14 = objConsumerRecord13.key();
        java.lang.String str15 = objConsumerRecord13.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = objConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (short) -1, 10L, (long) (short) 100, timestampType16, (long) 0, 0, 35, (java.lang.Object) (-1), (java.io.Serializable) 1L);
        int int23 = objConsumerRecord22.serializedKeySize();
        java.io.Serializable serializable24 = objConsumerRecord22.value();
        int int25 = objConsumerRecord22.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType26 = objConsumerRecord22.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType34 = null;
        java.lang.Object obj38 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord40 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType34, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj38, (java.io.Serializable) 1);
        long long41 = objConsumerRecord40.timestamp();
        long long42 = objConsumerRecord40.timestamp();
        int int43 = objConsumerRecord40.serializedKeySize();
        org.apache.kafka.common.header.Headers headers44 = objConsumerRecord40.headers();
        int int45 = objConsumerRecord40.serializedKeySize();
        org.apache.kafka.common.header.Headers headers46 = objConsumerRecord40.headers();
        java.io.Serializable serializable47 = objConsumerRecord40.value();
        long long48 = objConsumerRecord40.checksum();
        java.util.Optional<java.lang.Integer> intOptional49 = objConsumerRecord40.leaderEpoch();
        org.apache.kafka.common.header.Headers headers50 = objConsumerRecord40.headers();
        java.lang.String str51 = objConsumerRecord40.toString();
        int int52 = objConsumerRecord40.serializedValueSize();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objConsumerRecordConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>("", (int) (short) 1, (long) 10, (long) 97, timestampType26, (long) 100, 100, 97, objConsumerRecord40, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 97, serialized key size = 35, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = hi!)");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + 1L + "'", serializable24, 1L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + timestampType26 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType26.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(headers44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(headers46);
        org.junit.Assert.assertEquals("'" + serializable47 + "' != '" + 1 + "'", serializable47, 1);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(intOptional49);
        org.junit.Assert.assertNotNull(headers50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str51, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
        java.lang.Object obj3 = null;
        org.apache.kafka.common.record.TimestampType timestampType11 = null;
        java.lang.Object obj15 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType11, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj15, (java.io.Serializable) 1);
        java.lang.String str18 = objConsumerRecord17.toString();
        long long19 = objConsumerRecord17.offset();
        org.apache.kafka.common.header.Headers headers20 = objConsumerRecord17.headers();
        java.lang.String str21 = objConsumerRecord17.toString();
        long long22 = objConsumerRecord17.offset();
        long long23 = objConsumerRecord17.checksum();
        int int24 = objConsumerRecord17.partition();
        int int25 = objConsumerRecord17.serializedKeySize();
        long long26 = objConsumerRecord17.offset();
        java.util.Optional<java.lang.Integer> intOptional27 = objConsumerRecord17.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType32 = null;
        org.apache.kafka.common.record.TimestampType timestampType40 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType40, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType47 = objConsumerRecord46.timestampType();
        long long48 = objConsumerRecord46.timestamp();
        org.apache.kafka.common.header.Headers headers49 = objConsumerRecord46.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.String> headerIterableConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.String>("ConsumerRecord(topic = hi!, partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 0, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", 35, (long) (byte) -1, (long) 32, timestampType32, (long) '#', (int) (short) 10, 100, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers49, "ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1.0, value = class org.apache.kafka.common.header.internals.RecordHeaders)");
        java.lang.Class<?> wildcardClass52 = headerIterableConsumerRecord51.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 97, leaderEpoch = null, offset = 35, NoTimestampType = 0, serialized key size = 35, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)", 0, (long) 1, (java.lang.Object) objConsumerRecord17, (java.io.Serializable) wildcardClass52);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = null)", (int) '#', (long) 10, obj3, (java.io.Serializable) "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100), partition = 97, leaderEpoch = null, offset = 35, NoTimestampType = 0, serialized key size = 35, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = true)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str21, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(intOptional27);
        org.junit.Assert.assertNull(timestampType47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(headers49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        org.apache.kafka.common.record.TimestampType timestampType7 = null;
        java.lang.Object obj11 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType7, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj11, (java.io.Serializable) 1);
        long long14 = objConsumerRecord13.timestamp();
        int int15 = objConsumerRecord13.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord13.leaderEpoch();
        int int17 = objConsumerRecord13.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType22 = null;
        org.apache.kafka.common.record.TimestampType timestampType30 = null;
        java.io.Serializable serializable34 = null;
        org.apache.kafka.common.record.TimestampType timestampType39 = null;
        java.lang.Object obj43 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType39, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj43, (java.io.Serializable) 1);
        java.lang.String str46 = objConsumerRecord45.toString();
        java.lang.String str47 = objConsumerRecord45.toString();
        java.lang.Class<?> wildcardClass48 = objConsumerRecord45.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, java.lang.reflect.Type> serializableConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, java.lang.reflect.Type>("", (int) (short) 1, (long) 1, (long) 'a', timestampType30, (long) 10, 0, (int) (byte) 0, serializable34, (java.lang.reflect.Type) wildcardClass48);
        org.apache.kafka.common.record.TimestampType timestampType54 = null;
        java.lang.Object obj58 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType54, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj58, (java.io.Serializable) 1);
        long long61 = objConsumerRecord60.timestamp();
        java.util.Optional<java.lang.Integer> intOptional62 = objConsumerRecord60.leaderEpoch();
        java.lang.Class<?> wildcardClass63 = objConsumerRecord60.getClass();
        org.apache.kafka.common.record.TimestampType timestampType71 = null;
        java.lang.Object obj75 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType71, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj75, (java.io.Serializable) 1);
        java.lang.String str78 = objConsumerRecord77.toString();
        long long79 = objConsumerRecord77.offset();
        org.apache.kafka.common.header.Headers headers80 = objConsumerRecord77.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.io.Serializable> headersConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.io.Serializable>("", (int) (short) 100, (long) 10, headers80, (java.io.Serializable) false);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", (int) (byte) -1, (long) (-1), 1L, timestampType22, (java.lang.Long) 1L, (int) '#', 0, (java.lang.Object) serializable34, (java.io.Serializable) wildcardClass63, headers80);
        java.lang.Class<?> wildcardClass84 = headers80.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 0, (long) (byte) 1, (java.lang.Object) int17, (java.io.Serializable) wildcardClass84);
        java.lang.String str86 = objConsumerRecord85.topic();
        org.apache.kafka.common.header.Headers headers87 = objConsumerRecord85.headers();
        java.io.Serializable serializable88 = objConsumerRecord85.value();
        java.lang.String str89 = objConsumerRecord85.toString();
        java.lang.Class<?> wildcardClass90 = objConsumerRecord85.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str46, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str47, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertNotNull(intOptional62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str78, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertNotNull(headers80);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(headers87);
        org.junit.Assert.assertNotNull(serializable88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 100, value = class org.apache.kafka.common.header.internals.RecordHeaders)" + "'", str89, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = 100, value = class org.apache.kafka.common.header.internals.RecordHeaders)");
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj12 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj12, (java.io.Serializable) (byte) 100);
        long long15 = objConsumerRecord14.timestamp();
        int int16 = objConsumerRecord14.serializedValueSize();
        java.lang.Object obj17 = objConsumerRecord14.key();
        java.io.Serializable serializable18 = objConsumerRecord14.value();
        long long19 = objConsumerRecord14.timestamp();
        int int20 = objConsumerRecord14.partition();
        long long21 = objConsumerRecord14.offset();
        java.lang.Class<?> wildcardClass22 = objConsumerRecord14.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type> charSequenceConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.reflect.Type>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = false, value = 100), partition = 0, leaderEpoch = null, offset = 35, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = RecordHeaders(headers = [], isReadOnly = false), value = NoTimestampType)", (int) (byte) 1, (long) '4', (long) 52, timestampType4, (long) (-1), 32, (int) (byte) 1, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)", (java.lang.reflect.Type) wildcardClass22);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 100 + "'", serializable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", (int) (byte) -1, 100L, (long) 10, timestampType4, (long) 10, (int) (byte) -1, 100, (java.lang.Object) 0L, (java.io.Serializable) 10);
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord10.timestampType();
        java.lang.String str12 = objConsumerRecord10.toString();
        long long13 = objConsumerRecord10.offset();
        java.io.Serializable serializable14 = objConsumerRecord10.value();
        int int15 = objConsumerRecord10.partition();
        int int16 = objConsumerRecord10.serializedValueSize();
        java.lang.String str17 = objConsumerRecord10.toString();
        int int18 = objConsumerRecord10.serializedValueSize();
        org.apache.kafka.common.header.Headers headers19 = objConsumerRecord10.headers();
        java.lang.String str20 = objConsumerRecord10.topic();
        java.util.Optional<java.lang.Integer> intOptional21 = objConsumerRecord10.leaderEpoch();
        java.io.Serializable serializable22 = objConsumerRecord10.value();
        org.junit.Assert.assertNull(timestampType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str12, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 10 + "'", serializable14, 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)" + "'", str17, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = -1, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = 0, value = 10)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str20, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + 10 + "'", serializable22, 10);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        long long11 = objConsumerRecord10.timestamp();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        long long13 = objConsumerRecord10.checksum();
        java.lang.String str14 = objConsumerRecord10.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = objConsumerRecord10.timestampType();
        java.util.Optional<java.lang.Integer> intOptional16 = objConsumerRecord10.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(timestampType15);
        org.junit.Assert.assertNotNull(intOptional16);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        java.lang.Object obj3 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj3, (java.io.Serializable) (byte) 100);
        long long6 = objConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers7 = objConsumerRecord5.headers();
        java.lang.Object obj8 = objConsumerRecord5.key();
        java.lang.String str9 = objConsumerRecord5.toString();
        java.lang.String str10 = objConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str9, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)" + "'", str10, "ConsumerRecord(topic = hi!, partition = 97, leaderEpoch = null, offset = 97, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 100)");
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        java.lang.Object obj8 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType4, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj8, (java.io.Serializable) 1);
        java.lang.String str11 = objConsumerRecord10.toString();
        java.util.Optional<java.lang.Integer> intOptional12 = objConsumerRecord10.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional13 = objConsumerRecord10.leaderEpoch();
        long long14 = objConsumerRecord10.offset();
        int int15 = objConsumerRecord10.serializedKeySize();
        java.lang.Object obj16 = objConsumerRecord10.key();
        int int17 = objConsumerRecord10.serializedValueSize();
        java.lang.String str18 = objConsumerRecord10.toString();
        long long19 = objConsumerRecord10.checksum();
        java.lang.String str20 = objConsumerRecord10.topic();
        long long21 = objConsumerRecord10.timestamp();
        java.lang.String str22 = objConsumerRecord10.toString();
        int int23 = objConsumerRecord10.serializedKeySize();
        long long24 = objConsumerRecord10.checksum();
        java.io.Serializable serializable25 = objConsumerRecord10.value();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str11, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str18, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str22, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + 1 + "'", serializable25, 1);
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        java.lang.Object obj7 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("hi!", (int) 'a', (long) 'a', obj7, (java.io.Serializable) (byte) 100);
        java.lang.Object obj10 = objConsumerRecord9.key();
        org.apache.kafka.common.record.TimestampType timestampType11 = objConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = null;
        java.lang.Object obj23 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("", 10, (long) (byte) -1, (long) '4', timestampType19, (long) (byte) 0, (int) (short) 10, (int) (byte) 100, obj23, (java.io.Serializable) 1);
        java.lang.String str26 = objConsumerRecord25.toString();
        long long27 = objConsumerRecord25.offset();
        org.apache.kafka.common.header.Headers headers28 = objConsumerRecord25.headers();
        java.lang.String str29 = objConsumerRecord25.topic();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)", 0, 35L, (long) 32, timestampType11, (long) (byte) 0, 0, 1, (java.lang.Object) str29, (java.io.Serializable) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        java.io.Serializable serializable32 = objConsumerRecord31.value();
        java.io.Serializable serializable33 = objConsumerRecord31.value();
        java.lang.Object obj34 = objConsumerRecord31.key();
        org.apache.kafka.common.record.TimestampType timestampType35 = objConsumerRecord31.timestampType();
        long long36 = objConsumerRecord31.timestamp();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)" + "'", str26, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(headers28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", serializable32, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertEquals("'" + serializable33 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)" + "'", serializable33, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 52, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1), value = false)");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertTrue("'" + timestampType35 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType35.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
    }
}

