import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) '#');
        int int8 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = dateTimeFormatter7.parseLocalTime("[[[_seq_no][52]][100]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(dateTimeParser9);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withLocale(locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((java.lang.Integer) 52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = dateTimeFormatter21.parseLocalTime("_index");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZone(dateTimeZone6);
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][0]", "[_id][-9]", (int) (byte) 10);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[][-1]", "[[[_seq_no][52]][-1]][1]", 97);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][100]", "_seq_no", (int) 'a');
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("_index", "_index", 10);
        boolean boolean8 = shardId3.equals((java.lang.Object) shardId7);
        java.lang.String str9 = shardId7.toString();
        java.lang.String str10 = shardId7.getIndexName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[_index][10]" + "'", str9, "[_index][10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withDefaultYear((int) (byte) 1);
        java.io.Writer writer18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(writer18, readablePartial19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withZoneUTC();
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withLocale(locale20);
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withLocale(locale22);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withLocale(locale24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter25.withChronology(chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeFormatter30.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter2.withZone(dateTimeZone31);
        java.lang.Appendable appendable33 = null;
        org.joda.time.ReadablePartial readablePartial34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter32.printTo(appendable33, readablePartial34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZone(dateTimeZone13);
        boolean boolean15 = dateTimeFormatter12.isPrinter();
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_seq_no][52]][100]][97]", "[_seq_no][100]", "[[_index][100]][97]", "_type", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withLocale(locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        boolean boolean16 = dateTimeFormatter14.isParser();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer17, readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronolgy();
        java.io.Writer writer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_type][1]", "[[hi!][0]][0]", "[[_seq_no][52]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) (byte) 10);
        boolean boolean14 = dateTimeFormatter13.isParser();
        java.lang.Class<?> wildcardClass15 = dateTimeFormatter13.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass5 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronolgy();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dateTimeFormatter7.parseInto(readWritableInstant10, "[[[_index][100]][97]][100]", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimePrinter9);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter8.print((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.Chronology chronology11 = dateTimeFormatter7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withPivotYear((int) '4');
        int int14 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter13.print(readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeFormatter4.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter6.parseDateTime("[_id][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[_id][1]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_type][10]", "_type", "", "[_index][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[[_type][1]][35]][100]", "[_id][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean20 = dateTimeFormatter19.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter19.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser21);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter31.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser32);
        java.lang.StringBuffer stringBuffer42 = null;
        org.joda.time.ReadablePartial readablePartial43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter41.printTo(stringBuffer42, readablePartial43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeParser32);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter10.parseLocalDate("[[_index][0]][2000]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        boolean boolean12 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology13 = dateTimeFormatter2.getChronolgy();
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter2.print(readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = dateTimeFormatter7.parseLocalDate("[[_index][10]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(dateTimeParser9);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withLocale(locale12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter9.print(readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZone(dateTimeZone13);
        boolean boolean15 = dateTimeFormatter12.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter12.getZone();
        boolean boolean17 = dateTimeFormatter12.isOffsetParsed();
        java.lang.Appendable appendable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable18, (long) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[[_seq_no][52]][100]][1]", "_index", "[[_id][52]][97]", "[[_index][10]][35]", "_version", "[_shard_id][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withZoneUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withLocale(locale16);
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withLocale(locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withChronology(chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withZone(dateTimeZone25);
        java.io.Writer writer27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer27, readableInstant28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter2.parseInto(readWritableInstant11, "[[_seq_no][52]][-1]", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        boolean boolean9 = dateTimeFormatter7.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-9));
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeFormatter10.parseMillis("[_seq_no][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[_seq_no][52]][0]", "[[_index][100]][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str8 = shardId7.getIndexName();
        int int9 = shardId3.compareTo(shardId7);
        org.elasticsearch.index.shard.ShardId shardId13 = new org.elasticsearch.index.shard.ShardId("_index", "", (int) (short) 100);
        int int14 = shardId3.compareTo(shardId13);
        java.lang.String str15 = shardId13.getIndexName();
        int int16 = shardId13.id();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withDefaultYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = dateTimeFormatter9.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) (byte) 10);
        boolean boolean14 = dateTimeFormatter13.isParser();
        java.io.Writer writer15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][-1]", "[_shard_id][0]", (int) (short) 1);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.lang.StringBuilder stringBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuilder8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[][0]][10]", "[[[_index][100]][97]][100]", (int) (byte) 10);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "[[[_seq_no][52]][100]][1]", (int) 'a');
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int11 = dateTimeFormatter2.getPivotYear();
        java.lang.StringBuilder stringBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuilder12, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_index][100]][97]][100]", "[[_index][0]][2000]", "[][100]", "_seq_no", "[[][0]][10]", "[][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "_seq_no", 6);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("", "[[_index][100]][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        java.lang.Appendable appendable20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(appendable20, readableInstant21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][100]", "_seq_no", (int) 'a');
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("_index", "_index", 10);
        boolean boolean8 = shardId3.equals((java.lang.Object) shardId7);
        java.lang.String str9 = shardId7.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[_index][10]" + "'", str9, "[_index][10]");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.Locale locale10 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withDefaultYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withDefaultYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter12.print(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "[[[_seq_no][52]][-1]][32]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_index][100]][10]", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = dateTimeFormatter13.parseLocalDateTime("[[[_seq_no][52]][-1]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((java.lang.Integer) (-4));
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter17.print(readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str8 = shardId7.toString();
        java.lang.String str9 = shardId7.toString();
        int int10 = shardId3.compareTo(shardId7);
        java.lang.String str11 = shardId3.toString();
        java.lang.String str12 = shardId3.getIndexName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[][0]" + "'", str8, "[][0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[][0]" + "'", str9, "[][0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[_seq_no][52]][-1]" + "'", str11, "[[_seq_no][52]][-1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[_seq_no][52]" + "'", str12, "[_seq_no][52]");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][10]", "", (-1));
        int int4 = shardId3.id();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter10.parseDateTime("[_index][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        boolean boolean9 = dateTimeFormatter7.isPrinter();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter16.getParser();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withLocale(locale18);
        boolean boolean20 = dateTimeFormatter19.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter19.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeFormatter25.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter11.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withChronology(chronology28);
        java.lang.Appendable appendable30 = null;
        org.joda.time.ReadablePartial readablePartial31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter29.printTo(appendable30, readablePartial31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale14 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 97);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withChronology(chronology19);
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeFormatter20.print(readablePartial21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withZone(dateTimeZone16);
        boolean boolean18 = dateTimeFormatter17.isParser();
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(appendable19, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_shard_id", "[][0]", "_seq_no", "[[][0]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_shard_id][100]", "[][10]", "[_index][100]", "[[_type][1]][1]", "[[_index][10]][1]", "[_index][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatter17.getParser();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter17.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter17.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter17.withChronology(chronology25);
        org.joda.time.Chronology chronology27 = dateTimeFormatter17.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter17.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter17.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.format.DateTimeParser dateTimeParser34 = dateTimeFormatter33.getParser();
        org.joda.time.Chronology chronology35 = dateTimeFormatter33.getChronology();
        boolean boolean36 = dateTimeFormatter33.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter33.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter38.withChronology(chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter38.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter38.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter38.withOffsetParsed();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter38.withLocale(locale47);
        org.joda.time.Chronology chronology49 = dateTimeFormatter38.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = null;
        org.joda.time.format.DateTimeParser dateTimeParser51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter50, dateTimeParser51);
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter52.getParser();
        org.joda.time.Chronology chronology54 = dateTimeFormatter52.getChronology();
        boolean boolean55 = dateTimeFormatter52.isParser();
        org.joda.time.Chronology chronology56 = dateTimeFormatter52.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter52.withDefaultYear((int) (short) 0);
        java.util.Locale locale59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter52.withLocale(locale59);
        boolean boolean61 = dateTimeFormatter52.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter52.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter52.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone64 = dateTimeFormatter63.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter63.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = null;
        org.joda.time.format.DateTimeParser dateTimeParser67 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter66, dateTimeParser67);
        org.joda.time.format.DateTimeParser dateTimeParser69 = dateTimeFormatter68.getParser();
        java.util.Locale locale70 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter68.withLocale(locale70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter68.withZoneUTC();
        java.util.Locale locale73 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter72.withLocale(locale73);
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter72.withLocale(locale75);
        java.util.Locale locale77 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter76.withLocale(locale77);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter78.withZone(dateTimeZone79);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter78.withChronology(chronology81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter82.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone84 = dateTimeFormatter83.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter63.withZone(dateTimeZone84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter38.withZone(dateTimeZone84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter30.withZone(dateTimeZone84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter14.withZone(dateTimeZone84);
        boolean boolean89 = dateTimeFormatter88.isOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(dateTimeParser34);
        org.junit.Assert.assertNull(chronology35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(chronology49);
        org.junit.Assert.assertNull(dateTimeParser53);
        org.junit.Assert.assertNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNull(dateTimeParser69);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatter74);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(dateTimeFormatter88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withZone(dateTimeZone11);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[][0]][97]", "[[[_index][100]][97]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][-1]", "[[_index][0]][2000]", 32);
        int int4 = shardId3.id();
        org.elasticsearch.index.Index index5 = shardId3.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_shard_id", "hi!", (int) (byte) 0);
        java.lang.String str4 = shardId3.getIndexName();
        org.elasticsearch.index.shard.ShardId shardId8 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][1]", "[[_index][100]][97]", 97);
        int int9 = shardId3.compareTo(shardId8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = shardId8.compareTo(shardId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        boolean boolean13 = dateTimeFormatter10.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTimeFormatter15.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.Chronology chronology11 = dateTimeFormatter7.getChronology();
        org.joda.time.Chronology chronology12 = dateTimeFormatter7.getChronolgy();
        org.joda.time.Chronology chronology13 = dateTimeFormatter7.getChronolgy();
        org.joda.time.Chronology chronology14 = dateTimeFormatter7.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeFormatter7.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        int int7 = dateTimeFormatter6.getDefaultYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withLocale(locale8);
        java.lang.Integer int10 = dateTimeFormatter9.getPivotYear();
        boolean boolean11 = dateTimeFormatter9.isOffsetParsed();
        java.lang.StringBuilder stringBuilder12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuilder12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.lang.Integer int11 = dateTimeFormatter10.getPivotYear();
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer12, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_type][1]][35]][100]", "[[_type][1]][0]", (int) (short) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean18 = dateTimeFormatter17.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = shardId3.equals((java.lang.Object) dateTimeFormatter32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.format.DateTimeFormatter cannot be cast to org.elasticsearch.index.shard.ShardId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeParser19);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        boolean boolean12 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_shard_id][100]", "[_shard_id][0]", "[[_id][52]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale11 = dateTimeFormatter10.getLocale();
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withDefaultYear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = dateTimeFormatter10.parseLocalDate("[[_id][52]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser5);
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = dateTimeFormatter8.parseLocalDateTime("[_id][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[_id][52]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = dateTimeFormatter6.parseLocalDateTime("[_seq_no][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[_index][100]][-9]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter14.getParser();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withLocale(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter14.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter14.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter14.withChronology(chronology22);
        org.joda.time.Chronology chronology24 = dateTimeFormatter14.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withZoneUTC();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withLocale(locale32);
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withLocale(locale34);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withLocale(locale36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withChronology(chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeFormatter42.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter14.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean47 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter2.withLocale(locale48);
        java.lang.StringBuffer stringBuffer50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer50, readableInstant51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZone(dateTimeZone13);
        java.io.Writer writer15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withDefaultYear((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withDefaultYear((int) (byte) 0);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter6.parseDateTime("[[_index][100]][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeParser13);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_seq_no][52]][-1]][32]", "[[][0]][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "[_type][-1]", "[[_id][52]][100]", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "[[][0]][97]", "[_type][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_index][0]][2000]", "[[_index][100]][10]", "[_seq_no][100]", "_shard_id", "[[_id][52]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[hi!][-1]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][100]][1]", "[][100]", 0);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter2.getZone();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear(10);
        java.lang.StringBuilder stringBuilder13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withZoneUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withLocale(locale16);
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withLocale(locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withChronology(chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withZone(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter26.withOffsetParsed();
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter26.printTo(stringBuffer28, readablePartial29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][-1]", "_id", (int) (short) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        boolean boolean8 = dateTimeFormatter6.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear(10);
        int int11 = dateTimeFormatter10.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = shardId3.equals((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.elasticsearch.index.shard.ShardId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = dateTimeFormatter16.parseMutableDateTime("[_seq_no][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 52);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronolgy();
        int int15 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.Chronology chronology16 = dateTimeFormatter13.getChronolgy();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][-1]", "[_index][100]", 0);
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_id][-9]", "", 6);
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_index][100]][97]", "[_seq_no][100]", "[_index][0]", "[[_seq_no][52]][100]", "[_id][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_seq_no][52]][100]", "[_shard_id][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter6.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter6.parseMillis("[[_type][-1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "[[][0]][10]", "[hi!][10]", "_type", "[[_seq_no][52]][0]", "[[[_seq_no][52]][-1]][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale12 = dateTimeFormatter10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withPivotYear((int) (byte) 10);
        java.lang.StringBuilder stringBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter19.printTo(stringBuilder20, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_id][52]][0]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_index][10]", "[[_index][10]][32]", "[_type][10]", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean19 = dateTimeFormatter18.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser20);
        java.util.Locale locale39 = dateTimeFormatter38.getLocale();
        org.joda.time.Chronology chronology40 = dateTimeFormatter38.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeParser20);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNull(chronology40);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter13.getParser();
        org.joda.time.Chronology chronology15 = dateTimeFormatter13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withPivotYear((java.lang.Integer) (-9));
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withZoneUTC();
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withLocale(locale27);
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withLocale(locale29);
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withLocale(locale31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter32.withChronology(chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter36.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeFormatter37.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter13.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter10.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((int) (byte) 0);
        java.lang.StringBuilder stringBuilder43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter42.printTo(stringBuilder43, readableInstant44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withDefaultYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter12.parseLocalDate("[][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "[[][0]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withChronology(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter13.parseMutableDateTime("[][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 52);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = dateTimeFormatter13.parseLocalDateTime("[[_type][1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[_index][10]", "[[[_index][100]][97]][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_type][1]][0]", "_id", "[[[_seq_no][52]][100]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withChronology(chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withDefaultYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = dateTimeFormatter16.parseMutableDateTime("[][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_type", "_type", (int) (short) 1);
        java.lang.String str4 = shardId3.toString();
        int int5 = shardId3.id();
        org.elasticsearch.index.Index index6 = shardId3.getIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_type][1]" + "'", str4, "[_type][1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(index6);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale12 = dateTimeFormatter10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withZoneUTC();
        java.lang.StringBuilder stringBuilder18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(stringBuilder18, readableInstant19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter7.getParser();
        boolean boolean14 = dateTimeFormatter7.isParser();
        boolean boolean15 = dateTimeFormatter7.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronology();
        boolean boolean18 = dateTimeFormatter16.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = dateTimeFormatter16.parseLocalDateTime("[[_seq_no][52]][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withPivotYear((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass15 = dateTimeFormatter11.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[_index][100]][0]", "[[_id][52]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean12 = dateTimeFormatter11.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter11.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser13);
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withLocale(locale23);
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser25);
        java.lang.Appendable appendable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(appendable28, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeParser25);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuilder stringBuilder13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        java.io.Writer writer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        int int11 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withLocale(locale17);
        boolean boolean19 = dateTimeFormatter18.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withZone(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeFormatter2.print((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "hi!", 0);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter16.print(readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(appendable17, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withLocale(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withPivotYear((int) (short) 100);
        java.io.Writer writer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer17, readablePartial18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[][0]][10]", "[[][0]][10]", 100);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = dateTimeFormatter7.parseLocalDateTime("[_id][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[][100]", "[_seq_no][52]", "[[_id][52]][97]", "[[_seq_no][52]][100]", "[_index][100]", "[_id][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuilder12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_shard_id][0]", "[[][0]][97]", (int) (byte) 100);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withLocale(locale10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withLocale(locale17);
        int int19 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter12.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter24.getParser();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter24.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter24.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter24.withChronology(chronology32);
        org.joda.time.Chronology chronology34 = dateTimeFormatter24.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.format.DateTimeParser dateTimeParser38 = dateTimeFormatter37.getParser();
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter37.withLocale(locale39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withZoneUTC();
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withLocale(locale42);
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter41.withLocale(locale44);
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter45.withLocale(locale46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withZone(dateTimeZone48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter47.withChronology(chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeFormatter52.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter24.withZone(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter12.withZone(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter9.withZone(dateTimeZone53);
        java.lang.StringBuffer stringBuffer57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter56.printTo(stringBuffer57, readableInstant58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2000 + "'", int19 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(dateTimeParser21);
        org.junit.Assert.assertNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNull(chronology34);
        org.junit.Assert.assertNull(dateTimeParser38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withChronology(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '4');
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_index][100]][0]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeFormatter15.parseMillis("[_seq_no][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) '#');
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTimeFormatter9.parseDateTime("[[_index][100]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology(chronology13);
        java.lang.Integer int15 = dateTimeFormatter14.getPivotYear();
        java.lang.StringBuilder stringBuilder16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuilder16, readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[][0]][10]", "[[_index][100]][-9]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_type][1]][1]", "[_seq_no][10]", "[_index][0]", "[_index][0]", "[[_type][1]][35]", "[[_type][1]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter7.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTimeFormatter7.parseDateTime("[_index][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withLocale(locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withChronology(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTimeFormatter23.parseDateTime("[_index][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str8 = shardId7.getIndexName();
        int int9 = shardId3.compareTo(shardId7);
        org.elasticsearch.index.shard.ShardId shardId13 = new org.elasticsearch.index.shard.ShardId("_index", "", (int) (short) 100);
        int int14 = shardId3.compareTo(shardId13);
        java.lang.String str15 = shardId13.getIndexName();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId13.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withDefaultYear(35);
        java.lang.Integer int18 = dateTimeFormatter15.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = dateTimeFormatter15.parseLocalDateTime("_version");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_id", "[][0]", (int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withLocale(locale8);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter9.withPivotYear((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter16.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = shardId3.equals((java.lang.Object) dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.format.DateTimeFormatter cannot be cast to org.elasticsearch.index.shard.ShardId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][-1]", "[[_seq_no][52]][-1]", (int) (byte) 1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        org.elasticsearch.index.shard.ShardId shardId11 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str12 = shardId11.getIndexName();
        int int13 = shardId7.compareTo(shardId11);
        int int14 = shardId3.compareTo(shardId7);
        java.lang.String str15 = shardId3.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[[_seq_no][52]][-1]][1]" + "'", str15, "[[[_seq_no][52]][-1]][1]");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean14 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter2.getZone();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter2.print(readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateTimeZone15);
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_index][100]][0]", "[[][0]][10]", "[[[_seq_no][52]][100]][1]", "_seq_no", "hi!", "[[_index][100]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_shard_id][0]", "", "[[_index][10]][32]", "_version", "[[_type][1]][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter2.getZone();
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer13, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter11.getParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withLocale(locale15);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTimeFormatter16.parseDateTime("[[_type][1]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimePrinter17);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        java.lang.Integer int7 = dateTimeFormatter5.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withDefaultYear((int) (short) 10);
        java.lang.StringBuilder stringBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuilder14, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "[[][0]][10]", (int) (byte) 1);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter13.parseMillis("[[[_seq_no][52]][100]][97]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "[[][0]][10]", "[_id][52]", "[[[_index][100]][97]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][10]", "[_index][0]", (int) ' ');
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter16.print((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter12.getPrinter();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter12.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimePrinter13);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withLocale(locale8);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZone(dateTimeZone6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter5.print(readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer15, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withDefaultYear(2000);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter15.print(readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[_index][0]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = dateTimeFormatter12.parseLocalDate("[][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, (long) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[_shard_id][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZone(dateTimeZone10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter9.getPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter9.parseInto(readWritableInstant13, "[_type][-1]", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withZone(dateTimeZone13);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter8.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withDefaultYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter16.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter16.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = dateTimeZone20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertNull(dateTimeZone20);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        boolean boolean8 = dateTimeFormatter6.isOffsetParsed();
        java.lang.Class<?> wildcardClass9 = dateTimeFormatter6.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        org.joda.time.Chronology chronology13 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear((int) 'a');
        java.lang.Appendable appendable16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter10.parseLocalTime("[[_type][1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 0);
        java.lang.StringBuilder stringBuilder16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(stringBuilder16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withLocale(locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withPivotYear((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass22 = dateTimeFormatter21.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        boolean boolean11 = dateTimeFormatter7.isPrinter();
        java.lang.Class<?> wildcardClass12 = dateTimeFormatter7.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[][-1]", "[[[_type][1]][35]][100]", "[][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.Chronology chronology11 = dateTimeFormatter7.getChronology();
        org.joda.time.Chronology chronology12 = dateTimeFormatter7.getChronolgy();
        org.joda.time.Chronology chronology13 = dateTimeFormatter7.getChronolgy();
        org.joda.time.Chronology chronology14 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter7.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = dateTimeFormatter7.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNull(dateTimePrinter15);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZoneUTC();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable12, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter6.parseDateTime("[][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        int int11 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withLocale(locale17);
        boolean boolean19 = dateTimeFormatter18.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withZone(dateTimeZone25);
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withLocale(locale27);
        org.joda.time.ReadWritableInstant readWritableInstant29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = dateTimeFormatter26.parseInto(readWritableInstant29, "[_id][52]", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter2.parseLocalTime("_shard_id");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][0]", "[[_type][1]][35]", (int) (byte) -1);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 52);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = dateTimeFormatter14.parseMutableDateTime("[[_seq_no][52]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale14 = dateTimeFormatter13.getLocale();
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuilder15, readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTimeFormatter8.parseDateTime("[_type][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[[_type][1]][35]][100]", "[_id][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[][10]", "[_index][0]", "[[_seq_no][52]][100]", "[[_type][1]][1]", "[_id][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        boolean boolean10 = dateTimeFormatter8.isParser();
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter8.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer11, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "[[_type][1]][35]", 10);
        int int4 = shardId3.getId();
        java.lang.String str5 = shardId3.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[][0]][10]" + "'", str5, "[[][0]][10]");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_index][10]][35]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withChronology(chronology18);
        java.lang.Appendable appendable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter19.printTo(appendable20, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_index][100]][-9]", "[[_index][0]][2000]", "[[_index][100]][0]", "hi!", "[[_type][1]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "[][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str4 = shardId3.toString();
        org.elasticsearch.index.shard.ShardId shardId8 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        int int9 = shardId8.id();
        int int10 = shardId3.compareTo(shardId8);
        java.lang.String str11 = shardId8.getIndexName();
        int int12 = shardId8.getId();
        int int13 = shardId8.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId8.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[][0]" + "'", str4, "[][0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZone(dateTimeZone9);
        int int11 = dateTimeFormatter8.getDefaultYear();
        int int12 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withChronology(chronology13);
        org.joda.time.ReadWritableInstant readWritableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeFormatter8.parseInto(readWritableInstant15, "[][10]", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[_index][100]", "[_seq_no][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withDefaultYear(100);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withLocale(locale13);
        java.lang.Appendable appendable15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter7.getParser();
        java.lang.StringBuilder stringBuilder11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeParser10);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str8 = shardId7.getIndexName();
        int int9 = shardId3.compareTo(shardId7);
        java.lang.String str10 = shardId7.toString();
        int int11 = shardId7.getId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId7.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[][0]" + "'", str10, "[][0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        boolean boolean13 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear((int) 'a');
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withLocale(locale16);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(stringBuffer18, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        org.joda.time.Chronology chronology9 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter7.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter7.getZone();
        java.util.Locale locale12 = dateTimeFormatter7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter7.parseMutableDateTime("[_id][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNull(dateTimePrinter10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter10.isParser();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[hi!][0]][0]", "_id", "[[_index][10]][32]", "[hi!][0]", "[[_id][52]][100]", "[_shard_id][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_shard_id][0]", "[[_type][1]][35]", "[[][0]][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_index][0]", "[_index][10]", "[[[_seq_no][52]][-1]][1]", "[[_id][52]][100]", "[[hi!][0]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean25 = dateTimeFormatter24.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser26 = dateTimeFormatter24.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser26);
        org.joda.time.format.DateTimeParser dateTimeParser37 = dateTimeFormatter36.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser37);
        java.lang.StringBuffer stringBuffer52 = null;
        org.joda.time.ReadablePartial readablePartial53 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter51.printTo(stringBuffer52, readablePartial53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeParser26);
        org.junit.Assert.assertNotNull(dateTimeParser37);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "[[_index][100]][-9]", 32);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 0);
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter13.print(readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale12 = dateTimeFormatter10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        org.joda.time.Chronology chronology18 = dateTimeFormatter17.getChronology();
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(stringBuffer19, readableInstant20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "[[_index][0]][2000]", (int) (short) -1);
        int int4 = shardId3.id();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][10]][0]", "[_id][52]", (int) (byte) 1);
        int int4 = shardId3.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_shard_id][100]", "[][100]", "[[_index][0]][2000]", "_shard_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][10]][1]", "_index", (int) (byte) 100);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_seq_no][52]][-1]", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter12.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "_shard_id", (-9));
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.Chronology chronology8 = dateTimeFormatter6.getChronology();
        boolean boolean9 = dateTimeFormatter6.isParser();
        org.joda.time.Chronology chronology10 = dateTimeFormatter6.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withDefaultYear((int) (short) 0);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter6.withLocale(locale13);
        boolean boolean15 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = shardId3.equals((java.lang.Object) dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][-1]", "[][-1]", (int) '#');
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("hi!", "_type", (int) (short) -1);
        int int8 = shardId7.id();
        int int9 = shardId7.id();
        boolean boolean10 = shardId3.equals((java.lang.Object) shardId7);
        org.elasticsearch.index.shard.ShardId shardId14 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][0]", "[][0]", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = shardId3.equals((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter8.parseMutableDateTime("[[[_seq_no][52]][100]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear(10);
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withOffsetParsed();
        boolean boolean15 = dateTimeFormatter14.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withOffsetParsed();
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(appendable17, readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.lang.StringBuilder stringBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuilder10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter14.getParser();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withLocale(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter14.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter14.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter14.withChronology(chronology22);
        org.joda.time.Chronology chronology24 = dateTimeFormatter14.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withZoneUTC();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withLocale(locale32);
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withLocale(locale34);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withLocale(locale36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withChronology(chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeFormatter42.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter14.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean47 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter2.withLocale(locale48);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = dateTimeFormatter2.parseMillis("[][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter8.parseMillis("_index");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withChronology(chronology13);
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronolgy();
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(chronology15);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int8 = dateTimeFormatter2.getDefaultYear();
        boolean boolean9 = dateTimeFormatter2.isPrinter();
        int int10 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter13.getParser();
        org.joda.time.Chronology chronology15 = dateTimeFormatter13.getChronology();
        boolean boolean16 = dateTimeFormatter13.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 0);
        boolean boolean19 = dateTimeFormatter18.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter18.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter23.getParser();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withLocale(locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeFormatter23.getZone();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withPivotYear((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter29.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter29.withPivotYear(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter36.withZoneUTC();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withChronology(chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeFormatter39.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter18.withZone(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter2.withZone(dateTimeZone40);
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = dateTimeFormatter42.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime45 = dateTimeFormatter42.parseMutableDateTime("[hi!][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateTimePrinter20);
        org.junit.Assert.assertNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNull(dateTimePrinter43);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_type][1]][35]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][100]][-9]", "[[[_seq_no][52]][100]][97]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "[_type][1]", (int) (byte) 100);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("hi!", "_version", (int) (byte) 10);
        int int8 = shardId3.compareTo(shardId7);
        java.lang.String str9 = shardId7.toString();
        java.lang.String str10 = shardId7.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId7.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!][10]" + "'", str9, "[hi!][10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!][10]" + "'", str10, "[hi!][10]");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withLocale(locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter14.print(readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear(10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter13.parseDateTime("[[_type][1]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withZoneUTC();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withLocale(locale24);
        int int26 = dateTimeFormatter19.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter19.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter31.getParser();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter31.withLocale(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeFormatter31.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter31.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter31.withChronology(chronology39);
        org.joda.time.Chronology chronology41 = dateTimeFormatter31.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter42 = null;
        org.joda.time.format.DateTimeParser dateTimeParser43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter42, dateTimeParser43);
        org.joda.time.format.DateTimeParser dateTimeParser45 = dateTimeFormatter44.getParser();
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter44.withLocale(locale46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter44.withZoneUTC();
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withLocale(locale49);
        java.util.Locale locale51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withLocale(locale51);
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter52.withLocale(locale53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter54.withZone(dateTimeZone55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter54.withChronology(chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter58.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone60 = dateTimeFormatter59.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter31.withZone(dateTimeZone60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter19.withZone(dateTimeZone60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter16.withZone(dateTimeZone60);
        org.joda.time.ReadableInstant readableInstant64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = dateTimeFormatter63.print(readableInstant64);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNull(dateTimePrinter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2000 + "'", int26 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNull(dateTimeParser32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNull(chronology41);
        org.junit.Assert.assertNull(dateTimeParser45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_index][10]][35]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_shard_id][0]", "[[_index][100]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_seq_no", (int) ' ');
        java.lang.String str4 = shardId3.getIndexName();
        java.lang.String str5 = shardId3.getIndexName();
        java.lang.Object obj6 = null;
        boolean boolean7 = shardId3.equals(obj6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter12.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser14);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withLocale(locale24);
        org.joda.time.format.DateTimeParser dateTimeParser26 = dateTimeFormatter23.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = dateTimeFormatter29.parseDateTime("[[_index][10]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[[_index][10]][0]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeParser26);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter7.getZone();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withOffsetParsed();
        java.lang.StringBuilder stringBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder12, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter2.print((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter7.print((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_seq_no][10]", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeFormatter2.parseMillis("[[_index][10]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale12 = dateTimeFormatter10.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter18.getParser();
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withLocale(locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter18.withZoneUTC();
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withLocale(locale23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter18.withZone(dateTimeZone25);
        int int27 = dateTimeFormatter18.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter31.getParser();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter31.withLocale(locale33);
        boolean boolean35 = dateTimeFormatter34.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter34.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter34.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter18.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter15.withZone(dateTimeZone41);
        org.joda.time.Chronology chronology44 = dateTimeFormatter43.getChronolgy();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNull(dateTimeParser32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNull(chronology44);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZone(dateTimeZone10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_index][100]][97]", "[_shard_id][100]", "[_id][52]", "[[_index][10]][35]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withChronology(chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 100);
        org.joda.time.ReadWritableInstant readWritableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeFormatter14.parseInto(readWritableInstant15, "[[_index][100]][97]", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        java.lang.StringBuilder stringBuilder14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuilder14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[_type][-1]", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_type", "_type", (int) (short) 1);
        int int4 = shardId3.getId();
        int int5 = shardId3.id();
        int int6 = shardId3.id();
        org.elasticsearch.index.shard.ShardId shardId10 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str11 = shardId10.toString();
        org.elasticsearch.index.shard.ShardId shardId15 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        int int16 = shardId15.id();
        int int17 = shardId10.compareTo(shardId15);
        boolean boolean18 = shardId3.equals((java.lang.Object) shardId15);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[][0]" + "'", str11, "[][0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        java.lang.Integer int7 = dateTimeFormatter5.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 100);
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter9.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter10.parseDateTime("_seq_no");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_type][1]][0]", "_shard_id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass8 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_type][1]", "[[_index][0]][2000]", (-9));
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_seq_no][52]][0]", "[hi!][-1]", "[[[_index][100]][97]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        boolean boolean11 = dateTimeFormatter7.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withZoneUTC();
        java.io.Writer writer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) (-9));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter7.parseLocalDate("[_seq_no][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withOffsetParsed();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter7.getPrinter();
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter7.print(readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = dateTimeFormatter2.parseLocalTime("[_index][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter11.getParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withLocale(locale15);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        java.lang.Class<?> wildcardClass18 = dateTimeFormatter16.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][10]", "[_type][1]", (int) '#');
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[][0]", "_seq_no", 0);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.index.shard.ShardId shardId12 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][97]", "[hi!][10]", 100);
        int int13 = shardId7.compareTo(shardId12);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter16.getParser();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withLocale(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withZoneUTC();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter16.withLocale(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter16.withZone(dateTimeZone23);
        int int25 = dateTimeFormatter16.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser26 = dateTimeFormatter16.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter29.getParser();
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter29.withLocale(locale31);
        boolean boolean33 = dateTimeFormatter32.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter32.withZone(dateTimeZone36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter32.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeFormatter38.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter16.withZone(dateTimeZone39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = shardId7.equals((java.lang.Object) dateTimeZone39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2000 + "'", int25 == 2000);
        org.junit.Assert.assertNull(dateTimeParser26);
        org.junit.Assert.assertNull(dateTimeParser30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "[[_type][1]][35]", 10);
        int int4 = shardId3.getId();
        java.lang.String str5 = shardId3.toString();
        org.elasticsearch.index.Index index6 = shardId3.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[][0]][10]" + "'", str5, "[[][0]][10]");
        org.junit.Assert.assertNotNull(index6);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "[[[_type][1]][35]][100]", "_version", "[][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTimeFormatter8.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeFormatter8.parseMillis("[hi!][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(chronology15);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withLocale(locale16);
        org.joda.time.Chronology chronology18 = dateTimeFormatter17.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTimeFormatter17.print(readablePartial20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable12, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][100]][0]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_index][10]][0]", "[_shard_id][0]", "[hi!][10]", "[[[_index][100]][97]][100]", "", "[[_seq_no][52]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withChronology(chronology12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        java.util.Locale locale15 = dateTimeFormatter13.getLocale();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = dateTimeFormatter17.parseMutableDateTime("[[_index][0]][2000]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(10);
        boolean boolean7 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 6);
        int int10 = dateTimeFormatter6.getDefaultYear();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][97]", "[_seq_no][52]", (int) (short) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.Chronology chronology8 = dateTimeFormatter6.getChronology();
        org.joda.time.Chronology chronology9 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withPivotYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = shardId3.equals((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear(2000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter10.print(readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear(10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuilder12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[][10]", "[[hi!][0]][0]", "[[[_seq_no][52]][-1]][32]", "[_shard_id][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_type", "[][0]", "[[hi!][0]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][10]", "[[_type][1]][0]", 97);
        java.lang.String str4 = shardId3.getIndexName();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!][10]" + "'", str4, "[hi!][10]");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser11);
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter22.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = dateTimeFormatter22.parseLocalDateTime("[_seq_no][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[_seq_no][100]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][10]][32]", "[hi!][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean18 = dateTimeFormatter17.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser19);
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter39.getParser();
        org.joda.time.Chronology chronology41 = dateTimeFormatter39.getChronology();
        boolean boolean42 = dateTimeFormatter39.isParser();
        org.joda.time.Chronology chronology43 = dateTimeFormatter39.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter39.withDefaultYear((int) (short) 0);
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter39.withLocale(locale46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withPivotYear(10);
        boolean boolean50 = dateTimeFormatter49.isOffsetParsed();
        org.joda.time.Chronology chronology51 = dateTimeFormatter49.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        org.joda.time.format.DateTimeParser dateTimeParser55 = dateTimeFormatter54.getParser();
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withLocale(locale56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter57.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter59.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter62 = null;
        org.joda.time.format.DateTimeParser dateTimeParser63 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter62, dateTimeParser63);
        org.joda.time.format.DateTimeParser dateTimeParser65 = dateTimeFormatter64.getParser();
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter64.withLocale(locale66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter64.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeFormatter64.getZone();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter64.withZone(dateTimeZone70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter64.withChronology(chronology72);
        org.joda.time.Chronology chronology74 = dateTimeFormatter64.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter75 = null;
        org.joda.time.format.DateTimeParser dateTimeParser76 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter75, dateTimeParser76);
        org.joda.time.format.DateTimeParser dateTimeParser78 = dateTimeFormatter77.getParser();
        java.util.Locale locale79 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter77.withLocale(locale79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter77.withZoneUTC();
        java.util.Locale locale82 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter81.withLocale(locale82);
        java.util.Locale locale84 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter81.withLocale(locale84);
        java.util.Locale locale86 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter85.withLocale(locale86);
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter87.withZone(dateTimeZone88);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter87.withChronology(chronology90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter92 = dateTimeFormatter91.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone93 = dateTimeFormatter92.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter64.withZone(dateTimeZone93);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter95 = dateTimeFormatter61.withZone(dateTimeZone93);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter96 = dateTimeFormatter49.withZone(dateTimeZone93);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter97 = dateTimeFormatter36.withZone(dateTimeZone93);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime99 = dateTimeFormatter97.parseLocalTime("[[_type][1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[[_type][1]][0]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeParser19);
        org.junit.Assert.assertNull(dateTimeParser40);
        org.junit.Assert.assertNull(chronology41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(chronology51);
        org.junit.Assert.assertNull(dateTimeParser55);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(dateTimeParser65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNull(chronology74);
        org.junit.Assert.assertNull(dateTimeParser78);
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(dateTimeFormatter89);
        org.junit.Assert.assertNotNull(dateTimeFormatter91);
        org.junit.Assert.assertNotNull(dateTimeFormatter92);
        org.junit.Assert.assertNotNull(dateTimeZone93);
        org.junit.Assert.assertNotNull(dateTimeFormatter94);
        org.junit.Assert.assertNotNull(dateTimeFormatter95);
        org.junit.Assert.assertNotNull(dateTimeFormatter96);
        org.junit.Assert.assertNotNull(dateTimeFormatter97);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter18.getParser();
        org.joda.time.Chronology chronology20 = dateTimeFormatter18.getChronology();
        boolean boolean21 = dateTimeFormatter18.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withChronology(chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter23.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter23.withOffsetParsed();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter23.withLocale(locale32);
        org.joda.time.Chronology chronology34 = dateTimeFormatter23.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.format.DateTimeParser dateTimeParser38 = dateTimeFormatter37.getParser();
        org.joda.time.Chronology chronology39 = dateTimeFormatter37.getChronology();
        boolean boolean40 = dateTimeFormatter37.isParser();
        org.joda.time.Chronology chronology41 = dateTimeFormatter37.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter37.withDefaultYear((int) (short) 0);
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter37.withLocale(locale44);
        boolean boolean46 = dateTimeFormatter37.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter37.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter37.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter48.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter51 = null;
        org.joda.time.format.DateTimeParser dateTimeParser52 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter51, dateTimeParser52);
        org.joda.time.format.DateTimeParser dateTimeParser54 = dateTimeFormatter53.getParser();
        java.util.Locale locale55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter53.withLocale(locale55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter53.withZoneUTC();
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter57.withLocale(locale58);
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter57.withLocale(locale60);
        java.util.Locale locale62 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter61.withLocale(locale62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter63.withZone(dateTimeZone64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter63.withChronology(chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter67.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeFormatter68.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter48.withZone(dateTimeZone69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter23.withZone(dateTimeZone69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter15.withZone(dateTimeZone69);
        java.lang.StringBuilder stringBuilder73 = null;
        org.joda.time.ReadablePartial readablePartial74 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter72.printTo(stringBuilder73, readablePartial74);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNull(chronology34);
        org.junit.Assert.assertNull(dateTimeParser38);
        org.junit.Assert.assertNull(chronology39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNull(dateTimeParser54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[_shard_id][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = dateTimeFormatter18.parseMutableDateTime("[hi!][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[hi!][10]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        java.lang.Integer int9 = dateTimeFormatter7.getPivotYear();
        boolean boolean10 = dateTimeFormatter7.isParser();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "[[_type][1]][0]", "[_id][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter7.isParser();
        org.joda.time.ReadWritableInstant readWritableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter7.parseInto(readWritableInstant9, "[[_index][10]][32]", 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withDefaultYear(2000);
        int int13 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter12.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter12.parseLocalTime("[[][0]][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter2.isPrinter();
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter2.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "[_index][0]", (-4));
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = shardId3.compareTo(shardId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZone(dateTimeZone9);
        int int11 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-9));
        java.io.Writer writer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[_id][1]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        boolean boolean13 = dateTimeFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter2.parseMillis("_version");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_type][1]][1]", "[[][0]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        int int9 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZoneUTC();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "[_type][-1]", 52);
        int int4 = shardId3.id();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.Locale locale10 = dateTimeFormatter2.getLocale();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTimeFormatter14.parseDateTime("[_index][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_id][52]][0]", "[_type][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][0]", "[[][0]][97]", 13);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter11.getParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withDefaultYear((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTimeFormatter19.parseDateTime("[_type][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][10]", "", (int) (byte) 100);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_seq_no][52]][-1]][1]", "[[_index][0]][2000]", "[[_index][10]][0]", "[_index][0]", "[_seq_no][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean24 = dateTimeFormatter23.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter23.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser25);
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter35.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime51 = dateTimeFormatter49.parseMutableDateTime("[_type][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[_type][1]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimeParser36);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[][0]][97]", "[_shard_id][0]", (int) 'a');
        int int4 = shardId3.getId();
        java.lang.Class<?> wildcardClass5 = shardId3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter8.parseDateTime("[_type][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[_seq_no][100]", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str8 = shardId7.toString();
        java.lang.String str9 = shardId7.toString();
        int int10 = shardId3.compareTo(shardId7);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[][0]" + "'", str8, "[][0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[][0]" + "'", str9, "[][0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_shard_id", (-1));
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "_id", (int) (byte) 100);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[hi!][10]", "[[_index][100]][0]", "[_index][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) (byte) 100);
        boolean boolean12 = dateTimeFormatter9.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTimeFormatter9.parseDateTime("_seq_no");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTimeFormatter16.parseDateTime("[[_index][100]][-9]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 97);
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter14.print(readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[][0]", "[[_id][52]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        boolean boolean13 = dateTimeFormatter10.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withZone(dateTimeZone14);
        boolean boolean16 = dateTimeFormatter15.isPrinter();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withChronology(chronology17);
        java.lang.StringBuilder stringBuilder19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(stringBuilder19, readablePartial20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_shard_id][100]", "_version", "[_id][-9]", "[[_type][1]][0]", "_shard_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][100]", "[_seq_no][100]", (-4));
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZoneUTC();
        boolean boolean12 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter15.print(readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_id][52]][97]", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 52);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZone(dateTimeZone12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter11.print(readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withZone(dateTimeZone16);
        boolean boolean18 = dateTimeFormatter17.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withPivotYear((-9));
        org.joda.time.ReadWritableInstant readWritableInstant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dateTimeFormatter17.parseInto(readWritableInstant21, "[[_index][100]][10]", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[_index][10]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTimeFormatter10.parseDateTime("[[[_type][1]][35]][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) '#');
        int int8 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        java.lang.StringBuilder stringBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(dateTimeParser9);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[[_type][1]][35]][100]", "[[_id][52]][0]", "[_shard_id][0]", "[[_id][52]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][100]", "[[_index][10]][32]", (int) (short) 0);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_type", "[_index][10]", "[[_index][100]][-9]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][-1]", "[[_type][1]][1]", 97);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withDefaultYear((int) (byte) 100);
        int int14 = dateTimeFormatter13.getDefaultYear();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = dateTimeFormatter16.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.lang.Integer int11 = dateTimeFormatter10.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass14 = dateTimeFormatter10.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter0.parseMutableDateTime("[[_seq_no][52]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[[_seq_no][52]][0]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer12, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_type][1]][1]", "[_index][100]", "[hi!][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][1]", "[[_index][10]][32]", (int) 'a');
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        java.lang.Integer int8 = dateTimeFormatter5.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter5.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = dateTimeFormatter5.parseMutableDateTime("[_id][-9]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(dateTimePrinter9);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][100]", "_type", (int) (short) 100);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.Locale locale10 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withDefaultYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withOffsetParsed();
        java.io.Writer writer16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer16, readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_seq_no][52]][-1]", "_index", "[_id][1]", "[_type][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][0]", "[[_index][10]][32]", (int) (short) 0);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[][0]][10]", "[[_index][0]][2000]", "_version", "[[_index][10]][32]", "[[][0]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer9, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter10.parseInto(readWritableInstant12, "[[_index][0]][2000]", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][10]", "[_index][10]", (int) (short) -1);
        int int4 = shardId3.getId();
        org.elasticsearch.index.shard.ShardId shardId8 = new org.elasticsearch.index.shard.ShardId("[_type][-1]", "[[][0]][97]", (int) 'a');
        int int9 = shardId3.compareTo(shardId8);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId8.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(1);
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronolgy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "[_id][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][97]", "_type", (int) ' ');
        java.lang.String str4 = shardId3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[_index][100]][97]][32]" + "'", str4, "[[[_index][100]][97]][32]");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_seq_no][52]", "hi!", "", "[_type][1]", "[[[_seq_no][52]][100]][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SEQ_NO();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_seq_no" + "'", str1, "_seq_no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_id][52]", "[[_index][100]][0]", "[[[_seq_no][52]][100]][1]", "[[][0]][97]", "[][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withChronology(chronology5);
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((int) (short) 100);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer11, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_index][100]][-9]", "[[_seq_no][52]][-1]", "[[[_index][100]][0]][-1]", "[[_id][52]][97]", "[_index][0]", "[[_index][100]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withDefaultYear(2000);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter12.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withOffsetParsed();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer16, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_type][1]][0]", "[_index][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[[_type][1]][35]][100]", "[_id][-9]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withDefaultYear(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter11.parseMutableDateTime("_version");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withLocale(locale16);
        org.joda.time.Chronology chronology18 = dateTimeFormatter7.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateTimeFormatter7.print((long) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[_type][1]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[[_type][1]][35]][100]", "[][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[][100]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[][0]][97]", "[_type][10]", "[[_index][0]][2000]", "[[_seq_no][52]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_seq_no][52]][100]][1]", "[[hi!][0]][0]", "[[hi!][0]][0]", "_seq_no", "[][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_index][100]][0]", "[[_id][52]][97]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_index][10]][0]", "[[_id][52]][100]", "[[_index][10]][0]", "[_type][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_id][52]][0]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter2.parseMillis("[_type][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_shard_id", (-1));
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "_id", (int) (byte) 100);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.index.shard.ShardId shardId12 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str13 = shardId12.toString();
        java.lang.String str14 = shardId12.toString();
        int int15 = shardId7.compareTo(shardId12);
        java.lang.String str16 = shardId7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[][0]" + "'", str13, "[][0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[][0]" + "'", str14, "[][0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[][100]" + "'", str16, "[][100]");
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer15, readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_id", "_version", (int) ' ');
        int int4 = shardId3.id();
        org.elasticsearch.index.Index index5 = shardId3.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_type][1]][0]", "[[hi!][0]][0]", "[[[_type][1]][35]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[hi!][-1]", "[][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale12 = dateTimeFormatter10.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter13.print(readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) (byte) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withChronology(chronology14);
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "[_shard_id][0]", (int) (byte) 100);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withZone(dateTimeZone13);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter8.withLocale(locale15);
        boolean boolean17 = dateTimeFormatter8.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = dateTimeFormatter8.parseLocalDateTime("[[[_seq_no][52]][100]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((-4));
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter7.print(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        boolean boolean12 = dateTimeFormatter11.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter5.withZone(dateTimeZone18);
        java.lang.Class<?> wildcardClass20 = dateTimeFormatter5.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str4 = shardId3.toString();
        org.elasticsearch.index.shard.ShardId shardId8 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        int int9 = shardId8.id();
        int int10 = shardId3.compareTo(shardId8);
        java.lang.String str11 = shardId8.toString();
        int int12 = shardId8.getId();
        org.elasticsearch.action.DocWriteResponse.Fields fields13 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str14 = fields13.get_SEQ_NO();
        java.lang.String str15 = fields13.get_ID();
        java.lang.String str16 = fields13.get_SEQ_NO();
        java.lang.String str17 = fields13.get_SEQ_NO();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = shardId8.equals((java.lang.Object) fields13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[][0]" + "'", str4, "[][0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[][0]" + "'", str11, "[][0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_seq_no" + "'", str17, "_seq_no");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][100]", "", (-13));
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withChronology(chronology13);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatter17.getParser();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withZoneUTC();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter17.withLocale(locale22);
        boolean boolean24 = dateTimeFormatter17.isParser();
        java.util.Locale locale25 = dateTimeFormatter17.getLocale();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.Chronology chronology29 = dateTimeFormatter17.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatter32.getParser();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withLocale(locale34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser38 = dateTimeFormatter37.getParser();
        org.joda.time.Chronology chronology39 = dateTimeFormatter37.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter40 = null;
        org.joda.time.format.DateTimeParser dateTimeParser41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter40, dateTimeParser41);
        org.joda.time.format.DateTimeParser dateTimeParser43 = dateTimeFormatter42.getParser();
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter42.withLocale(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter42.withZoneUTC();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter42.withLocale(locale47);
        int int49 = dateTimeFormatter42.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter42.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatter42.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        org.joda.time.format.DateTimeParser dateTimeParser55 = dateTimeFormatter54.getParser();
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withLocale(locale56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter54.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone59 = dateTimeFormatter54.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter54.withZone(dateTimeZone60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter54.withChronology(chronology62);
        org.joda.time.Chronology chronology64 = dateTimeFormatter54.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter65 = null;
        org.joda.time.format.DateTimeParser dateTimeParser66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter65, dateTimeParser66);
        org.joda.time.format.DateTimeParser dateTimeParser68 = dateTimeFormatter67.getParser();
        java.util.Locale locale69 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter67.withLocale(locale69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter67.withZoneUTC();
        java.util.Locale locale72 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter71.withLocale(locale72);
        java.util.Locale locale74 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter71.withLocale(locale74);
        java.util.Locale locale76 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter75.withLocale(locale76);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter77.withZone(dateTimeZone78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter77.withChronology(chronology80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter81.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone83 = dateTimeFormatter82.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter54.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter42.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter37.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter17.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter5.withZone(dateTimeZone83);
        java.lang.Appendable appendable89 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter88.printTo(appendable89, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(chronology29);
        org.junit.Assert.assertNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNull(dateTimeParser38);
        org.junit.Assert.assertNull(chronology39);
        org.junit.Assert.assertNull(dateTimeParser43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2000 + "'", int49 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNull(dateTimeParser51);
        org.junit.Assert.assertNull(dateTimeParser55);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNull(chronology64);
        org.junit.Assert.assertNull(dateTimeParser68);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(dateTimeFormatter88);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_type][1]][1]", "[[][0]][10]", (int) (short) 10);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "[[[_type][1]][35]][100]", "_version", "[[_seq_no][52]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(0);
        java.lang.Integer int8 = dateTimeFormatter5.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter5.print((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter12.parseMutableDateTime("[_shard_id][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withPivotYear(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withZone(dateTimeZone24);
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter19.withLocale(locale26);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.format.DateTimeParser dateTimeParser31 = dateTimeFormatter30.getParser();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withLocale(locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter35.getParser();
        org.joda.time.Chronology chronology37 = dateTimeFormatter35.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = null;
        org.joda.time.format.DateTimeParser dateTimeParser39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter38, dateTimeParser39);
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter40.getParser();
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter40.withLocale(locale42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter40.withZoneUTC();
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter40.withLocale(locale45);
        int int47 = dateTimeFormatter40.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter40.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatter40.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = null;
        org.joda.time.format.DateTimeParser dateTimeParser51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter50, dateTimeParser51);
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter52.getParser();
        java.util.Locale locale54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter52.withLocale(locale54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter52.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeFormatter52.getZone();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter52.withZone(dateTimeZone58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter52.withChronology(chronology60);
        org.joda.time.Chronology chronology62 = dateTimeFormatter52.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter63 = null;
        org.joda.time.format.DateTimeParser dateTimeParser64 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter63, dateTimeParser64);
        org.joda.time.format.DateTimeParser dateTimeParser66 = dateTimeFormatter65.getParser();
        java.util.Locale locale67 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter65.withLocale(locale67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter65.withZoneUTC();
        java.util.Locale locale70 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter69.withLocale(locale70);
        java.util.Locale locale72 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter69.withLocale(locale72);
        java.util.Locale locale74 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter73.withLocale(locale74);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter75.withZone(dateTimeZone76);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter75.withChronology(chronology78);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter79.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone81 = dateTimeFormatter80.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter52.withZone(dateTimeZone81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter40.withZone(dateTimeZone81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter35.withZone(dateTimeZone81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter19.withZone(dateTimeZone81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter16.withZone(dateTimeZone81);
        org.joda.time.ReadableInstant readableInstant87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str88 = dateTimeFormatter86.print(readableInstant87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNull(dateTimeParser36);
        org.junit.Assert.assertNull(chronology37);
        org.junit.Assert.assertNull(dateTimeParser41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2000 + "'", int47 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeParser49);
        org.junit.Assert.assertNull(dateTimeParser53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(chronology62);
        org.junit.Assert.assertNull(dateTimeParser66);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter10.print(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter5.getZone();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer11, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withChronology(chronology14);
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter15.print(readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "[][0]", (int) '#');
        java.lang.String str4 = shardId3.getIndexName();
        org.elasticsearch.index.Index index5 = shardId3.getIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[_index][0]", "[[][0]][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withChronology(chronology13);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter14.getParser();
        java.lang.StringBuilder stringBuilder16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuilder16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeParser15);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withLocale(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withPivotYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = dateTimeFormatter14.parseMutableDateTime("[[[_index][100]][97]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter7.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter11.parseMillis("[[hi!][0]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((int) '#');
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        boolean boolean10 = dateTimeFormatter8.isParser();
        java.lang.StringBuilder stringBuilder11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuilder11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withZone(dateTimeZone11);
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        java.lang.Class<?> wildcardClass14 = dateTimeFormatter12.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer16, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][100]", "[_id][52]", 0);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_seq_no", "[[_index][10]][1]", "[[[_type][1]][35]][100]", "_index", "[][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_type][1]][35]", "", (int) (short) 10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[hi!][0]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter8.withChronology(chronology15);
        boolean boolean17 = dateTimeFormatter16.isOffsetParsed();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withChronology(chronology18);
        org.joda.time.ReadWritableInstant readWritableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dateTimeFormatter19.parseInto(readWritableInstant20, "[[_index][10]][35]", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.Locale locale10 = dateTimeFormatter2.getLocale();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology14 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatter17.getParser();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        org.joda.time.Chronology chronology24 = dateTimeFormatter22.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withZoneUTC();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter27.withLocale(locale32);
        int int34 = dateTimeFormatter27.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter27.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter39.getParser();
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter39.withLocale(locale41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter39.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeFormatter39.getZone();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter39.withZone(dateTimeZone45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter39.withChronology(chronology47);
        org.joda.time.Chronology chronology49 = dateTimeFormatter39.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = null;
        org.joda.time.format.DateTimeParser dateTimeParser51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter50, dateTimeParser51);
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter52.getParser();
        java.util.Locale locale54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter52.withLocale(locale54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter52.withZoneUTC();
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withLocale(locale57);
        java.util.Locale locale59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter56.withLocale(locale59);
        java.util.Locale locale61 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter60.withLocale(locale61);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter62.withZone(dateTimeZone63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter62.withChronology(chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter66.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone68 = dateTimeFormatter67.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter39.withZone(dateTimeZone68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter27.withZone(dateTimeZone68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter22.withZone(dateTimeZone68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter2.withZone(dateTimeZone68);
        java.util.Locale locale73 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter2.withLocale(locale73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate76 = dateTimeFormatter74.parseLocalDate("[[_type][1]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2000 + "'", int34 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNull(dateTimeParser36);
        org.junit.Assert.assertNull(dateTimeParser40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(chronology49);
        org.junit.Assert.assertNull(dateTimeParser53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatter74);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) '#');
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter7.print(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        boolean boolean12 = dateTimeFormatter10.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withDefaultYear(0);
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withLocale(locale12);
        boolean boolean14 = dateTimeFormatter13.isParser();
        boolean boolean15 = dateTimeFormatter13.isOffsetParsed();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuffer16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter2.withDefaultYear((int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        boolean boolean26 = dateTimeFormatter25.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter25.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withZone(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter25.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter31.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter19.withZone(dateTimeZone32);
        java.lang.Appendable appendable34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter33.printTo(appendable34, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "", (int) '4');
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.Chronology chronology9 = dateTimeFormatter7.getChronology();
        boolean boolean10 = dateTimeFormatter7.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter7.getChronolgy();
        int int12 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 52);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withZone(dateTimeZone17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronolgy();
        int int20 = dateTimeFormatter18.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter18.withDefaultYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = shardId3.equals((java.lang.Object) dateTimeFormatter22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index4);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000 + "'", int20 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withLocale(locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        java.lang.Appendable appendable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable16, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_id][52]][100]", "[[_index][0]][-1]", "[_seq_no][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_type][1]][1]", "[_id][52]", "[_id][-9]", "[[_id][52]][0]", "[][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_type][1]", "[_seq_no][52]", "[_type][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withPivotYear((java.lang.Integer) (-9));
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuilder18, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withOffsetParsed();
        java.lang.StringBuilder stringBuilder10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZoneUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale11);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withLocale(locale19);
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withChronology(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter27.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withZone(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = dateTimeFormatter29.parseDateTime("[][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "[_type][1]", (int) (byte) 100);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("hi!", "_version", (int) (byte) 10);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId7.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.Locale locale10 = dateTimeFormatter2.getLocale();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology14 = dateTimeFormatter2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withZone(dateTimeZone15);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        org.joda.time.Chronology chronology21 = dateTimeFormatter19.getChronology();
        boolean boolean22 = dateTimeFormatter19.isParser();
        org.joda.time.Chronology chronology23 = dateTimeFormatter19.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology26 = dateTimeFormatter19.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter29.getParser();
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter29.withLocale(locale31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withZoneUTC();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withLocale(locale34);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter33.withLocale(locale36);
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withLocale(locale38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withZone(dateTimeZone40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter39.withChronology(chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter43.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeFormatter44.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter19.withZone(dateTimeZone45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter2.withZone(dateTimeZone45);
        java.io.Writer writer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer48, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNull(chronology26);
        org.junit.Assert.assertNull(dateTimeParser30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withChronology(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withLocale(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withZone(dateTimeZone16);
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter11.withLocale(locale18);
        org.joda.time.Chronology chronology20 = dateTimeFormatter11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter11.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter11.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter11.withDefaultYear((int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter31.getParser();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter31.withLocale(locale33);
        boolean boolean35 = dateTimeFormatter34.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter34.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter34.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter28.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter8.withZone(dateTimeZone41);
        java.io.Writer writer44 = null;
        org.joda.time.ReadablePartial readablePartial45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer44, readablePartial45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeParser32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.StringBuilder stringBuilder13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuilder13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear(10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withLocale(locale12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chronology14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale12 = dateTimeFormatter10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withOffsetParsed();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        java.lang.Appendable appendable18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(appendable18, readableInstant19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear(35);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[hi!][0]][0]", "[[_index][0]][-1]", "[[_index][100]][0]", "[[_index][10]][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter14.print(readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[_id][52]][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_seq_no][52]][100]][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = dateTimeFormatter7.parseLocalDateTime("[_id][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '4');
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        org.joda.time.Chronology chronology14 = dateTimeFormatter12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withChronology(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dateTimeFormatter16.parseMillis("[[_index][10]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withZoneUTC();
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][1]", "[hi!][0]", (int) (byte) -1);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) '#');
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer9, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withZone(dateTimeZone11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withChronology(chronology13);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronology();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer18, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter2.parseDateTime("[[_seq_no][52]][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-9));
        boolean boolean10 = dateTimeFormatter2.isOffsetParsed();
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_id][52]", "", "[][10]", "[][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear(10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withLocale(locale12);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        org.joda.time.Chronology chronology15 = dateTimeFormatter13.getChronolgy();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter13.print(readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNull(chronology15);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean23 = dateTimeFormatter22.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = dateTimeFormatter46.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeParser24);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[[_seq_no][52]][-1]][1]", "", "[_type][-1]", "[[_index][10]][0]", "[][10]", "[_id][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_index][100]][0]][-1]", "[_shard_id][100]", 100);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_seq_no", "[[_index][10]][0]", "_seq_no", "[[_index][100]][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimePrinter9);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        boolean boolean11 = dateTimeFormatter8.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter8.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_seq_no][52]][100]", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter2.isPrinter();
        int int9 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter2.parseLocalDateTime("[[hi!][10]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("hi!", "_version", (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.Chronology chronology8 = dateTimeFormatter6.getChronology();
        boolean boolean9 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter6.withLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = shardId3.equals((java.lang.Object) dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_index][100]][97]][100]", "[_type][10]", "", "[[hi!][10]][0]", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear(0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter7.withChronology(chronology15);
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withLocale(locale19);
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withChronology(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter27.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = dateTimeFormatter2.parseLocalDate("[[_index][100]][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][10]][0]", "[][0]", 52);
        java.lang.String str4 = shardId3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[_index][10]][0]][52]" + "'", str4, "[[[_index][10]][0]][52]");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("_id", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 0);
        java.lang.StringBuilder stringBuilder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuilder11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_type][-1]][0]", "[[_index][100]][-9]", "_id", "_seq_no" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean23 = dateTimeFormatter22.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser24);
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter34.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser35);
        java.lang.StringBuffer stringBuffer48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter47.printTo(stringBuffer48, readableInstant49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeParser35);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withDefaultYear((int) (byte) 100);
        int int14 = dateTimeFormatter13.getDefaultYear();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withLocale(locale15);
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable17, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_id][52]", "_index", "[[[_seq_no][52]][100]][1]", "[[_index][100]][0]", "[[[_index][100]][97]][32]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int14 = dateTimeFormatter13.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withDefaultYear((-4));
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer17, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) (byte) 100);
        int int12 = dateTimeFormatter9.getDefaultYear();
        java.lang.Integer int13 = dateTimeFormatter9.getPivotYear();
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable14, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withDefaultYear((int) 'a');
        boolean boolean11 = dateTimeFormatter6.isPrinter();
        java.lang.Integer int12 = dateTimeFormatter6.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter6.parseLocalTime("[[][0]][97]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_type][1]][0]", "[[_index][100]][10]", "[_index][100]", "[[[_index][10]][0]][52]", "[][10]", "[[[_index][100]][0]][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter13.getParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter18.getParser();
        org.joda.time.Chronology chronology20 = dateTimeFormatter18.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter23.getParser();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withZoneUTC();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withLocale(locale28);
        int int30 = dateTimeFormatter23.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter23.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter35.getParser();
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withLocale(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeFormatter35.getZone();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter35.withZone(dateTimeZone41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter35.withChronology(chronology43);
        org.joda.time.Chronology chronology45 = dateTimeFormatter35.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatter48.getParser();
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter48.withLocale(locale50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withZoneUTC();
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter52.withLocale(locale53);
        java.util.Locale locale55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter52.withLocale(locale55);
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withLocale(locale57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withZone(dateTimeZone59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter58.withChronology(chronology61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter62.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone64 = dateTimeFormatter63.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter35.withZone(dateTimeZone64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter23.withZone(dateTimeZone64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter18.withZone(dateTimeZone64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter2.withZone(dateTimeZone64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter68.withPivotYear((int) (short) 0);
        java.util.Locale locale71 = dateTimeFormatter70.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime73 = dateTimeFormatter70.parseDateTime("[[_type][1]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNull(chronology20);
        org.junit.Assert.assertNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2000 + "'", int30 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(dateTimeParser32);
        org.junit.Assert.assertNull(dateTimeParser36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNull(chronology45);
        org.junit.Assert.assertNull(dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNull(locale71);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "[hi!][10]", "[hi!][0]", "[[_index][10]][1]", "[_id][52]", "[[[_type][1]][35]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZone(dateTimeZone12);
        boolean boolean14 = dateTimeFormatter13.isOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withChronology(chronology9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "[_seq_no][52]", 100);
        java.lang.String str4 = shardId3.toString();
        java.lang.String str5 = shardId3.getIndexName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[_seq_no][52]][100]" + "'", str4, "[[_seq_no][52]][100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_seq_no][52]" + "'", str5, "[_seq_no][52]");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        java.lang.Class<?> wildcardClass11 = dateTimeFormatter10.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.Locale locale10 = dateTimeFormatter2.getLocale();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeFormatter2.parseMillis("[_type][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[[_seq_no][52]][100]][97]", "", "[hi!][-1]", "[[[_index][100]][97]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_id][52]][100]", "[[_type][1]][0]", "[[_index][10]][35]", "[[_index][0]][-1]", "[_seq_no][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZone(dateTimeZone9);
        int int11 = dateTimeFormatter8.getDefaultYear();
        int int12 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withChronology(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = dateTimeFormatter14.parseMutableDateTime("[][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((int) (short) 100);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_version", "_seq_no", 52);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "_index", (int) (byte) 1);
        org.elasticsearch.index.Index index8 = shardId7.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = shardId3.equals((java.lang.Object) index8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index8);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_type][-1]][0]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) (-9));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter12.print((long) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_index][0]", "_type", "_version", "[hi!][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withChronology(chronology12);
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronology();
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer13, (long) (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        boolean boolean9 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withZoneUTC();
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withLocale(locale20);
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withLocale(locale22);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withLocale(locale24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withZone(dateTimeZone26);
        boolean boolean28 = dateTimeFormatter25.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter25.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter12.withZone(dateTimeZone29);
        java.lang.Appendable appendable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable31, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }
}

