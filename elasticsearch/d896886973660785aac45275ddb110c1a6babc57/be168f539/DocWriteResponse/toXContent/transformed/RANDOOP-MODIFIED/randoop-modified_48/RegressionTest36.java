import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test18001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18001");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = dateTimeFormatter2.parseLocalDateTime("[[[[_version][1]][100]][1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter11.parseDateTime("[[][10]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeFormatter6.isPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withLocale(locale10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        boolean boolean13 = dateTimeFormatter11.isParser();
        org.joda.time.Chronology chronology14 = dateTimeFormatter11.getChronolgy();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(32);
        int int10 = dateTimeFormatter9.getDefaultYear();
        boolean boolean11 = dateTimeFormatter9.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter9.parseLocalDateTime("[_id][97]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("_version", "[[hi!][-1]][35]", (int) ' ');
        org.elasticsearch.index.shard.ShardId shardId7 = new org.elasticsearch.index.shard.ShardId("_index", "_version", 0);
        org.elasticsearch.index.shard.ShardId shardId11 = new org.elasticsearch.index.shard.ShardId("_index", "", 0);
        java.lang.String str12 = shardId11.getIndexName();
        int int13 = shardId7.compareTo(shardId11);
        int int14 = shardId7.id();
        org.elasticsearch.index.shard.ShardId shardId18 = new org.elasticsearch.index.shard.ShardId("", "", (int) ' ');
        int int19 = shardId18.getId();
        org.elasticsearch.index.shard.ShardId shardId23 = new org.elasticsearch.index.shard.ShardId("", "hi!", (int) (byte) 100);
        int int24 = shardId18.compareTo(shardId23);
        int int25 = shardId18.getId();
        java.lang.String str26 = shardId18.getIndexName();
        int int27 = shardId7.compareTo(shardId18);
        int int28 = shardId3.compareTo(shardId7);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter31.withZoneUTC();
        boolean boolean33 = dateTimeFormatter31.isParser();
        org.joda.time.Chronology chronology34 = dateTimeFormatter31.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withOffsetParsed();
        java.lang.Integer int36 = dateTimeFormatter31.getPivotYear();
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter31.withLocale(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withOffsetParsed();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withChronology(chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter38.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = shardId7.equals((java.lang.Object) dateTimeFormatter42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        int int13 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronology();
        boolean boolean22 = dateTimeFormatter20.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withZone(dateTimeZone25);
        boolean boolean27 = dateTimeFormatter24.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter24.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter31.withZoneUTC();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withLocale(locale33);
        int int35 = dateTimeFormatter34.getDefaultYear();
        org.joda.time.Chronology chronology36 = dateTimeFormatter34.getChronolgy();
        org.joda.time.Chronology chronology37 = dateTimeFormatter34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeFormatter34.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter24.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter17.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter6.withZone(dateTimeZone38);
        org.joda.time.format.DateTimeParser dateTimeParser42 = dateTimeFormatter41.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter45.withZoneUTC();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withLocale(locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withOffsetParsed();
        boolean boolean50 = dateTimeFormatter49.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter51 = null;
        org.joda.time.format.DateTimeParser dateTimeParser52 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter51, dateTimeParser52);
        org.joda.time.Chronology chronology54 = dateTimeFormatter53.getChronology();
        boolean boolean55 = dateTimeFormatter53.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter53.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter57.withZone(dateTimeZone58);
        boolean boolean60 = dateTimeFormatter57.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeFormatter57.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter62 = null;
        org.joda.time.format.DateTimeParser dateTimeParser63 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter62, dateTimeParser63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter64.withZoneUTC();
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter65.withLocale(locale66);
        int int68 = dateTimeFormatter67.getDefaultYear();
        org.joda.time.Chronology chronology69 = dateTimeFormatter67.getChronolgy();
        org.joda.time.Chronology chronology70 = dateTimeFormatter67.getChronology();
        org.joda.time.DateTimeZone dateTimeZone71 = dateTimeFormatter67.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter57.withZone(dateTimeZone71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter49.withZone(dateTimeZone71);
        java.util.Locale locale74 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter73.withLocale(locale74);
        org.joda.time.format.DateTimePrinter dateTimePrinter76 = null;
        org.joda.time.format.DateTimeParser dateTimeParser77 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter76, dateTimeParser77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter78.withZoneUTC();
        java.util.Locale locale80 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter79.withLocale(locale80);
        int int82 = dateTimeFormatter81.getDefaultYear();
        org.joda.time.Chronology chronology83 = dateTimeFormatter81.getChronolgy();
        org.joda.time.Chronology chronology84 = dateTimeFormatter81.getChronology();
        org.joda.time.DateTimeZone dateTimeZone85 = dateTimeFormatter81.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter73.withZone(dateTimeZone85);
        org.joda.time.DateTimeZone dateTimeZone87 = dateTimeFormatter73.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter41.withZone(dateTimeZone87);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter88.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2000 + "'", int35 == 2000);
        org.junit.Assert.assertNull(chronology36);
        org.junit.Assert.assertNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNull(dateTimeParser42);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2000 + "'", int68 == 2000);
        org.junit.Assert.assertNull(chronology69);
        org.junit.Assert.assertNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2000 + "'", int82 == 2000);
        org.junit.Assert.assertNull(chronology83);
        org.junit.Assert.assertNull(chronology84);
        org.junit.Assert.assertNotNull(dateTimeZone85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertNotNull(dateTimeZone87);
        org.junit.Assert.assertNotNull(dateTimeFormatter88);
        org.junit.Assert.assertNotNull(dateTimeFormatter89);
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 2000);
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withZone(dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withZoneUTC();
        boolean boolean20 = dateTimeFormatter15.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withZoneUTC();
        boolean boolean26 = dateTimeFormatter25.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter25.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withZone(dateTimeZone29);
        java.util.Locale locale31 = dateTimeFormatter25.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = null;
        org.joda.time.format.DateTimeParser dateTimeParser33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter34.withZoneUTC();
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withLocale(locale36);
        int int38 = dateTimeFormatter37.getDefaultYear();
        org.joda.time.Chronology chronology39 = dateTimeFormatter37.getChronolgy();
        org.joda.time.Chronology chronology40 = dateTimeFormatter37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter37.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter25.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter15.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter8.withZone(dateTimeZone41);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.Chronology chronology49 = dateTimeFormatter48.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = dateTimeFormatter48.getPrinter();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withChronology(chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter52.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeFormatter53.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter8.withZone(dateTimeZone54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int60 = dateTimeFormatter8.parseInto(readWritableInstant57, "[[[][100]][100]][1]", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2000 + "'", int38 == 2000);
        org.junit.Assert.assertNull(chronology39);
        org.junit.Assert.assertNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNull(dateTimePrinter45);
        org.junit.Assert.assertNull(chronology49);
        org.junit.Assert.assertNull(dateTimePrinter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withZone(dateTimeZone8);
        java.util.Locale locale10 = dateTimeFormatter4.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter4.withDefaultYear((int) (byte) 0);
        java.lang.Integer int13 = dateTimeFormatter12.getPivotYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 100);
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        boolean boolean18 = dateTimeFormatter16.isParser();
        org.joda.time.Chronology chronology19 = dateTimeFormatter16.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = null;
        org.joda.time.format.DateTimeParser dateTimeParser33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser33);
        org.joda.time.Chronology chronology35 = dateTimeFormatter34.getChronology();
        boolean boolean36 = dateTimeFormatter34.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter34.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withZone(dateTimeZone39);
        boolean boolean41 = dateTimeFormatter38.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeFormatter38.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter45.withZoneUTC();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withLocale(locale47);
        int int49 = dateTimeFormatter48.getDefaultYear();
        org.joda.time.Chronology chronology50 = dateTimeFormatter48.getChronolgy();
        org.joda.time.Chronology chronology51 = dateTimeFormatter48.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeFormatter48.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter38.withZone(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter31.withZone(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter20.withZone(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter12.withZone(dateTimeZone52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime58 = dateTimeFormatter56.parseLocalDateTime("[[_version][1]][0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(chronology35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2000 + "'", int49 == 2000);
        org.junit.Assert.assertNull(chronology50);
        org.junit.Assert.assertNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_id][6]][52]", "[[[_id][10]][0]][1]", (int) (short) 100);
        java.lang.String str4 = shardId3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[_id][6]][52]][100]" + "'", str4, "[[[_id][6]][52]][100]");
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear(0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "[_id][97]" };
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
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "[[][10]][52]", "[][32]" };
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
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[[_version][0]][100]][1]" };
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
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[][2000]", "[[[[_index][52]][35]][-1]][52]", (-4));
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withZone(dateTimeZone8);
        java.util.Locale locale10 = dateTimeFormatter4.getLocale();
        java.lang.Integer int11 = dateTimeFormatter4.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter4.getPrinter();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter4.withLocale(locale13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withChronology(chronology15);
        boolean boolean17 = dateTimeFormatter14.isPrinter();
        java.lang.Integer int18 = dateTimeFormatter14.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "[hi!][-1]", "[hi!][1]", "[[[][10]][0]][20]", "[][97]", "[_id][0]" };
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
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) (-4));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withDefaultYear(32);
        boolean boolean18 = dateTimeFormatter17.isOffsetParsed();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withChronology(chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter17.withChronology(chronology21);
        org.joda.time.ReadablePartial readablePartial23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeFormatter22.print(readablePartial23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[_version][1]", "", (-13));
        java.lang.String str4 = shardId3.getIndexName();
        java.lang.String str5 = shardId3.getIndexName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[_version][1]" + "'", str4, "[_version][1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[_version][1]" + "'", str5, "[_version][1]");
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 2000);
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter9.getPivotYear();
        boolean boolean11 = dateTimeFormatter9.isOffsetParsed();
        boolean boolean12 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter9.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter9.getPrinter();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withDefaultYear(100);
        boolean boolean13 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology14 = dateTimeFormatter8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter8.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.elasticsearch.common.xcontent.ToXContent.MapParams mapParams1 = new org.elasticsearch.common.xcontent.ToXContent.MapParams(strMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mapParams1.param("[[[][100]][32]][13]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 35);
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter9.print(readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withZone(dateTimeZone8);
        java.util.Locale locale10 = dateTimeFormatter4.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        int int17 = dateTimeFormatter16.getDefaultYear();
        org.joda.time.Chronology chronology18 = dateTimeFormatter16.getChronolgy();
        org.joda.time.Chronology chronology19 = dateTimeFormatter16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter16.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withZone(dateTimeZone20);
        int int22 = dateTimeFormatter4.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter4.withPivotYear((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withPivotYear((int) (short) 1);
        java.lang.StringBuilder stringBuilder30 = null;
        org.joda.time.ReadablePartial readablePartial31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter29.printTo(stringBuilder30, readablePartial31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2000 + "'", int22 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.util.Locale locale9 = dateTimeFormatter8.getLocale();
        boolean boolean10 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withZoneUTC();
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable17, readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter5.getChronolgy();
        org.joda.time.Chronology chronology8 = dateTimeFormatter5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        boolean boolean17 = dateTimeFormatter16.isPrinter();
        org.joda.time.Chronology chronology18 = dateTimeFormatter16.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter21.withDefaultYear(32);
        java.lang.Integer int27 = dateTimeFormatter26.getPivotYear();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withLocale(locale28);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter32.withZoneUTC();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withLocale(locale34);
        int int36 = dateTimeFormatter35.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withZone(dateTimeZone37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = null;
        org.joda.time.format.DateTimeParser dateTimeParser42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter41, dateTimeParser42);
        org.joda.time.Chronology chronology44 = dateTimeFormatter43.getChronology();
        boolean boolean45 = dateTimeFormatter43.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter43.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withZone(dateTimeZone48);
        boolean boolean50 = dateTimeFormatter47.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeFormatter47.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter54.withZoneUTC();
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter55.withLocale(locale56);
        int int58 = dateTimeFormatter57.getDefaultYear();
        org.joda.time.Chronology chronology59 = dateTimeFormatter57.getChronolgy();
        org.joda.time.Chronology chronology60 = dateTimeFormatter57.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeFormatter57.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter47.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter40.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter29.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter16.withZone(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter5.withZone(dateTimeZone61);
        java.util.Locale locale67 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter66.withLocale(locale67);
        boolean boolean69 = dateTimeFormatter66.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2000 + "'", int36 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNull(chronology44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2000 + "'", int58 == 2000);
        org.junit.Assert.assertNull(chronology59);
        org.junit.Assert.assertNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withChronology(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear((int) '4');
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter7.getParser();
        java.lang.Integer int12 = dateTimeFormatter7.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter7.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter7.getZone();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[][10]][97]", "[[_type][-1]][-1]", (int) (byte) 0);
        java.lang.String str4 = shardId3.toString();
        int int5 = shardId3.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[][10]][97]][0]" + "'", str4, "[[[][10]][97]][0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 32);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        boolean boolean9 = dateTimeFormatter7.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        boolean boolean15 = dateTimeFormatter14.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZone(dateTimeZone18);
        java.util.Locale locale20 = dateTimeFormatter14.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.Chronology chronology28 = dateTimeFormatter26.getChronolgy();
        org.joda.time.Chronology chronology29 = dateTimeFormatter26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter14.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter7.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withChronology(chronology33);
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withLocale(locale35);
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter34.withLocale(locale37);
        boolean boolean39 = dateTimeFormatter34.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter34.withZoneUTC();
        java.lang.StringBuilder stringBuilder41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter34.printTo(stringBuilder41, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 32);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        boolean boolean9 = dateTimeFormatter7.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        boolean boolean15 = dateTimeFormatter14.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZone(dateTimeZone18);
        java.util.Locale locale20 = dateTimeFormatter14.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.Chronology chronology28 = dateTimeFormatter26.getChronolgy();
        org.joda.time.Chronology chronology29 = dateTimeFormatter26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter14.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter7.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withChronology(chronology33);
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withLocale(locale35);
        boolean boolean37 = dateTimeFormatter34.isPrinter();
        org.joda.time.Chronology chronology38 = dateTimeFormatter34.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeFormatter34.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter34.withPivotYear((java.lang.Integer) 9);
        org.joda.time.Chronology chronology42 = dateTimeFormatter34.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNull(chronology42);
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "[hi!][1]", "[[][52]][-1]", "[_id][52]", "[[hi!][0]][6]" };
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
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withDefaultYear(100);
        boolean boolean13 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withPivotYear((int) 'a');
        java.util.Locale locale16 = dateTimeFormatter15.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withZone(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withZoneUTC();
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter5.parseLocalTime("[[_index][100]][-11]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter9.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter9.getPrinter();
        java.lang.StringBuilder stringBuilder15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuilder15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNull(dateTimePrinter14);
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withZoneUTC();
        boolean boolean11 = dateTimeFormatter10.isOffsetParsed();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withChronology(chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter15.getZone();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withChronology(chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter15.withDefaultYear((-14));
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "[[_version][1]][2]" };
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
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
        org.elasticsearch.index.shard.ShardId shardId3 = new org.elasticsearch.index.shard.ShardId("[[_index][52]][-1]", "[[[hi!][-1]][35]][-1]", 0);
    }
}

