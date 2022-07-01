import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withLocale(locale2);
        java.lang.String str5 = dateTimeFormatter3.print((long) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(2000);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        java.lang.String str17 = dateTimeFormatter15.print((long) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withDefaultYear(2000);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withDefaultYear((int) '#');
        org.joda.time.LocalDate localDate25 = dateTimeFormatter23.parseLocalDate("1969-12-31T21:00:00.032-03:00");
        java.lang.String str26 = dateTimeFormatter7.print((org.joda.time.ReadablePartial) localDate25);
        java.io.Writer writer27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer27, readableInstant28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str5, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str17, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(localDate25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000" + "'", str26, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        java.lang.String str13 = dateTimeFormatter10.print((long) '#');
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter10.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        int int17 = dateTimeFormatter16.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear((int) '#');
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withZoneUTC();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        java.lang.String str29 = dateTimeFormatter27.print((long) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withDefaultYear(2000);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withChronology(chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withDefaultYear((int) '#');
        org.joda.time.LocalTime localTime37 = dateTimeFormatter31.parseLocalTime("1969-12-31T23:59:57.999Z");
        java.lang.String str38 = dateTimeFormatter23.print((org.joda.time.ReadablePartial) localTime37);
        java.lang.String str39 = dateTimeFormatter10.print((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter10.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str13, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str29, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(localTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT23:59:57.999" + "'", str38, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT23:59:57.999");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT23:59:57.999" + "'", str39, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT23:59:57.999");
        org.junit.Assert.assertNull(dateTimeParser40);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronology();
        boolean boolean12 = dateTimeFormatter10.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter10.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter19.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimePrinter20);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        boolean boolean7 = dateTimeFormatter4.isPrinter();
        org.joda.time.LocalDate localDate9 = dateTimeFormatter4.parseLocalDate("2021-11-06T06:08:52.891-03:00");
        org.joda.time.Chronology chronology10 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter4.withPivotYear((java.lang.Integer) (-2001));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear(24);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withPivotYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.DateTime dateTime29 = dateTimeFormatter27.parseDateTime("2021-11-06T09:08:49.297Z");
        int int30 = dateTimeFormatter27.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter27.withDefaultYear(10);
        org.joda.time.Chronology chronology33 = dateTimeFormatter32.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeFormatter32.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTimeFormatter32.parseMutableDateTime("1969-12-31T23:59:59.989Z");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer17, (org.joda.time.ReadableInstant) mutableDateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2000 + "'", int30 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear(2000);
        org.joda.time.Chronology chronology12 = dateTimeFormatter9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter9.getZone();
        java.lang.String str15 = dateTimeFormatter9.print((-101L));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31T23:59:59.899Z" + "'", str15, "1969-12-31T23:59:59.899Z");
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withLocale(locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter8.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeParser12);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withZone(dateTimeZone6);
        java.util.Locale locale8 = dateTimeFormatter3.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear(29);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withChronology(chronology13);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withLocale(locale15);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear((int) (byte) 1);
        java.lang.Appendable appendable9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser15);
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser17);
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withZone(dateTimeZone22);
        boolean boolean24 = dateTimeFormatter23.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withDefaultYear((int) ' ');
        boolean boolean27 = dateTimeFormatter23.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter31.withZoneUTC();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withLocale(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withZoneUTC();
        org.joda.time.LocalTime localTime37 = dateTimeFormatter32.parseLocalTime("1970-01-01T00:00:00.100Z");
        org.joda.time.DateTime dateTime39 = dateTimeFormatter32.parseDateTime("1969-12-31T21:00:00.001-03:00");
        java.lang.String str40 = dateTimeFormatter29.print((org.joda.time.ReadableInstant) dateTime39);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable9, (org.joda.time.ReadableInstant) dateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str40, "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.Chronology chronology11 = dateTimeFormatter8.getChronolgy();
        java.lang.StringBuilder stringBuilder12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter13.getPrinter();
        org.joda.time.Chronology chronology16 = dateTimeFormatter13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter18.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTimeFormatter20.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter20.withPivotYear(100);
        boolean boolean27 = dateTimeFormatter26.isParser();
        org.joda.time.LocalDate localDate29 = dateTimeFormatter26.parseLocalDate("2021-11-06T09:09:40.788Z");
        java.lang.String str30 = dateTimeFormatter13.print((org.joda.time.ReadablePartial) localDate29);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuilder12, (org.joda.time.ReadablePartial) localDate29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimePrinter15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localDate29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000" + "'", str30, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        java.util.Locale locale5 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((int) (short) 100);
        java.util.Locale locale10 = dateTimeFormatter7.getLocale();
        org.joda.time.Chronology chronology11 = dateTimeFormatter7.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.DateTime dateTime7 = dateTimeFormatter4.parseDateTime("2021-11-06T09:10:02.476Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        java.util.Locale locale5 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withOffsetParsed();
        java.lang.String str9 = dateTimeFormatter7.print((long) (byte) 0);
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) (-2001));
        org.joda.time.LocalDate localDate15 = dateTimeFormatter11.parseLocalDate("2021-11-06T09:11:10.039Z");
        long long17 = dateTimeFormatter11.parseMillis("2021-11-06T09:09:55.310Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31T21:00:00.000-03:00" + "'", str9, "1969-12-31T21:00:00.000-03:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1636189795310L + "'", long17 == 1636189795310L);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.lang.String str4 = dateTimeFormatter0.print((long) (short) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withChronology(chronology5);
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withLocale(locale7);
        java.lang.Integer int9 = dateTimeFormatter0.getPivotYear();
        java.lang.Class<?> wildcardClass10 = dateTimeFormatter0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str4, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter0.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withLocale(locale6);
        java.lang.String str9 = dateTimeFormatter7.print(1636189744552L);
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2021-11-06T09:09:04.552Z" + "'", str9, "2021-11-06T09:09:04.552Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "2021-11-06T09:09:50.998Z", "1969-12-31T23:59:59.899Z", "2021-11-06T09:09:50.998", "2021-11-06T09:09:16.898Z", "2021-11-06T06:10:11.357-03:00" };
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
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        java.util.Locale locale1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        long long4 = dateTimeFormatter0.parseMillis("1970-01-01T00:00:00.001Z");
        org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter0.parseMutableDateTime("2021-11-06T09:08:52.891Z");
        boolean boolean7 = dateTimeFormatter0.isParser();
        java.lang.String str9 = dateTimeFormatter0.print((long) 29);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter15.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = dateTimeFormatter27.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withLocale(locale30);
        long long33 = dateTimeFormatter29.parseMillis("1970-01-01T00:00:00.001Z");
        org.joda.time.MutableDateTime mutableDateTime35 = dateTimeFormatter29.parseMutableDateTime("2021-11-06T09:08:52.891Z");
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter29.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser36);
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter39.withZoneUTC();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withChronology(chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter40.withPivotYear((java.lang.Integer) (-2001));
        org.joda.time.DateTime dateTime46 = dateTimeFormatter44.parseDateTime("1969-12-31T23:59:59.999Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter44.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatter48.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter38, dateTimeParser49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:00.029Z" + "'", str9, "1970-01-01T00:00:00.029Z");
        org.junit.Assert.assertNotNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimePrinter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTimeParser36);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeParser49);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        boolean boolean7 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter9.parseLocalTime("2021-11-06T09:11:56.777Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.String str15 = dateTimeFormatter13.print((long) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withOffsetParsed();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withChronology(chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter18.withZone(dateTimeZone21);
        boolean boolean23 = dateTimeFormatter22.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str15, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        int int2 = dateTimeFormatter1.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) '#');
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.String str14 = dateTimeFormatter12.print((long) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter12.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 1);
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter12.withLocale(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withChronology(chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((int) (byte) 1);
        boolean boolean29 = dateTimeFormatter28.isParser();
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withLocale(locale30);
        org.joda.time.LocalDateTime localDateTime33 = dateTimeFormatter31.parseLocalDateTime("1970-01-01T00:00:00.032Z");
        java.lang.String str34 = dateTimeFormatter12.print((org.joda.time.ReadablePartial) localDateTime33);
        java.lang.String str35 = dateTimeFormatter8.print((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTime dateTime37 = dateTimeFormatter8.parseDateTime("2021-11-06T09:09:58.427Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withChronology(chronology40);
        org.joda.time.format.DateTimePrinter dateTimePrinter42 = dateTimeFormatter39.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter42, dateTimeParser43);
        org.joda.time.format.DateTimeParser dateTimeParser45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter42, dateTimeParser45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter48.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter47.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter50.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeFormatter54.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter53.withZone(dateTimeZone55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTimeFormatter58.parseMutableDateTime("1970-01-01T00:00:00.000Z");
        int int63 = dateTimeFormatter50.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime60, "hi!", (int) (byte) 100);
        java.lang.String str64 = dateTimeFormatter46.print((org.joda.time.ReadableInstant) mutableDateTime60);
        java.lang.String str65 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter8.withChronology(chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter67.withDefaultYear(24);
        org.joda.time.Chronology chronology70 = dateTimeFormatter69.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter69.withDefaultYear((-11));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2000 + "'", int2 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str14, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01T00:00:00.032" + "'", str34, "1970-01-01T00:00:00.032");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:00.032" + "'", str35, "1970-01-01T00:00:00.032");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimePrinter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-101) + "'", int63 == (-101));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str64, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str65, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear((int) (byte) 1);
        boolean boolean9 = dateTimeFormatter8.isParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTimeFormatter11.parseMutableDateTime("2021-11-06T09:09:04.552Z");
        org.joda.time.LocalDate localDate15 = dateTimeFormatter11.parseLocalDate("1969-12-31T21:00:00.035-03:00");
        boolean boolean16 = dateTimeFormatter11.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.lang.String str4 = dateTimeFormatter0.print((long) (short) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withChronology(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter6.isParser();
        java.lang.String str11 = dateTimeFormatter6.print((long) 10);
        long long13 = dateTimeFormatter6.parseMillis("2021-11-06T09:09:16.736Z");
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable14, 1636189853865L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str4, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str11, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1636189756736L + "'", long13 == 1636189756736L);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter7.getPrinter();
        org.joda.time.Chronology chronology12 = dateTimeFormatter7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter13.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter15.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter19.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeFormatter21.print(10L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withChronology(chronology24);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTimeFormatter21.parseMutableDateTime("1970-01-01T00:00:00.052Z");
        java.lang.String str28 = dateTimeFormatter17.print((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.LocalDate localDate30 = dateTimeFormatter17.parseLocalDate("2021-11-06T09:09:04.552Z");
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeFormatter17.getZone();
        boolean boolean32 = dateTimeFormatter17.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter7.withDefaultYear(32);
        java.lang.Appendable appendable37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter40 = dateTimeFormatter38.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter40, dateTimeParser41);
        org.joda.time.format.DateTimeParser dateTimeParser43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter40, dateTimeParser43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter44.withZoneUTC();
        java.lang.Integer int46 = dateTimeFormatter45.getPivotYear();
        java.util.Locale locale47 = dateTimeFormatter45.getLocale();
        java.lang.Integer int48 = dateTimeFormatter45.getPivotYear();
        boolean boolean49 = dateTimeFormatter45.isOffsetParsed();
        boolean boolean50 = dateTimeFormatter45.isParser();
        java.util.Locale locale51 = dateTimeFormatter45.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeFormatter52.getZone();
        java.lang.Integer int54 = dateTimeFormatter52.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeFormatter52.getZone();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeFormatter52.getZone();
        org.joda.time.LocalDate localDate58 = dateTimeFormatter52.parseLocalDate("2021-11-06T09:09:04.552Z");
        java.lang.String str59 = dateTimeFormatter45.print((org.joda.time.ReadablePartial) localDate58);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter36.printTo(appendable37, (org.joda.time.ReadablePartial) localDate58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimePrinter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str23, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str28, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimePrinter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(locale47);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(localDate58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000" + "'", str59, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.LocalTime localTime6 = dateTimeFormatter4.parseLocalTime("1970-01-01T00:00:00.010Z");
        java.lang.Integer int7 = dateTimeFormatter4.getPivotYear();
        java.lang.String str9 = dateTimeFormatter4.print((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTimeFormatter4.parseMutableDateTime("1970-01-01T00:00:00.035Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.DateTime dateTime14 = dateTimeFormatter4.parseDateTime("1969-12-31T21:00:02.000-03:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str9, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZone(dateTimeZone12);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter16.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withZone(dateTimeZone17);
        int int19 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTimeFormatter15.parseMutableDateTime("1969-12-31T21:00:00.000-03:00");
        org.joda.time.LocalTime localTime23 = dateTimeFormatter15.parseLocalTime("1969-12-31T21:00:00.001-03:00");
        java.lang.String str24 = dateTimeFormatter13.print((org.joda.time.ReadablePartial) localTime23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter13.withLocale(locale25);
        boolean boolean27 = dateTimeFormatter13.isOffsetParsed();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter13.withChronology(chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter31.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withPivotYear((int) (short) 100);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter33.withLocale(locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withChronology(chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.LocalTime localTime44 = dateTimeFormatter42.parseLocalTime("1970-01-01T00:00:00.010Z");
        java.lang.String str45 = dateTimeFormatter33.print((org.joda.time.ReadablePartial) localTime44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeFormatter47.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter46.withZone(dateTimeZone48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter49.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTimeFormatter51.parseMutableDateTime("1970-01-01T00:00:00.000Z");
        java.util.Locale locale54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter51.withLocale(locale54);
        org.joda.time.DateTime dateTime57 = dateTimeFormatter51.parseDateTime("2021-11-06T09:08:46.029Z");
        java.lang.String str58 = dateTimeFormatter33.print((org.joda.time.ReadableInstant) dateTime57);
        java.util.Locale locale59 = dateTimeFormatter33.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter33.withPivotYear(0);
        int int62 = dateTimeFormatter33.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter63.withZoneUTC();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter64.withChronology(chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter66.withZoneUTC();
        org.joda.time.LocalTime localTime69 = dateTimeFormatter67.parseLocalTime("1970-01-01T00:00:00.010Z");
        java.lang.Integer int70 = dateTimeFormatter67.getPivotYear();
        java.lang.String str72 = dateTimeFormatter67.print((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTimeFormatter67.parseMutableDateTime("1970-01-01T00:00:00.035Z");
        int int77 = dateTimeFormatter33.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime74, "2021-11-06T09:09:11.413Z", (int) ' ');
        java.lang.String str78 = dateTimeFormatter13.print((org.joda.time.ReadableInstant) mutableDateTime74);
        java.lang.StringBuilder stringBuilder79 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter80.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter82 = dateTimeFormatter80.getPrinter();
        org.joda.time.Chronology chronology83 = dateTimeFormatter80.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone86 = dateTimeFormatter85.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter84.withZone(dateTimeZone86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter87.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime91 = dateTimeFormatter87.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter93 = dateTimeFormatter87.withPivotYear(100);
        boolean boolean94 = dateTimeFormatter93.isParser();
        org.joda.time.LocalDate localDate96 = dateTimeFormatter93.parseLocalDate("2021-11-06T09:09:40.788Z");
        java.lang.String str97 = dateTimeFormatter80.print((org.joda.time.ReadablePartial) localDate96);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuilder79, (org.joda.time.ReadablePartial) localDate96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2000 + "'", int19 == 2000);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT21:00:00.001" + "'", str24, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT21:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(localTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010" + "'", str45, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2021-11-06T09:08:46.029Z" + "'", str58, "2021-11-06T09:08:46.029Z");
        org.junit.Assert.assertNull(locale59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2000 + "'", int62 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNull(int70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str72, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-33) + "'", int77 == (-33));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str78, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertNotNull(dateTimePrinter82);
        org.junit.Assert.assertNull(chronology83);
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(dateTimeFormatter89);
        org.junit.Assert.assertNotNull(mutableDateTime91);
        org.junit.Assert.assertNotNull(dateTimeFormatter93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(localDate96);
// flaky:         org.junit.Assert.assertEquals("'" + str97 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000" + "'", str97, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.LocalTime localTime6 = dateTimeFormatter4.parseLocalTime("1970-01-01T00:00:00.010Z");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter4.getZone();
        java.lang.String str12 = dateTimeFormatter4.print(1636189798427L);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2021-11-06T09:09:58.427Z" + "'", str12, "2021-11-06T09:09:58.427Z");
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        java.lang.String str7 = dateTimeFormatter0.print((long) (-101));
        org.joda.time.DateTime dateTime9 = dateTimeFormatter0.parseDateTime("1969-12-31T21:00:00.097-03:00");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer10, 1636189790998L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.899Z" + "'", str7, "1969-12-31T23:59:59.899Z");
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("2021-11-06T09:11:38.721Z", "1970-01-01T00:00:00.032");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "2021-11-06T09:09:50.195Z", "2021-11-06T06:11:00.396-03:00", "2021-11-06T09:12:48.100Z", "2021-11-06T09:13:11.049Z", "1969-12-31T23:59:59.899Z" };
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
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter3.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology8 = dateTimeFormatter3.getChronolgy();
        java.lang.String str10 = dateTimeFormatter3.print(1636189729297L);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withLocale(locale11);
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2021-11-06T09:08:49.297Z" + "'", str10, "2021-11-06T09:08:49.297Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZone(dateTimeZone12);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withDefaultYear((int) ' ');
        boolean boolean17 = dateTimeFormatter13.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withOffsetParsed();
        java.lang.String str21 = dateTimeFormatter13.print((-2L));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-12-31T23:59:59.998Z" + "'", str21, "1969-12-31T23:59:59.998Z");
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        java.lang.Integer int5 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter1.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = dateTimeFormatter10.parseMutableDateTime("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT21:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????-??-??T21:00:00.010\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear((java.lang.Integer) (-101));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter8.getPrinter();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withChronology(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter8.parseLocalTime("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:09:25.796");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????-??-??T09:09:25.796\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withLocale(locale2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter3.getZone();
        org.joda.time.LocalTime localTime7 = dateTimeFormatter3.parseLocalTime("1970-01-01T00:00:00.010Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter10.parseMutableDateTime("1969-12-31T21:00:00.000-03:00");
        int int18 = dateTimeFormatter9.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime15, "1970-01-01T00:00:00.032Z", (int) (byte) 1);
        java.lang.String str20 = dateTimeFormatter9.print(1636189800066L);
        org.joda.time.DateTime dateTime22 = dateTimeFormatter9.parseDateTime("2021-11-06T09:11:05.824Z");
        java.lang.Class<?> wildcardClass23 = dateTime22.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimePrinter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2021-11-06T09:10:00.066Z" + "'", str20, "2021-11-06T09:10:00.066Z");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter5.parseMutableDateTime("1970-01-01T00:00:00.000Z");
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withLocale(locale8);
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withLocale(locale10);
        long long13 = dateTimeFormatter9.parseMillis("1969-12-31T23:59:59.998Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZone(dateTimeZone5);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        java.lang.Integer int12 = dateTimeFormatter10.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter10.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter10.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter0.withZone(dateTimeZone14);
        boolean boolean17 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = dateTimeFormatter0.getPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimePrinter18);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 100);
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.LocalTime localTime14 = dateTimeFormatter12.parseLocalTime("1970-01-01T00:00:00.010Z");
        java.lang.String str15 = dateTimeFormatter3.print((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTimeFormatter21.parseMutableDateTime("1970-01-01T00:00:00.000Z");
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withLocale(locale24);
        org.joda.time.DateTime dateTime27 = dateTimeFormatter21.parseDateTime("2021-11-06T09:08:46.029Z");
        java.lang.String str28 = dateTimeFormatter3.print((org.joda.time.ReadableInstant) dateTime27);
        java.util.Locale locale29 = dateTimeFormatter3.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter3.withPivotYear(0);
        int int32 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = dateTimeFormatter3.getPrinter();
        boolean boolean34 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withChronology(chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withPivotYear((java.lang.Integer) 2000);
        int int42 = dateTimeFormatter41.getDefaultYear();
        boolean boolean43 = dateTimeFormatter41.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeFormatter45.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter44.withZone(dateTimeZone46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withPivotYear((int) (short) 100);
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter47.withLocale(locale50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter51.withChronology(chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeFormatter54.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeFormatter56.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone59 = dateTimeFormatter58.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter56.withZone(dateTimeZone59);
        org.joda.time.LocalTime localTime62 = dateTimeFormatter60.parseLocalTime("1970-01-01T00:00:00.052Z");
        java.lang.String str63 = dateTimeFormatter54.print((org.joda.time.ReadablePartial) localTime62);
        java.lang.String str64 = dateTimeFormatter51.print((org.joda.time.ReadablePartial) localTime62);
        boolean boolean65 = dateTimeFormatter51.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone68 = dateTimeFormatter67.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter66.withZone(dateTimeZone68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter51.withZone(dateTimeZone68);
        java.lang.Integer int71 = dateTimeFormatter70.getPivotYear();
        org.joda.time.MutableDateTime mutableDateTime73 = dateTimeFormatter70.parseMutableDateTime("2021-11-06T09:10:15.479Z");
        int int76 = dateTimeFormatter41.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime73, "", (-36));
        int int79 = dateTimeFormatter3.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime73, "", (-2001));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime81 = dateTimeFormatter3.parseDateTime("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????-??-??T00:00:00.052\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2021-11-06T09:08:46.029Z" + "'", str28, "2021-11-06T09:08:46.029Z");
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2000 + "'", int32 == 2000);
        org.junit.Assert.assertNotNull(dateTimePrinter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2000 + "'", int42 == 2000);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(localTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052" + "'", str63, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052" + "'", str64, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNull(int71);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-36) + "'", int76 == (-36));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-2001) + "'", int79 == (-2001));
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mapParams1.param("2021-11-06T09:10:50.361Z", "2021-11-06T09:11:13.397Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter7.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        java.lang.String str17 = dateTimeFormatter15.print((long) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatter15.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser18);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter19.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str17, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimePrinter20);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.097", "1970-01-01T00:00:00.032", "2021-11-06T06:11:55.951-03:00", "1969-12-31T23:59:59.988Z", "2021-11-06T09:11:10.039Z", "2021-11-06T09:09:45.079Z" };
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
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withDefaultYear((int) '#');
        java.lang.Integer int10 = dateTimeFormatter6.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter13.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeFormatter19.print(10L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTimeFormatter19.parseMutableDateTime("1970-01-01T00:00:00.052Z");
        java.lang.String str26 = dateTimeFormatter15.print((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.LocalDate localDate28 = dateTimeFormatter15.parseLocalDate("2021-11-06T09:09:04.552Z");
        java.lang.String str29 = dateTimeFormatter6.print((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.Chronology chronology30 = dateTimeFormatter6.getChronolgy();
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeFormatter33.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withZone(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withPivotYear((int) (short) 100);
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withLocale(locale38);
        boolean boolean40 = dateTimeFormatter39.isParser();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTimeFormatter39.parseMutableDateTime("2021-11-06T09:08:49.297Z");
        org.joda.time.MutableDateTime mutableDateTime44 = dateTimeFormatter39.parseMutableDateTime("2021-11-06T09:09:01.407Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter39.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter48.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter47.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter50.withPivotYear((int) (short) 100);
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter50.withLocale(locale53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter50.withChronology(chronology55);
        org.joda.time.LocalTime localTime58 = dateTimeFormatter50.parseLocalTime("1969-12-31T21:00:00.000-03:00");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter50.withDefaultYear((-98));
        org.joda.time.LocalTime localTime62 = dateTimeFormatter60.parseLocalTime("2021-11-06T09:09:50.195Z");
        org.joda.time.DateTimeZone dateTimeZone63 = dateTimeFormatter60.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter39.withZone(dateTimeZone63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter65.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter67 = dateTimeFormatter65.getPrinter();
        org.joda.time.ReadableInstant readableInstant68 = null;
        java.lang.String str69 = dateTimeFormatter65.print(readableInstant68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter65.withDefaultYear((int) (byte) 1);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter65.withChronology(chronology72);
        org.joda.time.Chronology chronology74 = dateTimeFormatter73.getChronology();
        org.joda.time.LocalTime localTime76 = dateTimeFormatter73.parseLocalTime("2021-11-06T09:10:53.865Z");
        java.lang.String str77 = dateTimeFormatter64.print((org.joda.time.ReadablePartial) localTime76);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer31, (org.joda.time.ReadablePartial) localTime76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str21, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(localDate28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000" + "'", str29, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
        org.junit.Assert.assertNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimePrinter67);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2021-11-06T09:13:39.915Z" + "'", str69, "2021-11-06T09:13:39.915Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNull(chronology74);
        org.junit.Assert.assertNotNull(localTime76);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:10:53.865" + "'", str77, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:10:53.865");
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 100);
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter10.getPrinter();
        java.lang.String str14 = dateTimeFormatter10.print((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime16 = dateTimeFormatter10.parseLocalDateTime("1970-01-01T00:00:00.010Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter10.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter9.withZone(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = dateTimeFormatter9.parseLocalDateTime("2021-11-06T09:09:28.619Z");
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter9.getParser();
        java.lang.Appendable appendable23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable23, readablePartial24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimePrinter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str14, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withPivotYear((-53));
        java.lang.String str10 = dateTimeFormatter0.print(1636189751651L);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2021-11-06T09:09:11.651Z" + "'", str10, "2021-11-06T09:09:11.651Z");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.lang.String str4 = dateTimeFormatter0.print((long) (short) 0);
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        java.lang.String str10 = dateTimeFormatter6.print((long) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withPivotYear((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withChronology(chronology13);
        java.util.Locale locale15 = dateTimeFormatter12.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withPivotYear((java.lang.Integer) (-11));
        org.joda.time.MutableDateTime mutableDateTime19 = dateTimeFormatter12.parseMutableDateTime("2021-11-06T06:10:40.734-03:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str4, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:00.100Z" + "'", str10, "1970-01-01T00:00:00.100Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZone(dateTimeZone5);
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser8);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withChronology(chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.Chronology chronology20 = dateTimeFormatter17.getChronolgy();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter17.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTimeFormatter26.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        int int33 = dateTimeFormatter17.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime30, "1969-12-31T23:59:59.999Z", 1);
        int int36 = dateTimeFormatter10.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime30, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT21:00:00.035", 29);
        boolean boolean37 = dateTimeFormatter10.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser38 = dateTimeFormatter10.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24 + "'", int33 == 24);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-30) + "'", int36 == (-30));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeParser38);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.lang.String str4 = dateTimeFormatter0.print((long) (short) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withChronology(chronology5);
        org.joda.time.Chronology chronology7 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        java.lang.Integer int12 = dateTimeFormatter10.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter10.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter10.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter10.getPrinter();
        org.joda.time.LocalDate localDate17 = dateTimeFormatter10.parseLocalDate("1969-12-31T23:59:59.899Z");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer9, (org.joda.time.ReadablePartial) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str4, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimePrinter15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.lang.String str4 = dateTimeFormatter0.print((long) (short) 0);
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("1969-12-31T20:59:59.899-03:00");
        java.util.Locale locale11 = dateTimeFormatter8.getLocale();
        org.joda.time.Chronology chronology12 = dateTimeFormatter8.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str4, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "2021-11-06T09:11:00.254Z", "2021-11-06T09:12:07.407Z", "2021-11-06T09:13:22.605Z" };
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
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.032Z", "2021-11-06T06:12:34.289-03:00" };
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
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        java.lang.String str7 = dateTimeFormatter0.print((long) (-101));
        org.joda.time.DateTime dateTime9 = dateTimeFormatter0.parseDateTime("1969-12-31T21:00:00.097-03:00");
        boolean boolean10 = dateTimeFormatter0.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.899Z" + "'", str7, "1969-12-31T23:59:59.899Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        java.lang.String str4 = dateTimeFormatter0.print((long) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.LocalTime localTime11 = dateTimeFormatter9.parseLocalTime("1970-01-01T00:00:00.010Z");
        java.lang.Integer int12 = dateTimeFormatter9.getPivotYear();
        java.lang.String str14 = dateTimeFormatter9.print((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter0.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter18.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeFormatter20.print(10L);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter20.withChronology(chronology23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter28.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter16.withZone(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str4, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str14, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str22, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.Chronology chronology7 = dateTimeFormatter4.getChronology();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZoneUTC();
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronology();
        boolean boolean18 = dateTimeFormatter16.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTimeFormatter19.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        java.lang.String str23 = dateTimeFormatter16.print((org.joda.time.ReadableInstant) mutableDateTime22);
        long long25 = dateTimeFormatter16.parseMillis("2021-11-06T09:09:12.489Z");
        org.joda.time.DateTime dateTime27 = dateTimeFormatter16.parseDateTime("1969-12-31T23:59:59.999Z");
        java.lang.String str28 = dateTimeFormatter10.print((org.joda.time.ReadableInstant) dateTime27);
        java.io.Writer writer29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withChronology(chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter33.withZoneUTC();
        org.joda.time.LocalTime localTime36 = dateTimeFormatter33.parseLocalTime("2021-11-06T09:10:12.887Z");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer29, (org.joda.time.ReadablePartial) localTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.100Z" + "'", str23, "1970-01-01T00:00:00.100Z");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1636189752489L + "'", long25 == 1636189752489L);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str28, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(localTime36);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZone(dateTimeZone10);
        java.util.Locale locale12 = dateTimeFormatter7.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withOffsetParsed();
        boolean boolean15 = dateTimeFormatter14.isParser();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.LocalTime localTime24 = dateTimeFormatter22.parseLocalTime("1970-01-01T00:00:00.010Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withZoneUTC();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withChronology(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter28.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeFormatter33.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withZone(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withPivotYear((int) (short) 100);
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withLocale(locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter40.withZoneUTC();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withChronology(chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter43.withZoneUTC();
        org.joda.time.LocalTime localTime46 = dateTimeFormatter44.parseLocalTime("1970-01-01T00:00:00.010Z");
        java.lang.String str47 = dateTimeFormatter35.print((org.joda.time.ReadablePartial) localTime46);
        java.lang.String str48 = dateTimeFormatter31.print((org.joda.time.ReadablePartial) localTime46);
        java.lang.String str49 = dateTimeFormatter22.print((org.joda.time.ReadablePartial) localTime46);
        boolean boolean50 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.LocalTime localTime52 = dateTimeFormatter22.parseLocalTime("2021-11-06T09:09:11.651Z");
        java.lang.String str53 = dateTimeFormatter17.print((org.joda.time.ReadablePartial) localTime52);
        java.lang.String str54 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) localTime52);
        int int55 = dateTimeFormatter4.getDefaultYear();
        java.lang.Class<?> wildcardClass56 = dateTimeFormatter4.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(localTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010" + "'", str47, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010" + "'", str48, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010" + "'", str49, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:09:11.651" + "'", str53, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:09:11.651");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:09:11.651" + "'", str54, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:09:11.651");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2000 + "'", int55 == 2000);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withLocale(locale2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((-2));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZone(dateTimeZone10);
        java.util.Locale locale12 = dateTimeFormatter7.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser13);
        long long16 = dateTimeFormatter14.parseMillis("1970-01-01T00:00:00.032Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter14.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter14.withPivotYear((int) '4');
        org.joda.time.Chronology chronology23 = dateTimeFormatter14.getChronology();
        boolean boolean24 = dateTimeFormatter14.isParser();
        int int25 = dateTimeFormatter14.getDefaultYear();
        int int26 = dateTimeFormatter14.getDefaultYear();
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer27, 1636189744552L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(dateTimeParser13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2000 + "'", int25 == 2000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2000 + "'", int26 == 2000);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        java.util.Locale locale1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZone(dateTimeZone8);
        java.util.Locale locale10 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter5.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter5.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser12);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeParser12);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter3.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear((int) '#');
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer13, 1636189853865L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.String str15 = dateTimeFormatter13.print((long) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withOffsetParsed();
        boolean boolean19 = dateTimeFormatter18.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter21.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withPivotYear((-12));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str15, "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter1.withZone(dateTimeZone4);
        java.util.Locale locale6 = dateTimeFormatter1.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter1.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withPivotYear((-2));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withChronology(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.Chronology chronology6 = dateTimeFormatter3.getChronology();
        boolean boolean7 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter3.getZone();
        long long12 = dateTimeFormatter3.parseMillis("2021-11-06T09:11:45.669Z");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter3.parseLocalTime("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:08:42.828");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????-??-??T09:08:42.828\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1636189905669L + "'", long12 == 1636189905669L);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter1.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter6.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withZone(dateTimeZone7);
        java.util.Locale locale9 = dateTimeFormatter4.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter4.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser10);
        java.lang.StringBuilder stringBuilder13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withChronology(chronology16);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = dateTimeFormatter15.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser21);
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser23);
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withDefaultYear((-2001));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTimeFormatter30.parseMutableDateTime("1970-01-01T00:00:00.100Z");
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter30.withLocale(locale34);
        long long37 = dateTimeFormatter30.parseMillis("2021-11-06T09:09:18.702Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter30.withDefaultYear(1);
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withLocale(locale40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter39.withChronology(chronology42);
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter43.getParser();
        org.joda.time.MutableDateTime mutableDateTime46 = dateTimeFormatter43.parseMutableDateTime("2021-11-06T09:11:03.583Z");
        org.joda.time.DateTime dateTime48 = dateTimeFormatter43.parseDateTime("2021-11-06T09:11:39.110Z");
        java.lang.String str49 = dateTimeFormatter26.print((org.joda.time.ReadableInstant) dateTime48);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuilder13, (org.joda.time.ReadableInstant) dateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimePrinter18);
        org.junit.Assert.assertNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1636189758702L + "'", long37 == 1636189758702L);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeParser44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2021-11-06T09:11:39.110Z" + "'", str49, "2021-11-06T09:11:39.110Z");
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withPivotYear((-53));
        java.io.Writer writer9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 100);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withLocale(locale16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withChronology(chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter20.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter22.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withZone(dateTimeZone25);
        org.joda.time.LocalTime localTime28 = dateTimeFormatter26.parseLocalTime("1970-01-01T00:00:00.052Z");
        java.lang.String str29 = dateTimeFormatter20.print((org.joda.time.ReadablePartial) localTime28);
        java.lang.String str30 = dateTimeFormatter17.print((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.format.DateTimeParser dateTimeParser31 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.DateTime dateTime34 = dateTimeFormatter32.parseDateTime("2021-11-06T09:09:50.195Z");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer9, (org.joda.time.ReadableInstant) dateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052" + "'", str29, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052" + "'", str30, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeParser31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "2021-11-06T09:11:37.370Z", "2021-11-06T09:09:01.407", "2021-11-06T09:10:50.361Z", "2021-11-06T06:10:13.022-03:00", "2021-11-06T09:12:43.515Z" };
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
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "2021-11-06T09:10:54.386Z" };
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
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser7);
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withChronology(chronology13);
        java.lang.String str16 = dateTimeFormatter12.print((long) (-1));
        boolean boolean17 = dateTimeFormatter12.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter22.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter12.withZone(dateTimeZone23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter12.withLocale(locale25);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31T20:59:59.999-03:00" + "'", str16, "1969-12-31T20:59:59.999-03:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.LocalTime localTime12 = dateTimeFormatter9.parseLocalTime("2021-11-06T09:09:55.521Z");
        org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter9.parseMutableDateTime("2021-11-06T09:08:49.297Z");
        boolean boolean15 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter9.withZoneUTC();
        long long18 = dateTimeFormatter9.parseMillis("2021-11-06T09:12:18.627Z");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1636189938627L + "'", long18 == 1636189938627L);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser5);
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.Chronology chronology13 = dateTimeFormatter9.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withDefaultYear(0);
        boolean boolean16 = dateTimeFormatter15.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter15.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withZoneUTC();
        java.util.Locale locale19 = dateTimeFormatter15.getLocale();
        java.io.Writer writer20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter21.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withZone(dateTimeZone27);
        java.util.Locale locale29 = dateTimeFormatter24.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter24.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser30);
        org.joda.time.DateTime dateTime33 = dateTimeFormatter31.parseDateTime("2021-11-06T09:08:42.828Z");
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withChronology(chronology34);
        org.joda.time.DateTime dateTime37 = dateTimeFormatter35.parseDateTime("2021-11-06T09:10:25.252Z");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer20, (org.joda.time.ReadableInstant) dateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimePrinter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNotNull(dateTimeParser30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT09:10:11.157", "2021-11-06T09:12:26.372Z", "2021-11-06T06:10:36.416-03:00", "2021-11-06T09:12:18.627Z", "2021-11-06T09:12:24.561Z" };
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
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter0.getZone();
        org.joda.time.LocalDate localDate6 = dateTimeFormatter0.parseLocalDate("2021-11-06T09:09:04.552Z");
        org.joda.time.DateTime dateTime8 = dateTimeFormatter0.parseDateTime("2021-11-06T09:10:39.814Z");
        boolean boolean9 = dateTimeFormatter0.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withPivotYear((-53));
        java.lang.Appendable appendable9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter19.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter14.withZone(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = dateTimeFormatter14.parseLocalDate("2021-11-06T09:10:05.853Z");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable9, (org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(localDate23);
    }
}
