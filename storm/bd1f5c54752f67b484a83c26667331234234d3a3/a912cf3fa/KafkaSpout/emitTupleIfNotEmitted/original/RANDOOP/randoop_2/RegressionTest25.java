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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str18 = strConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int31 = strConsumerRecord30.serializedValueSize();
        int int32 = strConsumerRecord30.partition();
        org.apache.kafka.common.header.Headers headers33 = strConsumerRecord30.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int40 = strConsumerRecord39.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional41 = strConsumerRecord39.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType19, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers33, intOptional41);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int54 = strConsumerRecord53.serializedValueSize();
        int int55 = strConsumerRecord53.partition();
        org.apache.kafka.common.header.Headers headers56 = strConsumerRecord53.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType19, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers56);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int69 = strConsumerRecord68.serializedValueSize();
        int int70 = strConsumerRecord68.partition();
        long long71 = strConsumerRecord68.offset();
        long long72 = strConsumerRecord68.offset();
        org.apache.kafka.common.header.Headers headers73 = strConsumerRecord68.headers();
        long long74 = strConsumerRecord68.checksum();
        long long75 = strConsumerRecord68.checksum();
        org.apache.kafka.common.header.Headers headers76 = strConsumerRecord68.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = 1.0)", (int) (short) 10, 100L, (long) 32, timestampType19, (java.lang.Long) (-1L), (int) (byte) -1, 32, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) "hi!", headers76);
        long long78 = strConsumerRecord77.timestamp();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 52L + "'", long71 == 52L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 52L + "'", long72 == 52L);
        org.junit.Assert.assertNotNull(headers73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertNotNull(headers76);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 32L + "'", long78 == 32L);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        int int9 = strConsumerRecord5.serializedValueSize();
        java.lang.String str10 = strConsumerRecord5.toString();
        java.util.Optional<java.lang.Integer> intOptional11 = strConsumerRecord5.leaderEpoch();
        long long12 = strConsumerRecord5.checksum();
        java.lang.String str13 = strConsumerRecord5.key();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str10, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(intOptional11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str6 = strConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType7 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.header.Headers headers8 = strConsumerRecord5.headers();
        java.lang.String str9 = strConsumerRecord5.topic();
        long long10 = strConsumerRecord5.timestamp();
        java.io.Serializable serializable11 = strConsumerRecord5.value();
        java.lang.String str12 = strConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType13 = strConsumerRecord5.timestampType();
        long long14 = strConsumerRecord5.timestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (short) 10 + "'", serializable11, (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord17.timestampType();
        int int19 = strConsumerRecord17.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>("", 100, (long) '#', (long) (byte) 0, timestampType20, (long) (short) 10, 0, (int) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.lang.Comparable<java.lang.String>) "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long36 = strConsumerRecord35.timestamp();
        int int37 = strConsumerRecord35.partition();
        java.io.Serializable serializable38 = strConsumerRecord35.value();
        java.lang.Class<?> wildcardClass39 = serializable38.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long46 = strConsumerRecord45.timestamp();
        int int47 = strConsumerRecord45.partition();
        java.lang.String str48 = strConsumerRecord45.topic();
        long long49 = strConsumerRecord45.offset();
        java.lang.Class<?> wildcardClass50 = strConsumerRecord45.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeConsumerRecord51 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>("hi!", (int) (short) 0, (long) (byte) 1, 10L, timestampType20, (long) (byte) 10, (int) 'a', (int) (short) -1, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.GenericDeclaration) wildcardClass50);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType61 = strConsumerRecord60.timestampType();
        int int62 = strConsumerRecord60.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional63 = strConsumerRecord60.leaderEpoch();
        java.lang.String str64 = strConsumerRecord60.toString();
        long long65 = strConsumerRecord60.checksum();
        int int66 = strConsumerRecord60.partition();
        long long67 = strConsumerRecord60.offset();
        java.lang.String str68 = strConsumerRecord60.toString();
        org.apache.kafka.common.record.TimestampType timestampType69 = strConsumerRecord60.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>, java.lang.String> strConsumerRecordConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>, java.lang.String>("ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = )", (int) (byte) 0, (long) '4', 100L, timestampType20, (long) (byte) -1, 100, (int) 'a', strConsumerRecord60, "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), partition = 32, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)");
        long long72 = strConsumerRecord60.timestamp();
        long long73 = strConsumerRecord60.checksum();
        long long74 = strConsumerRecord60.timestamp();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + (short) 10 + "'", serializable38, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + timestampType61 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType61.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intOptional63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str64, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 52L + "'", long67 == 52L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str68, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType69 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType69.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int14 = strConsumerRecord13.serializedValueSize();
        int int15 = strConsumerRecord13.partition();
        long long16 = strConsumerRecord13.offset();
        long long17 = strConsumerRecord13.offset();
        int int18 = strConsumerRecord13.partition();
        java.lang.String str19 = strConsumerRecord13.toString();
        org.apache.kafka.common.header.Headers headers20 = strConsumerRecord13.headers();
        java.lang.String str21 = strConsumerRecord13.key();
        org.apache.kafka.common.record.TimestampType timestampType22 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType33 = strConsumerRecord32.timestampType();
        java.lang.String str34 = strConsumerRecord32.toString();
        org.apache.kafka.common.record.TimestampType timestampType35 = strConsumerRecord32.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 35, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = NoTimestampType), partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 35, 35L, 52L, timestampType22, 1L, 35, (int) (short) -1, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (java.io.Serializable) timestampType35);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional51 = strConsumerRecord49.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str58 = strConsumerRecord57.topic();
        org.apache.kafka.common.record.TimestampType timestampType59 = strConsumerRecord57.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord49, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType59);
        java.lang.String str61 = strConsumerRecord49.topic();
        java.lang.String str62 = strConsumerRecord49.key();
        java.lang.String str63 = strConsumerRecord49.toString();
        int int64 = strConsumerRecord49.partition();
        java.lang.Class<?> wildcardClass65 = strConsumerRecord49.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord71 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int72 = strConsumerRecord71.serializedValueSize();
        int int73 = strConsumerRecord71.partition();
        long long74 = strConsumerRecord71.offset();
        long long75 = strConsumerRecord71.offset();
        org.apache.kafka.common.record.TimestampType timestampType76 = strConsumerRecord71.timestampType();
        java.lang.String str77 = strConsumerRecord71.toString();
        int int78 = strConsumerRecord71.serializedValueSize();
        java.io.Serializable serializable79 = strConsumerRecord71.value();
        java.io.Serializable serializable80 = strConsumerRecord71.value();
        org.apache.kafka.common.record.TimestampType timestampType81 = strConsumerRecord71.timestampType();
        java.lang.String str82 = strConsumerRecord71.toString();
        long long83 = strConsumerRecord71.checksum();
        org.apache.kafka.common.header.Headers headers84 = strConsumerRecord71.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value =  ), partition = 35, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52), value = 10)", 10, (long) (short) 10, 0L, timestampType35, (java.lang.Long) 32L, 100, 0, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)", (java.io.Serializable) wildcardClass65, headers84);
        java.lang.String str86 = strConsumerRecord85.topic();
        org.apache.kafka.common.header.Headers headers87 = strConsumerRecord85.headers();
        java.lang.Class<?> wildcardClass88 = headers87.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + timestampType22 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType22.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType33 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType33.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str34, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType35 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType35.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intOptional51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType59 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType59.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str63, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 52L + "'", long74 == 52L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 52L + "'", long75 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType76 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType76.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str77, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + serializable79 + "' != '" + (short) 10 + "'", serializable79, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable80 + "' != '" + (short) 10 + "'", serializable80, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType81 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType81.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str82, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNotNull(headers84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value =  ), partition = 35, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52), value = 10)" + "'", str86, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value =  ), partition = 35, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52), value = 10)");
        org.junit.Assert.assertNotNull(headers87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        long long9 = strConsumerRecord5.offset();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        long long11 = strConsumerRecord5.checksum();
        int int12 = strConsumerRecord5.serializedValueSize();
        long long13 = strConsumerRecord5.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord5.timestampType();
        java.lang.Class<?> wildcardClass15 = timestampType14.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str10 = strConsumerRecord9.topic();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord9.headers();
        int int12 = strConsumerRecord9.serializedValueSize();
        int int13 = strConsumerRecord9.partition();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional28 = strConsumerRecord26.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str35 = strConsumerRecord34.topic();
        org.apache.kafka.common.record.TimestampType timestampType36 = strConsumerRecord34.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord26, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType36);
        java.lang.String str38 = strConsumerRecord26.topic();
        long long39 = strConsumerRecord26.offset();
        long long40 = strConsumerRecord26.offset();
        java.lang.String str41 = strConsumerRecord26.toString();
        java.lang.String str42 = strConsumerRecord26.key();
        long long43 = strConsumerRecord26.checksum();
        org.apache.kafka.common.header.Headers headers44 = strConsumerRecord26.headers();
        java.lang.String str45 = strConsumerRecord26.topic();
        org.apache.kafka.common.record.TimestampType timestampType46 = strConsumerRecord26.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType47 = strConsumerRecord26.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType57 = strConsumerRecord56.timestampType();
        int int58 = strConsumerRecord56.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional59 = strConsumerRecord56.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, java.lang.CharSequence> intOptionalConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Optional<java.lang.Integer>, java.lang.CharSequence>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) 10, intOptional59, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 10, leaderEpoch = null, offset = 52, NoTimestampType = 1, serialized key size = 52, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = null)");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int71 = strConsumerRecord70.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional72 = strConsumerRecord70.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str79 = strConsumerRecord78.topic();
        org.apache.kafka.common.record.TimestampType timestampType80 = strConsumerRecord78.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord70, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType80);
        java.lang.String str82 = strConsumerRecord70.topic();
        long long83 = strConsumerRecord70.offset();
        long long84 = strConsumerRecord70.offset();
        java.lang.String str85 = strConsumerRecord70.toString();
        java.lang.String str86 = strConsumerRecord70.key();
        org.apache.kafka.common.header.Headers headers87 = strConsumerRecord70.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, java.util.Optional<java.lang.Integer>> serializableConsumerRecord88 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, java.util.Optional<java.lang.Integer>>("ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value =  )", (int) '#', 0L, (long) 100, timestampType14, (java.lang.Long) 0L, (int) (byte) 100, 100, (java.io.Serializable) timestampType47, intOptional59, headers87);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intOptional28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType36 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType36.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str41, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(headers44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType46 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType46.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType57 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType57.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intOptional59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intOptional72);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType80 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType80.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 52L + "'", long83 == 52L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 52L + "'", long84 == 52L);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str85, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(headers87);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        long long9 = strConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers10 = strConsumerRecord5.headers();
        long long11 = strConsumerRecord5.checksum();
        int int12 = strConsumerRecord5.serializedKeySize();
        int int13 = strConsumerRecord5.serializedValueSize();
        java.lang.String str14 = strConsumerRecord5.toString();
        long long15 = strConsumerRecord5.offset();
        java.lang.String str16 = strConsumerRecord5.key();
        java.io.Serializable serializable17 = strConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str14, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (short) 10 + "'", serializable17, (short) 10);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        long long8 = strConsumerRecord5.checksum();
        int int9 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord5.leaderEpoch();
        int int11 = strConsumerRecord5.serializedValueSize();
        java.lang.String str12 = strConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType7 = strConsumerRecord5.timestampType();
        java.lang.String str8 = strConsumerRecord5.toString();
        int int9 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord5.timestampType();
        int int11 = strConsumerRecord5.serializedValueSize();
        long long12 = strConsumerRecord5.checksum();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        java.lang.String str14 = strConsumerRecord5.key();
        java.io.Serializable serializable15 = strConsumerRecord5.value();
        long long16 = strConsumerRecord5.checksum();
        java.io.Serializable serializable17 = strConsumerRecord5.value();
        long long18 = strConsumerRecord5.timestamp();
        int int19 = strConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional20 = strConsumerRecord5.leaderEpoch();
        int int21 = strConsumerRecord5.partition();
        java.io.Serializable serializable22 = strConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str8, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (short) 10 + "'", serializable15, (short) 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (short) 10 + "'", serializable17, (short) 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (short) 10 + "'", serializable22, (short) 10);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        long long9 = strConsumerRecord5.checksum();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.lang.String str11 = strConsumerRecord5.toString();
        long long12 = strConsumerRecord5.timestamp();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        long long14 = strConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str11, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord17.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord17.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord17.timestampType();
        java.lang.String str21 = strConsumerRecord17.key();
        long long22 = strConsumerRecord17.timestamp();
        long long23 = strConsumerRecord17.offset();
        java.lang.String str24 = strConsumerRecord17.toString();
        long long25 = strConsumerRecord17.checksum();
        java.io.Serializable serializable26 = strConsumerRecord17.value();
        java.io.Serializable serializable27 = strConsumerRecord17.value();
        java.io.Serializable serializable28 = strConsumerRecord17.value();
        java.lang.String str29 = strConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType30 = strConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long45 = strConsumerRecord44.timestamp();
        int int46 = strConsumerRecord44.partition();
        java.lang.String str47 = strConsumerRecord44.topic();
        long long48 = strConsumerRecord44.offset();
        org.apache.kafka.common.header.Headers headers49 = strConsumerRecord44.headers();
        java.io.Serializable serializable50 = strConsumerRecord44.value();
        org.apache.kafka.common.record.TimestampType timestampType51 = strConsumerRecord44.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long62 = strConsumerRecord61.timestamp();
        long long63 = strConsumerRecord61.offset();
        long long64 = strConsumerRecord61.offset();
        java.lang.String str65 = strConsumerRecord61.key();
        int int66 = strConsumerRecord61.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType67 = strConsumerRecord61.timestampType();
        int int68 = strConsumerRecord61.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType69 = strConsumerRecord61.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int76 = strConsumerRecord75.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional77 = strConsumerRecord75.leaderEpoch();
        java.lang.String str78 = strConsumerRecord75.key();
        long long79 = strConsumerRecord75.offset();
        org.apache.kafka.common.header.Headers headers80 = strConsumerRecord75.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", 1, (long) '4', 32L, timestampType51, (java.lang.Long) 100L, (int) (byte) 1, 35, "", (java.io.Serializable) timestampType69, headers80);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 52, leaderEpoch = null, offset = -1, NoTimestampType = 0, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), value =  )", 100, 1L, (long) 97, timestampType30, (long) 35, (int) '#', 0, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (java.io.Serializable) 100L);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers93 = strConsumerRecord92.headers();
        java.io.Serializable serializable94 = strConsumerRecord92.value();
        java.lang.Class<?> wildcardClass95 = serializable94.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '4', (long) (byte) 10, (long) (byte) -1, timestampType30, (long) 32, (int) (byte) -1, 1, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (java.io.Serializable) wildcardClass95);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord97 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 97, leaderEpoch = null, offset = 32, NoTimestampType = 1, serialized key size = 52, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 97, NoTimestampType = 52, serialized key size = 35, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 100), value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (byte) 10, 35L, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 35, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = NoTimestampType)", (java.io.Serializable) timestampType30);
        java.lang.Class<?> wildcardClass98 = timestampType30.getClass();
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str24, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (short) 10 + "'", serializable26, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (short) 10 + "'", serializable27, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (short) 10 + "'", serializable28, (short) 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType30 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType30.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertNotNull(headers49);
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + (short) 10 + "'", serializable50, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType51 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType51.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 52L + "'", long63 == 52L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 52L + "'", long64 == 52L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType67 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType67.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType69 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType69.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intOptional77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 52L + "'", long79 == 52L);
        org.junit.Assert.assertNotNull(headers80);
        org.junit.Assert.assertNotNull(headers93);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + (short) 0 + "'", serializable94, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        int int20 = strConsumerRecord8.serializedValueSize();
        int int21 = strConsumerRecord8.serializedValueSize();
        org.apache.kafka.common.header.Headers headers22 = strConsumerRecord8.headers();
        org.apache.kafka.common.header.Headers headers23 = strConsumerRecord8.headers();
        java.lang.String str24 = strConsumerRecord8.key();
        long long25 = strConsumerRecord8.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType26 = strConsumerRecord8.timestampType();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(headers22);
        org.junit.Assert.assertNotNull(headers23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType26 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType26.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord15 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) (byte) 10, 0L, "hi!", (java.io.Serializable) timestampType14);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType26 = strConsumerRecord25.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int33 = strConsumerRecord32.serializedValueSize();
        int int34 = strConsumerRecord32.partition();
        org.apache.kafka.common.header.Headers headers35 = strConsumerRecord32.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) ' ', 0L, (long) (byte) 10, timestampType14, (java.lang.Long) 0L, 10, (-1), "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (java.io.Serializable) timestampType26, headers35);
        java.lang.String str37 = strConsumerRecord36.topic();
        int int38 = strConsumerRecord36.serializedValueSize();
        java.io.Serializable serializable39 = strConsumerRecord36.value();
        long long40 = strConsumerRecord36.offset();
        int int41 = strConsumerRecord36.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType26 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType26.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(headers35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str37, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + serializable39 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable39.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        java.lang.String str20 = strConsumerRecord8.topic();
        long long21 = strConsumerRecord8.offset();
        long long22 = strConsumerRecord8.offset();
        java.lang.String str23 = strConsumerRecord8.toString();
        java.lang.String str24 = strConsumerRecord8.key();
        long long25 = strConsumerRecord8.checksum();
        long long26 = strConsumerRecord8.offset();
        java.util.Optional<java.lang.Integer> intOptional27 = strConsumerRecord8.leaderEpoch();
        int int28 = strConsumerRecord8.serializedKeySize();
        int int29 = strConsumerRecord8.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType30 = strConsumerRecord8.timestampType();
        java.lang.Class<?> wildcardClass31 = timestampType30.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str23, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertNotNull(intOptional27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType30 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType30.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        int int11 = strConsumerRecord9.partition();
        java.io.Serializable serializable12 = strConsumerRecord9.value();
        java.lang.Class<?> wildcardClass13 = strConsumerRecord9.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, 52L, "", (java.io.Serializable) wildcardClass13);
        java.io.Serializable serializable15 = strConsumerRecord14.value();
        java.lang.String str16 = strConsumerRecord14.key();
        long long17 = strConsumerRecord14.offset();
        java.lang.String str18 = strConsumerRecord14.topic();
        java.lang.String str19 = strConsumerRecord14.key();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (short) 10 + "'", serializable12, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializable15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType17 = strConsumerRecord16.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        java.lang.String str19 = strConsumerRecord16.toString();
        int int20 = strConsumerRecord16.partition();
        org.apache.kafka.common.record.TimestampType timestampType21 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) (short) 10, (long) (byte) 0, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) timestampType21);
        int int23 = strConsumerRecord22.partition();
        int int24 = strConsumerRecord22.partition();
        org.apache.kafka.common.record.TimestampType timestampType25 = strConsumerRecord22.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long39 = strConsumerRecord38.timestamp();
        long long40 = strConsumerRecord38.checksum();
        java.util.Optional<java.lang.Integer> intOptional41 = strConsumerRecord38.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType42 = strConsumerRecord38.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Comparable<java.lang.String>> timestampTypeConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Comparable<java.lang.String>>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) (short) 1, (long) (byte) 1, timestampType42, (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (int) (byte) 10, (long) ' ', (long) 97, timestampType25, (long) (short) 100, (int) (short) 100, 52, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (byte) 1);
        org.apache.kafka.common.record.TimestampType timestampType46 = strConsumerRecord45.timestampType();
        org.apache.kafka.common.header.Headers headers47 = strConsumerRecord45.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.lang.CharSequence> headersConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.header.Headers, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = 1.0), partition = 10, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 10)", 100, (long) (short) 0, headers47, (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 35, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = NoTimestampType), partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + timestampType21 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType21.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + timestampType25 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType25.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertTrue("'" + timestampType42 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType42.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType46 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType46.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers47);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        long long9 = strConsumerRecord5.checksum();
        java.lang.String str10 = strConsumerRecord5.toString();
        long long11 = strConsumerRecord5.offset();
        int int12 = strConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers14 = strConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str10, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertNotNull(headers14);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str22 = strConsumerRecord21.topic();
        org.apache.kafka.common.record.TimestampType timestampType23 = strConsumerRecord21.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int35 = strConsumerRecord34.serializedValueSize();
        int int36 = strConsumerRecord34.partition();
        org.apache.kafka.common.header.Headers headers37 = strConsumerRecord34.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int44 = strConsumerRecord43.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional45 = strConsumerRecord43.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType23, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers37, intOptional45);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int58 = strConsumerRecord57.serializedValueSize();
        int int59 = strConsumerRecord57.partition();
        org.apache.kafka.common.header.Headers headers60 = strConsumerRecord57.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType23, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers60);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (short) -1, (long) '4', 0L, timestampType23, (long) (byte) 10, (-1), 0, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) 1.0f);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long78 = strConsumerRecord77.timestamp();
        long long79 = strConsumerRecord77.checksum();
        java.util.Optional<java.lang.Integer> intOptional80 = strConsumerRecord77.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType81 = strConsumerRecord77.timestampType();
        java.lang.Class<?> wildcardClass82 = timestampType81.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (int) (short) 0, (long) (byte) 1, (long) 0, timestampType23, (long) 97, (int) '4', (int) (byte) 1, "", (java.io.Serializable) timestampType81);
        long long84 = strConsumerRecord83.checksum();
        org.apache.kafka.common.record.TimestampType timestampType85 = strConsumerRecord83.timestampType();
        java.util.Optional<java.lang.Integer> intOptional86 = strConsumerRecord83.leaderEpoch();
        java.lang.String str87 = strConsumerRecord83.topic();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intOptional45);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertTrue("'" + timestampType81 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType81.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 97L + "'", long84 == 97L);
        org.junit.Assert.assertTrue("'" + timestampType85 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType85.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)" + "'", str87, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)");
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        long long9 = strConsumerRecord5.offset();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.lang.String str11 = strConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        long long13 = strConsumerRecord5.offset();
        long long14 = strConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional15 = strConsumerRecord5.leaderEpoch();
        java.lang.String str16 = strConsumerRecord5.toString();
        int int17 = strConsumerRecord5.serializedValueSize();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str16, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        long long11 = strConsumerRecord9.checksum();
        java.util.Optional<java.lang.Integer> intOptional12 = strConsumerRecord9.leaderEpoch();
        long long13 = strConsumerRecord9.timestamp();
        long long14 = strConsumerRecord9.offset();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord9.timestampType();
        java.lang.String str16 = strConsumerRecord9.topic();
        int int17 = strConsumerRecord9.serializedValueSize();
        java.lang.String str18 = strConsumerRecord9.key();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord9.timestampType();
        java.io.Serializable serializable24 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long35 = strConsumerRecord34.timestamp();
        int int36 = strConsumerRecord34.partition();
        java.lang.String str37 = strConsumerRecord34.topic();
        long long38 = strConsumerRecord34.offset();
        java.io.Serializable serializable39 = strConsumerRecord34.value();
        java.lang.String str40 = strConsumerRecord34.topic();
        org.apache.kafka.common.record.TimestampType timestampType41 = strConsumerRecord34.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long53 = strConsumerRecord52.timestamp();
        int int54 = strConsumerRecord52.partition();
        java.lang.String str55 = strConsumerRecord52.topic();
        long long56 = strConsumerRecord52.offset();
        java.io.Serializable serializable57 = strConsumerRecord52.value();
        long long58 = strConsumerRecord52.checksum();
        org.apache.kafka.common.header.Headers headers59 = strConsumerRecord52.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '4', (-1L), (long) 0, timestampType41, (java.lang.Long) 10L, (int) (short) 10, 100, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (java.io.Serializable) ' ', headers59);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 35, leaderEpoch = null, offset = 1, NoTimestampType = 32, serialized key size = 32, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = 1.0), value = NoTimestampType)", (-1), (long) (byte) -1, (long) '#', timestampType19, (java.lang.Long) (-1L), (int) (byte) 100, (int) (byte) 10, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)", serializable24, headers59);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertEquals("'" + serializable39 + "' != '" + (short) 10 + "'", serializable39, (short) 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType41 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType41.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertEquals("'" + serializable57 + "' != '" + (short) 10 + "'", serializable57, (short) 10);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(headers59);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str10 = strConsumerRecord9.topic();
        java.io.Serializable serializable11 = strConsumerRecord9.value();
        java.lang.String str12 = strConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType13 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType23 = strConsumerRecord22.timestampType();
        int int24 = strConsumerRecord22.serializedKeySize();
        int int25 = strConsumerRecord22.serializedValueSize();
        java.lang.String str26 = strConsumerRecord22.topic();
        java.io.Serializable serializable27 = strConsumerRecord22.value();
        org.apache.kafka.common.header.Headers headers28 = strConsumerRecord22.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str38 = strConsumerRecord37.topic();
        int int39 = strConsumerRecord37.serializedValueSize();
        int int40 = strConsumerRecord37.serializedValueSize();
        java.lang.Class<?> wildcardClass41 = strConsumerRecord37.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str48 = strConsumerRecord47.topic();
        int int49 = strConsumerRecord47.serializedValueSize();
        int int50 = strConsumerRecord47.serializedValueSize();
        java.lang.String str51 = strConsumerRecord47.key();
        java.lang.Class<?> wildcardClass52 = strConsumerRecord47.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.io.Serializable, java.lang.reflect.GenericDeclaration>("", (int) (short) -1, (long) (short) 10, (java.io.Serializable) wildcardClass41, (java.lang.reflect.GenericDeclaration) wildcardClass52);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.Type> headerIterableConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.Type>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 35, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = 1)", 1, (long) (short) 0, (long) 100, timestampType13, (long) 32, 52, 0, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers28, (java.lang.reflect.Type) wildcardClass41);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (short) 10 + "'", serializable11, (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (short) 10 + "'", serializable27, (short) 10);
        org.junit.Assert.assertNotNull(headers28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long13 = strConsumerRecord12.timestamp();
        int int14 = strConsumerRecord12.partition();
        java.io.Serializable serializable15 = strConsumerRecord12.value();
        java.lang.Class<?> wildcardClass16 = strConsumerRecord12.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (int) (byte) 10, (long) 32, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", 97, 52L, "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), partition = 32, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)", (java.io.Serializable) (byte) 10);
        java.io.Serializable serializable20 = strConsumerRecord19.value();
        org.apache.kafka.common.header.Headers headers21 = strConsumerRecord19.headers();
        int int22 = strConsumerRecord19.serializedValueSize();
        java.lang.String str23 = strConsumerRecord19.topic();
        java.util.Optional<java.lang.Integer> intOptional24 = strConsumerRecord19.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (short) 10 + "'", serializable15, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 10 + "'", serializable20, (byte) 10);
        org.junit.Assert.assertNotNull(headers21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)" + "'", str23, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)");
        org.junit.Assert.assertNotNull(intOptional24);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str14 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType15, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers29, intOptional37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        int int51 = strConsumerRecord49.partition();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord49.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType15, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers52);
        java.lang.String str54 = strConsumerRecord53.toString();
        java.util.Optional<java.lang.Integer> intOptional55 = strConsumerRecord53.leaderEpoch();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)" + "'", str54, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)");
        org.junit.Assert.assertNotNull(intOptional55);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        long long9 = strConsumerRecord5.offset();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.lang.String str11 = strConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        long long13 = strConsumerRecord5.offset();
        long long14 = strConsumerRecord5.timestamp();
        java.lang.String str15 = strConsumerRecord5.key();
        java.io.Serializable serializable16 = strConsumerRecord5.value();
        long long17 = strConsumerRecord5.offset();
        long long18 = strConsumerRecord5.checksum();
        java.lang.String str19 = strConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (short) 10 + "'", serializable16, (short) 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        java.lang.String str20 = strConsumerRecord8.topic();
        long long21 = strConsumerRecord8.offset();
        long long22 = strConsumerRecord8.offset();
        java.lang.String str23 = strConsumerRecord8.toString();
        int int24 = strConsumerRecord8.serializedKeySize();
        java.lang.String str25 = strConsumerRecord8.topic();
        int int26 = strConsumerRecord8.serializedValueSize();
        java.lang.String str27 = strConsumerRecord8.key();
        org.apache.kafka.common.record.TimestampType timestampType28 = strConsumerRecord8.timestampType();
        java.util.Optional<java.lang.Integer> intOptional29 = strConsumerRecord8.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional30 = strConsumerRecord8.leaderEpoch();
        int int31 = strConsumerRecord8.partition();
        java.lang.String str32 = strConsumerRecord8.toString();
        java.lang.String str33 = strConsumerRecord8.key();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str23, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + timestampType28 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType28.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional29);
        org.junit.Assert.assertNotNull(intOptional30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str32, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        java.lang.String str11 = strConsumerRecord9.topic();
        java.lang.String str12 = strConsumerRecord9.key();
        int int13 = strConsumerRecord9.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord15 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 100, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = 100)", (int) (byte) 100, (long) (byte) 1, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType)", (java.io.Serializable) timestampType14);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        long long11 = strConsumerRecord9.offset();
        long long12 = strConsumerRecord9.offset();
        java.lang.String str13 = strConsumerRecord9.key();
        int int14 = strConsumerRecord9.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord9.timestampType();
        int int16 = strConsumerRecord9.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType17 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long28 = strConsumerRecord27.timestamp();
        int int29 = strConsumerRecord27.partition();
        java.io.Serializable serializable30 = strConsumerRecord27.value();
        java.lang.String str31 = strConsumerRecord27.topic();
        java.lang.Class<?> wildcardClass32 = strConsumerRecord27.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52), partition = 100, leaderEpoch = null, offset = 97, NoTimestampType = 1, serialized key size = 52, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 100)", (int) (short) 100, (long) 'a', 0L, timestampType17, (long) ' ', 32, 35, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = 35, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = NoTimestampType)", (java.io.Serializable) wildcardClass32);
        java.lang.String str34 = strConsumerRecord33.key();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (short) 10 + "'", serializable30, (short) 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = 35, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = NoTimestampType)" + "'", str34, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = 35, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = NoTimestampType)");
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str6 = strConsumerRecord5.topic();
        java.io.Serializable serializable7 = strConsumerRecord5.value();
        java.lang.String str8 = strConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional9 = strConsumerRecord5.leaderEpoch();
        java.lang.String str10 = strConsumerRecord5.toString();
        long long11 = strConsumerRecord5.checksum();
        org.apache.kafka.common.header.Headers headers12 = strConsumerRecord5.headers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (short) 10 + "'", serializable7, (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str10, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(headers12);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long26 = strConsumerRecord25.timestamp();
        int int27 = strConsumerRecord25.partition();
        java.lang.String str28 = strConsumerRecord25.topic();
        java.lang.Class<?> wildcardClass29 = strConsumerRecord25.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int40 = strConsumerRecord39.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional41 = strConsumerRecord39.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str48 = strConsumerRecord47.topic();
        org.apache.kafka.common.record.TimestampType timestampType49 = strConsumerRecord47.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord39, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType49);
        org.apache.kafka.common.header.Headers headers51 = strConsumerRecord39.headers();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord39.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (int) (short) 100, (long) 'a', (long) ' ', timestampType16, (java.lang.Long) 0L, (int) (byte) 100, (-1), (java.lang.reflect.GenericDeclaration) wildcardClass29, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", headers52);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 100, (long) (byte) -1, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (java.io.Serializable) (short) 100);
        int int55 = strConsumerRecord54.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType56 = strConsumerRecord54.timestampType();
        long long57 = strConsumerRecord54.offset();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType49 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType49.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers51);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType56 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType56.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        long long9 = strConsumerRecord5.timestamp();
        long long10 = strConsumerRecord5.timestamp();
        int int11 = strConsumerRecord5.serializedKeySize();
        int int12 = strConsumerRecord5.serializedValueSize();
        long long13 = strConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        long long11 = strConsumerRecord9.timestamp();
        long long12 = strConsumerRecord9.checksum();
        int int13 = strConsumerRecord9.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord9.timestampType();
        java.util.Optional<java.lang.Integer> intOptional16 = strConsumerRecord9.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType17 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType32 = strConsumerRecord31.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType33 = strConsumerRecord31.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType48 = strConsumerRecord47.timestampType();
        int int49 = strConsumerRecord47.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType50 = strConsumerRecord47.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>("", 100, (long) '#', (long) (byte) 0, timestampType50, (long) (short) 10, 0, (int) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.lang.Comparable<java.lang.String>) "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", 100, (long) 0, 1L, timestampType33, (long) (short) 1, (int) (byte) 1, (int) (short) 1, "hi!", (java.io.Serializable) '#');
        org.apache.kafka.common.record.TimestampType timestampType58 = strConsumerRecord57.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord64 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int65 = strConsumerRecord64.serializedValueSize();
        int int66 = strConsumerRecord64.partition();
        long long67 = strConsumerRecord64.offset();
        long long68 = strConsumerRecord64.offset();
        org.apache.kafka.common.record.TimestampType timestampType69 = strConsumerRecord64.timestampType();
        java.lang.String str70 = strConsumerRecord64.toString();
        int int71 = strConsumerRecord64.serializedValueSize();
        long long72 = strConsumerRecord64.timestamp();
        java.lang.String str73 = strConsumerRecord64.topic();
        org.apache.kafka.common.record.TimestampType timestampType74 = strConsumerRecord64.timestampType();
        java.util.Optional<java.lang.Integer> intOptional75 = strConsumerRecord64.leaderEpoch();
        java.lang.String str76 = strConsumerRecord64.topic();
        org.apache.kafka.common.header.Headers headers77 = strConsumerRecord64.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType84 = strConsumerRecord83.timestampType();
        int int85 = strConsumerRecord83.serializedKeySize();
        int int86 = strConsumerRecord83.partition();
        org.apache.kafka.common.record.TimestampType timestampType87 = strConsumerRecord83.timestampType();
        java.util.Optional<java.lang.Integer> intOptional88 = strConsumerRecord83.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52), value = NoTimestampType)", (int) 'a', 0L, (long) (byte) 10, timestampType17, (java.lang.Long) 100L, (int) (byte) 100, (int) '4', "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 52, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 0, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType), partition = 100, leaderEpoch = null, offset = 100, null = 100, serialized key size = 1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = null)", (java.io.Serializable) timestampType58, headers77, intOptional88);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType33 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType33.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType48 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType48.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType50 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType50.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType58 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType58.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 52L + "'", long67 == 52L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 52L + "'", long68 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType69 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType69.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str70, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType74 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType74.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(headers77);
        org.junit.Assert.assertTrue("'" + timestampType84 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType84.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertTrue("'" + timestampType87 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType87.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional88);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        java.lang.String str16 = strConsumerRecord13.toString();
        int int17 = strConsumerRecord13.partition();
        java.lang.String str18 = strConsumerRecord13.key();
        int int19 = strConsumerRecord13.partition();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int31 = strConsumerRecord30.serializedValueSize();
        int int32 = strConsumerRecord30.partition();
        org.apache.kafka.common.header.Headers headers33 = strConsumerRecord30.headers();
        java.util.Optional<java.lang.Integer> intOptional34 = strConsumerRecord30.leaderEpoch();
        java.lang.String str35 = strConsumerRecord30.key();
        long long36 = strConsumerRecord30.offset();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord30.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType38 = strConsumerRecord30.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = -1, leaderEpoch = null, offset = -1, null = -1, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", 0, 100L, 32L, timestampType20, (long) (byte) 10, 0, (int) (byte) 100, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = #)", (java.io.Serializable) timestampType38);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str50 = strConsumerRecord49.topic();
        java.io.Serializable serializable51 = strConsumerRecord49.value();
        java.io.Serializable serializable52 = strConsumerRecord49.value();
        int int53 = strConsumerRecord49.serializedValueSize();
        int int54 = strConsumerRecord49.partition();
        java.io.Serializable serializable55 = strConsumerRecord49.value();
        java.lang.String str56 = strConsumerRecord49.topic();
        org.apache.kafka.common.header.Headers headers57 = strConsumerRecord49.headers();
        long long58 = strConsumerRecord49.checksum();
        java.util.Optional<java.lang.Integer> intOptional59 = strConsumerRecord49.leaderEpoch();
        java.lang.Class<?> wildcardClass60 = intOptional59.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers67 = strConsumerRecord66.headers();
        java.io.Serializable serializable68 = strConsumerRecord66.value();
        java.lang.String str69 = strConsumerRecord66.key();
        org.apache.kafka.common.header.Headers headers70 = strConsumerRecord66.headers();
        org.apache.kafka.common.header.Headers headers71 = strConsumerRecord66.headers();
        org.apache.kafka.common.header.Headers headers72 = strConsumerRecord66.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long79 = strConsumerRecord78.timestamp();
        int int80 = strConsumerRecord78.partition();
        java.lang.String str81 = strConsumerRecord78.topic();
        long long82 = strConsumerRecord78.offset();
        org.apache.kafka.common.header.Headers headers83 = strConsumerRecord78.headers();
        int int84 = strConsumerRecord78.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional85 = strConsumerRecord78.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = 100, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 100), partition = 0, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 1)", 32, (long) 35, 1L, timestampType20, (java.lang.Long) 35L, (int) 'a', (int) (short) 0, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (java.io.Serializable) wildcardClass60, headers72, intOptional85);
        int int87 = strConsumerRecord86.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str16, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertNotNull(intOptional34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + timestampType38 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType38.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (short) 10 + "'", serializable51, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable52 + "' != '" + (short) 10 + "'", serializable52, (short) 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + (short) 10 + "'", serializable55, (short) 10);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(intOptional59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(headers67);
        org.junit.Assert.assertEquals("'" + serializable68 + "' != '" + (short) 0 + "'", serializable68, (short) 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(headers70);
        org.junit.Assert.assertNotNull(headers71);
        org.junit.Assert.assertNotNull(headers72);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 52L + "'", long82 == 52L);
        org.junit.Assert.assertNotNull(headers83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intOptional85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType7 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        java.lang.String str9 = strConsumerRecord5.key();
        long long10 = strConsumerRecord5.timestamp();
        long long11 = strConsumerRecord5.offset();
        java.lang.String str12 = strConsumerRecord5.toString();
        long long13 = strConsumerRecord5.checksum();
        java.io.Serializable serializable14 = strConsumerRecord5.value();
        int int15 = strConsumerRecord5.partition();
        int int16 = strConsumerRecord5.partition();
        long long17 = strConsumerRecord5.timestamp();
        int int18 = strConsumerRecord5.serializedValueSize();
        java.lang.Class<?> wildcardClass19 = strConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str12, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (short) 10 + "'", serializable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str18 = strConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int31 = strConsumerRecord30.serializedValueSize();
        int int32 = strConsumerRecord30.partition();
        org.apache.kafka.common.header.Headers headers33 = strConsumerRecord30.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int40 = strConsumerRecord39.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional41 = strConsumerRecord39.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType19, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers33, intOptional41);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int54 = strConsumerRecord53.serializedValueSize();
        int int55 = strConsumerRecord53.partition();
        org.apache.kafka.common.header.Headers headers56 = strConsumerRecord53.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType19, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers56);
        long long58 = strConsumerRecord57.offset();
        java.lang.String str59 = strConsumerRecord57.topic();
        long long60 = strConsumerRecord57.offset();
        long long61 = strConsumerRecord57.checksum();
        java.lang.String str62 = strConsumerRecord57.key();
        org.apache.kafka.common.header.Headers headers63 = strConsumerRecord57.headers();
        java.io.Serializable serializable64 = strConsumerRecord57.value();
        java.io.Serializable serializable65 = strConsumerRecord57.value();
        java.lang.String str66 = strConsumerRecord57.topic();
        java.lang.String str67 = strConsumerRecord57.key();
        long long68 = strConsumerRecord57.offset();
        java.lang.Class<?> wildcardClass69 = strConsumerRecord57.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 97, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 0, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 52, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1))", (int) (short) 100, (long) (-1), "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value =  ), partition = 10, leaderEpoch = null, offset = 35, NoTimestampType = 35, serialized key size = 52, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType), value = null)", (java.io.Serializable) wildcardClass69);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str59, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str62, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers63);
        org.junit.Assert.assertEquals("'" + serializable64 + "' != '" + (-1.0d) + "'", serializable64, (-1.0d));
        org.junit.Assert.assertEquals("'" + serializable65 + "' != '" + (-1.0d) + "'", serializable65, (-1.0d));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str66, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str67, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str6 = strConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType7 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.header.Headers headers8 = strConsumerRecord5.headers();
        java.lang.String str9 = strConsumerRecord5.topic();
        long long10 = strConsumerRecord5.timestamp();
        java.lang.String str11 = strConsumerRecord5.key();
        java.lang.String str12 = strConsumerRecord5.topic();
        java.lang.String str13 = strConsumerRecord5.topic();
        java.lang.String str14 = strConsumerRecord5.toString();
        org.apache.kafka.common.header.Headers headers15 = strConsumerRecord5.headers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str14, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers15);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        java.lang.String str20 = strConsumerRecord8.topic();
        java.lang.String str21 = strConsumerRecord8.key();
        java.lang.String str22 = strConsumerRecord8.topic();
        java.io.Serializable serializable23 = strConsumerRecord8.value();
        org.apache.kafka.common.record.TimestampType timestampType24 = strConsumerRecord8.timestampType();
        long long25 = strConsumerRecord8.offset();
        org.apache.kafka.common.header.Headers headers26 = strConsumerRecord8.headers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (short) 10 + "'", serializable23, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType24 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType24.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertNotNull(headers26);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers8 = strConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional9 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord5.leaderEpoch();
        java.lang.String str11 = strConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers12 = strConsumerRecord5.headers();
        java.lang.Class<?> wildcardClass13 = strConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long14 = strConsumerRecord13.timestamp();
        int int15 = strConsumerRecord13.partition();
        java.lang.String str16 = strConsumerRecord13.topic();
        long long17 = strConsumerRecord13.offset();
        java.io.Serializable serializable18 = strConsumerRecord13.value();
        java.lang.String str19 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType31 = strConsumerRecord30.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) '4', (long) (byte) -1, timestampType20, (long) 10, (int) (short) 0, 0, "hi!", (java.io.Serializable) timestampType31);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType47 = strConsumerRecord46.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType48 = strConsumerRecord46.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType49 = strConsumerRecord46.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType59 = strConsumerRecord58.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int69 = strConsumerRecord68.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional70 = strConsumerRecord68.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str77 = strConsumerRecord76.topic();
        org.apache.kafka.common.record.TimestampType timestampType78 = strConsumerRecord76.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord68, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType78);
        java.lang.String str80 = strConsumerRecord68.topic();
        java.lang.Class<?> wildcardClass81 = strConsumerRecord68.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Object> timestampTypeConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Object>("hi!", (int) (short) 100, 1L, 100L, timestampType49, (long) (short) -1, (int) (byte) -1, (int) (byte) -1, timestampType59, (java.lang.Object) wildcardClass81);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (short) 1, (long) (-1), 100L, timestampType20, (long) 1, (int) (byte) 1, 0, "", (java.io.Serializable) timestampType49);
        long long84 = strConsumerRecord83.timestamp();
        java.io.Serializable serializable85 = strConsumerRecord83.value();
        long long86 = strConsumerRecord83.timestamp();
        long long87 = strConsumerRecord83.timestamp();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (short) 10 + "'", serializable18, (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType48 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType48.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType49 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType49.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType59 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType59.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intOptional70);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType78 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType78.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 100L + "'", long84 == 100L);
        org.junit.Assert.assertTrue("'" + serializable85 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable85.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 100L + "'", long86 == 100L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 100L + "'", long87 == 100L);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        java.util.Optional<java.lang.Integer> intOptional8 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType9 = strConsumerRecord5.timestampType();
        java.lang.String str10 = strConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord5.headers();
        int int12 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        long long14 = strConsumerRecord5.checksum();
        java.util.Optional<java.lang.Integer> intOptional15 = strConsumerRecord5.leaderEpoch();
        long long16 = strConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        long long9 = strConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers10 = strConsumerRecord5.headers();
        long long11 = strConsumerRecord5.checksum();
        int int12 = strConsumerRecord5.serializedKeySize();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional14 = strConsumerRecord5.leaderEpoch();
        int int15 = strConsumerRecord5.partition();
        int int16 = strConsumerRecord5.partition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertNotNull(intOptional14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        long long9 = strConsumerRecord5.timestamp();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord5.timestampType();
        java.util.Optional<java.lang.Integer> intOptional12 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        int int14 = strConsumerRecord5.serializedValueSize();
        long long15 = strConsumerRecord5.offset();
        long long16 = strConsumerRecord5.checksum();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        long long9 = strConsumerRecord5.offset();
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord5.timestampType();
        java.lang.String str11 = strConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        long long13 = strConsumerRecord5.checksum();
        org.apache.kafka.common.header.Headers headers14 = strConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(headers14);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        long long9 = strConsumerRecord5.offset();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.lang.String str11 = strConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        long long13 = strConsumerRecord5.offset();
        int int14 = strConsumerRecord5.serializedValueSize();
        java.lang.String str15 = strConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers16 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headers16);
        org.junit.Assert.assertNotNull(headers17);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        long long9 = strConsumerRecord5.checksum();
        long long10 = strConsumerRecord5.offset();
        int int11 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        java.lang.String str14 = strConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str14, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        int int8 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.header.Headers headers9 = strConsumerRecord5.headers();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.lang.Class<?> wildcardClass11 = serializable10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        long long11 = strConsumerRecord9.offset();
        org.apache.kafka.common.header.Headers headers12 = strConsumerRecord9.headers();
        long long13 = strConsumerRecord9.checksum();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        int int15 = strConsumerRecord9.serializedKeySize();
        int int16 = strConsumerRecord9.serializedValueSize();
        java.lang.Class<?> wildcardClass17 = strConsumerRecord9.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.reflect.AnnotatedElement> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.reflect.AnnotatedElement>("ConsumerRecord(topic = , partition = 97, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = -1)", (int) ' ', (long) (short) 100, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1), partition = 1, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType)", (java.lang.reflect.AnnotatedElement) wildcardClass17);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers7 = strConsumerRecord5.headers();
        int int8 = strConsumerRecord5.serializedKeySize();
        org.apache.kafka.common.header.Headers headers9 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers10 = strConsumerRecord5.headers();
        long long11 = strConsumerRecord5.timestamp();
        int int12 = strConsumerRecord5.serializedKeySize();
        java.lang.String str13 = strConsumerRecord5.toString();
        org.apache.kafka.common.header.Headers headers14 = strConsumerRecord5.headers();
        int int15 = strConsumerRecord5.serializedValueSize();
        long long16 = strConsumerRecord5.timestamp();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)" + "'", str13, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)");
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType23 = strConsumerRecord22.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType24 = strConsumerRecord22.timestampType();
        java.lang.String str25 = strConsumerRecord22.toString();
        int int26 = strConsumerRecord22.partition();
        java.lang.String str27 = strConsumerRecord22.key();
        java.lang.Class<?> wildcardClass28 = strConsumerRecord22.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord29 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 52, 52L, (long) 0, timestampType12, 100L, 100, (int) (byte) 1, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 10, leaderEpoch = null, offset = 52, NoTimestampType = 1, serialized key size = 52, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = null)", (java.io.Serializable) wildcardClass28);
        long long30 = strConsumerRecord29.offset();
        long long31 = strConsumerRecord29.checksum();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType24 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType24.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str25, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        java.io.Serializable serializable7 = strConsumerRecord5.value();
        java.lang.String str8 = strConsumerRecord5.key();
        java.lang.String str9 = strConsumerRecord5.key();
        long long10 = strConsumerRecord5.checksum();
        int int11 = strConsumerRecord5.serializedValueSize();
        int int12 = strConsumerRecord5.serializedKeySize();
        int int13 = strConsumerRecord5.serializedValueSize();
        java.lang.String str14 = strConsumerRecord5.topic();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (short) 0 + "'", serializable7, (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.io.Serializable serializable8 = strConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType9 = strConsumerRecord5.timestampType();
        long long10 = strConsumerRecord5.offset();
        java.util.Optional<java.lang.Integer> intOptional11 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional12 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (short) 10 + "'", serializable8, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(intOptional11);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(headers13);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.header.Headers headers12 = strConsumerRecord9.headers();
        java.lang.String str13 = strConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord15 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (-1), 97L, "hi!", (java.io.Serializable) timestampType14);
        int int16 = strConsumerRecord15.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType7 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        java.lang.String str9 = strConsumerRecord5.key();
        long long10 = strConsumerRecord5.timestamp();
        long long11 = strConsumerRecord5.offset();
        java.lang.String str12 = strConsumerRecord5.toString();
        long long13 = strConsumerRecord5.checksum();
        java.io.Serializable serializable14 = strConsumerRecord5.value();
        java.io.Serializable serializable15 = strConsumerRecord5.value();
        java.io.Serializable serializable16 = strConsumerRecord5.value();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord5.headers();
        long long18 = strConsumerRecord5.offset();
        java.lang.String str19 = strConsumerRecord5.toString();
        org.apache.kafka.common.header.Headers headers20 = strConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType7 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType7.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str12, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (short) 10 + "'", serializable14, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (short) 10 + "'", serializable15, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (short) 10 + "'", serializable16, (short) 10);
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str19, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers20);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long27 = strConsumerRecord26.timestamp();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.record.TimestampType timestampType29 = strConsumerRecord26.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType44 = strConsumerRecord43.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) (byte) 10, 0L, "hi!", (java.io.Serializable) timestampType44);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord55 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType56 = strConsumerRecord55.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int63 = strConsumerRecord62.serializedValueSize();
        int int64 = strConsumerRecord62.partition();
        org.apache.kafka.common.header.Headers headers65 = strConsumerRecord62.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) ' ', 0L, (long) (byte) 10, timestampType44, (java.lang.Long) 0L, 10, (-1), "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (java.io.Serializable) timestampType56, headers65);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 0, 52L, (long) '#', timestampType16, (java.lang.Long) 0L, (int) (short) 10, (int) (short) -1, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (java.io.Serializable) timestampType29, headers65);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord81 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType82 = strConsumerRecord81.timestampType();
        int int83 = strConsumerRecord81.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType84 = strConsumerRecord81.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", 1, 52L, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (java.io.Serializable) timestampType84);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", 1, (long) (byte) 1, (long) '#', timestampType29, (long) 100, 52, 10, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (java.io.Serializable) 52L);
        int int87 = strConsumerRecord86.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional88 = strConsumerRecord86.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional89 = strConsumerRecord86.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType90 = strConsumerRecord86.timestampType();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + timestampType29 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType29.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType44 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType44.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType56 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType56.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(headers65);
        org.junit.Assert.assertTrue("'" + timestampType82 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType82.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType84 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType84.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 52 + "'", int87 == 52);
        org.junit.Assert.assertNotNull(intOptional88);
        org.junit.Assert.assertNotNull(intOptional89);
        org.junit.Assert.assertTrue("'" + timestampType90 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType90.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        int int11 = strConsumerRecord9.partition();
        java.lang.String str12 = strConsumerRecord9.topic();
        long long13 = strConsumerRecord9.offset();
        java.io.Serializable serializable14 = strConsumerRecord9.value();
        java.lang.String str15 = strConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52)", (int) (short) 100, (long) '4', "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = #)", (java.io.Serializable) timestampType16);
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord17.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord17.timestampType();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (short) 10 + "'", serializable14, (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedKeySize();
        int int8 = strConsumerRecord5.partition();
        int int9 = strConsumerRecord5.serializedValueSize();
        long long10 = strConsumerRecord5.timestamp();
        int int11 = strConsumerRecord5.partition();
        long long12 = strConsumerRecord5.offset();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(intOptional13);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        long long9 = strConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers10 = strConsumerRecord5.headers();
        long long11 = strConsumerRecord5.checksum();
        long long12 = strConsumerRecord5.checksum();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers14 = strConsumerRecord5.headers();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord5.timestampType();
        int int16 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional17 = strConsumerRecord5.leaderEpoch();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intOptional17);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        int int11 = strConsumerRecord9.partition();
        java.io.Serializable serializable12 = strConsumerRecord9.value();
        org.apache.kafka.common.record.TimestampType timestampType13 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (int) (byte) 0, (long) 100, "hi!", (java.io.Serializable) timestampType13);
        java.lang.String str15 = strConsumerRecord14.topic();
        java.lang.String str16 = strConsumerRecord14.topic();
        java.lang.String str17 = strConsumerRecord14.key();
        long long18 = strConsumerRecord14.offset();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (short) 10 + "'", serializable12, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)" + "'", str15, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)" + "'", str16, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        long long11 = strConsumerRecord9.offset();
        long long12 = strConsumerRecord9.offset();
        java.lang.String str13 = strConsumerRecord9.key();
        int int14 = strConsumerRecord9.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord9.timestampType();
        int int16 = strConsumerRecord9.serializedValueSize();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord9.headers();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 100, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = 100)", 32, (long) 52, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = 52)", (java.io.Serializable) timestampType18);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord9.timestampType();
        java.lang.String str13 = strConsumerRecord9.key();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers26 = strConsumerRecord25.headers();
        org.apache.kafka.common.header.Headers headers27 = strConsumerRecord25.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord36 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int37 = strConsumerRecord36.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional38 = strConsumerRecord36.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str45 = strConsumerRecord44.topic();
        org.apache.kafka.common.record.TimestampType timestampType46 = strConsumerRecord44.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord36, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType46);
        int int48 = strConsumerRecord36.serializedValueSize();
        java.lang.String str49 = strConsumerRecord36.key();
        java.lang.String str50 = strConsumerRecord36.key();
        java.util.Optional<java.lang.Integer> intOptional51 = strConsumerRecord36.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord52 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) ' ', (long) (byte) 100, timestampType14, (java.lang.Long) 0L, 0, (int) (short) -1, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (java.io.Serializable) "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", headers27, intOptional51);
        int int53 = strConsumerRecord52.serializedKeySize();
        int int54 = strConsumerRecord52.serializedValueSize();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers26);
        org.junit.Assert.assertNotNull(headers27);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intOptional38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType46 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType46.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(intOptional51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str14 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType15, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers29, intOptional37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        int int51 = strConsumerRecord49.partition();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord49.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType15, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers52);
        long long54 = strConsumerRecord53.offset();
        java.lang.String str55 = strConsumerRecord53.topic();
        long long56 = strConsumerRecord53.offset();
        org.apache.kafka.common.header.Headers headers57 = strConsumerRecord53.headers();
        java.util.Optional<java.lang.Integer> intOptional58 = strConsumerRecord53.leaderEpoch();
        long long59 = strConsumerRecord53.timestamp();
        int int60 = strConsumerRecord53.serializedValueSize();
        long long61 = strConsumerRecord53.offset();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str55, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertNotNull(intOptional58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long14 = strConsumerRecord13.timestamp();
        int int15 = strConsumerRecord13.partition();
        java.io.Serializable serializable16 = strConsumerRecord13.value();
        org.apache.kafka.common.record.TimestampType timestampType17 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (int) (byte) 0, (long) 100, "hi!", (java.io.Serializable) timestampType17);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52)", (int) (byte) 10, 32L, (long) (short) 100, timestampType17, 1L, 0, (int) (short) 1, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)", (java.io.Serializable) "ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = )");
        long long25 = strConsumerRecord24.offset();
        org.apache.kafka.common.record.TimestampType timestampType26 = strConsumerRecord24.timestampType();
        java.lang.String str27 = strConsumerRecord24.topic();
        java.lang.String str28 = strConsumerRecord24.key();
        int int29 = strConsumerRecord24.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (short) 10 + "'", serializable16, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + timestampType26 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType26.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52)" + "'", str27, "ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)" + "'", str28, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int10 = strConsumerRecord9.serializedValueSize();
        int int11 = strConsumerRecord9.partition();
        long long12 = strConsumerRecord9.offset();
        long long13 = strConsumerRecord9.offset();
        org.apache.kafka.common.header.Headers headers14 = strConsumerRecord9.headers();
        long long15 = strConsumerRecord9.checksum();
        int int16 = strConsumerRecord9.serializedKeySize();
        java.lang.Class<?> wildcardClass17 = strConsumerRecord9.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (int) ' ', (long) (byte) 100, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)", (java.io.Serializable) wildcardClass17);
        int int19 = strConsumerRecord18.serializedKeySize();
        org.apache.kafka.common.header.Headers headers20 = strConsumerRecord18.headers();
        java.util.Optional<java.lang.Integer> intOptional21 = strConsumerRecord18.leaderEpoch();
        long long22 = strConsumerRecord18.offset();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(headers14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(headers20);
        org.junit.Assert.assertNotNull(intOptional21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        int int20 = strConsumerRecord8.serializedValueSize();
        java.io.Serializable serializable21 = strConsumerRecord8.value();
        long long22 = strConsumerRecord8.checksum();
        int int23 = strConsumerRecord8.serializedValueSize();
        int int24 = strConsumerRecord8.serializedKeySize();
        java.lang.String str25 = strConsumerRecord8.toString();
        int int26 = strConsumerRecord8.serializedKeySize();
        java.lang.String str27 = strConsumerRecord8.topic();
        java.lang.String str28 = strConsumerRecord8.key();
        long long29 = strConsumerRecord8.offset();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (short) 10 + "'", serializable21, (short) 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str25, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType17 = strConsumerRecord16.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord16.timestampType();
        java.lang.String str20 = strConsumerRecord16.key();
        long long21 = strConsumerRecord16.timestamp();
        long long22 = strConsumerRecord16.offset();
        java.lang.String str23 = strConsumerRecord16.toString();
        java.io.Serializable serializable24 = strConsumerRecord16.value();
        org.apache.kafka.common.record.TimestampType timestampType25 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str36 = strConsumerRecord35.topic();
        java.lang.Class<?> wildcardClass37 = strConsumerRecord35.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers44 = strConsumerRecord43.headers();
        org.apache.kafka.common.header.Headers headers45 = strConsumerRecord43.headers();
        java.util.Optional<java.lang.Integer> intOptional46 = strConsumerRecord43.leaderEpoch();
        long long47 = strConsumerRecord43.offset();
        org.apache.kafka.common.header.Headers headers48 = strConsumerRecord43.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long59 = strConsumerRecord58.timestamp();
        int int60 = strConsumerRecord58.partition();
        java.lang.String str61 = strConsumerRecord58.topic();
        long long62 = strConsumerRecord58.offset();
        java.io.Serializable serializable63 = strConsumerRecord58.value();
        java.lang.String str64 = strConsumerRecord58.topic();
        org.apache.kafka.common.record.TimestampType timestampType65 = strConsumerRecord58.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord75 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType76 = strConsumerRecord75.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) '4', (long) (byte) -1, timestampType65, (long) 10, (int) (short) 0, 0, "hi!", (java.io.Serializable) timestampType76);
        org.apache.kafka.common.record.TimestampType timestampType78 = strConsumerRecord77.timestampType();
        java.util.Optional<java.lang.Integer> intOptional79 = strConsumerRecord77.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 100, (long) (short) 0, (long) 1, timestampType25, (java.lang.Long) 10L, 0, (int) (short) 100, "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType)", (java.io.Serializable) wildcardClass37, headers48, intOptional79);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 100, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = null), partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = 52, serialized key size = 97, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 10, 0L, (long) (byte) 100, timestampType25, 32L, (-1), (int) (byte) 10, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = #)", (java.io.Serializable) 100L);
        java.io.Serializable serializable87 = strConsumerRecord86.value();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>, java.lang.Comparable<java.lang.String>> strConsumerRecordConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>, java.lang.Comparable<java.lang.String>>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (int) (short) 10, (long) ' ', strConsumerRecord86, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        long long90 = strConsumerRecord86.offset();
        int int91 = strConsumerRecord86.serializedKeySize();
        int int92 = strConsumerRecord86.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str23, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (short) 10 + "'", serializable24, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType25 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType25.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(headers44);
        org.junit.Assert.assertNotNull(headers45);
        org.junit.Assert.assertNotNull(intOptional46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(headers48);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertEquals("'" + serializable63 + "' != '" + (short) 10 + "'", serializable63, (short) 10);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType65 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType65.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType76 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType76.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType78 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType78.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional79);
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + 100L + "'", serializable87, 100L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord13.timestampType();
        java.lang.String str17 = strConsumerRecord13.key();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int40 = strConsumerRecord39.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional41 = strConsumerRecord39.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord47 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str48 = strConsumerRecord47.topic();
        org.apache.kafka.common.record.TimestampType timestampType49 = strConsumerRecord47.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord39, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType49);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) (byte) -1, 100L, (long) 10, timestampType49, 0L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) 0.0f);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord65 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType66 = strConsumerRecord65.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType67 = strConsumerRecord65.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType68 = strConsumerRecord65.timestampType();
        java.lang.Object obj69 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Object> timestampTypeConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Object>("", 0, (long) (byte) 100, (long) (byte) -1, timestampType49, (long) (byte) 100, (int) (short) 10, (int) (short) -1, timestampType68, obj69);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long77 = strConsumerRecord76.timestamp();
        long long78 = strConsumerRecord76.checksum();
        long long79 = strConsumerRecord76.timestamp();
        org.apache.kafka.common.header.Headers headers80 = strConsumerRecord76.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int87 = strConsumerRecord86.serializedValueSize();
        int int88 = strConsumerRecord86.partition();
        int int89 = strConsumerRecord86.partition();
        int int90 = strConsumerRecord86.partition();
        java.util.Optional<java.lang.Integer> intOptional91 = strConsumerRecord86.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord92 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", (int) (byte) 0, 10L, 52L, timestampType18, (java.lang.Long) 100L, (int) (short) 100, 100, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (java.io.Serializable) "", headers80, intOptional91);
        java.lang.Class<?> wildcardClass93 = headers80.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord94 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (-1), (long) (byte) 1, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 97, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (java.io.Serializable) wildcardClass93);
        int int95 = strConsumerRecord94.partition();
        long long96 = strConsumerRecord94.checksum();
        java.lang.String str97 = strConsumerRecord94.key();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType49 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType49.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType66 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType66.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType67 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType67.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType68 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType68.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertNotNull(headers80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertNotNull(intOptional91);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-1L) + "'", long96 == (-1L));
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 97, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)" + "'", str97, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 97, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)");
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long14 = strConsumerRecord13.timestamp();
        int int15 = strConsumerRecord13.partition();
        java.lang.String str16 = strConsumerRecord13.topic();
        long long17 = strConsumerRecord13.offset();
        java.io.Serializable serializable18 = strConsumerRecord13.value();
        java.lang.String str19 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType31 = strConsumerRecord30.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) '4', (long) (byte) -1, timestampType20, (long) 10, (int) (short) 0, 0, "hi!", (java.io.Serializable) timestampType31);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 100, (long) 0, "", (java.io.Serializable) (byte) -1);
        long long34 = strConsumerRecord33.offset();
        java.io.Serializable serializable35 = strConsumerRecord33.value();
        long long36 = strConsumerRecord33.timestamp();
        org.apache.kafka.common.header.Headers headers37 = strConsumerRecord33.headers();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (short) 10 + "'", serializable18, (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + (byte) -1 + "'", serializable35, (byte) -1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(headers37);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        int int9 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord5.timestampType();
        int int11 = strConsumerRecord5.partition();
        java.lang.String str12 = strConsumerRecord5.key();
        int int13 = strConsumerRecord5.partition();
        long long14 = strConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        int int11 = strConsumerRecord9.partition();
        java.io.Serializable serializable12 = strConsumerRecord9.value();
        java.lang.Class<?> wildcardClass13 = strConsumerRecord9.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, 52L, "", (java.io.Serializable) wildcardClass13);
        java.io.Serializable serializable15 = strConsumerRecord14.value();
        java.lang.String str16 = strConsumerRecord14.toString();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord14.headers();
        java.lang.String str18 = strConsumerRecord14.toString();
        int int19 = strConsumerRecord14.partition();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord14.timestampType();
        java.io.Serializable serializable21 = strConsumerRecord14.value();
        int int22 = strConsumerRecord14.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (short) 10 + "'", serializable12, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializable15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str16, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str18, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(serializable21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        java.io.Serializable serializable7 = strConsumerRecord5.value();
        java.lang.String str8 = strConsumerRecord5.key();
        int int9 = strConsumerRecord5.serializedValueSize();
        java.lang.String str10 = strConsumerRecord5.key();
        long long11 = strConsumerRecord5.checksum();
        long long12 = strConsumerRecord5.timestamp();
        java.lang.String str13 = strConsumerRecord5.key();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord5.timestampType();
        long long15 = strConsumerRecord5.checksum();
        long long16 = strConsumerRecord5.offset();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (short) 0 + "'", serializable7, (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        java.lang.String str9 = strConsumerRecord5.toString();
        long long10 = strConsumerRecord5.offset();
        java.lang.String str11 = strConsumerRecord5.toString();
        org.apache.kafka.common.header.Headers headers12 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord5.timestampType();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str9, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str11, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.io.Serializable serializable6 = strConsumerRecord5.value();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (short) 10 + "'", serializable6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int14 = strConsumerRecord13.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional15 = strConsumerRecord13.leaderEpoch();
        java.lang.String str16 = strConsumerRecord13.key();
        long long17 = strConsumerRecord13.checksum();
        int int18 = strConsumerRecord13.serializedKeySize();
        org.apache.kafka.common.header.Headers headers19 = strConsumerRecord13.headers();
        long long20 = strConsumerRecord13.offset();
        java.lang.String str21 = strConsumerRecord13.key();
        org.apache.kafka.common.record.TimestampType timestampType22 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType23 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType38 = strConsumerRecord37.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType39 = strConsumerRecord37.timestampType();
        java.lang.String str40 = strConsumerRecord37.toString();
        int int41 = strConsumerRecord37.partition();
        org.apache.kafka.common.record.TimestampType timestampType42 = strConsumerRecord37.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (int) (short) 10, (long) (byte) 0, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) timestampType42);
        int int44 = strConsumerRecord43.partition();
        java.lang.Class<?> wildcardClass45 = strConsumerRecord43.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = 100, serialized value size = 97, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 100)", 1, (long) ' ', 1L, timestampType23, (long) (byte) 0, (int) 'a', 97, (java.lang.Comparable<java.lang.String>) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 100, leaderEpoch = null, offset = -1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = null)", (java.lang.reflect.Type) wildcardClass45);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long57 = strConsumerRecord56.timestamp();
        int int58 = strConsumerRecord56.partition();
        java.io.Serializable serializable59 = strConsumerRecord56.value();
        java.util.Optional<java.lang.Integer> intOptional60 = strConsumerRecord56.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType61 = strConsumerRecord56.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord62 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = 1, serialized key size = 10, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value =  ), partition = 35, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 10, serialized key size = 10, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 52), value = 10)", 100, (long) 35, (long) (short) 1, timestampType23, (long) 1, 100, 32, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 10, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = 0.0)", (java.io.Serializable) timestampType61);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + timestampType22 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType22.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType38 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType38.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType39 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType39.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str40, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + timestampType42 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType42.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertEquals("'" + serializable59 + "' != '" + (short) 10 + "'", serializable59, (short) 10);
        org.junit.Assert.assertNotNull(intOptional60);
        org.junit.Assert.assertTrue("'" + timestampType61 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType61.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        long long8 = strConsumerRecord5.timestamp();
        java.lang.String str9 = strConsumerRecord5.topic();
        long long10 = strConsumerRecord5.timestamp();
        java.io.Serializable serializable11 = strConsumerRecord5.value();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        java.lang.String str14 = strConsumerRecord5.toString();
        java.lang.String str15 = strConsumerRecord5.toString();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord5.timestampType();
        java.util.Optional<java.lang.Integer> intOptional17 = strConsumerRecord5.leaderEpoch();
        int int18 = strConsumerRecord5.serializedKeySize();
        long long19 = strConsumerRecord5.offset();
        java.io.Serializable serializable20 = strConsumerRecord5.value();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (short) 10 + "'", serializable11, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str14, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str15, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(intOptional17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (short) 10 + "'", serializable20, (short) 10);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional7 = strConsumerRecord5.leaderEpoch();
        java.lang.String str8 = strConsumerRecord5.topic();
        java.io.Serializable serializable9 = strConsumerRecord5.value();
        long long10 = strConsumerRecord5.offset();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord5.timestampType();
        long long12 = strConsumerRecord5.timestamp();
        java.lang.Class<?> wildcardClass13 = strConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intOptional7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (short) 10 + "'", serializable9, (short) 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord12 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int13 = strConsumerRecord12.serializedValueSize();
        int int14 = strConsumerRecord12.partition();
        java.lang.Class<?> wildcardClass15 = strConsumerRecord12.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long22 = strConsumerRecord21.timestamp();
        long long23 = strConsumerRecord21.checksum();
        long long24 = strConsumerRecord21.timestamp();
        java.lang.String str25 = strConsumerRecord21.topic();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>> typeConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.Type, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", 10, 0L, (java.lang.reflect.Type) wildcardClass15, strConsumerRecord21);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", 0, (long) (byte) 100, "ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType)", (java.io.Serializable) 0L);
        long long28 = strConsumerRecord27.offset();
        java.lang.String str29 = strConsumerRecord27.toString();
        org.apache.kafka.common.header.Headers headers30 = strConsumerRecord27.headers();
        java.lang.String str31 = strConsumerRecord27.toString();
        long long32 = strConsumerRecord27.timestamp();
        org.apache.kafka.common.header.Headers headers33 = strConsumerRecord27.headers();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)" + "'", str29, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)");
        org.junit.Assert.assertNotNull(headers30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)" + "'", str31, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(headers33);
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        int int20 = strConsumerRecord8.serializedValueSize();
        java.io.Serializable serializable21 = strConsumerRecord8.value();
        java.util.Optional<java.lang.Integer> intOptional22 = strConsumerRecord8.leaderEpoch();
        java.io.Serializable serializable23 = strConsumerRecord8.value();
        long long24 = strConsumerRecord8.checksum();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (short) 10 + "'", serializable21, (short) 10);
        org.junit.Assert.assertNotNull(intOptional22);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (short) 10 + "'", serializable23, (short) 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.offset();
        long long8 = strConsumerRecord5.offset();
        java.lang.String str9 = strConsumerRecord5.key();
        long long10 = strConsumerRecord5.offset();
        long long11 = strConsumerRecord5.timestamp();
        int int12 = strConsumerRecord5.serializedKeySize();
        java.lang.String str13 = strConsumerRecord5.key();
        java.lang.String str14 = strConsumerRecord5.topic();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        long long8 = strConsumerRecord5.timestamp();
        java.util.Optional<java.lang.Integer> intOptional9 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord5.leaderEpoch();
        int int11 = strConsumerRecord5.serializedValueSize();
        long long12 = strConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        java.io.Serializable serializable7 = strConsumerRecord5.value();
        java.lang.String str8 = strConsumerRecord5.key();
        java.lang.String str9 = strConsumerRecord5.key();
        int int10 = strConsumerRecord5.partition();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord5.headers();
        int int12 = strConsumerRecord5.partition();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        long long14 = strConsumerRecord5.checksum();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (short) 0 + "'", serializable7, (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord20 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str21 = strConsumerRecord20.topic();
        org.apache.kafka.common.record.TimestampType timestampType22 = strConsumerRecord20.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord33 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int34 = strConsumerRecord33.serializedValueSize();
        int int35 = strConsumerRecord33.partition();
        org.apache.kafka.common.header.Headers headers36 = strConsumerRecord33.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int43 = strConsumerRecord42.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional44 = strConsumerRecord42.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord45 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType22, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers36, intOptional44);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int57 = strConsumerRecord56.serializedValueSize();
        int int58 = strConsumerRecord56.partition();
        org.apache.kafka.common.header.Headers headers59 = strConsumerRecord56.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord60 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType22, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers59);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (short) -1, (long) '4', 0L, timestampType22, (long) (byte) 10, (-1), 0, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) 1.0f);
        int int67 = strConsumerRecord66.serializedValueSize();
        long long68 = strConsumerRecord66.checksum();
        org.apache.kafka.common.record.TimestampType timestampType69 = strConsumerRecord66.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int79 = strConsumerRecord78.serializedValueSize();
        int int80 = strConsumerRecord78.partition();
        java.lang.String str81 = strConsumerRecord78.topic();
        long long82 = strConsumerRecord78.checksum();
        long long83 = strConsumerRecord78.offset();
        long long84 = strConsumerRecord78.offset();
        int int85 = strConsumerRecord78.serializedKeySize();
        long long86 = strConsumerRecord78.timestamp();
        int int87 = strConsumerRecord78.partition();
        java.lang.Class<?> wildcardClass88 = strConsumerRecord78.getClass();
        java.lang.Iterable<org.apache.kafka.common.header.Header> headerIterable89 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.Iterable<org.apache.kafka.common.header.Header>> annotatedElementConsumerRecord90 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.reflect.AnnotatedElement, java.lang.Iterable<org.apache.kafka.common.header.Header>>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)", (int) ' ', (long) 0, (java.lang.reflect.AnnotatedElement) wildcardClass88, headerIterable89);
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.reflect.Type> timestampTypeConsumerRecord91 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.reflect.Type>("ConsumerRecord(topic = , partition = 52, leaderEpoch = null, offset = -1, NoTimestampType = 0, serialized key size = 10, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), value =  )", (int) (short) 1, (long) (short) 0, timestampType69, (java.lang.reflect.Type) wildcardClass88);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType22 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType22.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(headers36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intOptional44);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(headers59);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertTrue("'" + timestampType69 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType69.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 52L + "'", long83 == 52L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 52L + "'", long84 == 52L);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long14 = strConsumerRecord13.timestamp();
        int int15 = strConsumerRecord13.partition();
        java.lang.String str16 = strConsumerRecord13.topic();
        long long17 = strConsumerRecord13.offset();
        java.io.Serializable serializable18 = strConsumerRecord13.value();
        java.lang.String str19 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType31 = strConsumerRecord30.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord32 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) '4', (long) (byte) -1, timestampType20, (long) 10, (int) (short) 0, 0, "hi!", (java.io.Serializable) timestampType31);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType47 = strConsumerRecord46.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType48 = strConsumerRecord46.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType49 = strConsumerRecord46.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType59 = strConsumerRecord58.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord68 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int69 = strConsumerRecord68.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional70 = strConsumerRecord68.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str77 = strConsumerRecord76.topic();
        org.apache.kafka.common.record.TimestampType timestampType78 = strConsumerRecord76.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord79 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord68, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType78);
        java.lang.String str80 = strConsumerRecord68.topic();
        java.lang.Class<?> wildcardClass81 = strConsumerRecord68.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Object> timestampTypeConsumerRecord82 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, java.lang.Object>("hi!", (int) (short) 100, 1L, 100L, timestampType49, (long) (short) -1, (int) (byte) -1, (int) (byte) -1, timestampType59, (java.lang.Object) wildcardClass81);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (short) 1, (long) (-1), 100L, timestampType20, (long) 1, (int) (byte) 1, 0, "", (java.io.Serializable) timestampType49);
        long long84 = strConsumerRecord83.checksum();
        org.apache.kafka.common.header.Headers headers85 = strConsumerRecord83.headers();
        int int86 = strConsumerRecord83.serializedKeySize();
        java.lang.String str87 = strConsumerRecord83.key();
        org.apache.kafka.common.header.Headers headers88 = strConsumerRecord83.headers();
        java.io.Serializable serializable89 = strConsumerRecord83.value();
        java.lang.String str90 = strConsumerRecord83.key();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (short) 10 + "'", serializable18, (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType48 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType48.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType49 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType49.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType59 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType59.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intOptional70);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType78 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType78.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertNotNull(headers85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(headers88);
        org.junit.Assert.assertTrue("'" + serializable89 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", serializable89.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long14 = strConsumerRecord13.timestamp();
        int int15 = strConsumerRecord13.partition();
        java.lang.String str16 = strConsumerRecord13.topic();
        long long17 = strConsumerRecord13.offset();
        java.io.Serializable serializable18 = strConsumerRecord13.value();
        org.apache.kafka.common.header.Headers headers19 = strConsumerRecord13.headers();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.io.Serializable serializable31 = strConsumerRecord30.value();
        int int32 = strConsumerRecord30.partition();
        java.lang.Class<?> wildcardClass33 = strConsumerRecord30.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int43 = strConsumerRecord42.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional44 = strConsumerRecord42.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord50 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str51 = strConsumerRecord50.topic();
        org.apache.kafka.common.record.TimestampType timestampType52 = strConsumerRecord50.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord42, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType52);
        java.lang.String str54 = strConsumerRecord42.topic();
        long long55 = strConsumerRecord42.offset();
        long long56 = strConsumerRecord42.offset();
        org.apache.kafka.common.header.Headers headers57 = strConsumerRecord42.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord58 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) 0, (long) 'a', timestampType20, (java.lang.Long) 100L, 97, (int) (byte) 1, "ConsumerRecord(topic = , partition = 35, leaderEpoch = null, offset = 10, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = )", (java.io.Serializable) wildcardClass33, headers57);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord59 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = -1, NoTimestampType = 32, serialized key size = 97, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = false)", (int) (byte) 1, 0L, "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 0, leaderEpoch = null, offset = 10, NoTimestampType = 52, serialized key size = 100, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType), value = )", (java.io.Serializable) 97);
        java.lang.String str60 = strConsumerRecord59.topic();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (short) 10 + "'", serializable18, (short) 10);
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + (short) 10 + "'", serializable31, (short) 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intOptional44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType52 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType52.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = -1, NoTimestampType = 32, serialized key size = 97, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = false)" + "'", str60, "ConsumerRecord(topic = hi!, partition = 0, leaderEpoch = null, offset = -1, NoTimestampType = 32, serialized key size = 97, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = false)");
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int10 = strConsumerRecord9.serializedValueSize();
        int int11 = strConsumerRecord9.partition();
        long long12 = strConsumerRecord9.offset();
        long long13 = strConsumerRecord9.offset();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord9.timestampType();
        java.io.Serializable serializable15 = strConsumerRecord9.value();
        java.io.Serializable serializable16 = strConsumerRecord9.value();
        java.io.Serializable serializable17 = strConsumerRecord9.value();
        java.lang.String str18 = strConsumerRecord9.toString();
        org.apache.kafka.common.header.Headers headers19 = strConsumerRecord9.headers();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord37 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long38 = strConsumerRecord37.timestamp();
        int int39 = strConsumerRecord37.partition();
        java.lang.String str40 = strConsumerRecord37.topic();
        long long41 = strConsumerRecord37.offset();
        java.io.Serializable serializable42 = strConsumerRecord37.value();
        java.lang.String str43 = strConsumerRecord37.topic();
        org.apache.kafka.common.record.TimestampType timestampType44 = strConsumerRecord37.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord54 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType55 = strConsumerRecord54.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) '4', (long) (byte) -1, timestampType44, (long) 10, (int) (short) 0, 0, "hi!", (java.io.Serializable) timestampType55);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 100, (long) 0, "", (java.io.Serializable) (byte) -1);
        java.lang.String str58 = strConsumerRecord57.toString();
        int int59 = strConsumerRecord57.serializedValueSize();
        org.apache.kafka.common.header.Headers headers60 = strConsumerRecord57.headers();
        org.apache.kafka.common.record.TimestampType timestampType61 = strConsumerRecord57.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType68 = strConsumerRecord67.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType69 = strConsumerRecord67.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType70 = strConsumerRecord67.timestampType();
        java.lang.String str71 = strConsumerRecord67.key();
        long long72 = strConsumerRecord67.timestamp();
        long long73 = strConsumerRecord67.offset();
        java.lang.String str74 = strConsumerRecord67.toString();
        java.io.Serializable serializable75 = strConsumerRecord67.value();
        long long76 = strConsumerRecord67.offset();
        java.io.Serializable serializable77 = strConsumerRecord67.value();
        java.lang.String str78 = strConsumerRecord67.toString();
        java.lang.String str79 = strConsumerRecord67.topic();
        java.util.Optional<java.lang.Integer> intOptional80 = strConsumerRecord67.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord86 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long87 = strConsumerRecord86.timestamp();
        int int88 = strConsumerRecord86.partition();
        java.lang.String str89 = strConsumerRecord86.topic();
        long long90 = strConsumerRecord86.offset();
        java.io.Serializable serializable91 = strConsumerRecord86.value();
        java.lang.String str92 = strConsumerRecord86.topic();
        int int93 = strConsumerRecord86.partition();
        java.io.Serializable serializable94 = strConsumerRecord86.value();
        org.apache.kafka.common.header.Headers headers95 = strConsumerRecord86.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>> timestampTypeEnumConsumerRecord96 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.Optional<java.lang.Integer>>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = 1, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = #), value = 100.0)", 32, (long) 1, (long) 35, timestampType20, (java.lang.Long) 1L, 52, 0, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType61, intOptional80, headers95);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (short) 10 + "'", serializable15, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (short) 10 + "'", serializable16, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (short) 10 + "'", serializable17, (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str18, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers19);
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (short) 10 + "'", serializable42, (short) 10);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType44 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType44.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType55 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType55.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)" + "'", str58, "ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertTrue("'" + timestampType61 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType61.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType68 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType68.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType69 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType69.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType70 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType70.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str74, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + serializable75 + "' != '" + (short) 10 + "'", serializable75, (short) 10);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
        org.junit.Assert.assertEquals("'" + serializable77 + "' != '" + (short) 10 + "'", serializable77, (short) 10);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str78, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(intOptional80);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 52L + "'", long90 == 52L);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + (short) 10 + "'", serializable91, (short) 10);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 100 + "'", int93 == 100);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + (short) 10 + "'", serializable94, (short) 10);
        org.junit.Assert.assertNotNull(headers95);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        java.lang.String str20 = strConsumerRecord8.topic();
        long long21 = strConsumerRecord8.timestamp();
        java.lang.String str22 = strConsumerRecord8.topic();
        int int23 = strConsumerRecord8.partition();
        java.io.Serializable serializable24 = strConsumerRecord8.value();
        int int25 = strConsumerRecord8.serializedValueSize();
        java.lang.String str26 = strConsumerRecord8.key();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (short) 10 + "'", serializable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        int int11 = strConsumerRecord9.partition();
        java.lang.String str12 = strConsumerRecord9.topic();
        long long13 = strConsumerRecord9.offset();
        java.io.Serializable serializable14 = strConsumerRecord9.value();
        java.lang.String str15 = strConsumerRecord9.topic();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType27 = strConsumerRecord26.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 0, (long) '4', (long) (byte) -1, timestampType16, (long) 10, (int) (short) 0, 0, "hi!", (java.io.Serializable) timestampType27);
        org.apache.kafka.common.record.TimestampType timestampType29 = strConsumerRecord28.timestampType();
        java.lang.String str30 = strConsumerRecord28.topic();
        int int31 = strConsumerRecord28.serializedValueSize();
        int int32 = strConsumerRecord28.serializedValueSize();
        int int33 = strConsumerRecord28.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType34 = strConsumerRecord28.timestampType();
        java.lang.String str35 = strConsumerRecord28.toString();
        int int36 = strConsumerRecord28.serializedValueSize();
        java.lang.String str37 = strConsumerRecord28.toString();
        java.util.Optional<java.lang.Integer> intOptional38 = strConsumerRecord28.leaderEpoch();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (short) 10 + "'", serializable14, (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType27 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType27.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType29 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType29.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str30, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + timestampType34 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType34.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)" + "'", str35, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)" + "'", str37, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = 0, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)");
        org.junit.Assert.assertNotNull(intOptional38);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        java.io.Serializable serializable7 = strConsumerRecord5.value();
        java.lang.String str8 = strConsumerRecord5.key();
        int int9 = strConsumerRecord5.serializedValueSize();
        java.lang.String str10 = strConsumerRecord5.key();
        java.lang.String str11 = strConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers12 = strConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        int int14 = strConsumerRecord5.partition();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (short) 0 + "'", serializable7, (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headers12);
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str14 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType15, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers29, intOptional37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        int int51 = strConsumerRecord49.partition();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord49.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType15, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers52);
        long long54 = strConsumerRecord53.offset();
        java.io.Serializable serializable55 = strConsumerRecord53.value();
        org.apache.kafka.common.header.Headers headers56 = strConsumerRecord53.headers();
        java.lang.String str57 = strConsumerRecord53.toString();
        java.io.Serializable serializable58 = strConsumerRecord53.value();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + (-1.0d) + "'", serializable55, (-1.0d));
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)" + "'", str57, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)");
        org.junit.Assert.assertEquals("'" + serializable58 + "' != '" + (-1.0d) + "'", serializable58, (-1.0d));
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int10 = strConsumerRecord9.serializedValueSize();
        int int11 = strConsumerRecord9.partition();
        long long12 = strConsumerRecord9.offset();
        java.lang.String str13 = strConsumerRecord9.key();
        long long14 = strConsumerRecord9.checksum();
        long long15 = strConsumerRecord9.timestamp();
        java.lang.String str16 = strConsumerRecord9.toString();
        java.lang.String str17 = strConsumerRecord9.key();
        java.io.Serializable serializable18 = strConsumerRecord9.value();
        java.lang.String str19 = strConsumerRecord9.key();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 97, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = -1)", (-1), (long) 32, "", (java.io.Serializable) timestampType20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str16, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (short) 10 + "'", serializable18, (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers7 = strConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional8 = strConsumerRecord5.leaderEpoch();
        java.io.Serializable serializable9 = strConsumerRecord5.value();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.lang.String str11 = strConsumerRecord5.topic();
        java.lang.String str12 = strConsumerRecord5.topic();
        org.apache.kafka.common.record.TimestampType timestampType13 = strConsumerRecord5.timestampType();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertNotNull(headers7);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (short) 0 + "'", serializable9, (short) 0);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 0 + "'", serializable10, (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + timestampType13 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType13.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        org.apache.kafka.common.record.TimestampType timestampType4 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int17 = strConsumerRecord16.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional18 = strConsumerRecord16.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord24 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str25 = strConsumerRecord24.topic();
        org.apache.kafka.common.record.TimestampType timestampType26 = strConsumerRecord24.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord27 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord16, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType26);
        java.lang.String str28 = strConsumerRecord16.topic();
        long long29 = strConsumerRecord16.offset();
        long long30 = strConsumerRecord16.offset();
        java.lang.String str31 = strConsumerRecord16.toString();
        int int32 = strConsumerRecord16.serializedKeySize();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long39 = strConsumerRecord38.timestamp();
        int int40 = strConsumerRecord38.partition();
        java.io.Serializable serializable41 = strConsumerRecord38.value();
        java.lang.Class<?> wildcardClass42 = serializable41.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long49 = strConsumerRecord48.timestamp();
        long long50 = strConsumerRecord48.checksum();
        java.util.Optional<java.lang.Integer> intOptional51 = strConsumerRecord48.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType52 = strConsumerRecord48.timestampType();
        java.lang.String str53 = strConsumerRecord48.topic();
        long long54 = strConsumerRecord48.checksum();
        long long55 = strConsumerRecord48.timestamp();
        java.lang.String str56 = strConsumerRecord48.toString();
        org.apache.kafka.common.header.Headers headers57 = strConsumerRecord48.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord63 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers64 = strConsumerRecord63.headers();
        java.io.Serializable serializable65 = strConsumerRecord63.value();
        java.lang.String str66 = strConsumerRecord63.key();
        java.lang.String str67 = strConsumerRecord63.key();
        int int68 = strConsumerRecord63.partition();
        java.util.Optional<java.lang.Integer> intOptional69 = strConsumerRecord63.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>, java.lang.reflect.GenericDeclaration> strConsumerRecordConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", 10, (long) (short) -1, (long) (byte) 100, timestampType4, (java.lang.Long) (-1L), 100, (-1), strConsumerRecord16, (java.lang.reflect.GenericDeclaration) wildcardClass42, headers57, intOptional69);
        int int71 = strConsumerRecord16.serializedValueSize();
        long long72 = strConsumerRecord16.timestamp();
        java.lang.String str73 = strConsumerRecord16.key();
        int int74 = strConsumerRecord16.serializedValueSize();
        int int75 = strConsumerRecord16.partition();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intOptional18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType26 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType26.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str31, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (short) 10 + "'", serializable41, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(intOptional51);
        org.junit.Assert.assertTrue("'" + timestampType52 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType52.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str56, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertNotNull(headers64);
        org.junit.Assert.assertEquals("'" + serializable65 + "' != '" + (short) 0 + "'", serializable65, (short) 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(intOptional69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (int) 'a', (long) (short) -1, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (java.io.Serializable) (byte) 0);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers8 = strConsumerRecord5.headers();
        long long9 = strConsumerRecord5.checksum();
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord5.timestampType();
        int int11 = strConsumerRecord5.serializedKeySize();
        java.lang.String str12 = strConsumerRecord5.key();
        java.lang.String str13 = strConsumerRecord5.toString();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord5.timestampType();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        int int7 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.header.Headers headers8 = strConsumerRecord5.headers();
        int int9 = strConsumerRecord5.partition();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        int int20 = strConsumerRecord8.serializedValueSize();
        java.lang.String str21 = strConsumerRecord8.key();
        java.lang.String str22 = strConsumerRecord8.key();
        int int23 = strConsumerRecord8.serializedKeySize();
        int int24 = strConsumerRecord8.serializedValueSize();
        java.io.Serializable serializable25 = strConsumerRecord8.value();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (short) 10 + "'", serializable25, (short) 10);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        int int9 = strConsumerRecord5.serializedValueSize();
        int int10 = strConsumerRecord5.serializedKeySize();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord5.timestampType();
        java.lang.String str12 = strConsumerRecord5.topic();
        long long13 = strConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str14 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType15, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers29, intOptional37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        int int51 = strConsumerRecord49.partition();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord49.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType15, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers52);
        long long54 = strConsumerRecord53.offset();
        java.io.Serializable serializable55 = strConsumerRecord53.value();
        long long56 = strConsumerRecord53.timestamp();
        java.lang.String str57 = strConsumerRecord53.toString();
        java.io.Serializable serializable58 = strConsumerRecord53.value();
        long long59 = strConsumerRecord53.offset();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + (-1.0d) + "'", serializable55, (-1.0d));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)" + "'", str57, "ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0)");
        org.junit.Assert.assertEquals("'" + serializable58 + "' != '" + (-1.0d) + "'", serializable58, (-1.0d));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int9 = strConsumerRecord8.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord16 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str17 = strConsumerRecord16.topic();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord16.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord19 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("hi!", (int) '#', (long) (short) -1, (java.lang.Object) strConsumerRecord8, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType18);
        java.lang.String str20 = strConsumerRecord8.topic();
        long long21 = strConsumerRecord8.offset();
        long long22 = strConsumerRecord8.offset();
        java.lang.String str23 = strConsumerRecord8.toString();
        int int24 = strConsumerRecord8.serializedKeySize();
        java.lang.String str25 = strConsumerRecord8.topic();
        int int26 = strConsumerRecord8.serializedValueSize();
        java.lang.String str27 = strConsumerRecord8.key();
        long long28 = strConsumerRecord8.timestamp();
        java.io.Serializable serializable29 = strConsumerRecord8.value();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str23, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 10 + "'", serializable29, (short) 10);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional8 = strConsumerRecord5.leaderEpoch();
        java.lang.String str9 = strConsumerRecord5.toString();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        int int11 = strConsumerRecord5.serializedKeySize();
        java.lang.String str12 = strConsumerRecord5.toString();
        java.io.Serializable serializable13 = strConsumerRecord5.value();
        int int14 = strConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str9, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str12, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (short) 10 + "'", serializable13, (short) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str14 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType15, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers29, intOptional37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        int int51 = strConsumerRecord49.partition();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord49.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType15, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers52);
        long long54 = strConsumerRecord53.offset();
        java.lang.String str55 = strConsumerRecord53.topic();
        org.apache.kafka.common.record.TimestampType timestampType56 = strConsumerRecord53.timestampType();
        java.lang.Class<?> wildcardClass57 = timestampType56.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str55, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType56 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType56.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord15 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int16 = strConsumerRecord15.serializedValueSize();
        int int17 = strConsumerRecord15.partition();
        long long18 = strConsumerRecord15.offset();
        long long19 = strConsumerRecord15.offset();
        org.apache.kafka.common.record.TimestampType timestampType20 = strConsumerRecord15.timestampType();
        java.lang.String str21 = strConsumerRecord15.toString();
        int int22 = strConsumerRecord15.serializedValueSize();
        java.io.Serializable serializable23 = strConsumerRecord15.value();
        java.io.Serializable serializable24 = strConsumerRecord15.value();
        org.apache.kafka.common.record.TimestampType timestampType25 = strConsumerRecord15.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType32 = strConsumerRecord31.timestampType();
        int int33 = strConsumerRecord31.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType34 = strConsumerRecord31.timestampType();
        java.lang.String str35 = strConsumerRecord31.toString();
        java.util.Optional<java.lang.Integer> intOptional36 = strConsumerRecord31.leaderEpoch();
        long long37 = strConsumerRecord31.offset();
        java.util.Optional<java.lang.Integer> intOptional38 = strConsumerRecord31.leaderEpoch();
        org.apache.kafka.common.header.Headers headers39 = strConsumerRecord31.headers();
        long long40 = strConsumerRecord31.checksum();
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>> timestampTypeConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.kafka.common.record.TimestampType, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", 97, 35L, timestampType25, strConsumerRecord31);
        org.apache.kafka.common.header.Headers headers42 = strConsumerRecord31.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord48 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long49 = strConsumerRecord48.timestamp();
        long long50 = strConsumerRecord48.checksum();
        long long51 = strConsumerRecord48.timestamp();
        java.lang.String str52 = strConsumerRecord48.topic();
        long long53 = strConsumerRecord48.timestamp();
        java.io.Serializable serializable54 = strConsumerRecord48.value();
        org.apache.kafka.common.record.TimestampType timestampType55 = strConsumerRecord48.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> objConsumerRecord56 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 100, leaderEpoch = null, offset = 100, NoTimestampType = 1, serialized key size = 1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 100.0)", 10, 10L, (java.lang.Object) strConsumerRecord31, (java.lang.Enum<org.apache.kafka.common.record.TimestampType>) timestampType55);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord70 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers71 = strConsumerRecord70.headers();
        java.io.Serializable serializable72 = strConsumerRecord70.value();
        java.lang.String str73 = strConsumerRecord70.key();
        java.lang.String str74 = strConsumerRecord70.toString();
        org.apache.kafka.common.record.TimestampType timestampType75 = strConsumerRecord70.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), partition = 32, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)", 10, 100L, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 52, NoTimestampType = 0, serialized key size = -1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = 1.0)", (java.io.Serializable) timestampType75);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 100, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 1, leaderEpoch = null, offset = -1, NoTimestampType = 100, serialized key size = 1, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = NoTimestampType), value = 0)", (int) '#', (-1L), 1L, timestampType55, (long) (byte) 10, (int) (byte) 1, (-1), "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), partition = 10, leaderEpoch = null, offset = 52, NoTimestampType = 1, serialized key size = 52, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord), value = null)", (java.io.Serializable) "ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), partition = 32, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType20 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType20.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str21, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (short) 10 + "'", serializable23, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (short) 10 + "'", serializable24, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType25 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType25.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType32 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType32.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType34 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType34.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str35, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(intOptional36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertNotNull(intOptional38);
        org.junit.Assert.assertNotNull(headers39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(headers42);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable54 + "' != '" + (short) 10 + "'", serializable54, (short) 10);
        org.junit.Assert.assertTrue("'" + timestampType55 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType55.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(headers71);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + (short) 0 + "'", serializable72, (short) 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)" + "'", str74, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)");
        org.junit.Assert.assertTrue("'" + timestampType75 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType75.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedValueSize();
        int int8 = strConsumerRecord5.serializedKeySize();
        int int9 = strConsumerRecord5.serializedValueSize();
        java.lang.String str10 = strConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional11 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional12 = strConsumerRecord5.leaderEpoch();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(intOptional11);
        org.junit.Assert.assertNotNull(intOptional12);
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord17 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str18 = strConsumerRecord17.topic();
        org.apache.kafka.common.record.TimestampType timestampType19 = strConsumerRecord17.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord30 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int31 = strConsumerRecord30.serializedValueSize();
        int int32 = strConsumerRecord30.partition();
        org.apache.kafka.common.header.Headers headers33 = strConsumerRecord30.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord39 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int40 = strConsumerRecord39.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional41 = strConsumerRecord39.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord42 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType19, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers33, intOptional41);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int54 = strConsumerRecord53.serializedValueSize();
        int int55 = strConsumerRecord53.partition();
        org.apache.kafka.common.header.Headers headers56 = strConsumerRecord53.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType19, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers56);
        long long58 = strConsumerRecord57.offset();
        java.lang.String str59 = strConsumerRecord57.topic();
        long long60 = strConsumerRecord57.offset();
        long long61 = strConsumerRecord57.checksum();
        org.apache.kafka.common.record.TimestampType timestampType62 = strConsumerRecord57.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord72 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType73 = strConsumerRecord72.timestampType();
        int int74 = strConsumerRecord72.serializedKeySize();
        int int75 = strConsumerRecord72.partition();
        java.io.Serializable serializable76 = strConsumerRecord72.value();
        int int77 = strConsumerRecord72.serializedKeySize();
        org.apache.kafka.common.header.Headers headers78 = strConsumerRecord72.headers();
        java.lang.Class<?> wildcardClass79 = headers78.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord80 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 0, serialized key size = 100, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = -1.0), partition = 32, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = -1)", (int) (short) 1, (long) ' ', 100L, timestampType62, (long) (byte) -1, (int) (byte) 100, (int) (short) 10, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 52, NoTimestampType = 1, serialized key size = -1, serialized value size = 35, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 10.0)", (java.io.Serializable) wildcardClass79);
        long long81 = strConsumerRecord80.checksum();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType19 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType19.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(headers33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intOptional41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(headers56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str59, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType62 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType62.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType73 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType73.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + (short) 10 + "'", serializable76, (short) 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(headers78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers6 = strConsumerRecord5.headers();
        java.io.Serializable serializable7 = strConsumerRecord5.value();
        java.lang.String str8 = strConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers9 = strConsumerRecord5.headers();
        org.apache.kafka.common.header.Headers headers10 = strConsumerRecord5.headers();
        int int11 = strConsumerRecord5.serializedKeySize();
        long long12 = strConsumerRecord5.timestamp();
        org.junit.Assert.assertNotNull(headers6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (short) 0 + "'", serializable7, (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headers9);
        org.junit.Assert.assertNotNull(headers10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        int int8 = strConsumerRecord5.serializedKeySize();
        int int9 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord5.leaderEpoch();
        int int11 = strConsumerRecord5.serializedValueSize();
        java.lang.String str12 = strConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str12, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        java.util.Optional<java.lang.Integer> intOptional8 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType9 = strConsumerRecord5.timestampType();
        java.lang.String str10 = strConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord5.headers();
        int int12 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord5.timestampType();
        java.lang.String str17 = strConsumerRecord5.key();
        java.lang.Class<?> wildcardClass18 = strConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord9.timestampType();
        java.lang.String str13 = strConsumerRecord9.key();
        long long14 = strConsumerRecord9.timestamp();
        long long15 = strConsumerRecord9.offset();
        java.lang.String str16 = strConsumerRecord9.toString();
        org.apache.kafka.common.record.TimestampType timestampType17 = strConsumerRecord9.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord18 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), partition = 10, leaderEpoch = null, offset = 1, NoTimestampType = 1, serialized key size = 35, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0), value = NoTimestampType)", (int) (short) 100, (-1L), "", (java.io.Serializable) timestampType17);
        java.lang.String str19 = strConsumerRecord18.key();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str16, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + timestampType17 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType17.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        java.lang.String str9 = strConsumerRecord5.key();
        long long10 = strConsumerRecord5.timestamp();
        java.lang.String str11 = strConsumerRecord5.key();
        java.lang.String str12 = strConsumerRecord5.key();
        java.lang.String str13 = strConsumerRecord5.toString();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord13.timestampType();
        java.lang.String str17 = strConsumerRecord13.key();
        org.apache.kafka.common.record.TimestampType timestampType18 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord28 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType29 = strConsumerRecord28.timestampType();
        java.lang.Class<?> wildcardClass30 = strConsumerRecord28.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (short) 100, (long) (-1), (long) '4', timestampType18, (long) '4', (int) '#', 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) wildcardClass30);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord41 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str42 = strConsumerRecord41.topic();
        java.lang.Class<?> wildcardClass43 = strConsumerRecord41.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord44 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) -1, 100L, (long) 0, timestampType18, (long) (short) 1, (int) '#', 0, "hi!", (java.io.Serializable) wildcardClass43);
        long long45 = strConsumerRecord44.offset();
        long long46 = strConsumerRecord44.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType47 = strConsumerRecord44.timestampType();
        java.lang.String str48 = strConsumerRecord44.toString();
        java.lang.String str49 = strConsumerRecord44.topic();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + timestampType18 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType18.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType29 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType29.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + timestampType47 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType47.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord)" + "'", str48, "ConsumerRecord(topic = , partition = -1, leaderEpoch = null, offset = 100, NoTimestampType = 0, serialized key size = 35, serialized value size = 0, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = class org.apache.kafka.clients.consumer.ConsumerRecord)");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        long long9 = strConsumerRecord5.checksum();
        java.lang.String str10 = strConsumerRecord5.toString();
        long long11 = strConsumerRecord5.offset();
        int int12 = strConsumerRecord5.serializedKeySize();
        long long13 = strConsumerRecord5.timestamp();
        java.io.Serializable serializable14 = strConsumerRecord5.value();
        org.apache.kafka.common.header.Headers headers15 = strConsumerRecord5.headers();
        int int16 = strConsumerRecord5.serializedKeySize();
        java.lang.String str17 = strConsumerRecord5.key();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str10, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (short) 10 + "'", serializable14, (short) 10);
        org.junit.Assert.assertNotNull(headers15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedKeySize();
        int int8 = strConsumerRecord5.partition();
        java.io.Serializable serializable9 = strConsumerRecord5.value();
        int int10 = strConsumerRecord5.serializedKeySize();
        java.io.Serializable serializable11 = strConsumerRecord5.value();
        java.lang.String str12 = strConsumerRecord5.topic();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        long long14 = strConsumerRecord5.offset();
        int int15 = strConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (short) 10 + "'", serializable9, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (short) 10 + "'", serializable11, (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord21 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str22 = strConsumerRecord21.topic();
        org.apache.kafka.common.record.TimestampType timestampType23 = strConsumerRecord21.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord34 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int35 = strConsumerRecord34.serializedValueSize();
        int int36 = strConsumerRecord34.partition();
        org.apache.kafka.common.header.Headers headers37 = strConsumerRecord34.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord43 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int44 = strConsumerRecord43.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional45 = strConsumerRecord43.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType23, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers37, intOptional45);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord57 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int58 = strConsumerRecord57.serializedValueSize();
        int int59 = strConsumerRecord57.partition();
        org.apache.kafka.common.header.Headers headers60 = strConsumerRecord57.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord61 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType23, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers60);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord67 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (short) -1, (long) '4', 0L, timestampType23, (long) (byte) 10, (-1), 0, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) 1.0f);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord78 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, (long) (short) 1, "hi!", (java.io.Serializable) (short) 0);
        org.apache.kafka.common.header.Headers headers79 = strConsumerRecord78.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord85 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long86 = strConsumerRecord85.timestamp();
        long long87 = strConsumerRecord85.checksum();
        java.util.Optional<java.lang.Integer> intOptional88 = strConsumerRecord85.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord89 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 0, 0L, (long) '#', timestampType23, (java.lang.Long) 100L, 0, (int) (short) 100, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", headers79, intOptional88);
        int int90 = strConsumerRecord89.serializedValueSize();
        long long91 = strConsumerRecord89.checksum();
        java.lang.String str92 = strConsumerRecord89.key();
        int int93 = strConsumerRecord89.serializedKeySize();
        org.apache.kafka.common.header.Headers headers94 = strConsumerRecord89.headers();
        org.apache.kafka.common.record.TimestampType timestampType95 = strConsumerRecord89.timestampType();
        java.lang.String str96 = strConsumerRecord89.toString();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType23 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType23.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(headers37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intOptional45);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(headers60);
        org.junit.Assert.assertNotNull(headers79);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(intOptional88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 100L + "'", long91 == 100L);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str92, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(headers94);
        org.junit.Assert.assertTrue("'" + timestampType95 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType95.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10))" + "'", str96, "ConsumerRecord(topic = , partition = 0, leaderEpoch = null, offset = 0, NoTimestampType = 35, serialized key size = 0, serialized value size = 100, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), value = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10))");
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long10 = strConsumerRecord9.timestamp();
        int int11 = strConsumerRecord9.partition();
        java.io.Serializable serializable12 = strConsumerRecord9.value();
        java.lang.Class<?> wildcardClass13 = strConsumerRecord9.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord14 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) (byte) 1, 52L, "", (java.io.Serializable) wildcardClass13);
        java.io.Serializable serializable15 = strConsumerRecord14.value();
        java.lang.String str16 = strConsumerRecord14.key();
        int int17 = strConsumerRecord14.serializedKeySize();
        int int18 = strConsumerRecord14.serializedValueSize();
        long long19 = strConsumerRecord14.offset();
        java.io.Serializable serializable20 = strConsumerRecord14.value();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (short) 10 + "'", serializable12, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializable15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(serializable20);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str14 = strConsumerRecord13.topic();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord26 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int27 = strConsumerRecord26.serializedValueSize();
        int int28 = strConsumerRecord26.partition();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord26.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional37 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord38 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) 0, 0L, timestampType15, (java.lang.Long) 1L, (int) (short) -1, (int) (short) 100, "hi!", (java.io.Serializable) 1.0f, headers29, intOptional37);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord49 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int50 = strConsumerRecord49.serializedValueSize();
        int int51 = strConsumerRecord49.partition();
        org.apache.kafka.common.header.Headers headers52 = strConsumerRecord49.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord53 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", 10, (long) (short) 1, (long) 0, timestampType15, (java.lang.Long) 52L, (int) (byte) 100, (int) (byte) 1, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.io.Serializable) (-1.0d), headers52);
        long long54 = strConsumerRecord53.offset();
        java.lang.String str55 = strConsumerRecord53.topic();
        long long56 = strConsumerRecord53.offset();
        org.apache.kafka.common.header.Headers headers57 = strConsumerRecord53.headers();
        long long58 = strConsumerRecord53.timestamp();
        int int59 = strConsumerRecord53.serializedKeySize();
        java.io.Serializable serializable60 = strConsumerRecord53.value();
        org.apache.kafka.common.header.Headers headers61 = strConsumerRecord53.headers();
        long long62 = strConsumerRecord53.checksum();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intOptional37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(headers52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str55, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(headers57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertEquals("'" + serializable60 + "' != '" + (-1.0d) + "'", serializable60, (-1.0d));
        org.junit.Assert.assertNotNull(headers61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord13 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord13.timestampType();
        int int15 = strConsumerRecord13.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType16 = strConsumerRecord13.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>("", 100, (long) '#', (long) (byte) 0, timestampType16, (long) (short) 10, 0, (int) (byte) 0, (java.lang.CharSequence) "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)", (java.lang.Comparable<java.lang.String>) "");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("", (int) '#', (long) (short) 10, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)", (java.io.Serializable) "");
        java.lang.String str24 = strConsumerRecord23.key();
        java.util.Optional<java.lang.Integer> intOptional25 = strConsumerRecord23.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType26 = strConsumerRecord23.timestampType();
        int int27 = strConsumerRecord23.partition();
        java.util.Optional<java.lang.Integer> intOptional28 = strConsumerRecord23.leaderEpoch();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord23.headers();
        long long30 = strConsumerRecord23.checksum();
        org.apache.kafka.common.record.TimestampType timestampType31 = strConsumerRecord23.timestampType();
        long long32 = strConsumerRecord23.timestamp();
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType16 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType16.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)" + "'", str24, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 1, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = 0)");
        org.junit.Assert.assertNotNull(intOptional25);
        org.junit.Assert.assertTrue("'" + timestampType26 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType26.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(intOptional28);
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + timestampType31 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType31.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType6 = strConsumerRecord5.timestampType();
        int int7 = strConsumerRecord5.serializedValueSize();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        java.lang.String str9 = strConsumerRecord5.toString();
        java.util.Optional<java.lang.Integer> intOptional10 = strConsumerRecord5.leaderEpoch();
        long long11 = strConsumerRecord5.offset();
        int int12 = strConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional14 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional15 = strConsumerRecord5.leaderEpoch();
        long long16 = strConsumerRecord5.offset();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord5.headers();
        org.junit.Assert.assertTrue("'" + timestampType6 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType6.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str9, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertNotNull(intOptional14);
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertNotNull(headers17);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        long long7 = strConsumerRecord5.checksum();
        java.util.Optional<java.lang.Integer> intOptional8 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType9 = strConsumerRecord5.timestampType();
        java.lang.String str10 = strConsumerRecord5.topic();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord5.headers();
        int int12 = strConsumerRecord5.serializedValueSize();
        java.util.Optional<java.lang.Integer> intOptional13 = strConsumerRecord5.leaderEpoch();
        org.apache.kafka.common.record.TimestampType timestampType14 = strConsumerRecord5.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType15 = strConsumerRecord5.timestampType();
        java.lang.String str16 = strConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord5.headers();
        java.lang.Class<?> wildcardClass18 = headers17.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertTrue("'" + timestampType9 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType9.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intOptional13);
        org.junit.Assert.assertTrue("'" + timestampType14 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType14.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType15 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType15.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        long long8 = strConsumerRecord5.offset();
        java.lang.String str9 = strConsumerRecord5.key();
        int int10 = strConsumerRecord5.partition();
        int int11 = strConsumerRecord5.partition();
        java.io.Serializable serializable12 = strConsumerRecord5.value();
        org.apache.kafka.common.header.Headers headers13 = strConsumerRecord5.headers();
        int int14 = strConsumerRecord5.serializedKeySize();
        long long15 = strConsumerRecord5.timestamp();
        long long16 = strConsumerRecord5.timestamp();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (short) 10 + "'", serializable12, (short) 10);
        org.junit.Assert.assertNotNull(headers13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.record.TimestampType timestampType8 = strConsumerRecord5.timestampType();
        java.lang.String str9 = strConsumerRecord5.toString();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        java.io.Serializable serializable11 = strConsumerRecord5.value();
        java.lang.String str12 = strConsumerRecord5.key();
        long long13 = strConsumerRecord5.offset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + timestampType8 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType8.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str9, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (short) 10 + "'", serializable11, (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long9 = strConsumerRecord8.timestamp();
        int int10 = strConsumerRecord8.partition();
        java.lang.String str11 = strConsumerRecord8.topic();
        long long12 = strConsumerRecord8.offset();
        java.io.Serializable serializable13 = strConsumerRecord8.value();
        java.lang.String str14 = strConsumerRecord8.topic();
        java.io.Serializable serializable15 = strConsumerRecord8.value();
        java.util.Optional<java.lang.Integer> intOptional16 = strConsumerRecord8.leaderEpoch();
        org.apache.kafka.common.header.Headers headers17 = strConsumerRecord8.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord23 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        java.lang.String str24 = strConsumerRecord23.topic();
        java.io.Serializable serializable25 = strConsumerRecord23.value();
        java.lang.String str26 = strConsumerRecord23.topic();
        java.lang.String str27 = strConsumerRecord23.toString();
        java.lang.String str28 = strConsumerRecord23.key();
        java.util.Optional<java.lang.Integer> intOptional29 = strConsumerRecord23.leaderEpoch();
        java.lang.Class<?> wildcardClass30 = intOptional29.getClass();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.GenericDeclaration> headerIterableConsumerRecord31 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Iterable<org.apache.kafka.common.header.Header>, java.lang.reflect.GenericDeclaration>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", (int) (byte) 100, (long) 0, (java.lang.Iterable<org.apache.kafka.common.header.Header>) headers17, (java.lang.reflect.GenericDeclaration) wildcardClass30);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (short) 10 + "'", serializable13, (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (short) 10 + "'", serializable15, (short) 10);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNotNull(headers17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (short) 10 + "'", serializable25, (short) 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str27, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(intOptional29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int6 = strConsumerRecord5.serializedValueSize();
        int int7 = strConsumerRecord5.partition();
        org.apache.kafka.common.header.Headers headers8 = strConsumerRecord5.headers();
        java.util.Optional<java.lang.Integer> intOptional9 = strConsumerRecord5.leaderEpoch();
        java.lang.String str10 = strConsumerRecord5.key();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord5.headers();
        org.apache.kafka.common.record.TimestampType timestampType12 = strConsumerRecord5.timestampType();
        long long13 = strConsumerRecord5.checksum();
        int int14 = strConsumerRecord5.serializedKeySize();
        java.util.Optional<java.lang.Integer> intOptional15 = strConsumerRecord5.leaderEpoch();
        java.util.Optional<java.lang.Integer> intOptional16 = strConsumerRecord5.leaderEpoch();
        java.lang.Class<?> wildcardClass17 = strConsumerRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(headers8);
        org.junit.Assert.assertNotNull(intOptional9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + timestampType12 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType12.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intOptional15);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord5 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        long long6 = strConsumerRecord5.timestamp();
        int int7 = strConsumerRecord5.partition();
        java.lang.String str8 = strConsumerRecord5.topic();
        long long9 = strConsumerRecord5.offset();
        java.io.Serializable serializable10 = strConsumerRecord5.value();
        org.apache.kafka.common.header.Headers headers11 = strConsumerRecord5.headers();
        int int12 = strConsumerRecord5.serializedKeySize();
        java.lang.String str13 = strConsumerRecord5.toString();
        java.lang.String str14 = strConsumerRecord5.key();
        int int15 = strConsumerRecord5.serializedKeySize();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (short) 10 + "'", serializable10, (short) 10);
        org.junit.Assert.assertNotNull(headers11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str13, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord9 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        org.apache.kafka.common.record.TimestampType timestampType10 = strConsumerRecord9.timestampType();
        org.apache.kafka.common.record.TimestampType timestampType11 = strConsumerRecord9.timestampType();
        java.io.Serializable serializable16 = null;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord22 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int23 = strConsumerRecord22.serializedValueSize();
        int int24 = strConsumerRecord22.partition();
        long long25 = strConsumerRecord22.offset();
        long long26 = strConsumerRecord22.offset();
        org.apache.kafka.common.record.TimestampType timestampType27 = strConsumerRecord22.timestampType();
        java.lang.String str28 = strConsumerRecord22.toString();
        org.apache.kafka.common.header.Headers headers29 = strConsumerRecord22.headers();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord35 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("hi!", (int) (byte) 100, (long) '4', "", (java.io.Serializable) (short) 10);
        int int36 = strConsumerRecord35.serializedValueSize();
        int int37 = strConsumerRecord35.partition();
        long long38 = strConsumerRecord35.offset();
        long long39 = strConsumerRecord35.offset();
        org.apache.kafka.common.header.Headers headers40 = strConsumerRecord35.headers();
        long long41 = strConsumerRecord35.checksum();
        int int42 = strConsumerRecord35.serializedKeySize();
        int int43 = strConsumerRecord35.serializedValueSize();
        long long44 = strConsumerRecord35.offset();
        java.util.Optional<java.lang.Integer> intOptional45 = strConsumerRecord35.leaderEpoch();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable> strConsumerRecord46 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.io.Serializable>("ConsumerRecord(topic = ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10), partition = 10, leaderEpoch = null, offset = 0, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = NoTimestampType)", 0, 35L, 100L, timestampType11, (java.lang.Long) 52L, 10, (int) (byte) 10, "ConsumerRecord(topic = , partition = 1, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = class org.apache.kafka.clients.consumer.ConsumerRecord)", serializable16, headers29, intOptional45);
        java.util.Optional<java.lang.Integer> intOptional47 = strConsumerRecord46.leaderEpoch();
        int int48 = strConsumerRecord46.partition();
        org.apache.kafka.common.header.Headers headers49 = strConsumerRecord46.headers();
        java.util.Optional<java.lang.Integer> intOptional50 = strConsumerRecord46.leaderEpoch();
        org.junit.Assert.assertTrue("'" + timestampType10 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType10.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + timestampType11 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType11.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + timestampType27 + "' != '" + org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE + "'", timestampType27.equals(org.apache.kafka.common.record.TimestampType.NO_TIMESTAMP_TYPE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)" + "'", str28, "ConsumerRecord(topic = hi!, partition = 100, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = , value = 10)");
        org.junit.Assert.assertNotNull(headers29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertNotNull(headers40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 52L + "'", long44 == 52L);
        org.junit.Assert.assertNotNull(intOptional45);
        org.junit.Assert.assertNotNull(intOptional47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(headers49);
        org.junit.Assert.assertNotNull(intOptional50);
    }
}

