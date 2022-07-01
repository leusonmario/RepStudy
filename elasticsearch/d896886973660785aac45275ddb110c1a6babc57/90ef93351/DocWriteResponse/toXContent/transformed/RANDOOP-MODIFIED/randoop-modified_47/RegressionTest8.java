import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withLocale(locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology16 = dateTimeFormatter11.getChronology();
        boolean boolean17 = dateTimeFormatter11.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter20.getParser();
        org.joda.time.Chronology chronology22 = dateTimeFormatter20.getChronology();
        boolean boolean23 = dateTimeFormatter20.isParser();
        org.joda.time.Chronology chronology24 = dateTimeFormatter20.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter20.withDefaultYear((int) (short) 0);
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter20.withLocale(locale27);
        boolean boolean29 = dateTimeFormatter20.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter31.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = null;
        org.joda.time.format.DateTimeParser dateTimeParser35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser35);
        org.joda.time.format.DateTimeParser dateTimeParser37 = dateTimeFormatter36.getParser();
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter36.withLocale(locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withZoneUTC();
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withLocale(locale41);
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter40.withLocale(locale43);
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter44.withLocale(locale45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter46.withChronology(chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter50.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeFormatter51.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter31.withZone(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter11.withZone(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter2.withZone(dateTimeZone52);
        java.io.Writer writer56 = null;
        org.joda.time.ReadablePartial readablePartial57 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter55.printTo(writer56, readablePartial57);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dateTimeParser21);
        org.junit.Assert.assertNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNull(dateTimeParser37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, readableInstant11);
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
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[_seq_no][10]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][100]][10]", "[[hi!][10]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable15, (long) (-1));
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_index][100]][0]][-1]", "[[hi!][10]][52]", "[[][0]][10]", "[[_index][0]][2000]", "[[][0]][97]" };
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
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        java.lang.StringBuilder stringBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder9, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[_type][10]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
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
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuilder15, readablePartial16);
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
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone14);
        boolean boolean16 = dateTimeFormatter15.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = dateTimeFormatter15.parseLocalDate("[][10]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter6.print(readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
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
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        boolean boolean17 = dateTimeFormatter15.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter9.parseLocalTime("[[hi!][0]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_index][100]][97]", "[[[_seq_no][52]][100]][97]", "[[_index][10]][32]", "[_id][52]", "[_type][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "[[][0]][10]", (int) 'a');
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter6.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = shardId3.equals((java.lang.Object) dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_type][1]][35]][100]", "[_type][-1]", 32);
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
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(appendable17, readablePartial18);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeFormatter5.parseMillis("[[hi!][0]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_type", "_type", (int) (short) 1);
        java.lang.String str4 = shardId3.toString();
        org.elasticsearch.index.Index index5 = shardId3.getIndex();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        boolean boolean11 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 0);
        int int14 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter8.getPrinter();
        boolean boolean16 = dateTimeFormatter8.isParser();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = shardId3.equals((java.lang.Object) dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_type][1]" + "'", str4, "[_type][1]");
        org.junit.Assert.assertNotNull(index5);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
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
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter9.withPivotYear((-1));
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable17, (long) 32);
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
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withDefaultYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTimeFormatter7.parseDateTime("_type");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_shard_id][0]", "[][100]", (-13));
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][-1]", "[[][0]][10]", (-1));
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][0]", "[][0]", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = shardId3.equals((java.lang.Object) "[[_index][100]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter63.withPivotYear((-9));
        java.io.Writer writer66 = null;
        org.joda.time.ReadablePartial readablePartial67 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter63.printTo(writer66, readablePartial67);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
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
        int int18 = dateTimeFormatter15.getDefaultYear();
        boolean boolean19 = dateTimeFormatter15.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTimeFormatter30.getChronolgy();
        java.util.Locale locale32 = dateTimeFormatter30.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatter38.getParser();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withLocale(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter38.withZoneUTC();
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter38.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter38.withZone(dateTimeZone45);
        int int47 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser48 = dateTimeFormatter38.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = null;
        org.joda.time.format.DateTimeParser dateTimeParser50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser50);
        org.joda.time.format.DateTimeParser dateTimeParser52 = dateTimeFormatter51.getParser();
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter51.withLocale(locale53);
        boolean boolean55 = dateTimeFormatter54.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter54.withZone(dateTimeZone58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter54.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeFormatter60.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter38.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter35.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter15.withZone(dateTimeZone61);
        java.io.Writer writer65 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer65, (long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(chronology31);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2000 + "'", int47 == 2000);
        org.junit.Assert.assertNull(dateTimeParser48);
        org.junit.Assert.assertNull(dateTimeParser52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser25);
        java.lang.StringBuffer stringBuffer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter48.printTo(stringBuffer49, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeParser25);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 35);
        java.lang.StringBuilder stringBuilder11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuilder11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_seq_no][52]][-1]][1]" };
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
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int8 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print(readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
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
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        java.lang.StringBuilder stringBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuilder16, (long) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 6);
        org.joda.time.ReadWritableInstant readWritableInstant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dateTimeFormatter16.parseInto(readWritableInstant21, "_version", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_index][0]", "[[_index][100]][97]", "[[[_seq_no][52]][100]][1]", "_version", "[_type][-1]", "[[[_index][100]][97]][32]" };
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
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_seq_no][52]][100]][97]" };
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
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
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
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        java.io.Writer writer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(10);
        boolean boolean7 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 6);
        int int10 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter6.print(readablePartial11);
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
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter10.parseLocalDate("[_seq_no][100]");
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
        org.junit.Assert.assertNull(dateTimePrinter12);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
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
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronolgy();
        java.lang.StringBuilder stringBuilder18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuilder18, readableInstant19);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear(2000);
        java.lang.StringBuilder stringBuilder10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuilder10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTimeFormatter15.parseDateTime("[[_id][52]][0]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer14, readablePartial15);
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
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
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
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter7.getZone();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[[_seq_no][52]][100]][97]", "[_id][1]" };
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
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[[_type][1]][35]][100]", "_version");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withPivotYear((java.lang.Integer) (-9));
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withLocale(locale15);
        boolean boolean17 = dateTimeFormatter11.isParser();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter15.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter15.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter15.withChronology(chronology23);
        org.joda.time.Chronology chronology25 = dateTimeFormatter15.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter15.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter31.getParser();
        org.joda.time.Chronology chronology33 = dateTimeFormatter31.getChronology();
        boolean boolean34 = dateTimeFormatter31.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter31.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withChronology(chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter36.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter36.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter36.withOffsetParsed();
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter36.withLocale(locale45);
        org.joda.time.Chronology chronology47 = dateTimeFormatter36.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = null;
        org.joda.time.format.DateTimeParser dateTimeParser49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter48, dateTimeParser49);
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatter50.getParser();
        org.joda.time.Chronology chronology52 = dateTimeFormatter50.getChronology();
        boolean boolean53 = dateTimeFormatter50.isParser();
        org.joda.time.Chronology chronology54 = dateTimeFormatter50.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter50.withDefaultYear((int) (short) 0);
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter50.withLocale(locale57);
        boolean boolean59 = dateTimeFormatter50.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter50.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter50.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeFormatter61.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter61.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter64 = null;
        org.joda.time.format.DateTimeParser dateTimeParser65 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter64, dateTimeParser65);
        org.joda.time.format.DateTimeParser dateTimeParser67 = dateTimeFormatter66.getParser();
        java.util.Locale locale68 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter66.withLocale(locale68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter66.withZoneUTC();
        java.util.Locale locale71 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter70.withLocale(locale71);
        java.util.Locale locale73 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter70.withLocale(locale73);
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter74.withLocale(locale75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter76.withZone(dateTimeZone77);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter76.withChronology(chronology79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter80.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTimeFormatter81.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter61.withZone(dateTimeZone82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter36.withZone(dateTimeZone82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter28.withZone(dateTimeZone82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter2.withZone(dateTimeZone82);
        boolean boolean87 = dateTimeFormatter86.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter86.withPivotYear((java.lang.Integer) (-8));
        java.lang.StringBuilder stringBuilder90 = null;
        org.joda.time.ReadableInstant readableInstant91 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter86.printTo(stringBuilder90, readableInstant91);
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
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeParser32);
        org.junit.Assert.assertNull(chronology33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNull(chronology47);
        org.junit.Assert.assertNull(dateTimeParser51);
        org.junit.Assert.assertNull(chronology52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNull(dateTimeParser67);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatter74);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter89);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZone(dateTimeZone10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withChronology(chronology14);
        java.lang.Appendable appendable16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable16, readableInstant17);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][10]", "_shard_id", 6);
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
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][0]", "[_index][0]", 1);
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
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[_index][10]", "_shard_id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
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
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronology();
        boolean boolean12 = dateTimeFormatter10.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "_index", (int) (byte) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter6.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter6.withChronology(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = shardId3.equals((java.lang.Object) dateTimeFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_type][1]][35]", "[_id][52]", "[_id][1]", "[[_id][52]][97]", "[[_id][52]][100]" };
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
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_index][100]][0]][-1]", "_id", (int) (short) -1);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_id][-9]", "[[[_type][1]][35]][100]", "[[_index][100]][-9]", "[][0]" };
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
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_type", "", (int) '#');
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
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "[[_index][100]][-9]", "[][100]", "[_seq_no][100]", "[[hi!][10]][0]" };
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
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "[_index][100]", (int) (byte) 10);
        java.lang.String str4 = shardId3.getIndexName();
        org.elasticsearch.index.shard.ShardId shardId8 = new org.elasticsearch.index.shard.ShardId("_version", "[_index][100]", 10);
        boolean boolean9 = shardId3.equals((java.lang.Object) shardId8);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[][0]" + "'", str4, "[][0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
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
        java.lang.StringBuilder stringBuilder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter23.printTo(stringBuilder24, (long) 0);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 100);
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter12.parseMutableDateTime("[_shard_id][0]");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_seq_no][52]][-1]][1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str8 = shardId7.getIndexName();
        int int9 = shardId3.compareTo(shardId7);
        org.elasticsearch.index.shard.ShardId shardId13 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId17 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str18 = shardId17.getIndexName();
        int int19 = shardId13.compareTo(shardId17);
        int int20 = shardId3.compareTo(shardId13);
        int int21 = shardId13.getId();
        org.elasticsearch.common.io.stream.StreamInput streamInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId13.readFrom(streamInput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_type][-1]][0]", "[_seq_no][52]", (int) '#');
        int int4 = shardId3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SEQ_NO();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_seq_no" + "'", str1, "_seq_no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
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
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withChronology(chronology10);
        java.util.Locale locale12 = dateTimeFormatter11.getLocale();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[hi!][10]][0]", "[_id][52]" };
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
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[][10]", "hi!", "[[[_seq_no][52]][-1]][1]", "[[_index][100]][0]", "_seq_no", "[[[_seq_no][52]][-1]][1]" };
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
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withOffsetParsed();
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_seq_no][52]][0]", "[[_seq_no][52]][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
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
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer12, readablePartial13);
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
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZoneUTC();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer11, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter9.getPrinter();
        java.util.Locale locale11 = dateTimeFormatter9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter9.parseMillis("[[_index][10]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimePrinter10);
        org.junit.Assert.assertNull(locale11);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][0]", "[[_index][100]][0]", (int) (short) 0);
        int int4 = shardId3.id();
        int int5 = shardId3.getId();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        boolean boolean11 = dateTimeFormatter8.isParser();
        org.joda.time.Chronology chronology12 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withDefaultYear((int) (short) 0);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter8.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 52);
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter8.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = shardId3.equals((java.lang.Object) dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
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
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale11 = dateTimeFormatter9.getLocale();
        org.joda.time.Chronology chronology12 = dateTimeFormatter9.getChronology();
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer13, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_seq_no][52]][100]", "[hi!][0]", "_type", "[_seq_no][10]" };
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
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        boolean boolean10 = dateTimeFormatter8.isPrinter();
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
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        java.util.Locale locale10 = dateTimeFormatter7.getLocale();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("_seq_no");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
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
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withChronology(chronology15);
        boolean boolean17 = dateTimeFormatter16.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withPivotYear((-8));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter10.print((long) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][10]][1]", "hi!", 52);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        int int7 = dateTimeFormatter2.getDefaultYear();
        boolean boolean8 = dateTimeFormatter2.isPrinter();
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
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_shard_id", (-1));
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "_id", (int) (byte) 100);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.index.shard.ShardId shardId12 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str13 = shardId12.toString();
        java.lang.String str14 = shardId12.toString();
        int int15 = shardId7.compareTo(shardId12);
        int int16 = shardId7.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId7.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[][0]" + "'", str13, "[][0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[][0]" + "'", str14, "[][0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[_index][10]", "[_type][10]", "hi!" };
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
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[][0]][97]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "", (int) '4');
        java.lang.String str4 = shardId3.toString();
        java.lang.String str5 = shardId3.toString();
        java.lang.String str6 = shardId3.toString();
        int int7 = shardId3.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_seq_no][52]" + "'", str4, "[_seq_no][52]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_seq_no][52]" + "'", str5, "[_seq_no][52]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[_seq_no][52]" + "'", str6, "[_seq_no][52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
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
        java.lang.StringBuilder stringBuilder69 = null;
        org.joda.time.ReadablePartial readablePartial70 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuilder69, readablePartial70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
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
        java.util.Locale locale11 = dateTimeFormatter6.getLocale();
        boolean boolean12 = dateTimeFormatter6.isPrinter();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter6.withChronology(chronology13);
        org.joda.time.ReadWritableInstant readWritableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeFormatter14.parseInto(readWritableInstant15, "[[[_seq_no][52]][-1]][1]", (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_seq_no][10]", "[[_id][52]][0]", "[_seq_no][100]", "hi!" };
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
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[][0]", "[_seq_no][10]", "[[hi!][10]][0]", "[[][0]][10]", "[[[_index][10]][0]][52]" };
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
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_type][1]][1]", "_shard_id", "[[_index][10]][0]", "_seq_no" };
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
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean7 = dateTimeFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter2.print((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("", "[[[_index][10]][0]][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
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
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter15.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = dateTimeFormatter15.parseMutableDateTime("");
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
        org.junit.Assert.assertNull(dateTimeZone16);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter7.parseMutableDateTime("[_seq_no][10]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "[[_index][10]][32]", "_index", "[_id][1]", "hi!", "[_index][10]" };
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
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][10]", "[_type][10]", 13);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withPivotYear((int) (short) 0);
        boolean boolean15 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale16 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter24.getParser();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        java.util.Locale locale29 = dateTimeFormatter27.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter35.getParser();
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withLocale(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withZoneUTC();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter35.withLocale(locale40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter35.withZone(dateTimeZone42);
        int int44 = dateTimeFormatter35.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser45 = dateTimeFormatter35.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatter48.getParser();
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter48.withLocale(locale50);
        boolean boolean52 = dateTimeFormatter51.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter51.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter51.withZone(dateTimeZone55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeFormatter57.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter35.withZone(dateTimeZone58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter32.withZone(dateTimeZone58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter2.withZone(dateTimeZone58);
        java.lang.Appendable appendable62 = null;
        org.joda.time.ReadablePartial readablePartial63 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter61.printTo(appendable62, readablePartial63);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNull(dateTimeParser36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2000 + "'", int44 == 2000);
        org.junit.Assert.assertNull(dateTimeParser45);
        org.junit.Assert.assertNull(dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeFormatter4.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZoneUTC();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable7, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "[_index][100]", (int) (byte) 10);
        java.lang.String str4 = shardId3.getIndexName();
        org.elasticsearch.index.shard.ShardId shardId8 = new org.elasticsearch.index.shard.ShardId("_version", "[_index][100]", 10);
        boolean boolean9 = shardId3.equals((java.lang.Object) shardId8);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId8.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[][0]" + "'", str4, "[][0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
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
        java.lang.StringBuilder stringBuilder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuilder19, 1L);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][-1]", "[[_seq_no][52]][-1]", (int) ' ');
        java.lang.String str4 = shardId3.toString();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.Chronology chronology9 = dateTimeFormatter7.getChronology();
        boolean boolean10 = dateTimeFormatter7.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        boolean boolean14 = dateTimeFormatter12.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withDefaultYear(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter12.withPivotYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter12.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = shardId3.equals((java.lang.Object) dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[_seq_no][52]][-1]][32]" + "'", str4, "[[[_seq_no][52]][-1]][32]");
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        boolean boolean9 = dateTimeFormatter7.isOffsetParsed();
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_index][100]][-9]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(2000);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_version", "[_type][1]", "[_type][1]" };
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
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
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
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter9.print((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][-1]", "_id", (int) (short) -1);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter7.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone12);
        boolean boolean14 = dateTimeFormatter13.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear(10);
        java.lang.Integer int17 = dateTimeFormatter13.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = shardId3.equals((java.lang.Object) dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index4);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_index][100]", "[[hi!][0]][0]", "[_index][100]", "[][10]", "[[_id][52]][100]" };
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
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
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
        boolean boolean12 = dateTimeFormatter2.isOffsetParsed();
        int int13 = dateTimeFormatter2.getDefaultYear();
        int int14 = dateTimeFormatter2.getDefaultYear();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter2.parseLocalTime("_shard_id");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear((int) (byte) 100);
        java.lang.Integer int16 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_shard_id", "hi!", (int) (byte) 0);
        int int4 = shardId3.getId();
        int int5 = shardId3.id();
        int int6 = shardId3.id();
        java.lang.String str7 = shardId3.getIndexName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][-1]", "[_seq_no][10]", (-9));
        java.lang.String str4 = shardId3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[hi!][-1]][-9]" + "'", str4, "[[hi!][-1]][-9]");
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter14.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZone(dateTimeZone17);
        java.lang.Appendable appendable19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable19, readableInstant20);
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
        org.junit.Assert.assertNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[][0]][97]", "[_index][0]" };
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
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter14.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser16);
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter25.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser28);
        java.lang.StringBuffer stringBuffer34 = null;
        org.joda.time.ReadablePartial readablePartial35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter33.printTo(stringBuffer34, readablePartial35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeParser28);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((int) (short) 100);
        boolean boolean19 = dateTimeFormatter18.isPrinter();
        int int20 = dateTimeFormatter18.getDefaultYear();
        java.lang.Appendable appendable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(appendable21, (long) (short) 1);
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
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000 + "'", int20 == 2000);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_type][1]][35]", "_index", 52);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
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
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter7.getZone();
        boolean boolean13 = dateTimeFormatter7.isOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimeZone7);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[hi!][0]", "[_shard_id][100]", "[[hi!][0]][0]" };
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
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
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
        org.joda.time.Chronology chronology12 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withPivotYear(2000);
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer16, readablePartial17);
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
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        java.lang.Appendable appendable16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable16, readablePartial17);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 10);
        java.util.Locale locale15 = dateTimeFormatter8.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeFormatter8.parseMillis("[[_index][100]][-9]");
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
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
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
        boolean boolean12 = dateTimeFormatter9.isParser();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter9.print(readablePartial13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter13.getChronology();
        java.lang.StringBuilder stringBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuilder17, (long) (short) 1);
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
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = dateTimeFormatter17.parseLocalDate("[_id][-9]");
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
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withDefaultYear((int) (short) 10);
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter17.print(readablePartial18);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][-1]", "[[_seq_no][52]][-1]", (int) (byte) 1);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        org.elasticsearch.index.shard.ShardId shardId11 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str12 = shardId11.getIndexName();
        int int13 = shardId7.compareTo(shardId11);
        int int14 = shardId3.compareTo(shardId7);
        java.lang.String str15 = shardId3.getIndexName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[_seq_no][52]][-1]" + "'", str15, "[[_seq_no][52]][-1]");
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter9.parseDateTime("[[hi!][10]][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_id][52]][97]", "_type", "[[_index][100]][0]", "[_type][-1]", "_shard_id" };
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
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "[[_id][52]][0]", (int) (byte) -1);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZone(dateTimeZone6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter5.getPrinter();
        java.lang.Integer int9 = dateTimeFormatter5.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter5.print((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
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
        boolean boolean13 = dateTimeFormatter11.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer16, readableInstant17);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
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
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronology();
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable17, readableInstant18);
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
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'a');
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withLocale(locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter9.getZone();
        boolean boolean15 = dateTimeFormatter9.isPrinter();
        int int16 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.ReadWritableInstant readWritableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dateTimeFormatter9.parseInto(readWritableInstant17, "[[hi!][-1]][-9]", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter8.print((long) (-4));
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
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
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
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter2.getZone();
        org.joda.time.ReadWritableInstant readWritableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dateTimeFormatter2.parseInto(readWritableInstant18, "_shard_id", (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeZone17);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
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
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter10.getParser();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withPivotYear((int) (byte) 10);
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(stringBuilder18, (long) 100);
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
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_id][52]", "_version", (int) 'a');
        java.lang.String str4 = shardId3.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[_id][52]][97]" + "'", str4, "[[_id][52]][97]");
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_id][52]][100]", "[_shard_id][0]", "_version", "[[][0]][97]", "_shard_id", "[[_index][0]][2000]" };
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
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-9));
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        int int11 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        java.lang.Appendable appendable7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
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
        boolean boolean13 = dateTimeFormatter6.isPrinter();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter6.print(readablePartial14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
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
        org.joda.time.Chronology chronology21 = dateTimeFormatter17.getChronology();
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
        org.junit.Assert.assertNull(chronology21);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimePrinter17);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_seq_no][52]", "[[_index][100]][97]", "[[hi!][0]][0]", "[[_id][52]][100]", "[_seq_no][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_index][0]][-1]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "", (int) '4');
        java.lang.String str4 = shardId3.toString();
        java.lang.String str5 = shardId3.toString();
        java.lang.String str6 = shardId3.toString();
        int int7 = shardId3.id();
        org.elasticsearch.index.shard.ShardId shardId11 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str12 = shardId11.toString();
        java.lang.String str13 = shardId11.toString();
        int int14 = shardId11.id();
        int int15 = shardId3.compareTo(shardId11);
        int int16 = shardId11.getId();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId11.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_seq_no][52]" + "'", str4, "[_seq_no][52]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_seq_no][52]" + "'", str5, "[_seq_no][52]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[_seq_no][52]" + "'", str6, "[_seq_no][52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[][0]" + "'", str12, "[][0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[][0]" + "'", str13, "[][0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_seq_no][52]][-1]", "[_index][10]", "[_shard_id][100]", "[[_index][100]][10]", "[hi!][-1]" };
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
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][32]", "[_seq_no][100]", 6);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_index][10]][0]", "[[hi!][10]][0]", "", "", "[hi!][-1]" };
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
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
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
        org.joda.time.Chronology chronology13 = dateTimeFormatter7.getChronology();
        java.io.Writer writer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer14, readableInstant15);
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
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][10]", "[[_index][0]][2000]", 11);
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
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = dateTimeFormatter15.parseLocalTime("[_id][1]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter1.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withDefaultYear(52);
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = dateTimeFormatter4.parseLocalDate("[[_type][1]][1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[[_type][1]][1]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[][0]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_id][52]", "[[[_index][100]][97]][100]", "[[_seq_no][52]][0]" };
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
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology14 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 35);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer17, readableInstant18);
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
        org.junit.Assert.assertNull(dateTimePrinter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print((long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
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
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable14, (long) 10);
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
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
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
        int int18 = dateTimeFormatter15.getDefaultYear();
        boolean boolean19 = dateTimeFormatter15.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTimeFormatter30.getChronolgy();
        java.util.Locale locale32 = dateTimeFormatter30.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatter38.getParser();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withLocale(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter38.withZoneUTC();
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter38.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter38.withZone(dateTimeZone45);
        int int47 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser48 = dateTimeFormatter38.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = null;
        org.joda.time.format.DateTimeParser dateTimeParser50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser50);
        org.joda.time.format.DateTimeParser dateTimeParser52 = dateTimeFormatter51.getParser();
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter51.withLocale(locale53);
        boolean boolean55 = dateTimeFormatter54.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter54.withZone(dateTimeZone58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter54.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeFormatter60.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter38.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter35.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter15.withZone(dateTimeZone61);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime66 = dateTimeFormatter64.parseMutableDateTime("[[[_seq_no][52]][100]][97]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(chronology31);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2000 + "'", int47 == 2000);
        org.junit.Assert.assertNull(dateTimeParser48);
        org.junit.Assert.assertNull(dateTimeParser52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_id][52]", "[[[_seq_no][52]][-1]][32]" };
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
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
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
        org.joda.time.ReadWritableInstant readWritableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeFormatter14.parseInto(readWritableInstant15, "[[_index][100]][-9]", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
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
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        boolean boolean16 = dateTimeFormatter14.isParser();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer17, readablePartial18);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
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
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter7.getZone();
        java.lang.Appendable appendable15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable15, readableInstant16);
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
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNull(dateTimeZone14);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 1);
        java.lang.StringBuilder stringBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuilder9, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        boolean boolean12 = dateTimeFormatter10.isPrinter();
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer13, readableInstant14);
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
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter14.parseLocalTime("[_seq_no][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[][0]][10]", "[_type][-1]", "[[_index][10]][0]", "[[[_index][100]][97]][100]", "[[hi!][-1]][-9]" };
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
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_id][52]][100]", "[[_id][52]][97]", "[[[_index][10]][0]][52]" };
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
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "[_seq_no][52]", (int) ' ');
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear(1);
        java.lang.Appendable appendable15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable15, readableInstant16);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
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
        boolean boolean16 = dateTimeFormatter7.isOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronolgy();
        int int10 = dateTimeFormatter8.getDefaultYear();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][100]", "[_id][1]", 35);
        java.lang.String str4 = shardId3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[][100]][35]" + "'", str4, "[[][100]][35]");
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) '#');
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter12.withZone(dateTimeZone84);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime89 = dateTimeFormatter12.parseLocalDateTime("[[_type][-1]][0]");
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
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_type][-1]][0]", "[[_index][10]][35]", "[[_index][10]][0]", "[hi!][10]" };
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
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_index][10]", "[[[_index][100]][97]][100]", "[[hi!][-1]][-9]", "_version", "[[_index][100]][97]", "[[[_seq_no][52]][-1]][32]" };
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
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "[_id][52]", (int) (short) 100);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZoneUTC();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withLocale(locale14);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZone(dateTimeZone18);
        boolean boolean20 = dateTimeFormatter17.isPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter23.getParser();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withZoneUTC();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withLocale(locale28);
        boolean boolean30 = dateTimeFormatter23.isParser();
        java.util.Locale locale31 = dateTimeFormatter23.getLocale();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter23.withLocale(locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.Chronology chronology35 = dateTimeFormatter23.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatter38.getParser();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withLocale(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter43.getParser();
        org.joda.time.Chronology chronology45 = dateTimeFormatter43.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatter48.getParser();
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter48.withLocale(locale50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withZoneUTC();
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter48.withLocale(locale53);
        int int55 = dateTimeFormatter48.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser57 = dateTimeFormatter48.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter58 = null;
        org.joda.time.format.DateTimeParser dateTimeParser59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter58, dateTimeParser59);
        org.joda.time.format.DateTimeParser dateTimeParser61 = dateTimeFormatter60.getParser();
        java.util.Locale locale62 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter60.withLocale(locale62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter60.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeFormatter60.getZone();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter60.withZone(dateTimeZone66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter60.withChronology(chronology68);
        org.joda.time.Chronology chronology70 = dateTimeFormatter60.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter71 = null;
        org.joda.time.format.DateTimeParser dateTimeParser72 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter71, dateTimeParser72);
        org.joda.time.format.DateTimeParser dateTimeParser74 = dateTimeFormatter73.getParser();
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter73.withLocale(locale75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter73.withZoneUTC();
        java.util.Locale locale78 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter77.withLocale(locale78);
        java.util.Locale locale80 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter77.withLocale(locale80);
        java.util.Locale locale82 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter81.withLocale(locale82);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter83.withZone(dateTimeZone84);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter83.withChronology(chronology86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter87.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone89 = dateTimeFormatter88.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter90 = dateTimeFormatter60.withZone(dateTimeZone89);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter48.withZone(dateTimeZone89);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter92 = dateTimeFormatter43.withZone(dateTimeZone89);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter93 = dateTimeFormatter23.withZone(dateTimeZone89);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter17.withZone(dateTimeZone89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = shardId3.equals((java.lang.Object) dateTimeFormatter17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index4);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(chronology35);
        org.junit.Assert.assertNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNull(dateTimeParser44);
        org.junit.Assert.assertNull(chronology45);
        org.junit.Assert.assertNull(dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2000 + "'", int55 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNull(dateTimeParser57);
        org.junit.Assert.assertNull(dateTimeParser61);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNull(chronology70);
        org.junit.Assert.assertNull(dateTimeParser74);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(dateTimeFormatter88);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertNotNull(dateTimeFormatter90);
        org.junit.Assert.assertNotNull(dateTimeFormatter91);
        org.junit.Assert.assertNotNull(dateTimeFormatter92);
        org.junit.Assert.assertNotNull(dateTimeFormatter93);
        org.junit.Assert.assertNotNull(dateTimeFormatter94);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "[][10]", (-13));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[hi!][10]", "[[[_seq_no][52]][-1]][1]", "_type", "[[_seq_no][52]][100]", "[_seq_no][52]", "[_id][-9]" };
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
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
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
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = dateTimeFormatter14.parseMutableDateTime("[[_index][10]][32]");
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
        org.junit.Assert.assertNull(chronology15);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[hi!][-1]][-9]", "[_index][100]", "[[_type][-1]][0]" };
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
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_seq_no][10]", "_id" };
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
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "[[][0]][97]", "[][10]", "[_id][52]", "[_id][52]", "[_type][-1]" };
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
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
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
            org.joda.time.DateTime dateTime28 = dateTimeFormatter2.parseDateTime("[hi!][0]");
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
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
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
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(stringBuffer21, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeParser11);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withOffsetParsed();
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
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter11.parseLocalDateTime("[[hi!][-1]][-9]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
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
        int int13 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter12.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withDefaultYear(10);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(writer17, (long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
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
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, readablePartial14);
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
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
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
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, (long) (-13));
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
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[[_index][100]][97]][32]", "[_shard_id][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear((int) (short) 1);
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable17, readablePartial18);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
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
        java.lang.Class<?> wildcardClass10 = dateTimeFormatter6.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_index][100]][0]][-1]", "_shard_id" };
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
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[_id][-9]", "[[_index][10]][0]", "[[_id][52]][0]" };
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
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[hi!][-1]][-9]", "[[_type][1]][35]" };
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
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
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
        java.lang.Class<?> wildcardClass14 = dateTimeFormatter13.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[hi!][-1]", "[[_index][100]][10]", "[[_type][1]][0]", "[][0]", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter12.print(readableInstant14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "hi!", (-1));
        java.lang.String str4 = shardId3.getIndexName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_index][100]][97]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
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
        int int13 = dateTimeFormatter12.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter12.parseMutableDateTime("[][0]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(1);
        int int9 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-8));
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][100]][97]", "[[hi!][10]][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("_index", "[[hi!][0]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[][10]", "[[_index][100]][97]" };
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
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_id][52]", "[][0]", 52);
        int int4 = shardId3.id();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[][0]", "_seq_no", "[[][0]][10]", "[[[_seq_no][52]][-1]][32]" };
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
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
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
        org.joda.time.Chronology chronology13 = dateTimeFormatter7.getChronology();
        java.lang.StringBuilder stringBuilder14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder14, readableInstant15);
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
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_index][10]][1]", "[_id][1]", "[[_index][100]][97]", "_index", "[[hi!][0]][0]" };
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
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
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
        boolean boolean11 = dateTimeFormatter10.isOffsetParsed();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer12, readablePartial13);
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
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "[[_index][100]][97]", "[[_index][10]][35]", "[[_index][10]][35]", "[[[_seq_no][52]][100]][1]", "[[][0]][97]" };
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
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
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
        boolean boolean12 = dateTimeFormatter11.isPrinter();
        java.lang.StringBuilder stringBuilder13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuilder13, readableInstant14);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "", (int) '4');
        int int4 = shardId3.getId();
        java.lang.String str5 = shardId3.getIndexName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) (-1));
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
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTimeFormatter19.parseDateTime("[_type][-1]");
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
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "[[[_seq_no][52]][100]][1]", "[_type][1]", "[[_id][52]][97]", "[_index][0]" };
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
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
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
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter7.print(readablePartial11);
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
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_index][10]][0]][52]", "[[[_index][100]][97]][32]", (int) (short) -1);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        boolean boolean9 = dateTimeFormatter7.isPrinter();
        boolean boolean10 = dateTimeFormatter7.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter7.parseLocalTime("[[[_seq_no][52]][-1]][1]");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[_id][-9]", "_type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_id][52]][0]", "[[_id][52]][97]", "_shard_id", "[[[_index][100]][0]][-1]", "[[_index][0]][-1]", "[[_seq_no][52]][-1]" };
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
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "[_seq_no][52]", (int) (byte) 10);
        int int4 = shardId3.id();
        int int5 = shardId3.id();
        java.lang.Class<?> wildcardClass6 = shardId3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
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
        int int13 = dateTimeFormatter12.getDefaultYear();
        boolean boolean14 = dateTimeFormatter12.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = dateTimeFormatter12.parseLocalDate("_index");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_id][1]", "", (-9));
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[[_index][100]][97]][100]", "[[hi!][-1]][-9]" };
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
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
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
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = dateTimeFormatter7.parseMutableDateTime("[_type][-1]");
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
        org.junit.Assert.assertNull(dateTimeZone14);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        boolean boolean14 = dateTimeFormatter12.isOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser25);
        int int49 = dateTimeFormatter48.getDefaultYear();
        java.io.Writer writer50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter48.printTo(writer50, readableInstant51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2000 + "'", int49 == 2000);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
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
        java.util.Locale locale18 = dateTimeFormatter13.getLocale();
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
        org.junit.Assert.assertNull(locale18);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[hi!][10]", "[[_type][1]][0]", 97);
        java.lang.String str4 = shardId3.getIndexName();
        java.lang.String str5 = shardId3.getIndexName();
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
        boolean boolean18 = dateTimeFormatter11.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter11.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter11.withOffsetParsed();
        boolean boolean22 = dateTimeFormatter21.isParser();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = shardId3.equals((java.lang.Object) dateTimeFormatter21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!][10]" + "'", str4, "[hi!][10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!][10]" + "'", str5, "[hi!][10]");
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_index][100]", "[][0]" };
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
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter7.getZone();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale9 = dateTimeFormatter8.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-9));
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
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = dateTimeFormatter9.parseLocalTime("_version");
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
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
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
        java.io.Writer writer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(writer17, readablePartial18);
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
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][97]", "[[_type][1]][35]", (int) (byte) 100);
        java.lang.String str4 = shardId3.toString();
        int int5 = shardId3.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[_index][100]][97]][100]" + "'", str4, "[[[_index][100]][97]][100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_type][-1]", "[_id][1]", 100);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_type", "hi!", (int) (short) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withLocale(locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter6.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withPivotYear((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter12.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter12.withPivotYear(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withChronology(chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter22.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((int) (byte) 0);
        org.joda.time.Chronology chronology26 = dateTimeFormatter22.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = shardId3.equals((java.lang.Object) dateTimeFormatter22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNull(chronology26);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
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
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, (long) ' ');
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
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][0]][-1]", "[[_seq_no][52]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[hi!][10]][0]", "[[_index][100]][-9]", 2000);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[][0]][10]", "_version", (-1));
        int int4 = shardId3.getId();
        java.lang.Class<?> wildcardClass5 = shardId3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[[_index][100]][97]][32]", "hi!", "[_seq_no][52]", "[[[_index][100]][97]][100]" };
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
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[_shard_id][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withPivotYear((java.lang.Integer) (-9));
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withDefaultYear((-13));
        java.lang.Appendable appendable21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(appendable21, readableInstant22);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZone(dateTimeZone10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable14, readablePartial15);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_type][-1]", "[[_seq_no][52]][-1]", (int) (byte) 0);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter14.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZone(dateTimeZone17);
        java.lang.StringBuilder stringBuilder19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(stringBuilder19, readablePartial20);
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
        org.junit.Assert.assertNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_id][-9]", "[[_type][1]][35]", (int) (short) 10);
        java.lang.String str4 = shardId3.getIndexName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_id][-9]" + "'", str4, "[_id][-9]");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "[[][0]][97]" };
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
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withPivotYear(0);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer15, 0L);
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
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter2.print((long) (short) 10);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "[[_index][100]][0]", 32);
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
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[hi!][-1]][-9]", "[[[_index][100]][97]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 1);
        java.lang.StringBuilder stringBuilder16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder16, readablePartial17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withOffsetParsed();
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter21.printTo(stringBuffer22, readableInstant23);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_shard_id][0]", "[_seq_no][52]", (int) 'a');
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        boolean boolean8 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronology();
        boolean boolean14 = dateTimeFormatter11.isParser();
        org.joda.time.Chronology chronology15 = dateTimeFormatter11.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withDefaultYear((int) (short) 0);
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter11.withLocale(locale18);
        boolean boolean20 = dateTimeFormatter11.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter22.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withZoneUTC();
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter22.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withZone(dateTimeZone43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime47 = dateTimeFormatter45.parseLocalTime("[[[_index][10]][0]][52]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
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
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter4.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser7);
        java.lang.Class<?> wildcardClass10 = dateTimeParser7.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        boolean boolean8 = dateTimeFormatter2.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
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
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter10.parseInto(readWritableInstant11, "", 0);
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
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[hi!][-1]][-9]", "[[][0]][97]", "[_shard_id][0]", "[[_type][-1]][0]", "[[_index][0]][-1]", "_id" };
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
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[_index][10]][32]", "[[_index][10]][0]", "[_type][1]", "[[hi!][10]][0]", "[[hi!][0]][0]" };
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
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_shard_id", "[_index][100]", (int) (short) 100);
        java.lang.String str4 = shardId3.getIndexName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[][10]", "[[_index][10]][35]", "[[_index][100]][-9]", "[_id][1]", "", "[_type][10]" };
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
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
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
        boolean boolean71 = dateTimeFormatter70.isParser();
        java.util.Locale locale72 = dateTimeFormatter70.getLocale();
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(locale72);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[[_seq_no][52]][-1]][1]", "_seq_no", "[[[_type][1]][35]][100]" };
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
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_index][100]][0]", "[][100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-9));
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter12.print(readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear(52);
        boolean boolean15 = dateTimeFormatter12.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = dateTimeFormatter12.parseMutableDateTime("[[hi!][-1]][-9]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "[_id][52]", "[[[_index][10]][0]][52]", "hi!" };
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
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear(52);
        boolean boolean15 = dateTimeFormatter12.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withPivotYear((int) '#');
        boolean boolean18 = dateTimeFormatter12.isParser();
        java.io.Writer writer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer19, readablePartial20);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
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
        java.lang.Integer int14 = dateTimeFormatter12.getPivotYear();
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder15, readableInstant16);
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
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter5.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter5.parseMillis("[][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "_seq_no", (int) (short) 10);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "_type", (int) (short) 0);
        int int8 = shardId3.compareTo(shardId7);
        org.elasticsearch.action.DocWriteResponse.Fields fields9 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str10 = fields9.get_INDEX();
        java.lang.String str11 = fields9.get_SHARD_ID();
        java.lang.String str12 = fields9.get_SHARD_ID();
        java.lang.String str13 = fields9.get_SHARD_ID();
        java.lang.String str14 = fields9.get_TYPE();
        java.lang.String str15 = fields9.get_INDEX();
        java.lang.String str16 = fields9.get_ID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = shardId7.equals((java.lang.Object) str16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[][0]][97]", "[[_index][100]][-9]" };
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
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[[_index][100]][97]][32]", "[[_type][-1]][0]", "[[_id][52]][0]", "[[_index][0]][-1]" };
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
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("hi!", "_version", (int) (byte) 10);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("_index", "hi!", (int) (short) 100);
        int int8 = shardId3.compareTo(shardId7);
        int int9 = shardId7.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId7.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter7.print((long) (byte) 100);
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
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
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
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, readablePartial14);
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
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZone(dateTimeZone6);
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((int) (short) 1);
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 35);
        org.joda.time.Chronology chronology11 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 52);
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
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
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
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable17, (long) (-13));
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
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((java.lang.Integer) (-8));
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 6);
        java.lang.StringBuilder stringBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder20, (long) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[_index][10]][32]", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((-1));
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter9.parseMillis("[[[_index][100]][97]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 6);
        org.joda.time.Chronology chronology10 = dateTimeFormatter7.getChronolgy();
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[][100]", "[[_index][10]][32]", "[[[_seq_no][52]][100]][1]", "[_index][0]", "[hi!][10]" };
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
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][10]", "_shard_id", (int) (short) 10);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_type", "_shard_id", (int) (short) -1);
        java.lang.String str4 = shardId3.getIndexName();
        java.lang.String str5 = shardId3.toString();
        java.lang.String str6 = shardId3.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            shardId3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_type][-1]" + "'", str5, "[_type][-1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[_type][-1]" + "'", str6, "[_type][-1]");
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) (short) 10);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter12.print((-1L));
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter10.print(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
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
        java.util.Locale locale16 = dateTimeFormatter7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTimeFormatter7.parseDateTime("[[[_id][52]][0]][-8]");
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
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 10);
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, readablePartial15);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withLocale(locale13);
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder15, readablePartial16);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][100]", "[_id][1]", 0);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[[_seq_no][52]][100]][1]", "[[_type][1]][1]", "[_type][-1]", "[_shard_id][0]" };
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
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[[_index][100]][97]][32]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter2.getParser();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        org.joda.time.ReadWritableInstant readWritableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter2.parseInto(readWritableInstant13, "[[_seq_no][52]][100]", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter2.parseLocalDate("[[_index][100]][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.ReadWritableInstant readWritableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTimeFormatter2.parseInto(readWritableInstant7, "[[_index][10]][1]", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
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
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withChronology(chronology13);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter14.getPrinter();
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
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter1.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser3);
        boolean boolean5 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter4.print(readableInstant6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[_index][0]][-1]", "[[_index][100]][97]", "[[][0]][10]", "hi!", "[[[_index][100]][0]][-1]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = dateTimeFormatter2.parseLocalDate("[[[_index][100]][0]][-1]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_type", (int) (short) 0);
        java.lang.String str4 = shardId3.getIndexName();
        java.lang.String str5 = shardId3.getIndexName();
        org.elasticsearch.index.shard.ShardId shardId9 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str10 = shardId9.toString();
        org.elasticsearch.index.shard.ShardId shardId14 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        int int15 = shardId14.id();
        int int16 = shardId9.compareTo(shardId14);
        java.lang.String str17 = shardId14.getIndexName();
        int int18 = shardId3.compareTo(shardId14);
        int int19 = shardId3.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_seq_no][52]" + "'", str4, "[_seq_no][52]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_seq_no][52]" + "'", str5, "[_seq_no][52]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[][0]" + "'", str10, "[][0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_index][0]][2000]", "[hi!][0]", "[[_type][1]][0]" };
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
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_id][1]", "[[_index][10]][35]", "[_type][10]", "[_type][10]", "[[hi!][-1]][-9]", "_id" };
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
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][32]", "[[_index][10]][1]", 4);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear((-9));
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
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter12.parseMutableDateTime("[[_seq_no][52]][0]");
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
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter10.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser12);
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter21.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser24);
        java.lang.Class<?> wildcardClass26 = dateTimeFormatter25.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
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
        boolean boolean15 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology16 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter2.print((long) 35);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[hi!][10]][52]", "[[][0]][97]", 13);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
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
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withLocale(locale12);
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
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
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        boolean boolean17 = dateTimeFormatter15.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = dateTimeFormatter15.parseMutableDateTime("[[_type][1]][0]");
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
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withDefaultYear(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTimeFormatter14.parseDateTime("[[_index][10]][0]");
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
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_index][10]][1]", "[[[_seq_no][52]][100]][97]", "[hi!][0]" };
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
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[hi!][10]][0]" };
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
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
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
        int int13 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter12.getPrinter();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter12.print(readablePartial15);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][100]][0]", "[[_index][100]][97]", (int) 'a');
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.Chronology chronology8 = dateTimeFormatter6.getChronology();
        boolean boolean9 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter6.withLocale(locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withZone(dateTimeZone14);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter13.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = shardId3.equals((java.lang.Object) dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimePrinter16);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_index][100]][97]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "[_seq_no][52]", 2000);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("_id", "_index", (-9));
        int int8 = shardId3.compareTo(shardId7);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 0);
        int int16 = dateTimeFormatter11.getDefaultYear();
        boolean boolean17 = dateTimeFormatter11.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = shardId7.equals((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = dateTimeFormatter28.parseLocalTime("[_type][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[_type][-1]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeParser15);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter12.parseLocalTime("[][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer11, readablePartial12);
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
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_index][100]", "[_index][10]", "[hi!][0]", "[[_index][100]][-9]", "[[hi!][10]][52]", "[_shard_id][0]" };
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
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'a');
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withLocale(locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter9.getZone();
        boolean boolean15 = dateTimeFormatter9.isPrinter();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer16, (long) 10);
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
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[_index][100]", "[[_index][100]][-9]", "[[_id][52]][97]", "[_index][100]", "[[[_index][10]][0]][52]", "[_type][10]" };
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
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
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
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        java.lang.Class<?> wildcardClass13 = dateTimeZone12.getClass();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "[[_id][52]][100]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter5.print((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear((int) (short) 1);
        java.io.Writer writer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer15, readablePartial16);
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
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter12.parseMutableDateTime("[[[_index][100]][97]][32]");
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
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZone(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter5.parseLocalTime("_index");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[_index][100]][97]", "[[[_index][100]][97]][32]" };
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
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter8.print(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_seq_no][52]][100]", "hi!", (int) (short) -1);
        int int4 = shardId3.id();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[[_index][10]][0]][52]", "[_index][10]", "[_seq_no][10]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withPivotYear((int) (short) 100);
        java.io.Writer writer20 = null;
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter19.printTo(writer20, readablePartial21);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "[[_seq_no][52]][0]", 0);
        int int4 = shardId3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_index][10]][35]", "[[[_index][100]][97]][100]", "[[_id][52]][97]" };
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
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_index][100]][97]][100]", "[_shard_id][100]", 100);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withChronology(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = dateTimeFormatter9.parseLocalDate("[[_index][0]][-1]");
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
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
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
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withChronology(chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter10.print(readableInstant15);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
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
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withChronology(chronology10);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
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
        java.util.Locale locale12 = dateTimeFormatter11.getLocale();
        java.util.Locale locale13 = dateTimeFormatter11.getLocale();
        java.lang.Integer int14 = dateTimeFormatter11.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter11.parseLocalTime("[[_id][52]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[_seq_no][100]", "[[_seq_no][52]][-1]", "[[[_seq_no][52]][-1]][1]" };
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
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[_index][0]", "[[_type][-1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_index][10]][0]][52]" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SEQ_NO();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_seq_no" + "'", str1, "_seq_no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
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
        java.lang.StringBuilder stringBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder13, (long) 6);
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
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[_id][52]", "[[[_index][100]][97]][100]", "[[hi!][0]][0]", "[][10]" };
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
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_type][1]][1]", "[[][100]][35]", (int) (byte) 1);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = dateTimeFormatter9.print(0L);
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
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter7.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "", 97);
        java.lang.Object obj4 = null;
        boolean boolean5 = shardId3.equals(obj4);
        java.lang.String str6 = shardId3.getIndexName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[_seq_no][52]" + "'", str6, "[_seq_no][52]");
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
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
        org.joda.time.ReadWritableInstant readWritableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dateTimeFormatter13.parseInto(readWritableInstant16, "[[[_seq_no][52]][-1]][1]", (int) (short) 1);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "[_type][-1]", 1);
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
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-9));
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter12.parseLocalTime("[[[_id][52]][0]][-8]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][1]", "[_type][10]", 10);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_id][52]][100]", "[[][0]][97]" };
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
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter14.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZone(dateTimeZone17);
        java.io.Writer writer19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(writer19, readableInstant20);
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
        org.junit.Assert.assertNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
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
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter13.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = dateTimeFormatter13.parseLocalTime("[[_index][100]][97]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeZone16);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_id][52]][97]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withLocale(locale8);
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        int int11 = dateTimeFormatter7.getDefaultYear();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer12, readablePartial13);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(1);
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withDefaultYear((int) (short) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withChronology(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter11.getZone();
        java.lang.StringBuilder stringBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuilder15, (long) (-1));
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeZone14);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter7.parseLocalTime("[][10]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer14, (long) 11);
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
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "[[[_index][10]][0]][52]", "[[[_seq_no][52]][-1]][32]", "[[_index][10]][32]", "[[][0]][97]" };
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
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
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
        java.io.Writer writer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter38.printTo(writer39, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeParser20);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
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
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withChronology(chronology15);
        java.lang.StringBuilder stringBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuilder17, (long) 11);
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
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, readableInstant6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_index][10]", "[_index][100]", "[[[_index][100]][97]][100]", "[_seq_no][100]", "[[_index][0]][-1]", "[][10]" };
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
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
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
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = dateTimeFormatter16.parseLocalTime("[_type][10]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[_type][1]][35]", "[[[_seq_no][52]][100]][1]", "[hi!][-1]" };
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
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_type][-1]", "[[_type][1]][1]", "[[_id][52]][100]", "[_seq_no][10]", "[[_type][1]][1]", "[[_type][1]][1]" };
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
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
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
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer13, (long) (short) 1);
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
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
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
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter13.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = dateTimeParser14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(dateTimeParser14);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str4 = shardId3.toString();
        java.lang.String str5 = shardId3.toString();
        java.lang.String str6 = shardId3.toString();
        org.elasticsearch.index.Index index7 = shardId3.getIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[][0]" + "'", str4, "[][0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[][0]" + "'", str5, "[][0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[][0]" + "'", str6, "[][0]");
        org.junit.Assert.assertNotNull(index7);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_seq_no][52]][-1]][32]", "[[_index][100]][10]", "[][0]", "[[_index][100]][0]", "[[hi!][-1]][-9]" };
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
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = mapParams1.paramAsBoolean("[[[_seq_no][52]][100]][1]", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withDefaultYear((int) (short) 100);
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(stringBuilder18, (long) (short) 0);
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
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-9));
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter10.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
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
        java.lang.StringBuilder stringBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuilder20, (long) (short) 0);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = dateTimeFormatter16.parseLocalDateTime("[[_index][100]][-9]");
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
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[[hi!][10]][0]", "[hi!][-1]", "[hi!][10]" };
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
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[[_seq_no][52]][-1]][32]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(1);
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withDefaultYear((int) (short) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withChronology(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter11.getZone();
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuilder15, readableInstant16);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeZone14);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter11.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_type][1]][35]][100]", "[_type][-1]", 32);
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
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[_index][100]][0]", "[[_type][1]][0]" };
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
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][10]", "[_index][10]", (int) (short) -1);
        java.lang.String str4 = shardId3.getIndexName();
        java.lang.String str5 = shardId3.getIndexName();
        org.elasticsearch.index.shard.ShardId shardId9 = new org.elasticsearch.index.shard.ShardId("[[_type][1]][35]", "[_seq_no][52]", (int) (byte) 100);
        org.elasticsearch.index.shard.ShardId shardId13 = new org.elasticsearch.index.shard.ShardId("[_type][1]", "_id", (int) (short) 1);
        int int14 = shardId9.compareTo(shardId13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = shardId3.equals((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_index][10]" + "'", str4, "[_index][10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_index][10]" + "'", str5, "[_index][10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[][100]][35]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_shard_id", "[[_index][100]][-9]", (-1));
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter14.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser16);
        org.joda.time.format.DateTimeParser dateTimeParser27 = dateTimeFormatter26.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser27);
        java.lang.Appendable appendable32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter31.printTo(appendable32, readableInstant33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeParser27);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withPivotYear(97);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer17, readableInstant18);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withChronology(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = dateTimeFormatter13.parseLocalTime("[_shard_id][100]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
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
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withChronology(chronology13);
        java.io.Writer writer15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer15, readableInstant16);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer14, (long) (-4));
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
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear(1);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer17, readableInstant18);
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
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) '#');
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer9, readableInstant10);
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
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[[_id][52]][97]", "[_type][-1]", "[[_type][1]][0]", "", "[[][0]][10]", "_id" };
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
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
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
        org.joda.time.ReadableInstant readableInstant43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateTimeFormatter40.print(readableInstant43);
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
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter2.getPrinter();
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
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimePrinter10);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
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
        java.util.Locale locale19 = dateTimeFormatter18.getLocale();
        boolean boolean20 = dateTimeFormatter18.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[[_index][100]][0]][-1]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        org.joda.time.Chronology chronology10 = dateTimeFormatter7.getChronology();
        boolean boolean11 = dateTimeFormatter7.isParser();
        org.joda.time.Chronology chronology12 = dateTimeFormatter7.getChronolgy();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "[[[_index][10]][0]][52]", "[[_id][52]][0]", "[[hi!][10]][0]" };
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
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][0]", "_type", 97);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_type][1]][1]", "_version");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mapParams1.paramAsBoolean("[[_index][0]][-1]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "[_id][1]", "[_id][1]", "[[_type][1]][0]", "[_id][1]", "[[_index][10]][35]", "hi!" };
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
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
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
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withLocale(locale12);
        int int14 = dateTimeFormatter13.getDefaultYear();
        boolean boolean15 = dateTimeFormatter13.isPrinter();
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuffer16, readableInstant17);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
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
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer13, readableInstant14);
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
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
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
        java.lang.StringBuilder stringBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuilder14, (long) 97);
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
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 10);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) (short) 0);
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = dateTimeFormatter17.parseLocalDate("[_type][-1]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
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
        int int28 = dateTimeFormatter27.getDefaultYear();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2000 + "'", int28 == 2000);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[[[_index][100]][0]][-1]", "[[[_index][100]][0]][-1]", "[[][0]][10]", "_id" };
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
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "[[[_index][100]][0]][-1]", "[][100]", "_id", "[[_index][0]][2000]", "[[_type][1]][0]" };
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
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
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
        boolean boolean13 = dateTimeFormatter2.isPrinter();
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable14, 0L);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
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
        int int10 = dateTimeFormatter5.getDefaultYear();
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable11, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 6);
        java.lang.StringBuilder stringBuilder21 = null;
        org.joda.time.ReadablePartial readablePartial22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuilder21, readablePartial22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'a');
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withLocale(locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter9.getZone();
        boolean boolean15 = dateTimeFormatter9.isPrinter();
        int int16 = dateTimeFormatter9.getDefaultYear();
        java.lang.StringBuilder stringBuilder17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuilder17, readablePartial18);
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
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter6.print(readableInstant9);
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
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("[[_id][52]][97]", "[[_type][-1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear(2000);
        boolean boolean13 = dateTimeFormatter10.isPrinter();
        boolean boolean14 = dateTimeFormatter10.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter15.getPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimePrinter16);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "[][0]", (-9));
        java.lang.String str4 = shardId3.toString();
        org.elasticsearch.index.Index index5 = shardId3.getIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[_index][100]][-9]" + "'", str4, "[[_index][100]][-9]");
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[hi!][10]][52]", "[[][100]][35]" };
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
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][100]", "[[_seq_no][52]][100]", 6);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_version", "[[_index][100]][97]", "[[_type][1]][35]", "[[_id][52]][100]", "[[_index][10]][1]", "_seq_no" };
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
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter20.getParser();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter20.getZone();
        org.joda.time.Chronology chronology25 = dateTimeFormatter20.getChronology();
        boolean boolean26 = dateTimeFormatter20.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter29.getParser();
        org.joda.time.Chronology chronology31 = dateTimeFormatter29.getChronology();
        boolean boolean32 = dateTimeFormatter29.isParser();
        org.joda.time.Chronology chronology33 = dateTimeFormatter29.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter29.withDefaultYear((int) (short) 0);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter29.withLocale(locale36);
        boolean boolean38 = dateTimeFormatter29.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.format.DateTimeParser dateTimeParser46 = dateTimeFormatter45.getParser();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter45.withLocale(locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter45.withZoneUTC();
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter49.withLocale(locale50);
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter49.withLocale(locale52);
        java.util.Locale locale54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter53.withLocale(locale54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter55.withZone(dateTimeZone56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter55.withChronology(chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter59.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeFormatter60.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter40.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter20.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter12.withZone(dateTimeZone61);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime66 = dateTimeFormatter12.parseDateTime("[_id][-9]");
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
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(dateTimeZone24);
        org.junit.Assert.assertNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dateTimeParser30);
        org.junit.Assert.assertNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNull(dateTimeParser46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
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
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter11.parseInto(readWritableInstant12, "[[_seq_no][52]][-1]", (int) (short) -1);
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
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withDefaultYear(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withPivotYear((-1));
        boolean boolean15 = dateTimeFormatter14.isOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dateTimeFormatter14.parseInto(readWritableInstant16, "[[][0]][97]", (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(1);
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withDefaultYear((int) (short) 100);
        java.lang.StringBuilder stringBuilder12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuilder12, readablePartial13);
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
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(10);
        boolean boolean7 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 6);
        java.lang.StringBuilder stringBuilder10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuilder10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_seq_no", "_version", 100);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[_seq_no][52]", "_index", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId11 = new org.elasticsearch.index.shard.ShardId("", "", (int) (short) 0);
        java.lang.String str12 = shardId11.getIndexName();
        int int13 = shardId7.compareTo(shardId11);
        org.elasticsearch.index.shard.ShardId shardId17 = new org.elasticsearch.index.shard.ShardId("_index", "", (int) (short) 100);
        int int18 = shardId7.compareTo(shardId17);
        java.lang.String str19 = shardId17.getIndexName();
        int int20 = shardId3.compareTo(shardId17);
        java.lang.String str21 = shardId3.toString();
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = shardId3.compareTo(shardId22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_index" + "'", str19, "_index");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[_seq_no][100]" + "'", str21, "[_seq_no][100]");
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '#');
        int int9 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = dateTimeFormatter2.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[[_seq_no][52]][-1]][32]", "[[_type][1]][1]", 1);
        org.elasticsearch.index.Index index4 = shardId3.getIndex();
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[_index][0]][2000]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter2.isPrinter();
        java.lang.Integer int9 = dateTimeFormatter2.getPivotYear();
        int int10 = dateTimeFormatter2.getDefaultYear();
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
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_index", "_seq_no", (int) (short) 10);
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("[_index][100]", "_type", (int) (short) 0);
        int int8 = shardId3.compareTo(shardId7);
        java.lang.String str9 = shardId7.toString();
        java.lang.String str10 = shardId7.toString();
        int int11 = shardId7.getId();
        org.elasticsearch.index.shard.ShardId shardId15 = new org.elasticsearch.index.shard.ShardId("[[_id][52]][100]", "_id", 0);
        int int16 = shardId15.id();
        int int17 = shardId7.compareTo(shardId15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[_index][100]][0]" + "'", str9, "[[_index][100]][0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[_index][100]][0]" + "'", str10, "[[_index][100]][0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
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
        java.util.Locale locale13 = dateTimeFormatter2.getLocale();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = dateTimeFormatter2.parseLocalDate("_version");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeZone16);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
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
        boolean boolean11 = dateTimeFormatter9.isParser();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer12, readablePartial13);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[_index][0]][-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
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
        boolean boolean14 = dateTimeFormatter7.isOffsetParsed();
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuilder15, readablePartial16);
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
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isParser();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        java.lang.Integer int8 = dateTimeFormatter7.getPivotYear();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
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
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuffer16, (long) (byte) 1);
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
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
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
        boolean boolean17 = dateTimeFormatter13.isOffsetParsed();
        int int18 = dateTimeFormatter13.getDefaultYear();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
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
        java.lang.StringBuffer stringBuffer69 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer69, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("", "_index", (int) (short) 0);
        java.lang.String str4 = shardId3.toString();
        org.elasticsearch.index.Index index5 = shardId3.getIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[][0]" + "'", str4, "[][0]");
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withChronology(chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = dateTimeFormatter12.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_index][0]", "_index", 6);
        java.lang.String str4 = shardId3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[_index][0]][6]" + "'", str4, "[[_index][0]][6]");
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) ' ');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (byte) -1);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer11, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }
}

