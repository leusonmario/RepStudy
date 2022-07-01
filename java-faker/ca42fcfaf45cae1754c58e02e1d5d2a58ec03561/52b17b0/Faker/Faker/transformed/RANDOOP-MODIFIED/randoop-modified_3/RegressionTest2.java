import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japanese");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japanese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Finance finance7 = faker0.finance;
        com.github.javafaker.Lorem lorem8 = faker0.lorem();
        com.github.javafaker.Name name9 = faker0.name;
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        com.github.javafaker.Options options3 = null;
        faker0.options = options3;
        com.github.javafaker.Number number5 = faker0.number();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream12 = random1.ints((int) (byte) -1, 22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.Locale locale1 = new java.util.Locale("CAN");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "can");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.numerify("Chinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book12 = null;
        faker11.book = book12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Number number16 = faker15.number;
        faker11.number = number16;
        faker0.number = number16;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Name name22 = faker19.name();
        com.github.javafaker.Hacker hacker23 = faker19.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker19.fakeValuesService;
        com.github.javafaker.Book book25 = faker19.book();
        faker0.book = book25;
        com.github.javafaker.Color color27 = faker0.color();
        com.github.javafaker.Name name28 = null;
        faker0.name = name28;
        com.github.javafaker.DateAndTime dateAndTime30 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(hacker23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(dateAndTime30);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.lang.String str6 = locale0.getDisplayName();
        java.lang.String str7 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German (Germany)" + "'", str3, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de-DE" + "'", str4, "de-DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deutsch (Deutschland)" + "'", str6, "Deutsch (Deutschland)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.lang.String str6 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutschland" + "'", str1, "Deutschland");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Deutsch (Deutschland)" + "'", str3, "Deutsch (Deutschland)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de-DE" + "'", str4, "de-DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean10 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        java.lang.String str5 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet17);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        com.github.javafaker.Name name8 = faker6.name();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        com.github.javafaker.Business business15 = null;
        faker14.business = business15;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        com.github.javafaker.Code code20 = faker17.code();
        faker14.code = code20;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name23 = faker22.name;
        com.github.javafaker.Options options24 = faker22.options;
        com.github.javafaker.App app25 = faker22.app();
        com.github.javafaker.Options options26 = faker22.options;
        com.github.javafaker.Options options27 = faker22.options();
        com.github.javafaker.Name name28 = faker22.name();
        faker14.name = name28;
        faker6.name = name28;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(app25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(name28);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japanisch (Japan)" + "'", str2, "Japanisch (Japan)");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        long long8 = random0.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-6599062674968615793L) + "'", long8 == (-6599062674968615793L));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.Locale locale3 = new java.util.Locale("ANGLAIS", "und", "japan");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "anglais_UND_japan");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais-japan" + "'", str4, "anglais-japan");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("French", "");
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream15 = random9.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale4, random9);
        com.github.javafaker.Number number17 = faker16.number;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japanese (Japan)" + "'", str8, "Japanese (Japan)");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(number17);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.Locale locale2 = new java.util.Locale("English (Canada)", "\u65e5\u672c");
        java.util.Random random4 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.IntStream intStream6 = random4.ints();
        java.util.stream.IntStream intStream9 = random4.ints(0, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: english (canada)_?? could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        com.github.javafaker.Company company3 = faker0.company;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Internet internet11 = faker10.internet;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Options options14 = faker12.options;
        com.github.javafaker.Name name15 = faker12.name();
        com.github.javafaker.Code code16 = faker12.code;
        faker10.code = code16;
        com.github.javafaker.Number number18 = faker10.number;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        faker10.options = options25;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Name name30 = faker27.name();
        com.github.javafaker.Hacker hacker31 = faker27.hacker();
        com.github.javafaker.service.RandomService randomService32 = faker27.randomService;
        faker10.randomService = randomService32;
        faker0.randomService = randomService32;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(hacker31);
        org.junit.Assert.assertNotNull(randomService32);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.Locale locale42 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.util.Locale locale46 = new java.util.Locale("", "");
        java.lang.String str47 = locale42.getDisplayVariant(locale46);
        java.util.Set<java.lang.String> strSet48 = locale42.getUnicodeLocaleKeys();
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strSet48);
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList29, (java.util.Collection<java.lang.String>) strSet48);
        java.util.Collection<java.util.Locale> localeCollection51 = null;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter(languageRangeList29, localeCollection51);
        java.util.Locale locale55 = new java.util.Locale("", "");
        java.util.Locale locale56 = java.util.Locale.UK;
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale55.getDisplayLanguage(locale57);
        java.util.Set<java.lang.String> strSet59 = locale55.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList29, (java.util.Collection<java.lang.String>) strSet59);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strSet59);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode25.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode38.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.numerify("");
        com.github.javafaker.Color color7 = faker0.color;
        com.github.javafaker.Finance finance8 = faker0.finance;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.App app9 = faker6.app();
        com.github.javafaker.Options options10 = faker6.options;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Color color14 = faker11.color();
        faker6.color = color14;
        com.github.javafaker.Finance finance16 = faker6.finance;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Number number22 = faker21.number;
        faker17.number = number22;
        faker6.number = number22;
        faker0.number = number22;
        com.github.javafaker.Finance finance26 = faker0.finance;
        com.github.javafaker.App app27 = faker0.app();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(app9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(app27);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.Locale locale2 = new java.util.Locale("fra", "Chinese");
        org.junit.Assert.assertEquals(locale2.toString(), "fra_CHINESE");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        com.github.javafaker.Options options3 = null;
        faker0.options = options3;
        com.github.javafaker.Options options5 = faker0.options;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.App app9 = faker6.app();
        com.github.javafaker.Options options10 = faker6.options;
        com.github.javafaker.Options options11 = faker6.options();
        com.github.javafaker.Name name12 = faker6.name();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.Name name16 = faker13.name();
        faker6.name = name16;
        com.github.javafaker.Internet internet18 = faker6.internet;
        com.github.javafaker.Internet internet19 = faker6.internet;
        faker0.internet = internet19;
        com.github.javafaker.Address address21 = faker0.address;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(app9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(internet18);
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(address21);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale locale8 = new java.util.Locale("allemand", "french");
        java.lang.String str9 = locale3.getDisplayScript(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale locale13 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "und");
        java.lang.String str14 = locale8.getDisplayVariant(locale13);
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANGLAIS" + "'", str4, "ANGLAIS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "allemand_FRENCH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale13.toString(), "\u4e2d\u56fd\u8a9e_UND");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Company company14 = faker11.company();
        faker10.company = company14;
        com.github.javafaker.Hacker hacker16 = faker10.hacker;
        com.github.javafaker.Company company17 = faker10.company;
        com.github.javafaker.Hacker hacker18 = faker10.hacker;
        faker3.hacker = hacker18;
        com.github.javafaker.Finance finance20 = faker3.finance;
        com.github.javafaker.Company company21 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(company21);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker6.phoneNumber;
        com.github.javafaker.Number number14 = faker6.number();
        com.github.javafaker.Code code15 = faker6.code;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(code15);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Business business10 = null;
        faker0.business = business10;
        com.github.javafaker.Book book12 = faker0.book;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.Random random1 = new java.util.Random(10L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale locale22 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale26 = new java.util.Locale("", "");
        java.lang.String str27 = locale22.getDisplayVariant(locale26);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Collection<java.util.Locale> localeCollection30 = null;
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.Locale locale44 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.util.Locale locale48 = new java.util.Locale("", "");
        java.lang.String str49 = locale44.getDisplayVariant(locale48);
        java.util.Set<java.lang.String> strSet50 = locale44.getUnicodeLocaleKeys();
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strSet50);
        java.util.Collection<java.lang.String> strCollection52 = null;
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strCollection52, filteringMode61);
        java.util.Locale locale64 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.lang.String str66 = locale64.getDisplayCountry();
        java.util.Locale locale67 = locale64.stripExtensions();
        java.util.Locale locale68 = locale64.stripExtensions();
        java.util.Locale locale71 = new java.util.Locale("French", "");
        java.lang.String str72 = locale68.getDisplayName(locale71);
        java.util.Set<java.lang.String> strSet73 = locale71.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strSet73);
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet73);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(localeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode40.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode61.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Japan" + "'", str66, "Japan");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale71.toString(), "french");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Japanese (Japan)" + "'", str72, "Japanese (Japan)");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(0L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Locale.setDefault(locale0);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        float float7 = random6.nextFloat();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random6);
        java.util.Set<java.lang.Character> charSet9 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japanese" + "'", str3, "Japanese");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.73043025f + "'", float7 == 0.73043025f);
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getLanguage();
        java.lang.String str5 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Canada" + "'", str5, "Canada");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Germany", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=35.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.Locale locale3 = new java.util.Locale("eng", "Germany", "Deutschland");
        org.junit.Assert.assertEquals(locale3.toString(), "eng_GERMANY_Deutschland");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.Locale locale3 = new java.util.Locale("\u65e5\u672c", "german (germany)", "en_GB");
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale3.getDisplayName(locale6);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: ??_GERMAN (GERMANY)_en_GB could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u672c_GERMAN (GERMANY)_en_GB");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u65e5\u672c (GERMAN (GERMANY),en,GB)" + "'", str9, "\u65e5\u672c (GERMAN (GERMANY),en,GB)");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deu");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "fr-CA", "Japanisch");
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_FR-CA_Japanisch");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        java.lang.String str14 = faker5.bothify("Japan");
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream27 = random22.doubles((long) (short) 1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        faker15.randomService = randomService29;
        com.github.javafaker.Address address31 = faker15.address;
        com.github.javafaker.Lorem lorem32 = faker15.lorem();
        faker5.lorem = lorem32;
        com.github.javafaker.Options options34 = faker5.options();
        com.github.javafaker.Code code35 = faker5.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japan" + "'", str14, "Japan");
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(code35);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("Japan");
        java.util.Locale.Builder builder5 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("eng");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) 1);
        long long10 = random0.nextLong();
        double double11 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 855334945017422328L + "'", long10 == 855334945017422328L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6592721340271371d + "'", double11 == 0.6592721340271371d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale4.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_FR" + "'", str1, "fr_FR");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream3 = random1.longs((long) 'a');
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u');
        java.util.stream.LongStream longStream7 = random1.longs();
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1714397444786534d + "'", double8 == 0.1714397444786534d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        java.lang.String str5 = faker0.letterify("de");
        com.github.javafaker.Business business6 = faker0.business();
        com.github.javafaker.Finance finance7 = faker0.finance;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Options options40 = faker0.options();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(options40);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("en_US", "en_GB");
        java.lang.String str8 = locale4.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c" + "'", str2, "\u65e5\u672c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale7.toString(), "en_us_EN_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList19);
        java.util.Collection<java.lang.String> strCollection25 = null;
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap27);
        java.util.Collection<java.util.Locale> localeCollection29 = null;
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter(languageRangeList28, localeCollection29, filteringMode38);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode21.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode38.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(localeList40);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.Hacker hacker5 = faker0.hacker;
        java.lang.String str7 = faker0.letterify("eng");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream13 = random8.doubles((long) (short) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random8);
        byte[] byteArray16 = new byte[] { (byte) -1 };
        random8.nextBytes(byteArray16);
        random0.nextBytes(byteArray16);
        java.util.stream.IntStream intStream19 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[7]");
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.util.Locale locale3 = java.util.Locale.UK;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Internet internet5 = faker4.internet();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker6.fakeValuesService;
        com.github.javafaker.service.RandomService randomService10 = null;
        faker6.randomService = randomService10;
        com.github.javafaker.Options options12 = faker6.options;
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream18 = random13.doubles((long) (short) 1);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        faker6.randomService = randomService20;
        com.github.javafaker.Address address22 = faker6.address;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker23.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber27 = null;
        faker23.phoneNumber = phoneNumber27;
        com.github.javafaker.Name name29 = faker23.name();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Name name33 = faker30.name();
        com.github.javafaker.Hacker hacker34 = faker30.hacker();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book36 = null;
        faker35.book = book36;
        com.github.javafaker.Code code38 = faker35.code();
        faker30.code = code38;
        com.github.javafaker.Address address40 = faker30.address;
        faker23.address = address40;
        faker6.address = address40;
        faker4.address = address40;
        com.github.javafaker.Hacker hacker44 = faker4.hacker;
        com.github.javafaker.DateAndTime dateAndTime45 = faker4.dateAndTime;
        faker0.dateAndTime = dateAndTime45;
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(address40);
        org.junit.Assert.assertNotNull(hacker44);
        org.junit.Assert.assertNotNull(dateAndTime45);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Internet internet7 = faker0.internet;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.util.Random random10 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12, random13);
        com.github.javafaker.Business business18 = null;
        faker17.business = business18;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book21 = null;
        faker20.book = book21;
        com.github.javafaker.Code code23 = faker20.code();
        faker17.code = code23;
        java.lang.String str26 = faker17.bothify("Japan");
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker27.fakeValuesService;
        com.github.javafaker.service.RandomService randomService31 = null;
        faker27.randomService = randomService31;
        com.github.javafaker.Options options33 = faker27.options;
        java.util.Random random34 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream37 = random34.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream39 = random34.doubles((long) (short) 1);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.service.RandomService randomService41 = faker40.randomService;
        faker27.randomService = randomService41;
        com.github.javafaker.Address address43 = faker27.address;
        com.github.javafaker.Lorem lorem44 = faker27.lorem();
        faker17.lorem = lorem44;
        com.github.javafaker.Options options46 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService47 = faker17.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService47;
        faker0.fakeValuesService = fakeValuesService47;
        com.github.javafaker.Hacker hacker50 = faker0.hacker;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(code23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Japan" + "'", str26, "Japan");
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(fakeValuesService30);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(doubleStream37);
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(randomService41);
        org.junit.Assert.assertNotNull(address43);
        org.junit.Assert.assertNotNull(lorem44);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(fakeValuesService47);
        org.junit.Assert.assertNotNull(hacker50);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.Locale locale3 = new java.util.Locale("FR", "Chinesisch", "FRENCH");
        java.util.Locale locale7 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "Germany", "German (Germany)");
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CHINESISCH_FRENCH");
        org.junit.Assert.assertEquals(locale7.toString(), "\u4e2d\u56fd\u8a9e_GERMANY_German (Germany)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CHINESISCH" + "'", str8, "CHINESISCH");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int2 = random1.nextInt();
        float float3 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1188188233) + "'", int2 == (-1188188233));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.6991795f + "'", float3 == 0.6991795f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en_GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_gb");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getCountry();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und" + "'", str1, "und");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.LongStream longStream4 = random1.longs((-4972683369271453960L), (long) 1);
        java.util.stream.LongStream longStream5 = random1.longs();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(0.7281907524383029d, (double) 100.0f);
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        int int8 = random1.nextInt(23);
        int int9 = random1.nextInt();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 431529176 + "'", int9 == 431529176);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream3 = random1.ints();
        long long4 = random1.nextLong();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        java.lang.String str7 = faker5.regexify("en_US");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4972683369271453960L) + "'", long4 == (-4972683369271453960L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en_US" + "'", str7, "en_US");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Hacker hacker11 = faker7.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker7.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Options options14 = faker0.options;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Book book17 = faker15.book;
        com.github.javafaker.Company company18 = faker15.company();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Name name22 = faker19.name();
        faker15.name = name22;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book25 = null;
        faker24.book = book25;
        com.github.javafaker.Code code27 = faker24.code();
        faker15.code = code27;
        faker0.code = code27;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(code27);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("German (Germany)");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale10.getUnicodeLocaleType("anglais-japan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: anglais-japan");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale8.toString(), "german (germany)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "german (germany)");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.lang.String str10 = faker0.numerify("United Kingdom");
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Options options14 = faker12.options;
        com.github.javafaker.Color color15 = faker12.color();
        com.github.javafaker.Finance finance16 = faker12.finance;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.service.RandomService randomService21 = null;
        faker17.randomService = randomService21;
        com.github.javafaker.Options options23 = faker17.options;
        java.util.Random random24 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream29 = random24.doubles((long) (short) 1);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.service.RandomService randomService31 = faker30.randomService;
        faker17.randomService = randomService31;
        com.github.javafaker.Address address33 = faker17.address;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker34.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber38 = null;
        faker34.phoneNumber = phoneNumber38;
        com.github.javafaker.Name name40 = faker34.name();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name42 = faker41.name;
        com.github.javafaker.Options options43 = faker41.options;
        com.github.javafaker.Name name44 = faker41.name();
        com.github.javafaker.Hacker hacker45 = faker41.hacker();
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book47 = null;
        faker46.book = book47;
        com.github.javafaker.Code code49 = faker46.code();
        faker41.code = code49;
        com.github.javafaker.Address address51 = faker41.address;
        faker34.address = address51;
        faker17.address = address51;
        com.github.javafaker.Options options54 = faker17.options();
        com.github.javafaker.Company company55 = faker17.company;
        faker12.company = company55;
        faker0.company = company55;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(randomService31);
        org.junit.Assert.assertNotNull(address33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(name42);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(hacker45);
        org.junit.Assert.assertNotNull(code49);
        org.junit.Assert.assertNotNull(address51);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(company55);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker6.phoneNumber;
        com.github.javafaker.Address address13 = faker6.address;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(address13);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayCountry(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Germany" + "'", str4, "Germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.Random random1 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Business business9 = null;
        faker8.business = business9;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book12 = null;
        faker11.book = book12;
        com.github.javafaker.Code code14 = faker11.code();
        faker8.code = code14;
        java.lang.String str17 = faker8.bothify("Japan");
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name19 = faker18.name;
        com.github.javafaker.Options options20 = faker18.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = faker18.fakeValuesService;
        com.github.javafaker.service.RandomService randomService22 = null;
        faker18.randomService = randomService22;
        com.github.javafaker.Options options24 = faker18.options;
        java.util.Random random25 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream28 = random25.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream30 = random25.doubles((long) (short) 1);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.service.RandomService randomService32 = faker31.randomService;
        faker18.randomService = randomService32;
        com.github.javafaker.Address address34 = faker18.address;
        com.github.javafaker.Lorem lorem35 = faker18.lorem();
        faker8.lorem = lorem35;
        com.github.javafaker.Options options37 = faker8.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService38 = faker8.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService38;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name41 = faker40.name;
        com.github.javafaker.Options options42 = faker40.options;
        com.github.javafaker.App app43 = faker40.app();
        com.github.javafaker.Options options44 = faker40.options;
        faker2.options = options44;
        java.lang.String str47 = faker2.numerify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.App app48 = faker2.app;
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japan" + "'", str17, "Japan");
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(fakeValuesService21);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(randomService32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(lorem35);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(fakeValuesService38);
        org.junit.Assert.assertNotNull(name41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(app43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str47, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(app48);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        int int7 = random1.nextInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("japanese");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japanese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream3 = random1.longs((long) 'a');
        boolean boolean4 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random1.ints(2085992140, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker6.phoneNumber;
        com.github.javafaker.Finance finance14 = faker6.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Locale locale7 = new java.util.Locale("japan", "hi!", "anglais");
        java.lang.String str8 = locale2.getDisplayLanguage(locale7);
        java.lang.String str9 = locale2.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "japan_HI!_anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French" + "'", str8, "French");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr_FR" + "'", str9, "fr_FR");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        java.util.Locale.Builder builder5 = builder3.setVariant("allemand");
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder10 = builder3.setLocale(locale9);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        java.lang.String str8 = locale2.getDisplayScript();
        java.util.Locale locale11 = new java.util.Locale("", "");
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale11.getDisplayLanguage(locale13);
        java.lang.String str15 = locale2.getDisplayLanguage(locale11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German" + "'", str7, "German");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.util.Locale locale25 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale29 = new java.util.Locale("", "");
        java.lang.String str30 = locale25.getDisplayVariant(locale29);
        java.util.Set<java.lang.String> strSet31 = locale25.getUnicodeLocaleKeys();
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet31);
        java.util.Locale locale35 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.util.Locale locale39 = new java.util.Locale("", "");
        java.lang.String str40 = locale35.getDisplayVariant(locale39);
        java.util.Set<java.lang.String> strSet41 = locale35.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet41);
        java.util.Collection<java.util.Locale> localeCollection43 = null;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, localeCollection43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList51, filteringMode53);
        java.util.Locale locale57 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet58 = locale57.getExtensionKeys();
        java.util.Locale locale61 = new java.util.Locale("", "");
        java.lang.String str62 = locale57.getDisplayVariant(locale61);
        java.util.Set<java.lang.String> strSet63 = locale57.getUnicodeLocaleKeys();
        java.lang.String str64 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strSet63);
        java.util.Locale locale67 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale71 = new java.util.Locale("", "");
        java.lang.String str72 = locale67.getDisplayVariant(locale71);
        java.util.Set<java.lang.String> strSet73 = locale67.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strSet73);
        java.util.Locale locale75 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strSet76, filteringMode77);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection43, filteringMode77);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList79, filteringMode80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode9.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode21.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(charSet58);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode80.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        random0.setSeed((long) 25);
        java.util.stream.IntStream intStream9 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5370438706358901d + "'", double6 == 0.5370438706358901d);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getScript();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        java.lang.String str9 = locale3.getDisplayScript();
        java.lang.String str10 = locale3.getISO3Language();
        java.lang.String str11 = locale0.getDisplayVariant(locale3);
        java.lang.String str12 = locale3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr_FR" + "'", str12, "fr_FR");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.Locale locale1 = new java.util.Locale("french");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.DateAndTime dateAndTime3 = faker2.dateAndTime;
        java.lang.Class<?> wildcardClass4 = faker2.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale9 = new java.util.Locale("Japanese", "en_US");
        java.lang.String str10 = locale1.getDisplayName(locale9);
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream16 = random11.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream18 = random11.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream20 = random11.doubles((long) 1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random11);
        boolean boolean22 = locale1.equals((java.lang.Object) faker21);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "japan" + "'", str6, "japan");
        org.junit.Assert.assertEquals(locale9.toString(), "japanese_EN_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "japan" + "'", str10, "japan");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Japan");
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale2.getCountry();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale locale17 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("", "");
        java.lang.String str22 = locale17.getDisplayVariant(locale21);
        java.util.Set<java.lang.String> strSet23 = locale17.getUnicodeLocaleKeys();
        java.lang.String str24 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList31, filteringMode33);
        java.util.Locale locale37 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.util.Locale locale41 = new java.util.Locale("", "");
        java.lang.String str42 = locale37.getDisplayVariant(locale41);
        java.util.Set<java.lang.String> strSet43 = locale37.getUnicodeLocaleKeys();
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet43);
        java.util.Locale locale47 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.util.Locale locale51 = new java.util.Locale("", "");
        java.lang.String str52 = locale47.getDisplayVariant(locale51);
        java.util.Set<java.lang.String> strSet53 = locale47.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet53);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Locale locale58 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.util.Locale locale62 = new java.util.Locale("", "");
        java.lang.String str63 = locale58.getDisplayVariant(locale62);
        java.util.Set<java.lang.Character> charSet64 = locale58.getExtensionKeys();
        java.util.Set<java.lang.String> strSet65 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet65);
        java.util.Locale locale68 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet69, filteringMode70);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet4, filteringMode70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap73);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CN" + "'", str3, "CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode13.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode33.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charSet64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode70.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeList74);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.Locale locale2 = new java.util.Locale("chinese", "eng");
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_ENG");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.Locale locale3 = new java.util.Locale("japan", "de-DE", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale4.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale4, random11);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de" + "'", str9, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))" + "'", str10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u56fd\u8a9e", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_DE_DE");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale0.getDisplayScript(locale6);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Options options5 = faker3.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker3.fakeValuesService;
        com.github.javafaker.service.RandomService randomService7 = null;
        faker3.randomService = randomService7;
        com.github.javafaker.Options options9 = faker3.options;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream15 = random10.doubles((long) (short) 1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.service.RandomService randomService17 = faker16.randomService;
        faker3.randomService = randomService17;
        faker2.randomService = randomService17;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService23 = faker20.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber24 = null;
        faker20.phoneNumber = phoneNumber24;
        com.github.javafaker.Name name26 = faker20.name();
        com.github.javafaker.Options options27 = faker20.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService28 = faker20.fakeValuesService;
        java.lang.String str30 = faker20.numerify("fra");
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name32 = faker31.name;
        com.github.javafaker.Book book33 = faker31.book;
        com.github.javafaker.Company company34 = faker31.company();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name36 = faker35.name;
        com.github.javafaker.Options options37 = faker35.options;
        com.github.javafaker.Name name38 = faker35.name();
        faker31.name = name38;
        faker20.name = name38;
        com.github.javafaker.Internet internet41 = faker20.internet;
        faker2.internet = internet41;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(randomService17);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(fakeValuesService23);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(fakeValuesService28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fra" + "'", str30, "fra");
        org.junit.Assert.assertNotNull(name32);
        org.junit.Assert.assertNotNull(book33);
        org.junit.Assert.assertNotNull(company34);
        org.junit.Assert.assertNotNull(name36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(internet41);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book3 = null;
        faker2.book = book3;
        com.github.javafaker.Company company5 = faker2.company;
        faker1.company = company5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        com.github.javafaker.Address address10 = faker7.address();
        com.github.javafaker.Lorem lorem11 = faker7.lorem();
        com.github.javafaker.Name name12 = faker7.name();
        faker1.name = name12;
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.Random random1 = new java.util.Random((-1L));
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4961115982468162243L + "'", long2 == 4961115982468162243L);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int2 = random1.nextInt();
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1188188233) + "'", int2 == (-1188188233));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.6991795f + "'", float3 == 0.6991795f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "China", "ANGLAIS");
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("DE");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e_CHINA_ANGLAIS");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str4, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str5, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd\u8a9e (CHINA,ANGLAIS)" + "'", str8, "\u4e2d\u56fd\u8a9e (CHINA,ANGLAIS)");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Business business10 = null;
        faker0.business = business10;
        java.util.Locale locale12 = java.util.Locale.UK;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale12);
        com.github.javafaker.Internet internet14 = faker13.internet();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream27 = random22.doubles((long) (short) 1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        faker15.randomService = randomService29;
        com.github.javafaker.Address address31 = faker15.address;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name33 = faker32.name;
        com.github.javafaker.Options options34 = faker32.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker32.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber36 = null;
        faker32.phoneNumber = phoneNumber36;
        com.github.javafaker.Name name38 = faker32.name();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name40 = faker39.name;
        com.github.javafaker.Options options41 = faker39.options;
        com.github.javafaker.Name name42 = faker39.name();
        com.github.javafaker.Hacker hacker43 = faker39.hacker();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book45 = null;
        faker44.book = book45;
        com.github.javafaker.Code code47 = faker44.code();
        faker39.code = code47;
        com.github.javafaker.Address address49 = faker39.address;
        faker32.address = address49;
        faker15.address = address49;
        faker13.address = address49;
        com.github.javafaker.Hacker hacker53 = faker13.hacker;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name55 = faker54.name;
        com.github.javafaker.Options options56 = faker54.options;
        com.github.javafaker.App app57 = faker54.app();
        com.github.javafaker.Options options58 = faker54.options;
        com.github.javafaker.Options options59 = faker54.options();
        faker13.options = options59;
        com.github.javafaker.Number number61 = faker13.number;
        faker0.number = number61;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(fakeValuesService35);
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(name42);
        org.junit.Assert.assertNotNull(hacker43);
        org.junit.Assert.assertNotNull(code47);
        org.junit.Assert.assertNotNull(address49);
        org.junit.Assert.assertNotNull(hacker53);
        org.junit.Assert.assertNotNull(name55);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(app57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(number61);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.Name name7 = faker4.name();
        com.github.javafaker.Hacker hacker8 = faker4.hacker();
        java.lang.String str10 = faker4.numerify("");
        java.lang.String str12 = faker4.letterify("french");
        java.util.Locale locale13 = java.util.Locale.UK;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale13);
        com.github.javafaker.Code code15 = faker14.code;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale16);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale20, random21);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Company company30 = faker27.company();
        faker26.company = company30;
        com.github.javafaker.Hacker hacker32 = faker26.hacker;
        com.github.javafaker.Company company33 = faker26.company;
        com.github.javafaker.Hacker hacker34 = faker26.hacker;
        faker19.hacker = hacker34;
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale36, random37);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.Company company46 = faker43.company();
        faker42.company = company46;
        com.github.javafaker.Hacker hacker48 = faker42.hacker;
        com.github.javafaker.Company company49 = faker42.company;
        com.github.javafaker.Hacker hacker50 = faker42.hacker;
        faker19.hacker = hacker50;
        faker14.hacker = hacker50;
        com.github.javafaker.Finance finance53 = faker14.finance;
        faker4.finance = finance53;
        faker0.finance = finance53;
        com.github.javafaker.Options options56 = faker0.options();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "french" + "'", str12, "french");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "anglais" + "'", str18, "anglais");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(company46);
        org.junit.Assert.assertNotNull(hacker48);
        org.junit.Assert.assertNotNull(company49);
        org.junit.Assert.assertNotNull(hacker50);
        org.junit.Assert.assertNotNull(finance53);
        org.junit.Assert.assertNotNull(options56);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Business business4 = null;
        faker2.business = business4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker2.phoneNumber;
        com.github.javafaker.App app7 = faker2.app();
        com.github.javafaker.Book book8 = faker2.book;
        faker1.book = book8;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale14, random15);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Company company24 = faker21.company();
        faker20.company = company24;
        com.github.javafaker.Hacker hacker26 = faker20.hacker;
        com.github.javafaker.Company company27 = faker20.company;
        com.github.javafaker.Hacker hacker28 = faker20.hacker;
        faker13.hacker = hacker28;
        com.github.javafaker.Finance finance30 = faker13.finance;
        faker1.finance = finance30;
        java.util.Random random33 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Code code36 = faker35.code();
        faker1.code = code36;
        com.github.javafaker.Address address38 = faker1.address();
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "anglais" + "'", str12, "anglais");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(company24);
        org.junit.Assert.assertNotNull(hacker26);
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(finance30);
        org.junit.Assert.assertNotNull(code36);
        org.junit.Assert.assertNotNull(address38);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Company company14 = faker11.company();
        faker10.company = company14;
        com.github.javafaker.Hacker hacker16 = faker10.hacker;
        com.github.javafaker.Company company17 = faker10.company;
        com.github.javafaker.Hacker hacker18 = faker10.hacker;
        faker3.hacker = hacker18;
        com.github.javafaker.DateAndTime dateAndTime20 = faker3.date();
        com.github.javafaker.DateAndTime dateAndTime21 = faker3.dateAndTime;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(dateAndTime21);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book42 = null;
        faker41.book = book42;
        com.github.javafaker.Company company44 = faker41.company();
        java.lang.String str46 = faker41.letterify("ja");
        com.github.javafaker.PhoneNumber phoneNumber47 = faker41.phoneNumber;
        faker0.phoneNumber = phoneNumber47;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService52 = faker49.fakeValuesService;
        com.github.javafaker.service.RandomService randomService53 = null;
        faker49.randomService = randomService53;
        com.github.javafaker.Options options55 = faker49.options;
        java.util.Random random56 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream59 = random56.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream61 = random56.doubles((long) (short) 1);
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.service.RandomService randomService63 = faker62.randomService;
        faker49.randomService = randomService63;
        faker0.randomService = randomService63;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(company44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ja" + "'", str46, "ja");
        org.junit.Assert.assertNotNull(phoneNumber47);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(fakeValuesService52);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(doubleStream59);
        org.junit.Assert.assertNotNull(doubleStream61);
        org.junit.Assert.assertNotNull(randomService63);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book35 = null;
        faker34.book = book35;
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Number number39 = faker38.number;
        faker34.number = number39;
        faker6.number = number39;
        com.github.javafaker.Lorem lorem42 = faker6.lorem();
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.Name name46 = faker43.name();
        com.github.javafaker.Hacker hacker47 = faker43.hacker();
        com.github.javafaker.Internet internet48 = faker43.internet();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.App app52 = faker49.app();
        com.github.javafaker.Options options53 = faker49.options;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name55 = faker54.name;
        com.github.javafaker.Options options56 = faker54.options;
        com.github.javafaker.Color color57 = faker54.color();
        faker49.color = color57;
        com.github.javafaker.Finance finance59 = faker49.finance;
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book61 = null;
        faker60.book = book61;
        java.util.Random random63 = null;
        com.github.javafaker.Faker faker64 = new com.github.javafaker.Faker(random63);
        com.github.javafaker.Number number65 = faker64.number;
        faker60.number = number65;
        faker49.number = number65;
        faker43.number = number65;
        java.util.Random random69 = new java.util.Random();
        double double70 = random69.nextDouble();
        com.github.javafaker.Faker faker71 = new com.github.javafaker.Faker(random69);
        com.github.javafaker.Faker faker72 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name73 = faker72.name;
        com.github.javafaker.Options options74 = faker72.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService75 = faker72.fakeValuesService;
        com.github.javafaker.service.RandomService randomService76 = null;
        faker72.randomService = randomService76;
        com.github.javafaker.DateAndTime dateAndTime78 = faker72.date();
        faker71.dateAndTime = dateAndTime78;
        faker43.dateAndTime = dateAndTime78;
        faker6.dateAndTime = dateAndTime78;
        java.util.Locale locale82 = java.util.Locale.FRANCE;
        java.util.Random random83 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream86 = random83.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker87 = new com.github.javafaker.Faker(locale82, random83);
        com.github.javafaker.Faker faker88 = new com.github.javafaker.Faker(random83);
        com.github.javafaker.service.RandomService randomService89 = faker88.randomService;
        com.github.javafaker.Color color90 = faker88.color();
        faker6.color = color90;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(number39);
        org.junit.Assert.assertNotNull(lorem42);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(name46);
        org.junit.Assert.assertNotNull(hacker47);
        org.junit.Assert.assertNotNull(internet48);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(app52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(name55);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(finance59);
        org.junit.Assert.assertNotNull(number65);
// flaky:         org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.1833195625250552d + "'", double70 == 0.1833195625250552d);
        org.junit.Assert.assertNotNull(name73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(fakeValuesService75);
        org.junit.Assert.assertNotNull(dateAndTime78);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream86);
        org.junit.Assert.assertNotNull(randomService89);
        org.junit.Assert.assertNotNull(color90);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Lorem lorem3 = faker0.lorem;
        java.lang.String str5 = faker0.numerify("");
        com.github.javafaker.Code code6 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale9 = java.util.Locale.UK;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale9);
        com.github.javafaker.Code code11 = faker10.code;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.Company company26 = faker23.company();
        faker22.company = company26;
        com.github.javafaker.Hacker hacker28 = faker22.hacker;
        com.github.javafaker.Company company29 = faker22.company;
        com.github.javafaker.Hacker hacker30 = faker22.hacker;
        faker15.hacker = hacker30;
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Random random33 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream36 = random33.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale32, random33);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name40 = faker39.name;
        com.github.javafaker.Options options41 = faker39.options;
        com.github.javafaker.Company company42 = faker39.company();
        faker38.company = company42;
        com.github.javafaker.Hacker hacker44 = faker38.hacker;
        com.github.javafaker.Company company45 = faker38.company;
        com.github.javafaker.Hacker hacker46 = faker38.hacker;
        faker15.hacker = hacker46;
        faker10.hacker = hacker46;
        faker8.hacker = hacker46;
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name51 = faker50.name;
        com.github.javafaker.Options options52 = faker50.options;
        com.github.javafaker.Name name53 = faker50.name();
        com.github.javafaker.Hacker hacker54 = faker50.hacker();
        java.lang.String str56 = faker50.numerify("");
        java.lang.String str58 = faker50.letterify("french");
        com.github.javafaker.Faker faker59 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name60 = faker59.name;
        com.github.javafaker.Options options61 = faker59.options;
        com.github.javafaker.Name name62 = faker59.name();
        com.github.javafaker.Hacker hacker63 = faker59.hacker();
        com.github.javafaker.Faker faker64 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book65 = null;
        faker64.book = book65;
        com.github.javafaker.Code code67 = faker64.code();
        faker59.code = code67;
        com.github.javafaker.Address address69 = faker59.address;
        faker50.address = address69;
        com.github.javafaker.Faker faker71 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book72 = null;
        faker71.book = book72;
        com.github.javafaker.Code code74 = faker71.code();
        com.github.javafaker.Book book75 = faker71.book;
        com.github.javafaker.Faker faker76 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name77 = faker76.name;
        com.github.javafaker.Options options78 = faker76.options;
        com.github.javafaker.Name name79 = faker76.name();
        com.github.javafaker.Hacker hacker80 = faker76.hacker();
        com.github.javafaker.Internet internet81 = faker76.internet();
        com.github.javafaker.Lorem lorem82 = faker76.lorem;
        faker71.lorem = lorem82;
        com.github.javafaker.App app84 = faker71.app();
        faker50.app = app84;
        com.github.javafaker.Color color86 = faker50.color();
        faker8.color = color86;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German" + "'", str7, "German");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "anglais" + "'", str14, "anglais");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(company26);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(hacker30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(company42);
        org.junit.Assert.assertNotNull(hacker44);
        org.junit.Assert.assertNotNull(company45);
        org.junit.Assert.assertNotNull(hacker46);
        org.junit.Assert.assertNotNull(name51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(name53);
        org.junit.Assert.assertNotNull(hacker54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "french" + "'", str58, "french");
        org.junit.Assert.assertNotNull(name60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(name62);
        org.junit.Assert.assertNotNull(hacker63);
        org.junit.Assert.assertNotNull(code67);
        org.junit.Assert.assertNotNull(address69);
        org.junit.Assert.assertNotNull(code74);
        org.junit.Assert.assertNull(book75);
        org.junit.Assert.assertNotNull(name77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(name79);
        org.junit.Assert.assertNotNull(hacker80);
        org.junit.Assert.assertNotNull(internet81);
        org.junit.Assert.assertNotNull(lorem82);
        org.junit.Assert.assertNotNull(app84);
        org.junit.Assert.assertNotNull(color86);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book12 = null;
        faker11.book = book12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Number number16 = faker15.number;
        faker11.number = number16;
        faker0.number = number16;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Name name22 = faker19.name();
        com.github.javafaker.Hacker hacker23 = faker19.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker19.fakeValuesService;
        com.github.javafaker.Book book25 = faker19.book();
        faker0.book = book25;
        com.github.javafaker.Name name27 = faker0.name;
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Random random29 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream32 = random29.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale28, random29);
        com.github.javafaker.Business business34 = null;
        faker33.business = business34;
        com.github.javafaker.Book book36 = faker33.book;
        com.github.javafaker.Company company37 = faker33.company;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name39 = faker38.name;
        com.github.javafaker.Options options40 = faker38.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker38.fakeValuesService;
        com.github.javafaker.service.RandomService randomService42 = null;
        faker38.randomService = randomService42;
        com.github.javafaker.Options options44 = faker38.options;
        java.util.Random random45 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream48 = random45.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream50 = random45.doubles((long) (short) 1);
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(random45);
        com.github.javafaker.service.RandomService randomService52 = faker51.randomService;
        faker38.randomService = randomService52;
        com.github.javafaker.Business business54 = faker38.business();
        faker33.business = business54;
        com.github.javafaker.PhoneNumber phoneNumber56 = faker33.phoneNumber;
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name58 = faker57.name;
        java.lang.String str60 = faker57.letterify("hi!");
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name62 = faker61.name;
        com.github.javafaker.Options options63 = faker61.options;
        com.github.javafaker.App app64 = faker61.app();
        faker57.app = app64;
        com.github.javafaker.PhoneNumber phoneNumber66 = faker57.phoneNumber;
        faker33.phoneNumber = phoneNumber66;
        faker0.phoneNumber = phoneNumber66;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(hacker23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertNotNull(book36);
        org.junit.Assert.assertNotNull(company37);
        org.junit.Assert.assertNotNull(name39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(fakeValuesService41);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(doubleStream48);
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(randomService52);
        org.junit.Assert.assertNotNull(business54);
        org.junit.Assert.assertNotNull(phoneNumber56);
        org.junit.Assert.assertNotNull(name58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(name62);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(app64);
        org.junit.Assert.assertNotNull(phoneNumber66);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale0.getCountry();
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream12 = random6.longs((long) 1, (long) (short) 100);
        java.util.Random random14 = new java.util.Random((long) (byte) 10);
        double double15 = random14.nextDouble();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        random14.nextBytes(byteArray21);
        random6.nextBytes(byteArray21);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale0, random6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream28 = random6.ints((long) 431529176, 1342085725, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7304302967434272d + "'", double15 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-40, 40, -51, 5, 25]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        java.lang.String str5 = faker0.numerify("");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "Deutsch (Deutschland)");
        java.lang.String str3 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd\u8a9e_DEUTSCH (DEUTSCHLAND)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Internet internet7 = faker0.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker8.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber12 = null;
        faker8.phoneNumber = phoneNumber12;
        com.github.javafaker.Name name14 = faker8.name();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.Name name18 = faker15.name();
        com.github.javafaker.Hacker hacker19 = faker15.hacker();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book21 = null;
        faker20.book = book21;
        com.github.javafaker.Code code23 = faker20.code();
        faker15.code = code23;
        com.github.javafaker.Address address25 = faker15.address;
        faker8.address = address25;
        com.github.javafaker.App app27 = faker8.app();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name29 = faker28.name;
        com.github.javafaker.Options options30 = faker28.options;
        com.github.javafaker.App app31 = faker28.app();
        com.github.javafaker.Options options32 = faker28.options;
        com.github.javafaker.Options options33 = faker28.options();
        com.github.javafaker.Code code34 = faker28.code;
        faker8.code = code34;
        com.github.javafaker.Business business36 = faker8.business;
        faker0.business = business36;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(hacker19);
        org.junit.Assert.assertNotNull(code23);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(app27);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(app31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNotNull(business36);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        com.github.javafaker.Company company13 = faker5.company;
        com.github.javafaker.PhoneNumber phoneNumber14 = faker5.phoneNumber;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale15);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Random random20 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream23 = random20.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale19, random20);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name27 = faker26.name;
        com.github.javafaker.Options options28 = faker26.options;
        com.github.javafaker.Company company29 = faker26.company();
        faker25.company = company29;
        com.github.javafaker.Hacker hacker31 = faker25.hacker;
        com.github.javafaker.Company company32 = faker25.company;
        com.github.javafaker.Hacker hacker33 = faker25.hacker;
        faker18.hacker = hacker33;
        com.github.javafaker.Finance finance35 = faker18.finance;
        com.github.javafaker.Company company36 = faker18.company;
        faker5.company = company36;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "anglais" + "'", str17, "anglais");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(hacker31);
        org.junit.Assert.assertNotNull(company32);
        org.junit.Assert.assertNotNull(hacker33);
        org.junit.Assert.assertNotNull(finance35);
        org.junit.Assert.assertNotNull(company36);
    }
}
